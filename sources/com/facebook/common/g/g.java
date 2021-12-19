package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.e.a;
import com.facebook.common.h.c;
import java.io.IOException;
import java.io.InputStream;

public final class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f47091a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f47092b;

    /* renamed from: c  reason: collision with root package name */
    private final c<byte[]> f47093c;

    /* renamed from: d  reason: collision with root package name */
    private int f47094d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f47095e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47096f = false;

    static {
        Covode.recordClassIndex(28658);
    }

    private void b() {
        if (this.f47096f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        boolean z;
        if (this.f47095e <= this.f47094d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        b();
        return (this.f47094d - this.f47095e) + this.f47091a.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        if (!this.f47096f) {
            this.f47096f = true;
            this.f47093c.a(this.f47092b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        if (!this.f47096f) {
            a.c("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    private boolean a() {
        MethodCollector.i(1505);
        if (this.f47095e < this.f47094d) {
            MethodCollector.o(1505);
            return true;
        }
        int read = this.f47091a.read(this.f47092b);
        if (read <= 0) {
            MethodCollector.o(1505);
            return false;
        }
        this.f47094d = read;
        this.f47095e = 0;
        MethodCollector.o(1505);
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        boolean z;
        if (this.f47095e <= this.f47094d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f47092b;
        int i2 = this.f47095e;
        this.f47095e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        boolean z;
        if (this.f47095e <= this.f47094d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        b();
        int i2 = this.f47094d;
        int i3 = this.f47095e;
        long j3 = (long) (i2 - i3);
        if (j3 >= j2) {
            this.f47095e = (int) (((long) i3) + j2);
            return j2;
        }
        this.f47095e = i2;
        return j3 + this.f47091a.skip(j2 - j3);
    }

    public g(InputStream inputStream, byte[] bArr, c<byte[]> cVar) {
        MethodCollector.i(1496);
        this.f47091a = (InputStream) i.a(inputStream);
        this.f47092b = (byte[]) i.a(bArr);
        this.f47093c = (c) i.a(cVar);
        MethodCollector.o(1496);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        boolean z;
        if (this.f47095e <= this.f47094d) {
            z = true;
        } else {
            z = false;
        }
        i.b(z);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f47094d - this.f47095e, i3);
        System.arraycopy(this.f47092b, this.f47095e, bArr, i2, min);
        this.f47095e += min;
        return min;
    }
}
