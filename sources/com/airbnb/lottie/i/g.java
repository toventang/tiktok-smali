package com.airbnb.lottie.i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.s;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<float[]> f5695a = new ThreadLocal<float[]>() {
        /* class com.airbnb.lottie.i.g.AnonymousClass4 */

        static {
            Covode.recordClassIndex(2393);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ float[] initialValue() {
            return new float[4];
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f5696b = new ThreadLocal<PathMeasure>() {
        /* class com.airbnb.lottie.i.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2390);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<Path> f5697c = new ThreadLocal<Path>() {
        /* class com.airbnb.lottie.i.g.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2391);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Path> f5698d = new ThreadLocal<Path>() {
        /* class com.airbnb.lottie.i.g.AnonymousClass3 */

        static {
            Covode.recordClassIndex(2392);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final float f5699e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    private static final PathMeasure f5700f = new PathMeasure();

    /* renamed from: g  reason: collision with root package name */
    private static final Path f5701g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private static final Path f5702h = new Path();

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f5703i = new float[4];

    /* renamed from: j  reason: collision with root package name */
    private static final float f5704j = ((float) Math.sqrt(2.0d));

    /* renamed from: k  reason: collision with root package name */
    private static float f5705k = -1.0f;

    public static float a() {
        if (f5705k == -1.0f) {
            f5705k = Resources.getSystem().getDisplayMetrics().density;
        }
        return f5705k;
    }

    static {
        Covode.recordClassIndex(2389);
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
        if (d.a.f5625a) {
            float[] fArr = f5695a.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f2 = f5699e;
            fArr[2] = f2;
            fArr[3] = f2;
            matrix.mapPoints(fArr);
            return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
        }
        float[] fArr2 = f5703i;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        float f3 = f5704j;
        fArr2[2] = f3;
        fArr2[3] = f3;
        matrix.mapPoints(fArr2);
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    public static void a(Path path, s sVar) {
        if (sVar != null) {
            if (d.a.f5625a) {
                a(path, ((c) sVar.f5252b).g() / 100.0f, ((c) sVar.f5253c).g() / 100.0f, ((c) sVar.f5254d).g() / 360.0f);
                return;
            }
            a(path, sVar.f5252b.f().floatValue() / 100.0f, sVar.f5253c.f().floatValue() / 100.0f, sVar.f5254d.f().floatValue() / 360.0f);
        }
    }

    public static Bitmap a(Bitmap bitmap, int i2, int i3, h hVar) {
        int i4;
        int i5;
        Bitmap bitmap2;
        MethodCollector.i(4331);
        if (bitmap == null || hVar == null || i2 <= 0 || i3 <= 0) {
            MethodCollector.o(4331);
            return bitmap;
        } else if (d.a.f5630f) {
            if (d.e.f5651c) {
                int i6 = hVar.f5654a;
                int i7 = hVar.f5655b;
                if (i6 >= 32 && i7 >= 32) {
                    i4 = i2 / 2;
                    i5 = i3 / 2;
                    if (bitmap.getWidth() <= i4 || bitmap.getHeight() > i5) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
                        bitmap.recycle();
                    } else {
                        bitmap2 = bitmap;
                    }
                    if (bitmap2.getWidth() < i2 || bitmap2.getHeight() < i3) {
                        hVar.f5661h = true;
                    }
                    if (d.f5620a && !(bitmap.getWidth() == i2 && bitmap.getHeight() == i3)) {
                        bitmap.getWidth();
                        bitmap.getHeight();
                    }
                    MethodCollector.o(4331);
                    return bitmap2;
                }
            }
            i4 = i2;
            i5 = i3;
            if (bitmap.getWidth() <= i4) {
            }
            bitmap2 = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
            bitmap.recycle();
            hVar.f5661h = true;
            bitmap.getWidth();
            bitmap.getHeight();
            MethodCollector.o(4331);
            return bitmap2;
        } else if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            MethodCollector.o(4331);
            return bitmap;
        } else {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
            bitmap.recycle();
            MethodCollector.o(4331);
            return createScaledBitmap;
        }
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void a(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure;
        Path path2;
        Path path3;
        com.airbnb.lottie.d.b("applyTrimPathIfNeeded");
        if (d.a.f5625a) {
            pathMeasure = f5696b.get();
            path2 = f5697c.get();
            path3 = f5698d.get();
        } else {
            pathMeasure = f5700f;
            path2 = f5701g;
            path3 = f5702h;
        }
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            com.airbnb.lottie.d.c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f3 - f2) - 1.0f)) < 0.01d) {
            com.airbnb.lottie.d.c("applyTrimPathIfNeeded");
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
                com.airbnb.lottie.d.c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.airbnb.lottie.d.c("applyTrimPathIfNeeded");
        }
    }
}
