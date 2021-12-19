package com.squareup.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f58058a;

    /* renamed from: b  reason: collision with root package name */
    private long f58059b;

    /* renamed from: c  reason: collision with root package name */
    private long f58060c;

    /* renamed from: d  reason: collision with root package name */
    private long f58061d;

    /* renamed from: e  reason: collision with root package name */
    private long f58062e;

    static {
        Covode.recordClassIndex(36068);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f58058a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        this.f58058a.close();
    }

    public final boolean markSupported() {
        return this.f58058a.markSupported();
    }

    @Override // java.io.InputStream
    public final void reset() {
        a(this.f58062e);
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(3814);
        int read = this.f58058a.read();
        if (read != -1) {
            this.f58059b++;
        }
        MethodCollector.o(3814);
        return read;
    }

    public n(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    public final void mark(int i2) {
        this.f58062e = a(i2);
    }

    public final long a(int i2) {
        long j2 = this.f58059b + ((long) i2);
        if (this.f58061d < j2) {
            b(j2);
        }
        return this.f58059b;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        long skip = this.f58058a.skip(j2);
        this.f58059b += skip;
        return skip;
    }

    public final void a(long j2) {
        if (this.f58059b > this.f58061d || j2 < this.f58060c) {
            throw new IOException("Cannot reset");
        }
        this.f58058a.reset();
        a(this.f58060c, j2);
        this.f58059b = j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.i(3815);
        int read = this.f58058a.read(bArr);
        if (read != -1) {
            this.f58059b += (long) read;
        }
        MethodCollector.o(3815);
        return read;
    }

    private void b(long j2) {
        try {
            long j3 = this.f58060c;
            long j4 = this.f58059b;
            if (j3 >= j4 || j4 > this.f58061d) {
                this.f58060c = j4;
                this.f58058a.mark((int) (j2 - j4));
            } else {
                this.f58058a.reset();
                this.f58058a.mark((int) (j2 - this.f58060c));
                a(this.f58060c, this.f58059b);
            }
            this.f58061d = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: ".concat(String.valueOf(e2)));
        }
    }

    private n(InputStream inputStream, byte b2) {
        MethodCollector.i(3808);
        this.f58062e = -1;
        this.f58058a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        MethodCollector.o(3808);
    }

    private void a(long j2, long j3) {
        while (j2 < j3) {
            long skip = this.f58058a.skip(j3 - j2);
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
        MethodCollector.i(3817);
        int read = this.f58058a.read(bArr, i2, i3);
        if (read != -1) {
            this.f58059b += (long) read;
        }
        MethodCollector.o(3817);
        return read;
    }
}
