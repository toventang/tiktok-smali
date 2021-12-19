package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;

public class i {
    static {
        Covode.recordClassIndex(35480);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double[] f57040a = new double[4];

        /* renamed from: b  reason: collision with root package name */
        public double[] f57041b = new double[3];

        /* renamed from: c  reason: collision with root package name */
        public double[] f57042c = new double[3];

        /* renamed from: d  reason: collision with root package name */
        public double[] f57043d = new double[3];

        /* renamed from: e  reason: collision with root package name */
        public double[] f57044e = new double[3];

        static {
            Covode.recordClassIndex(35481);
        }

        public static void a(double[] dArr) {
            for (int i2 = 0; i2 < dArr.length; i2++) {
                dArr[i2] = 0.0d;
            }
        }
    }

    public static double b(double d2) {
        double round = (double) Math.round(d2 * 1000.0d);
        Double.isNaN(round);
        return round * 0.001d;
    }

    public static double c(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    public static boolean a(double d2) {
        if (!Double.isNaN(d2) && Math.abs(d2) < 1.0E-5d) {
            return true;
        }
        return false;
    }

    public static boolean a(double[] dArr) {
        if (dArr.length < 16) {
            return false;
        }
        return true;
    }

    public static void d(double[] dArr) {
        if (a(dArr)) {
            dArr[14] = 0.0d;
            dArr[13] = 0.0d;
            dArr[12] = 0.0d;
            dArr[11] = 0.0d;
            dArr[9] = 0.0d;
            dArr[8] = 0.0d;
            dArr[7] = 0.0d;
            dArr[6] = 0.0d;
            dArr[4] = 0.0d;
            dArr[3] = 0.0d;
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[15] = 1.0d;
            dArr[10] = 1.0d;
            dArr[5] = 1.0d;
            dArr[0] = 1.0d;
        }
    }

    public static double b(double[] dArr) {
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double d5 = dArr[3];
        double d6 = dArr[4];
        double d7 = dArr[5];
        double d8 = dArr[6];
        double d9 = dArr[7];
        double d10 = dArr[8];
        double d11 = dArr[9];
        double d12 = dArr[10];
        double d13 = dArr[11];
        double d14 = dArr[12];
        double d15 = dArr[13];
        double d16 = dArr[14];
        double d17 = dArr[15];
        double d18 = d5 * d8;
        double d19 = d4 * d9;
        double d20 = d5 * d7;
        double d21 = d3 * d9;
        double d22 = d4 * d7;
        double d23 = d3 * d8;
        double d24 = d5 * d6;
        double d25 = d9 * d2;
        double d26 = d4 * d6;
        double d27 = d8 * d2;
        double d28 = d3 * d6;
        double d29 = d2 * d7;
        return ((((((((((((((((((((((((d18 * d11) * d14) - ((d19 * d11) * d14)) - ((d20 * d12) * d14)) + ((d21 * d12) * d14)) + ((d22 * d13) * d14)) - ((d23 * d13) * d14)) - ((d18 * d10) * d15)) + ((d19 * d10) * d15)) + ((d24 * d12) * d15)) - ((d25 * d12) * d15)) - ((d26 * d13) * d15)) + ((d27 * d13) * d15)) + ((d20 * d10) * d16)) - ((d21 * d10) * d16)) - ((d24 * d11) * d16)) + ((d25 * d11) * d16)) + ((d28 * d13) * d16)) - ((d13 * d29) * d16)) - ((d22 * d10) * d17)) + ((d23 * d10) * d17)) + ((d26 * d11) * d17)) - ((d27 * d11) * d17)) - ((d28 * d12) * d17)) + (d29 * d12 * d17);
    }

    public static double a(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static double[] a(double[] dArr, double d2) {
        if (a(d2)) {
            d2 = c(dArr);
        }
        double d3 = 1.0d / d2;
        return new double[]{dArr[0] * d3, dArr[1] * d3, dArr[2] * d3};
    }

    public static void a(double[] dArr, double d2, double d3) {
        dArr[12] = d2;
        dArr[13] = d3;
    }

    public static double[] a(double[] dArr, double[] dArr2, double d2) {
        return new double[]{(dArr[0] * 1.0d) + (dArr2[0] * d2), (dArr[1] * 1.0d) + (dArr2[1] * d2), (dArr[2] * 1.0d) + (d2 * dArr2[2])};
    }
}
