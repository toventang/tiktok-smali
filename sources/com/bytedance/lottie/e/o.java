package com.bytedance.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.c.h;
import androidx.core.h.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.a;
import java.lang.ref.WeakReference;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f40679a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static h<WeakReference<Interpolator>> f40680b;

    static {
        Covode.recordClassIndex(24963);
    }

    private static WeakReference<Interpolator> a(int i2) {
        WeakReference<Interpolator> a2;
        MethodCollector.i(1266);
        synchronized (o.class) {
            try {
                if (f40680b == null) {
                    f40680b = new h<>();
                }
                a2 = f40680b.a(i2, null);
            } finally {
                MethodCollector.o(1266);
            }
        }
        return a2;
    }

    private static void a(int i2, WeakReference<Interpolator> weakReference) {
        MethodCollector.i(1267);
        synchronized (o.class) {
            try {
                f40680b.b(i2, weakReference);
            } finally {
                MethodCollector.o(1267);
            }
        }
    }

    private static <T> a<T> a(JsonReader jsonReader, float f2, af<T> afVar) {
        return new a<>(afVar.a(jsonReader, f2));
    }

    private static <T> a<T> a(g gVar, JsonReader jsonReader, float f2, af<T> afVar) {
        Interpolator interpolator;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        t2 = afVar.a(jsonReader, f2);
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
                        t = afVar.a(jsonReader, f2);
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
                        pointF4 = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        pointF3 = n.b(jsonReader, f2);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f40679a;
            t2 = t;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f40679a;
        } else {
            float f4 = -f2;
            pointF.x = f.a(pointF.x, f4, f2);
            pointF.y = f.a(pointF.y, -100.0f, 100.0f);
            pointF2.x = f.a(pointF2.x, f4, f2);
            pointF2.y = f.a(pointF2.y, -100.0f, 100.0f);
            int i2 = (int) ((((float) (((int) ((((float) (((int) ((((float) (((int) (((pointF.x + 1.0f) * 527.0f) + 1.0f)) * 31)) * (pointF.y + 2.0f)) + 1.0f)) * 31)) * (pointF2.x + 3.0f)) + 1.0f)) * 31)) * (pointF2.y + 4.0f)) + 1.0f);
            WeakReference<Interpolator> a2 = a(i2);
            if (a2 == null || (interpolator = a2.get()) == null) {
                interpolator = b.a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                try {
                    a(i2, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        a<T> aVar = new a<>(gVar, t, t2, interpolator, f3, null);
        aVar.f40725h = pointF3;
        aVar.f40726i = pointF4;
        return aVar;
    }

    public static <T> a<T> a(JsonReader jsonReader, g gVar, float f2, af<T> afVar, boolean z) {
        if (z) {
            return a(gVar, jsonReader, f2, afVar);
        }
        return a(jsonReader, f2, afVar);
    }
}
