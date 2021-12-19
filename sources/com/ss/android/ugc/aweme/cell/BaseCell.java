package com.ss.android.ugc.aweme.cell;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.be.a;
import com.ss.android.ugc.aweme.dc.e;
import h.f.b.l;

public abstract class BaseCell<T extends a> extends PowerCell<T> {
    static {
        Covode.recordClassIndex(43049);
    }

    public abstract View b(ViewGroup viewGroup);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        super.m();
        a();
    }

    private final e a() {
        a aVar = (a) this.f34234d;
        if (aVar != null) {
            return aVar.f68538a;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        e a2 = a();
        if (a2 != null) {
            a2.ce_();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return b(viewGroup);
    }

    public void a(T t) {
        l.d(t, "");
        super.a((com.bytedance.ies.powerlist.b.a) t);
        boolean b2 = t.b();
        if (b2) {
            View view = this.itemView;
            l.b(view, "");
            view.setVisibility(0);
            View view2 = this.itemView;
            l.b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
        } else if (!b2) {
            View view3 = this.itemView;
            l.b(view3, "");
            view3.setVisibility(8);
            View view4 = this.itemView;
            l.b(view4, "");
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = 0;
                layoutParams2.height = 0;
            }
        }
    }
}
