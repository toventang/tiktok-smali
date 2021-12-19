package com.bytedance.android.live.core.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Charset f8891a;

    /* renamed from: b  reason: collision with root package name */
    int f8892b;

    /* renamed from: c  reason: collision with root package name */
    private final InputStream f8893c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f8894d;

    /* renamed from: e  reason: collision with root package name */
    private int f8895e;

    static {
        Covode.recordClassIndex(4542);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.i(11531);
        synchronized (this.f8893c) {
            try {
                if (this.f8894d != null) {
                    this.f8894d = null;
                    this.f8893c.close();
                }
            } finally {
                MethodCollector.o(11531);
            }
        }
    }

    private void b() {
        MethodCollector.i(11695);
        InputStream inputStream = this.f8893c;
        byte[] bArr = this.f8894d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f8895e = 0;
            this.f8892b = read;
            MethodCollector.o(11695);
            return;
        }
        EOFException eOFException = new EOFException();
        MethodCollector.o(11695);
        throw eOFException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1[r5] == 13) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.a.a.c.a():java.lang.String");
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private c(InputStream inputStream, Charset charset, byte b2) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(b.f8889a)) {
            this.f8893c = inputStream;
            this.f8891a = charset;
            this.f8894d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
