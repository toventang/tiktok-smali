package com.facebook.a.f;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(28503);
    }

    d() {
    }

    static void b(a aVar) {
        if (!a.a(d.class)) {
            try {
                if (1 < aVar.f46763b.length) {
                    int i2 = 1;
                    for (int i3 = 1; i3 < aVar.f46763b.length; i3++) {
                        i2 *= aVar.f46763b[i3];
                    }
                    int[] iArr = new int[2];
                    int i4 = 0;
                    while (true) {
                        iArr[i4] = aVar.f46763b[i4];
                        i4++;
                        if (i4 > 0) {
                            iArr[1] = i2;
                            aVar.a(iArr);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }

    static a d(a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar.f46763b[1];
            a aVar2 = new a(new int[]{i3, i2});
            float[] fArr = aVar.f46762a;
            float[] fArr2 = aVar2.f46762a;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    fArr2[(i5 * i2) + i4] = fArr[(i4 * i3) + i5];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static a e(a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar.f46763b[1];
            int i4 = aVar.f46763b[2];
            a aVar2 = new a(new int[]{i4, i3, i2});
            float[] fArr = aVar.f46762a;
            float[] fArr2 = aVar2.f46762a;
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    for (int i7 = 0; i7 < i4; i7++) {
                        fArr2[(i7 * i2 * i3) + (i6 * i2) + i5] = fArr[(i5 * i3 * i4) + (i6 * i4) + i7];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static a a(a[] aVarArr) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = aVarArr[0].f46763b[0];
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                i3 += aVarArr[i4].f46763b[1];
            }
            a aVar = new a(new int[]{i2, i3});
            float[] fArr = aVar.f46762a;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * i3;
                int i7 = 0;
                while (true) {
                    float[] fArr2 = aVarArr[i7].f46762a;
                    int i8 = aVarArr[i7].f46763b[1];
                    System.arraycopy(fArr2, i5 * i8, fArr, i6, i8);
                    i6 += i8;
                    i7++;
                    if (i7 >= 4) {
                        break;
                    }
                }
            }
            return aVar;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static void c(a aVar) {
        if (!a.a(d.class)) {
            try {
                int i2 = aVar.f46763b[0];
                int i3 = aVar.f46763b[1];
                float[] fArr = aVar.f46762a;
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = i4 * i3;
                    int i6 = i5 + i3;
                    float f2 = Float.MIN_VALUE;
                    float f3 = 0.0f;
                    for (int i7 = i5; i7 < i6; i7++) {
                        if (fArr[i7] > f2) {
                            f2 = fArr[i7];
                        }
                    }
                    for (int i8 = i5; i8 < i6; i8++) {
                        fArr[i8] = (float) Math.exp((double) (fArr[i8] - f2));
                    }
                    for (int i9 = i5; i9 < i6; i9++) {
                        f3 += fArr[i9];
                    }
                    while (i5 < i6) {
                        fArr[i5] = fArr[i5] / f3;
                        i5++;
                    }
                }
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }

    static void a(a aVar) {
        if (!a.a(d.class)) {
            try {
                float[] fArr = aVar.f46762a;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (fArr[i2] < 0.0f) {
                        fArr[i2] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }

    static a a(a aVar, int i2) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i3 = aVar.f46763b[0];
            int i4 = aVar.f46763b[1];
            int i5 = aVar.f46763b[2];
            int i6 = (i4 - i2) + 1;
            a aVar2 = new a(new int[]{i3, i6, i5});
            float[] fArr = aVar.f46762a;
            float[] fArr2 = aVar2.f46762a;
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i5; i8++) {
                    for (int i9 = 0; i9 < i6; i9++) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        for (int i13 = 0; i13 < i2; i13++) {
                            fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                        }
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    private static a c(a aVar, a aVar2) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar2.f46763b[0];
            int i4 = aVar2.f46763b[1];
            a aVar3 = new a(new int[]{i2, i4});
            float[] fArr = aVar.f46762a;
            float[] fArr2 = aVar2.f46762a;
            float[] fArr3 = aVar3.f46762a;
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = (i5 * i4) + i6;
                    fArr3[i7] = 0.0f;
                    for (int i8 = 0; i8 < i3; i8++) {
                        fArr3[i7] = fArr3[i7] + (fArr[(i5 * i3) + i8] * fArr2[(i8 * i4) + i6]);
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static a b(a aVar, a aVar2) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = 0;
            int i3 = aVar.f46763b[0];
            int i4 = aVar.f46763b[1];
            int i5 = aVar.f46763b[2];
            int i6 = aVar2.f46763b[0];
            int i7 = (i4 - i6) + 1;
            int i8 = aVar2.f46763b[2];
            a aVar3 = new a(new int[]{i3, i7, i8});
            float[] fArr = aVar.f46762a;
            float[] fArr2 = aVar3.f46762a;
            float[] fArr3 = aVar2.f46762a;
            int i9 = 0;
            while (i9 < i3) {
                int i10 = 0;
                while (i10 < i8) {
                    int i11 = 0;
                    while (i11 < i7) {
                        float f2 = 0.0f;
                        while (i2 < i6) {
                            for (int i12 = 0; i12 < i5; i12++) {
                                f2 += fArr[(i4 * i5 * i9) + ((i2 + i11) * i5) + i12] * fArr3[(((i2 * i5) + i12) * i8) + i10];
                            }
                            i2++;
                        }
                        fArr2[(i7 * i8 * i9) + (i11 * i8) + i10] = f2;
                        i11++;
                        i2 = 0;
                    }
                    i10++;
                    i2 = 0;
                }
                i9++;
                i2 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static a a(String[] strArr, a aVar) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int i2 = aVar.f46763b[1];
            a aVar2 = new a(new int[]{length, 128, i2});
            float[] fArr = aVar2.f46762a;
            float[] fArr2 = aVar.f46762a;
            for (int i3 = 0; i3 < length; i3++) {
                int[] a2 = e.a(strArr[i3]);
                int i4 = 0;
                while (true) {
                    System.arraycopy(fArr2, a2[i4] * i2, fArr, (i2 * 128 * i3) + (i2 * i4), i2);
                    i4++;
                    if (i4 >= 128) {
                        break;
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }

    static void a(a aVar, a aVar2) {
        if (!a.a(d.class)) {
            try {
                int i2 = aVar.f46763b[0];
                int i3 = aVar.f46763b[1];
                int i4 = aVar.f46763b[2];
                float[] fArr = aVar.f46762a;
                float[] fArr2 = aVar2.f46762a;
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        for (int i7 = 0; i7 < i4; i7++) {
                            int i8 = (i5 * i3 * i4) + (i6 * i4) + i7;
                            fArr[i8] = fArr[i8] + fArr2[i7];
                        }
                    }
                }
            } catch (Throwable th) {
                a.a(th, d.class);
            }
        }
    }

    static a a(a aVar, a aVar2, a aVar3) {
        if (a.a(d.class)) {
            return null;
        }
        try {
            int i2 = aVar.f46763b[0];
            int i3 = aVar3.f46763b[0];
            a c2 = c(aVar, aVar2);
            float[] fArr = aVar3.f46762a;
            float[] fArr2 = c2.f46762a;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr2[i6] = fArr2[i6] + fArr[i5];
                }
            }
            return c2;
        } catch (Throwable th) {
            a.a(th, d.class);
            return null;
        }
    }
}
