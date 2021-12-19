package androidx.core.graphics;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class d {
    static {
        Covode.recordClassIndex(781);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2411a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2412b;

        static {
            Covode.recordClassIndex(782);
        }

        a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f2413a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f2414b;

        static {
            Covode.recordClassIndex(783);
        }

        b(b bVar) {
            this.f2413a = bVar.f2413a;
            float[] fArr = bVar.f2414b;
            this.f2414b = d.a(fArr, fArr.length);
        }

        b(char c2, float[] fArr) {
            this.f2413a = c2;
            this.f2414b = fArr;
        }

        public static void a(b[] bVarArr, Path path) {
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float[] fArr = new float[6];
            char c2 = 'm';
            char c3 = 0;
            char c4 = 'm';
            int i3 = 0;
            while (i3 < bVarArr.length) {
                char c5 = bVarArr[i3].f2413a;
                float[] fArr2 = bVarArr[i3].f2414b;
                float f10 = fArr[c3];
                float f11 = fArr[1];
                float f12 = fArr[2];
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = fArr[5];
                switch (c5) {
                    case 'A':
                    case 'a':
                        i2 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i2 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i2 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i2 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f14, f15);
                        f10 = f14;
                        f12 = f10;
                        f11 = f15;
                        f13 = f11;
                    default:
                        i2 = 2;
                        break;
                }
                int i4 = 0;
                while (i4 < fArr2.length) {
                    if (c5 == 'A') {
                        c5 = 'A';
                        int i5 = i4 + 5;
                        float f16 = fArr2[i5];
                        int i6 = i4 + 6;
                        float f17 = fArr2[i6];
                        float f18 = fArr2[i4 + 0];
                        float f19 = fArr2[i4 + 1];
                        float f20 = fArr2[i4 + 2];
                        if (fArr2[i4 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i4 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a(path, f10, f11, f16, f17, f18, f19, f20, z, z2);
                        f10 = fArr2[i5];
                        f11 = fArr2[i6];
                        f13 = f11;
                        f12 = f10;
                    } else if (c5 == 'C') {
                        c5 = 'C';
                        int i7 = i4 + 2;
                        int i8 = i4 + 3;
                        int i9 = i4 + 4;
                        int i10 = i4 + 5;
                        path.cubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f10 = fArr2[i9];
                        f11 = fArr2[i10];
                        f12 = fArr2[i7];
                        f13 = fArr2[i8];
                    } else if (c5 == 'H') {
                        c5 = 'H';
                        int i11 = i4 + 0;
                        path.lineTo(fArr2[i11], f11);
                        f10 = fArr2[i11];
                    } else if (c5 == 'Q') {
                        c5 = 'Q';
                        int i12 = i4 + 0;
                        int i13 = i4 + 1;
                        int i14 = i4 + 2;
                        int i15 = i4 + 3;
                        path.quadTo(fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        f12 = fArr2[i12];
                        f13 = fArr2[i13];
                        f10 = fArr2[i14];
                        f11 = fArr2[i15];
                    } else if (c5 == 'V') {
                        c5 = 'V';
                        int i16 = i4 + 0;
                        path.lineTo(f10, fArr2[i16]);
                        f11 = fArr2[i16];
                    } else if (c5 != 'a') {
                        if (c5 == 'c') {
                            f4 = f11;
                            int i17 = i4 + 2;
                            int i18 = i4 + 3;
                            int i19 = i4 + 4;
                            int i20 = i4 + 5;
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                            f10 = fArr2[i17] + f10;
                            f11 = fArr2[i18] + f4;
                            f2 = f10 + fArr2[i19];
                            f5 = fArr2[i20];
                        } else if (c5 == 'h') {
                            int i21 = i4 + 0;
                            path.rLineTo(fArr2[i21], 0.0f);
                            f10 += fArr2[i21];
                        } else if (c5 == 'q') {
                            int i22 = i4 + 0;
                            int i23 = i4 + 1;
                            int i24 = i4 + 2;
                            int i25 = i4 + 3;
                            path.rQuadTo(fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                            f12 = fArr2[i22] + f10;
                            f13 = f11 + fArr2[i23];
                            f10 += fArr2[i24];
                            c5 = 'q';
                            f11 = fArr2[i25] + f11;
                        } else if (c5 == 'v') {
                            int i26 = i4 + 0;
                            path.rLineTo(0.0f, fArr2[i26]);
                            f11 += fArr2[i26];
                        } else if (c5 != 'L') {
                            if (c5 == 'M') {
                                int i27 = i4 + 0;
                                f10 = fArr2[i27];
                                int i28 = i4 + 1;
                                f11 = fArr2[i28];
                                if (i4 > 0) {
                                    path.lineTo(fArr2[i27], fArr2[i28]);
                                } else {
                                    path.moveTo(fArr2[i27], fArr2[i28]);
                                }
                            } else if (c5 == 'S') {
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f10 = (f10 * 2.0f) - f12;
                                    f11 = (f11 * 2.0f) - f13;
                                }
                                int i29 = i4 + 0;
                                int i30 = i4 + 1;
                                int i31 = i4 + 2;
                                int i32 = i4 + 3;
                                path.cubicTo(f10, f11, fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                f12 = fArr2[i29];
                                f13 = fArr2[i30];
                                f10 = fArr2[i31];
                                f11 = fArr2[i32];
                            } else if (c5 == 'T') {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f10 = (f10 * 2.0f) - f12;
                                    f11 = (f11 * 2.0f) - f13;
                                }
                                int i33 = i4 + 0;
                                int i34 = i4 + 1;
                                path.quadTo(f10, f11, fArr2[i33], fArr2[i34]);
                                f2 = fArr2[i33];
                                f3 = fArr2[i34];
                                f13 = f11;
                                f12 = f10;
                                f10 = f2;
                                f11 = f3;
                            } else if (c5 == 'l') {
                                int i35 = i4 + 0;
                                int i36 = i4 + 1;
                                path.rLineTo(fArr2[i35], fArr2[i36]);
                                f10 += fArr2[i35];
                                f11 += fArr2[i36];
                            } else if (c5 == c2) {
                                int i37 = i4 + 0;
                                f10 += fArr2[i37];
                                int i38 = i4 + 1;
                                f11 += fArr2[i38];
                                if (i4 > 0) {
                                    path.rLineTo(fArr2[i37], fArr2[i38]);
                                } else {
                                    path.rMoveTo(fArr2[i37], fArr2[i38]);
                                }
                            } else if (c5 == 's') {
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f7 = f10 - f12;
                                    f6 = f11 - f13;
                                } else {
                                    f7 = 0.0f;
                                    f6 = 0.0f;
                                }
                                int i39 = i4 + 0;
                                int i40 = i4 + 1;
                                int i41 = i4 + 2;
                                int i42 = i4 + 3;
                                f4 = f11;
                                path.rCubicTo(f7, f6, fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f10 = fArr2[i39] + f10;
                                f11 = fArr2[i40] + f4;
                                f2 = f10 + fArr2[i41];
                                f5 = fArr2[i42];
                            } else if (c5 == 't') {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f9 = f10 - f12;
                                    f8 = f11 - f13;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                int i43 = i4 + 0;
                                int i44 = i4 + 1;
                                path.rQuadTo(f9, f8, fArr2[i43], fArr2[i44]);
                                f12 = f9 + f10;
                                f13 = f8 + f11;
                                f10 += fArr2[i43];
                                f11 += fArr2[i44];
                                c5 = 't';
                            }
                            f15 = f11;
                            f14 = f10;
                        } else {
                            int i45 = i4 + 0;
                            int i46 = i4 + 1;
                            path.lineTo(fArr2[i45], fArr2[i46]);
                            f10 = fArr2[i45];
                            f11 = fArr2[i46];
                        }
                        f3 = f5 + f4;
                        f13 = f11;
                        f12 = f10;
                        f10 = f2;
                        f11 = f3;
                    } else {
                        int i47 = i4 + 5;
                        float f21 = fArr2[i47] + f10;
                        int i48 = i4 + 6;
                        float f22 = fArr2[i48] + f11;
                        float f23 = fArr2[i4 + 0];
                        float f24 = fArr2[i4 + 1];
                        float f25 = fArr2[i4 + 2];
                        if (fArr2[i4 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr2[i4 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c5 = 'a';
                        a(path, f10, f11, f21, f22, f23, f24, f25, z3, z4);
                        f10 += fArr2[i47];
                        f11 += fArr2[i48];
                        f13 = f11;
                        f12 = f10;
                    }
                    i4 += i2;
                    c4 = c5;
                    c5 = c4;
                    c2 = 'm';
                }
                fArr[0] = f10;
                fArr[1] = f11;
                fArr[2] = f12;
                fArr[3] = f13;
                fArr[4] = f14;
                fArr[5] = f15;
                c4 = bVarArr[i3].f2413a;
                i3++;
                c2 = 'm';
                c3 = 0;
            }
        }

        public final void a(b bVar, b bVar2, float f2) {
            this.f2413a = bVar.f2413a;
            int i2 = 0;
            while (true) {
                float[] fArr = bVar.f2414b;
                if (i2 < fArr.length) {
                    this.f2414b[i2] = (fArr[i2] * (1.0f - f2)) + (bVar2.f2414b[i2] * f2);
                    i2++;
                } else {
                    return;
                }
            }
        }

        private static void a(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d7;
            double d12 = d6;
            int ceil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d8);
            double sin = Math.sin(d8);
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double d13 = -d4;
            double d14 = d13 * cos;
            double d15 = d5 * sin;
            double d16 = (d14 * sin2) - (d15 * cos2);
            double d17 = d13 * sin;
            double d18 = d5 * cos;
            double d19 = (sin2 * d17) + (cos2 * d18);
            double d20 = (double) ceil;
            Double.isNaN(d20);
            double d21 = d10 / d20;
            int i2 = 0;
            while (i2 < ceil) {
                double d22 = d9 + d21;
                double sin3 = Math.sin(d22);
                double cos3 = Math.cos(d22);
                double d23 = (d2 + ((d4 * cos) * cos3)) - (d15 * sin3);
                double d24 = d3 + (d4 * sin * cos3) + (d18 * sin3);
                double d25 = (d14 * sin3) - (d15 * cos3);
                double d26 = (sin3 * d17) + (cos3 * d18);
                double d27 = d22 - d9;
                double tan = Math.tan(d27 / 2.0d);
                double sin4 = (Math.sin(d27) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d12 + (d16 * sin4)), (float) (d11 + (d19 * sin4)), (float) (d23 - (sin4 * d25)), (float) (d24 - (sin4 * d26)), (float) d23, (float) d24);
                i2++;
                d12 = d23;
                d9 = d22;
                d19 = d26;
                d16 = d25;
                d11 = d24;
            }
        }

        private static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            boolean z3;
            float f9 = f6;
            float f10 = f7;
            while (true) {
                double radians = Math.toRadians((double) f8);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d4 = (double) f2;
                Double.isNaN(d4);
                double d5 = (double) f3;
                Double.isNaN(d5);
                double d6 = (double) f9;
                Double.isNaN(d6);
                double d7 = ((d4 * cos) + (d5 * sin)) / d6;
                double d8 = (double) (-f2);
                Double.isNaN(d8);
                Double.isNaN(d5);
                double d9 = (double) f10;
                Double.isNaN(d9);
                double d10 = ((d8 * sin) + (d5 * cos)) / d9;
                double d11 = (double) f4;
                Double.isNaN(d11);
                double d12 = (double) f5;
                Double.isNaN(d12);
                Double.isNaN(d6);
                double d13 = ((d11 * cos) + (d12 * sin)) / d6;
                double d14 = (double) (-f4);
                Double.isNaN(d14);
                Double.isNaN(d12);
                Double.isNaN(d9);
                double d15 = ((d14 * sin) + (d12 * cos)) / d9;
                double d16 = d7 - d13;
                double d17 = d10 - d15;
                double d18 = (d7 + d13) / 2.0d;
                double d19 = (d10 + d15) / 2.0d;
                double d20 = (d16 * d16) + (d17 * d17);
                if (d20 != 0.0d) {
                    double d21 = (1.0d / d20) - 0.25d;
                    if (d21 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                        f9 *= sqrt;
                        f10 *= sqrt;
                    } else {
                        double sqrt2 = Math.sqrt(d21);
                        double d22 = d16 * sqrt2;
                        double d23 = sqrt2 * d17;
                        if (z == z2) {
                            d2 = d18 - d23;
                            d3 = d19 + d22;
                        } else {
                            d2 = d18 + d23;
                            d3 = d19 - d22;
                        }
                        double atan2 = Math.atan2(d10 - d3, d7 - d2);
                        double atan22 = Math.atan2(d15 - d3, d13 - d2) - atan2;
                        if (atan22 >= 0.0d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 != z3) {
                            if (atan22 > 0.0d) {
                                atan22 -= 6.283185307179586d;
                            } else {
                                atan22 += 6.283185307179586d;
                            }
                        }
                        Double.isNaN(d6);
                        double d24 = d2 * d6;
                        Double.isNaN(d9);
                        double d25 = d3 * d9;
                        a(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d6, d9, d4, d5, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static Path a(String str) {
        Path path = new Path();
        b[] b2 = b(str);
        if (b2 == null) {
            return null;
        }
        try {
            b.a(b2, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e2);
        }
    }

    public static b[] b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int a2 = a(str, i2);
            String trim = str.substring(i3, a2).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), c(trim));
            }
            i2 = a2 + 1;
            i3 = a2;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            a(arrayList, str.charAt(i3), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e A[Catch:{ NumberFormatException -> 0x0082 }, LOOP:1: B:10:0x002e->B:29:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] c(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.d.c(java.lang.String):float[]");
    }

    public static b[] a(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = new b(bVarArr[i2]);
        }
        return bVarArr2;
    }

    static float[] a(float[] fArr, int i2) {
        if (i2 >= 0) {
            int i3 = i2 - 0;
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, 0, fArr2, 0, Math.min(i3, fArr.length - 0));
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i2) {
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public static boolean a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (!(bVarArr[i2].f2413a == bVarArr2[i2].f2413a && bVarArr[i2].f2414b.length == bVarArr2[i2].f2414b.length)) {
                return false;
            }
        }
        return true;
    }

    private static void a(ArrayList<b> arrayList, char c2, float[] fArr) {
        arrayList.add(new b(c2, fArr));
    }
}
