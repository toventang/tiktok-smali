package com.bytedance.ies.powerlist.header;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class FixedViewCell extends PowerCell<a> {
    static {
        Covode.recordClassIndex(20492);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.an1, viewGroup, false);
        l.a((Object) a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(a aVar) {
        MethodCollector.i(1152);
        a aVar2 = aVar;
        l.c(aVar2, "");
        View view = aVar2.f34295a;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            View view2 = this.itemView;
            l.a((Object) view2, "");
            if (!l.a(viewGroup, view2.findViewById(R.id.dqe))) {
                viewGroup.removeView(view);
            }
            MethodCollector.o(1152);
            return;
        }
        View view3 = this.itemView;
        l.a((Object) view3, "");
        ((FrameLayout) view3.findViewById(R.id.dqe)).addView(view);
        MethodCollector.o(1152);
    }
}
