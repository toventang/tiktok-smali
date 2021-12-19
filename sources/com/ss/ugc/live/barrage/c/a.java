package com.ss.ugc.live.barrage.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f154101a = new a();

    /* renamed from: com.ss.ugc.live.barrage.c.a$a  reason: collision with other inner class name */
    public interface AbstractC4101a {
        static {
            Covode.recordClassIndex(102751);
        }

        void a(View view, Bitmap bitmap);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(102750);
    }

    public static void a(View view, AbstractC4101a aVar) {
        l.c(view, "");
        l.c(aVar, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null && !drawingCache.isRecycled()) {
                aVar.a(view, drawingCache);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Context context, int i2, AbstractC4101a aVar) {
        MethodCollector.i(10831);
        l.c(context, "");
        l.c(aVar, "");
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        l.a((Object) inflate, "");
        a(inflate, aVar);
        MethodCollector.o(10831);
    }
}
