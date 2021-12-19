package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.c.h;
import androidx.core.h.b.b;
import com.airbnb.lottie.e;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f5670a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static h<WeakReference<Interpolator>> f5671b;

    o() {
    }

    static {
        Covode.recordClassIndex(2369);
    }

    private static WeakReference<Interpolator> a(int i2) {
        WeakReference<Interpolator> a2;
        MethodCollector.i(4454);
        synchronized (o.class) {
            try {
                if (f5671b == null) {
                    f5671b = new h<>();
                }
                a2 = f5671b.a(i2, null);
            } finally {
                MethodCollector.o(4454);
            }
        }
        return a2;
    }

    private static void a(int i2, WeakReference<Interpolator> weakReference) {
        MethodCollector.i(4457);
        synchronized (o.class) {
            try {
                f5671b.b(i2, weakReference);
            } finally {
                MethodCollector.o(4457);
            }
        }
    }

    private static <T> a<T> a(JsonReader jsonReader, float f2, af<T> afVar) {
        return new a<>(afVar.a(jsonReader, f2));
    }

    private static <T> a<T> a(e eVar, JsonReader jsonReader, float f2, af<T> afVar) {
        Interpolator interpolator;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        float f3 = 0.0f;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        t = afVar.a(jsonReader, f2);
                        continue;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        if (jsonReader.nextInt() == 1) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                        }
                    }
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        pointF2 = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        pointF = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        t2 = afVar.a(jsonReader, f2);
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        f3 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        pointF3 = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        pointF4 = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f5670a;
            t = t2;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f5670a;
        } else {
            float f4 = -f2;
            pointF.x = f.a(pointF.x, f4, f2);
            pointF.y = f.a(pointF.y, -100.0f, 100.0f);
            pointF2.x = f.a(pointF2.x, f4, f2);
            pointF2.y = f.a(pointF2.y, -100.0f, 100.0f);
            float f5 = pointF.x;
            float f6 = pointF.y;
            float f7 = pointF2.x;
            float f8 = pointF2.y;
            int i2 = 17;
            if (f5 != 0.0f) {
                i2 = (int) (f5 * 527.0f);
            }
            if (f6 != 0.0f) {
                i2 = (int) (((float) (i2 * 31)) * f6);
            }
            if (f7 != 0.0f) {
                i2 = (int) (((float) (i2 * 31)) * f7);
            }
            if (f8 != 0.0f) {
                i2 = (int) (((float) (i2 * 31)) * f8);
            }
            WeakReference<Interpolator> a2 = a(i2);
            if (a2 == null || (interpolator = a2.get()) == null) {
                interpolator = b.a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                try {
                    a(i2, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        a<T> aVar = new a<>(eVar, t2, t, interpolator, f3, null);
        aVar.f5719k = pointF4;
        aVar.f5720l = pointF3;
        return aVar;
    }

    static <T> a<T> a(JsonReader jsonReader, e eVar, float f2, af<T> afVar, boolean z) {
        if (z) {
            return a(eVar, jsonReader, f2, afVar);
        }
        return a(jsonReader, f2, afVar);
    }
}
