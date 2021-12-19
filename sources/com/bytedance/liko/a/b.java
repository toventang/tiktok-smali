package com.bytedance.liko.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.entity.d;
import com.bytedance.crash.j.i;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.liko.b.e;
import java.util.Map;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f40056a = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<Bitmap, a> f40059a = new WeakHashMap<>();

        static {
            Covode.recordClassIndex(24692);
        }
    }

    static {
        Covode.recordClassIndex(24690);
    }

    /* renamed from: com.bytedance.liko.a.b$b  reason: collision with other inner class name */
    public static class RunnableC0979b implements Runnable {
        static {
            Covode.recordClassIndex(24693);
        }

        public final void run() {
            MethodCollector.i(14065);
            System.gc();
            synchronized (this) {
                try {
                    for (Map.Entry<Bitmap, a> entry : b.f40056a.f40059a.entrySet()) {
                        a value = entry.getValue();
                        if (Npth.isInit()) {
                            d a2 = d.a(new StackTraceElement(value.getClass().getName(), "report", "BitmapEvent", 0), value.f40048a, value.f40053f, Thread.currentThread().getName(), false, "EnsureNotNull", "BitmapWarning");
                            a2.c("CreateThread", value.f40049b);
                            a2.c("CreateTime", String.valueOf(value.f40052e));
                            a2.c("BitmapWidth", String.valueOf(value.f40050c));
                            a2.c("BitmapHeigth", String.valueOf(value.f40051d));
                            if ("BitmapOverViewEvent".equals(value.f40053f)) {
                                a2.c("ImageViewHeigth", String.valueOf(value.f40054g));
                                a2.c("ImageViewWidth", String.valueOf(value.f40055h));
                            }
                            i.a(a2);
                        }
                        if (e.f40082b != null) {
                            com.bytedance.liko.b.b bVar = e.f40082b;
                            a value2 = entry.getValue();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("BitmapWarning:" + value2.f40053f + "\n");
                            stringBuffer.append("CreateThread:" + value2.f40049b + " CreateTime:" + value2.f40052e + " width:" + value2.f40050c + " height" + value2.f40051d + "\n");
                            stringBuffer.append(value2.f40048a + "\n");
                            bVar.a(stringBuffer.toString());
                        }
                    }
                } finally {
                    MethodCollector.o(14065);
                }
            }
        }
    }
}
