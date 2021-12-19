package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.io.InputStream;

public final class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    final h f47097a;

    /* renamed from: b  reason: collision with root package name */
    int f47098b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f47099c = 0;

    static {
        Covode.recordClassIndex(28662);
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f47098b = this.f47099c;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f47097a.a() - this.f47098b;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f47097a;
        int i2 = this.f47098b;
        this.f47098b = i2 + 1;
        return hVar.a(i2) & 255;
    }

    public final void mark(int i2) {
        this.f47099c = this.f47098b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        boolean z;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        int min = Math.min((int) j2, available());
        this.f47098b += min;
        return (long) min;
    }

    public j(h hVar) {
        MethodCollector.i(5038);
        i.a(!hVar.d());
        this.f47097a = (h) i.a(hVar);
        MethodCollector.o(5038);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i2 + "; regionLength=" + i3);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i3 <= 0) {
            return 0;
        }
        int min = Math.min(available, i3);
        this.f47097a.a(this.f47098b, bArr, i2, min);
        this.f47098b += min;
        return min;
    }
}
