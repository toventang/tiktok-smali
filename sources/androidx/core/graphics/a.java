package androidx.core.graphics;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<double[]> f2404a = new ThreadLocal<>();

    private static float a(float f2, float f3) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2 > f3 ? f3 : f2;
    }

    static {
        Covode.recordClassIndex(778);
    }

    private static double a(int i2) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal<double[]> threadLocal = f2404a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length == 3) {
            double d2 = (double) red;
            Double.isNaN(d2);
            double d3 = d2 / 255.0d;
            if (d3 < 0.04045d) {
                pow = d3 / 12.92d;
            } else {
                pow = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            double d4 = (double) green;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                pow2 = d5 / 12.92d;
            } else {
                pow2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = (double) blue;
            Double.isNaN(d6);
            double d7 = d6 / 255.0d;
            if (d7 < 0.04045d) {
                pow3 = d7 / 12.92d;
            } else {
                pow3 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    private static int c(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    public static int b(int i2, int i3) {
        if (i3 >= 0 && i3 <= 255) {
            return (i2 & 16777215) | (i3 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int a(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int c2 = c(alpha2, alpha);
        return Color.argb(c2, a(Color.red(i2), alpha2, Color.red(i3), alpha, c2), a(Color.green(i2), alpha2, Color.green(i3), alpha, c2), a(Color.blue(i2), alpha2, Color.blue(i3), alpha, c2));
    }

    private static double d(int i2, int i3) {
        if (Color.alpha(i3) == 255) {
            if (Color.alpha(i2) < 255) {
                i2 = a(i2, i3);
            }
            double a2 = a(i2) + 0.05d;
            double a3 = a(i3) + 0.05d;
            return Math.max(a2, a3) / Math.min(a2, a3);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
    }

    public static int b(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    public static int a(int i2, int i3, float f2) {
        int i4 = 255;
        if (Color.alpha(i3) == 255) {
            double d2 = (double) f2;
            if (d(b(i2, 255), i3) < d2) {
                return -1;
            }
            int i5 = 0;
            int i6 = 0;
            do {
                int i7 = (i6 + i4) / 2;
                if (d(b(i2, i7), i3) < d2) {
                    i6 = i7;
                } else {
                    i4 = i7;
                }
                i5++;
                if (i5 > 10) {
                    break;
                }
            } while (i4 - i6 > 1);
            return i4;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
    }

    public static void a(int i2, int i3, int i4, float[] fArr) {
        float f2;
        float abs;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float f5 = ((float) i4) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f3) {
                f2 = ((f4 - f5) / f6) % 6.0f;
            } else if (max == f4) {
                f2 = ((f5 - f3) / f6) + 2.0f;
            } else {
                f2 = 4.0f + ((f3 - f4) / f6);
            }
            abs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = a(f8, 360.0f);
        fArr[1] = a(abs, 1.0f);
        fArr[2] = a(f7, 1.0f);
    }

    private static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }
}
