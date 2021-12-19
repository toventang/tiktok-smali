package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.utils.d;
import com.bytedance.geckox.utils.h;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class MemoryBuffer implements a {

    /* renamed from: a  reason: collision with root package name */
    private long f29757a;

    /* renamed from: b  reason: collision with root package name */
    private long f29758b;

    /* renamed from: c  reason: collision with root package name */
    private long f29759c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f29760d;

    /* renamed from: e  reason: collision with root package name */
    private File f29761e;

    private native long nCreate(String str, long j2);

    private native void nFlush(long j2, String str, long j3);

    private native void nRead(long j2, long j3, byte[] bArr, int i2, int i3);

    private native void nRelease(long j2, long j3);

    private native void nWrite(long j2, long j3, byte[] bArr, int i2, int i3);

    @Override // com.bytedance.geckox.buffer.a
    public final long b() {
        return this.f29757a;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final File f() {
        return this.f29761e;
    }

    static {
        Covode.recordClassIndex(17274);
        h.a("buffer");
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        try {
            e();
        } catch (Exception e2) {
            d.a(e2);
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final long c() {
        if (!this.f29760d.get()) {
            return this.f29759c;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a() {
        MethodCollector.i(8500);
        if (!this.f29760d.get()) {
            nFlush(this.f29758b, this.f29761e.getAbsolutePath(), this.f29757a);
            MethodCollector.o(8500);
            return;
        }
        IOException iOException = new IOException("released!");
        MethodCollector.o(8500);
        throw iOException;
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void e() {
        MethodCollector.i(9385);
        if (this.f29760d.getAndSet(true)) {
            MethodCollector.o(9385);
            return;
        }
        nRelease(this.f29758b, this.f29757a);
        this.f29758b = 0;
        MethodCollector.o(9385);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.a
    public final void a(int i2) {
        a(new byte[]{(byte) i2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 > r1) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f29760d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0019
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
        L_0x000e:
            r4 = r1
        L_0x000f:
            r3.f29759c = r4
            return
        L_0x0012:
            long r1 = r3.f29757a
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000f
            goto L_0x000e
        L_0x0019:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MemoryBuffer.b(long):void");
    }

    @Override // com.bytedance.geckox.buffer.a
    public final synchronized long a(long j2) {
        MethodCollector.i(8980);
        if (this.f29760d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(8980);
            throw iOException;
        } else if (j2 <= 0) {
            MethodCollector.o(8980);
            return 0;
        } else {
            long j3 = this.f29759c;
            long j4 = j2 + j3;
            this.f29759c = j4;
            if (j4 < 0) {
                this.f29759c = 0;
            } else {
                long j5 = this.f29757a;
                if (j4 > j5) {
                    this.f29759c = j5;
                }
            }
            long j6 = this.f29759c - j3;
            MethodCollector.o(8980);
            return j6;
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int a(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        MethodCollector.i(9180);
        if (this.f29760d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(9180);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i4 <= 0) {
            MethodCollector.o(9180);
            return 0;
        } else if (i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(9180);
            return 0;
        } else {
            if (i2 + i4 > bArr.length) {
                i4 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j2 = this.f29759c;
                    long j3 = this.f29757a;
                    if (j2 == j3) {
                        return 0;
                    }
                    if (((long) i4) + j2 > j3) {
                        i4 = (int) (j3 - j2);
                    }
                    nWrite(this.f29758b, j2, bArr, i2, i4);
                    this.f29759c += (long) i4;
                    MethodCollector.o(9180);
                    return i4;
                } finally {
                    MethodCollector.o(9180);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.a
    public final int b(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        MethodCollector.i(9383);
        if (this.f29760d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.o(9383);
            throw iOException;
        } else if (bArr == null || i4 <= 0 || i2 < 0 || i2 >= bArr.length) {
            MethodCollector.o(9383);
            return 0;
        } else {
            if (i2 + i4 > bArr.length) {
                i4 = bArr.length - i2;
            }
            synchronized (this) {
                try {
                    long j2 = this.f29759c;
                    long j3 = this.f29757a;
                    if (j2 == j3) {
                        return -1;
                    }
                    if (((long) i4) + j2 > j3) {
                        i4 = (int) (j3 - j2);
                    }
                    nRead(this.f29758b, j2, bArr, i2, i4);
                    this.f29759c += (long) i4;
                    MethodCollector.o(9383);
                    return i4;
                } finally {
                    MethodCollector.o(9383);
                }
            }
        }
    }
}
