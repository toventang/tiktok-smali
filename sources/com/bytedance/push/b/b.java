package com.bytedance.push.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class b extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f42048a;

    /* renamed from: b  reason: collision with root package name */
    private long f42049b;

    /* renamed from: c  reason: collision with root package name */
    private long f42050c;

    /* renamed from: d  reason: collision with root package name */
    private long f42051d;

    /* renamed from: e  reason: collision with root package name */
    private long f42052e;

    static {
        Covode.recordClassIndex(25705);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f42048a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        this.f42048a.close();
    }

    public final boolean markSupported() {
        return this.f42048a.markSupported();
    }

    @Override // java.io.InputStream
    public final void reset() {
        a(this.f42052e);
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(7983);
        int read = this.f42048a.read();
        if (read != -1) {
            this.f42049b++;
        }
        MethodCollector.o(7983);
        return read;
    }

    public b(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    public final void mark(int i2) {
        this.f42052e = a(i2);
    }

    public final long a(int i2) {
        long j2 = this.f42049b + ((long) i2);
        if (this.f42051d < j2) {
            b(j2);
        }
        return this.f42049b;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        long skip = this.f42048a.skip(j2);
        this.f42049b += skip;
        return skip;
    }

    public final void a(long j2) {
        if (this.f42049b > this.f42051d || j2 < this.f42050c) {
            throw new IOException("reset failed");
        }
        this.f42048a.reset();
        a(this.f42050c, j2);
        this.f42049b = j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.i(7992);
        int read = this.f42048a.read(bArr);
        if (read != -1) {
            this.f42049b += (long) read;
        }
        MethodCollector.o(7992);
        return read;
    }

    private void b(long j2) {
        try {
            long j3 = this.f42050c;
            long j4 = this.f42049b;
            if (j3 >= j4 || j4 > this.f42051d) {
                this.f42050c = j4;
                this.f42048a.mark((int) (j2 - j4));
            } else {
                this.f42048a.reset();
                this.f42048a.mark((int) (j2 - this.f42050c));
                a(this.f42050c, this.f42049b);
            }
            this.f42051d = j2;
        } catch (Throwable th) {
            throw new IllegalStateException("set index failed: ".concat(String.valueOf(th)));
        }
    }

    private b(InputStream inputStream, byte b2) {
        MethodCollector.i(7972);
        this.f42052e = -1;
        this.f42048a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        MethodCollector.o(7972);
    }

    private void a(long j2, long j3) {
        while (j2 < j3) {
            long skip = this.f42048a.skip(j3 - j2);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j2 += skip;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(7997);
        int read = this.f42048a.read(bArr, i2, i3);
        if (read != -1) {
            this.f42049b += (long) read;
        }
        MethodCollector.o(7997);
        return read;
    }
}
