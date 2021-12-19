package com.ss.android.ugc.aweme.discover.j;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.discover.adapter.ad;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.model.SearchObserver;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.discover.ui.bh;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.y;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class m extends bh<SearchMusic> {

    /* renamed from: a  reason: collision with root package name */
    private MusicPlayHelper f81277a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f81278b;

    static {
        Covode.recordClassIndex(50505);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.f81278b == null) {
            this.f81278b = new SparseArray();
        }
        View view = (View) this.f81278b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f81278b.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.f81278b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "music";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.discover.ui.bh, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return true;
    }

    public m() {
        this.t = j.f121157e;
    }

    public final void d() {
        MusicPlayHelper musicPlayHelper = this.f81277a;
        if (musicPlayHelper != null) {
            musicPlayHelper.a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void onPause() {
        super.onPause();
        d();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void f() {
        super.f();
        new y().o("music_search_result").f();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        a(new ad(this.f81277a, this.r, v(), this));
        com.ss.android.ugc.aweme.common.h.c.a(w(), new a(this));
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        a(new o());
        g<?> n = n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMusicPresenter");
        n.a((Object) new n());
        n().a_((com.ss.android.ugc.aweme.common.e.c) this);
        n().a((ac) this);
    }

    public static final class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f81279a;

        static {
            Covode.recordClassIndex(50506);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(m mVar) {
            this.f81279a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.common.h.c.b
        public final Object a(int i2) {
            List e2 = this.f81279a.A().e();
            if (e2 == null || i2 < 0 || i2 >= e2.size()) {
                return null;
            }
            return e2.get(i2);
        }
    }

    static final class b implements SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f81280a;

        static {
            Covode.recordClassIndex(50507);
        }

        b(m mVar) {
            this.f81280a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageHidden() {
            SearchStateListener$$CC.onPageHidden(this);
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageResume() {
            SearchStateListener$$CC.onPageResume(this);
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onContentVisible(boolean z) {
            if (!z) {
                this.f81280a.d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            d();
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f81281a;

        static {
            Covode.recordClassIndex(50508);
        }

        c(m mVar) {
            this.f81281a = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f81281a.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        this.f81277a = (MusicPlayHelper) ae.a(activity, (ad.b) null).a(MusicPlayHelper.class);
        e activity2 = getActivity();
        if (activity2 == null) {
            l.b();
        }
        androidx.lifecycle.ac a2 = ae.a(activity2, (ad.b) null).a(SearchStateViewModel.class);
        l.b(a2, "");
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new b(this));
        ((SearchStateViewModel) a2).searchState.observe(this, searchObserver);
        t<Boolean> tVar = C().isShowingFilters;
        if (tVar != null) {
            tVar.observe(this, new c(this));
        }
        super.onViewCreated(view, bundle);
    }
}
