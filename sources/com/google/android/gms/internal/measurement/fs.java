package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class fs extends fq {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f50874d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f50875e;

    /* renamed from: f  reason: collision with root package name */
    private int f50876f;

    /* renamed from: g  reason: collision with root package name */
    private int f50877g;

    /* renamed from: h  reason: collision with root package name */
    private int f50878h;

    /* renamed from: i  reason: collision with root package name */
    private int f50879i;

    /* renamed from: j  reason: collision with root package name */
    private int f50880j;

    /* renamed from: k  reason: collision with root package name */
    private int f50881k;

    static {
        Covode.recordClassIndex(31796);
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final long d() {
        return w();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final long e() {
        return w();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int f() {
        return v();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final long g() {
        return y();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int h() {
        return x();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int m() {
        return v();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int n() {
        return v();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int o() {
        return x();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final long p() {
        return y();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int u() {
        return this.f50878h - this.f50879i;
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final double b() {
        return Double.longBitsToDouble(y());
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final float c() {
        return Float.intBitsToFloat(x());
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final boolean i() {
        if (w() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int q() {
        return e(v());
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final long r() {
        return a(w());
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final boolean t() {
        if (this.f50878h == this.f50876f) {
            return true;
        }
        return false;
    }

    private final byte A() {
        int i2 = this.f50878h;
        if (i2 != this.f50876f) {
            byte[] bArr = this.f50874d;
            this.f50878h = i2 + 1;
            return bArr[i2];
        }
        throw gu.a();
    }

    private final void z() {
        int i2 = this.f50876f + this.f50877g;
        this.f50876f = i2;
        int i3 = i2 - this.f50879i;
        int i4 = this.f50881k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f50877g = i5;
            this.f50876f = i2 - i5;
            return;
        }
        this.f50877g = 0;
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int a() {
        if (t()) {
            this.f50880j = 0;
            return 0;
        }
        int v = v();
        this.f50880j = v;
        if ((v >>> 3) != 0) {
            return v;
        }
        throw gu.d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.fq
    public final long s() {
        long j2 = 0;
        int i2 = 0;
        do {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
            i2 += 7;
        } while (i2 < 64);
        throw gu.c();
    }

    private final int x() {
        int i2 = this.f50878h;
        if (this.f50876f - i2 >= 4) {
            byte[] bArr = this.f50874d;
            this.f50878h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw gu.a();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final String j() {
        int v = v();
        if (v > 0) {
            if (v <= this.f50876f - this.f50878h) {
                String str = new String(this.f50874d, this.f50878h, v, gp.f50957a);
                this.f50878h += v;
                return str;
            }
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw gu.b();
            }
        }
        throw gu.a();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.f50876f;
            int i3 = this.f50878h;
            if (v <= i2 - i3) {
                String b2 = jm.b(this.f50874d, i3, v);
                this.f50878h += v;
                return b2;
            }
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw gu.b();
            }
        }
        throw gu.a();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final fe l() {
        int v = v();
        if (v > 0) {
            int i2 = this.f50876f;
            int i3 = this.f50878h;
            if (v <= i2 - i3) {
                fe zza = fe.zza(this.f50874d, i3, v);
                this.f50878h += v;
                return zza;
            }
        } else if (v == 0) {
            return fe.zza;
        } else {
            if (v <= 0) {
                throw gu.b();
            }
        }
        int i4 = this.f50876f;
        int i5 = this.f50878h;
        if (v <= i4 - i5) {
            int i6 = v + i5;
            this.f50878h = i6;
            return new fp(Arrays.copyOfRange(this.f50874d, i5, i6));
        }
        throw gu.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r4[r2] >= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fs.v():int");
    }

    private final long y() {
        int i2 = this.f50878h;
        if (this.f50876f - i2 >= 8) {
            byte[] bArr = this.f50874d;
            this.f50878h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw gu.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (((long) r6[r5]) >= 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fs.w():long");
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final void a(int i2) {
        if (this.f50880j != i2) {
            throw gu.e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final void d(int i2) {
        this.f50881k = i2;
        z();
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f50876f;
            int i4 = this.f50878h;
            if (i2 <= i3 - i4) {
                this.f50878h = i4 + i2;
                return;
            }
            throw gu.a();
        }
        throw gu.b();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final int c(int i2) {
        if (i2 >= 0) {
            int u = i2 + u();
            int i3 = this.f50881k;
            if (u <= i3) {
                this.f50881k = u;
                z();
                return i3;
            }
            throw gu.a();
        }
        throw gu.b();
    }

    @Override // com.google.android.gms.internal.measurement.fq
    public final boolean b(int i2) {
        int a2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f50876f - this.f50878h >= 10) {
                do {
                    byte[] bArr = this.f50874d;
                    int i5 = this.f50878h;
                    this.f50878h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                } while (i4 < 10);
                throw gu.c();
            }
            while (A() < 0) {
                i4++;
                if (i4 >= 10) {
                    throw gu.c();
                }
            }
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
            return true;
        } else if (i3 == 3) {
            do {
                a2 = a();
                if (a2 == 0) {
                    break;
                }
            } while (b(a2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f(4);
                return true;
            }
            throw gu.f();
        }
    }

    private fs(byte[] bArr, int i2) {
        super((byte) 0);
        this.f50881k = Integer.MAX_VALUE;
        this.f50874d = bArr;
        this.f50876f = i2 + 0;
        this.f50878h = 0;
        this.f50879i = 0;
        this.f50875e = false;
    }

    /* synthetic */ fs(byte[] bArr, int i2, byte b2) {
        this(bArr, i2);
    }
}
