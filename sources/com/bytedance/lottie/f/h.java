package com.bytedance.lottie.f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.r;
import com.bytedance.lottie.e;
import java.io.Closeable;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final PathMeasure f40699a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private static final Path f40700b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private static final Path f40701c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f40702d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    private static final float f40703e = ((float) Math.sqrt(2.0d));

    /* renamed from: f  reason: collision with root package name */
    private static float f40704f = -1.0f;

    public static float a() {
        if (f40704f == -1.0f) {
            f40704f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f40704f;
    }

    static {
        Covode.recordClassIndex(24984);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float a(Matrix matrix) {
        float[] fArr = f40702d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f40703e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]))) / 2.0f;
    }

    public static void a(Path path, r rVar) {
        if (rVar != null) {
            a(path, rVar.f40411b.d().floatValue() / 100.0f, rVar.f40412c.d().floatValue() / 100.0f, rVar.f40413d.d().floatValue() / 360.0f);
        }
    }

    public static void a(Path path, float f2, float f3, float f4) {
        e.b("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f40699a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            e.c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f3 - f2) - 1.0f)) < 0.01d) {
            e.c("applyTrimPathIfNeeded");
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = (float) f.a(min, length);
                max = (float) f.a(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.a(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.a(max, length);
            }
            if (min == max) {
                path.reset();
                e.c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            Path path2 = f40700b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = f40701c;
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                Path path4 = f40701c;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            e.c("applyTrimPathIfNeeded");
        }
    }
}
