package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.k;

public final class w extends k {

    /* renamed from: a  reason: collision with root package name */
    private final s f48112a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.common.h.a<r> f48113b;

    /* renamed from: c  reason: collision with root package name */
    private int f48114c;

    static {
        Covode.recordClassIndex(29071);
    }

    @Override // com.facebook.common.g.k
    public final int b() {
        return this.f48114c;
    }

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(29072);
        }

        public a() {
            super("OutputStream no longer valid");
        }
    }

    private void d() {
        if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) this.f48113b)) {
            throw new a();
        }
    }

    /* renamed from: c */
    public final u a() {
        d();
        return new u(this.f48113b, this.f48114c);
    }

    @Override // java.io.OutputStream, java.io.Closeable, com.facebook.common.g.k, java.lang.AutoCloseable
    public final void close() {
        com.facebook.common.h.a.c(this.f48113b);
        this.f48113b = null;
        this.f48114c = -1;
        super.close();
    }

    public w(s sVar) {
        this(sVar, sVar.f48107g[0]);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    public w(s sVar, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        s sVar2 = (s) i.a(sVar);
        this.f48112a = sVar2;
        this.f48114c = 0;
        this.f48113b = com.facebook.common.h.a.a(sVar2.a(i2), sVar2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i2 + "; regionLength=" + i3);
        }
        d();
        int i4 = this.f48114c + i3;
        d();
        if (i4 > this.f48113b.a().getSize()) {
            r rVar = (r) this.f48112a.a(i4);
            this.f48113b.a().copy(0, rVar, 0, this.f48114c);
            this.f48113b.close();
            this.f48113b = com.facebook.common.h.a.a(rVar, this.f48112a);
        }
        this.f48113b.a().write(this.f48114c, bArr, i2, i3);
        this.f48114c += i3;
    }
}
