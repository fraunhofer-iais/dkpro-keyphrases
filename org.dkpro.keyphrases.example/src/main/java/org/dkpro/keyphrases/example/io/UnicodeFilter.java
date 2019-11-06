package org.dkpro.keyphrases.example.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UnicodeFilter
    extends FilterInputStream
{

    protected UnicodeFilter(InputStream in)
    {
        super(in);
    }

    private boolean isAllowed(int c)
    {
        // see https://www.w3.org/TR/xml/#charsets
        if (c < 0x20) {
            if (c == 0x9 || c == 0xA || c == 0xD) {
                return true;
            }
            return false;
        }
        if (c > 0xD7FF && c < 0xE000) {
            return false;
        }
        if (c == 0xFFFE || c == 0xFFFF) {
            return false;
        }
        return true;
    }

    @Override
    public int read() throws IOException
    {
        int c;
        do {
            c = super.read();
        }
        while (!isAllowed(c));
        return c;
    }

    @Override
    public int read(byte[] b) throws IOException
    {
        return read(b, 0, b.length);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        byte[] b_unfiltered = new byte[len];
        int bytes_read = super.read(b_unfiltered, off, len);
        if (bytes_read == -1) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < bytes_read; i++) {
            if (isAllowed(b_unfiltered[i])) {
                b[index] = b_unfiltered[i];
                index++;
            }
        }
        return index;
    }
}