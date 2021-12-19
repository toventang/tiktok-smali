package com.bytedance.tux.table.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.g.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f45405a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f45406b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final int f45407c;

    private b() {
    }

    static {
        Covode.recordClassIndex(27646);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f45405a = a.a(TypedValue.applyDimension(1, 86.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        f45407c = a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
    }

    public static void b(ConstraintLayout constraintLayout, View view, View view2) {
        l.c(constraintLayout, "");
        l.c(view, "");
        l.c(view2, "");
        constraintLayout.removeView(view);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.a(constraintLayout);
        bVar.a(view.getId());
        bVar.a(view2.getId(), 7, constraintLayout.getId(), 7);
        bVar.b(constraintLayout);
    }

    public static void a(ConstraintLayout constraintLayout, View view, View view2) {
        MethodCollector.i(6819);
        l.c(constraintLayout, "");
        l.c(view, "");
        l.c(view2, "");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        view.setId(R.id.euh);
        constraintLayout.addView(view);
        int id = view.getId();
        int id2 = view2.getId();
        int id3 = constraintLayout.getId();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.a(constraintLayout);
        bVar.a(id, 3, id3, 3);
        bVar.a(id, 7, id3, 7);
        bVar.a(id2, 7, id, 6);
        bVar.a(id2, 0.0f);
        bVar.a(id, 6, id2, 7);
        bVar.a(id, 1.0f);
        bVar.c(id2);
        bVar.b(constraintLayout);
        i.b(view, Integer.valueOf(f45407c), null, null, null, false, 30);
        MethodCollector.o(6819);
    }
}
