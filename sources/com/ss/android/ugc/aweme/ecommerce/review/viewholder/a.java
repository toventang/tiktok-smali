package com.ss.android.ugc.aweme.ecommerce.review.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(54671);
    }

    public static final <T, V extends View> void a(ViewGroup viewGroup, List<? extends T> list, h.f.a.a<? extends V> aVar, q<? super V, ? super T, ? super Integer, z> qVar) {
        MethodCollector.i(4918);
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(qVar, "");
        if (list == null || list.isEmpty()) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
        }
        if (l.a(viewGroup.getTag(), list) || list == null) {
            viewGroup.setTag(list);
            MethodCollector.o(4918);
            return;
        }
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                View view = (View) aVar.invoke();
                viewGroup.addView(view);
                qVar.invoke(view, t, Integer.valueOf(i2));
            } else {
                childAt.setVisibility(0);
                qVar.invoke(childAt, t, Integer.valueOf(i2));
            }
            i2 = i3;
        }
        if (viewGroup.getChildCount() > list.size()) {
            int childCount = viewGroup.getChildCount();
            for (int size = list.size(); size < childCount; size++) {
                View childAt2 = viewGroup.getChildAt(size);
                l.b(childAt2, "");
                childAt2.setVisibility(8);
            }
        }
        MethodCollector.o(4918);
    }
}
