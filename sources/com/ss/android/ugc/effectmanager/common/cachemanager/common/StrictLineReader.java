package com.ss.android.ugc.effectmanager.common.cachemanager.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class StrictLineReader implements Closeable {
    private byte[] buf;
    public final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    static {
        Covode.recordClassIndex(95283);
    }

    public boolean hasUnterminatedLine() {
        if (this.end == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MethodCollector.i(208);
        synchronized (this.in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.in.close();
                }
            } finally {
                MethodCollector.o(208);
            }
        }
    }

    private void fillBuf() {
        MethodCollector.i(215);
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.pos = 0;
            this.end = read;
            MethodCollector.o(215);
            return;
        }
        EOFException eOFException = new EOFException();
        MethodCollector.o(215);
        throw eOFException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1[r5] == 13) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String readLine() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.cachemanager.common.StrictLineReader.readLine():java.lang.String");
    }

    public StrictLineReader(InputStream inputStream, Charset charset2) {
        this(inputStream, 8192, charset2);
    }

    public StrictLineReader(InputStream inputStream, int i2, Charset charset2) {
        if (inputStream == null || charset2 == null) {
            throw null;
        } else if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset2.equals(FileUtils.INSTANCE.getUS_ASCII())) {
            this.in = inputStream;
            this.charset = charset2;
            this.buf = new byte[i2];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
