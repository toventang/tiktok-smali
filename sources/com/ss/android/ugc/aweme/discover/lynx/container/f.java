package com.ss.android.ugc.aweme.discover.lynx.container;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public interface f {
    static {
        Covode.recordClassIndex(50622);
    }

    void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams);

    void a(d dVar);

    void a(String str, JSONObject jSONObject);

    void a(List<a> list);

    void b(String str);

    View getRealView();

    public static final class a {
        static {
            Covode.recordClassIndex(50623);
        }

        public static void a(f fVar, ViewGroup viewGroup, int i2, ViewGroup.LayoutParams layoutParams) {
            MethodCollector.i(2113);
            l.d(viewGroup, "");
            l.d(layoutParams, "");
            View realView = fVar.getRealView();
            ViewParent parent = realView.getParent();
            if (l.a(parent, viewGroup)) {
                MethodCollector.o(2113);
                return;
            }
            if (parent != null) {
                ((ViewGroup) parent).removeView(realView);
            }
            viewGroup.addView(realView, 0, layoutParams);
            MethodCollector.o(2113);
        }
    }
}
