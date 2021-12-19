package com.ss.android.ugc.aweme.comment.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;

final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final h f71398a;

    static {
        Covode.recordClassIndex(43948);
    }

    n(h hVar) {
        this.f71398a = hVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        h hVar = this.f71398a;
        Boolean bool = (Boolean) obj;
        if (hVar.y != null && hVar.f71377d != null) {
            hVar.f71377d.setVisibility(bool.booleanValue() ? !(hVar.y.getAliasAweme() != null) ? 0 : 4 : 8);
            ConstraintLayout.a aVar = (ConstraintLayout.a) hVar.f71378e.getLayoutParams();
            aVar.f2045b = (int) com.bytedance.common.utility.n.b(hVar.itemView.getContext(), bool.booleanValue() ? 16.0f : 52.0f);
            hVar.f71378e.setLayoutParams(aVar);
            if (bool.booleanValue()) {
                o.b(false, hVar.f71380g, hVar.f71379f, hVar.f71381h);
            } else if (hVar.y.getAliasAweme() == null) {
                o.b(true, hVar.f71380g, hVar.f71379f, hVar.f71381h);
                hVar.d();
            }
        }
    }
}
