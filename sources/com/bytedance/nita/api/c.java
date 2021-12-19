package com.bytedance.nita.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.f.b;
import h.f.b.l;

public interface c {
    static {
        Covode.recordClassIndex(25459);
    }

    String a();

    void a(View view, Activity activity);

    ViewGroup b(Context context);

    b b();

    e c();

    int[] d();

    int e();

    g f();

    f g();

    public static final class a {
        static {
            Covode.recordClassIndex(25460);
        }

        public static ViewGroup a(Context context) {
            MethodCollector.i(6446);
            l.c(context, "");
            FrameLayout frameLayout = new FrameLayout(context);
            MethodCollector.o(6446);
            return frameLayout;
        }
    }
}
