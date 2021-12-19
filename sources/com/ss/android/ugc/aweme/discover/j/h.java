package com.ss.android.ugc.aweme.discover.j;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.discover.adapter.u;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.discover.ui.bh;
import com.ss.android.ugc.aweme.search.j;
import java.util.Objects;

public final class h extends bh<SearchChallenge> {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f81252a;

    static {
        Covode.recordClassIndex(50490);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.f81252a == null) {
            this.f81252a = new SparseArray();
        }
        View view = (View) this.f81252a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f81252a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.f81252a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "tag";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.discover.ui.bh, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    public h() {
        this.t = j.f121159g;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        a(new u(this.r, v(), this));
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        a(new j());
        g<?> n = n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchChallengePresenter");
        n.a((Object) new i());
        n().a_((c) this);
        n().a((ac) this);
    }
}
