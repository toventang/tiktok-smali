package com.ss.android.ugc.aweme.discover.ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ai;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.lynx.container.f;
import h.f.b.l;

public final class y extends u {
    private SparseArray K;
    private boolean o;

    static {
        Covode.recordClassIndex(51571);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final View a(int i2) {
        if (this.K == null) {
            this.K = new SparseArray();
        }
        View view = (View) this.K.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.K.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final void aT_() {
        SparseArray sparseArray = this.K;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "shop";
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u
    public final boolean m() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.aa
    public final void a(f fVar) {
        l.d(fVar, "");
        fVar.a(ai.b(u(), this.v, s.a.a().a()));
    }
}
