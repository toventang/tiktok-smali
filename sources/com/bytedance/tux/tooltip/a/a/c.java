package com.bytedance.tux.tooltip.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.h.d;
import com.bytedance.tux.tooltip.a.a.d;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.g.a;
import h.w;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class c extends LinearLayout {
    static {
        Covode.recordClassIndex(27693);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, R.attr.cg);
        final int parseColor;
        l.c(context, "");
        MethodCollector.i(8818);
        setOrientation(1);
        int[] iArr = {R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw};
        l.a((Object) iArr, "");
        Integer a2 = d.a(context, iArr, 1);
        if (a2 != null) {
            parseColor = a2.intValue();
        } else {
            parseColor = Color.parseColor("#33FFFFFF");
        }
        setDividerDrawable(f.a(new b<e, z>() {
            /* class com.bytedance.tux.tooltip.a.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(27694);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(e eVar) {
                e eVar2 = eVar;
                l.c(eVar2, "");
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                eVar2.f44781g = a.a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics()));
                eVar2.f44775a = Integer.valueOf(parseColor);
                return z.f158842a;
            }
        }).a(context));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        setDividerPadding(a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        setShowDividers(2);
        MethodCollector.o(8818);
    }

    public final void setActions(List<? extends a> list) {
        l.c(list, "");
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View view = (a) it.next();
            if (view instanceof View) {
                if (view != null) {
                    addView(view);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (view instanceof d.a) {
                Context context = getContext();
                l.a((Object) context, "");
                e eVar = new e(context, (byte) 0);
                eVar.setAction((d.a) view);
                addView(eVar);
            } else if (view instanceof d.b) {
                Context context2 = getContext();
                l.a((Object) context2, "");
                f fVar = new f(context2, (byte) 0);
                fVar.setAction((d.b) view);
                addView(fVar);
            }
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
