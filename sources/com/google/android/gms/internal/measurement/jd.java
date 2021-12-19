package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;
import java.util.Arrays;

public final class jd {

    /* renamed from: a  reason: collision with root package name */
    static final jd f51055a = new jd(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    int f51056b;

    /* renamed from: c  reason: collision with root package name */
    int[] f51057c;

    /* renamed from: d  reason: collision with root package name */
    Object[] f51058d;

    /* renamed from: e  reason: collision with root package name */
    int f51059e;

    /* renamed from: f  reason: collision with root package name */
    boolean f51060f;

    jd() {
        this(0, new int[8], new Object[8], true);
    }

    static {
        Covode.recordClassIndex(31897);
    }

    public final int hashCode() {
        int i2 = this.f51056b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f51057c;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f51058d;
        int i8 = this.f51056b;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int a() {
        int e2;
        int i2 = this.f51059e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f51056b; i4++) {
            int i5 = this.f51057c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                e2 = ft.e(i6, ((Long) this.f51058d[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.f51058d[i4]).longValue();
                e2 = ft.g(i6);
            } else if (i7 == 2) {
                e2 = ft.c(i6, (fe) this.f51058d[i4]);
            } else if (i7 == 3) {
                e2 = (ft.m(i6 << 3) << 1) + ((jd) this.f51058d[i4]).a();
            } else if (i7 == 5) {
                ((Integer) this.f51058d[i4]).intValue();
                e2 = ft.e(i6);
            } else {
                throw new IllegalStateException(gu.f());
            }
            i3 += e2;
        }
        this.f51059e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        int i2 = this.f51056b;
        if (i2 == jdVar.f51056b) {
            int[] iArr = this.f51057c;
            int[] iArr2 = jdVar.f51057c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f51058d;
                    Object[] objArr2 = jdVar.f51058d;
                    int i4 = this.f51056b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                } else if (iArr[i3] != iArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    public final void a(jw jwVar) {
        if (this.f51056b != 0) {
            if (jwVar.a() == gm.e.f50950j) {
                for (int i2 = 0; i2 < this.f51056b; i2++) {
                    a(this.f51057c[i2], this.f51058d[i2], jwVar);
                }
                return;
            }
            for (int i3 = this.f51056b - 1; i3 >= 0; i3--) {
                a(this.f51057c[i3], this.f51058d[i3], jwVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f51056b; i3++) {
            hy.a(sb, i2, String.valueOf(this.f51057c[i3] >>> 3), this.f51058d[i3]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Object obj) {
        int i3;
        if (this.f51060f) {
            int i4 = this.f51056b;
            int[] iArr = this.f51057c;
            if (i4 == iArr.length) {
                if (i4 < 4) {
                    i3 = 8;
                } else {
                    i3 = i4 >> 1;
                }
                int i5 = i4 + i3;
                this.f51057c = Arrays.copyOf(iArr, i5);
                this.f51058d = Arrays.copyOf(this.f51058d, i5);
            }
            int[] iArr2 = this.f51057c;
            int i6 = this.f51056b;
            iArr2[i6] = i2;
            this.f51058d[i6] = obj;
            this.f51056b = i6 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static void a(int i2, Object obj, jw jwVar) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            jwVar.a(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            jwVar.d(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            jwVar.a(i3, (fe) obj);
        } else if (i4 != 3) {
            if (i4 == 5) {
                jwVar.d(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(gu.f());
        } else if (jwVar.a() == gm.e.f50950j) {
            jwVar.a(i3);
            ((jd) obj).a(jwVar);
            jwVar.b(i3);
        } else {
            jwVar.b(i3);
            ((jd) obj).a(jwVar);
            jwVar.a(i3);
        }
    }

    jd(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f51059e = -1;
        this.f51056b = i2;
        this.f51057c = iArr;
        this.f51058d = objArr;
        this.f51060f = z;
    }
}
