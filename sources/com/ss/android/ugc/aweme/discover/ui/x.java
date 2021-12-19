package com.ss.android.ugc.aweme.discover.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.helper.ai;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.lynx.container.f;
import com.ss.android.ugc.aweme.discover.model.SearchObserver;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.j;
import h.f.b.l;

public final class x extends u {
    private boolean K = true;
    private SparseArray L;
    private MusicPlayHelper o;

    static {
        Covode.recordClassIndex(51568);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final View a(int i2) {
        if (this.L == null) {
            this.L = new SparseArray();
        }
        View view = (View) this.L.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.L.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am
    public final void aT_() {
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "music";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.u, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return this.K;
    }

    public final void n() {
        MusicPlayHelper musicPlayHelper = this.o;
        if (musicPlayHelper != null) {
            musicPlayHelper.a();
        }
    }

    public x() {
        this.t = j.f121157e;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u
    public final boolean m() {
        if (com.bytedance.ies.abmock.b.a().a(true, "dynamic_search_music_container_type", 0) == 1) {
            return true;
        }
        return false;
    }

    static final class a implements SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f82785a;

        static {
            Covode.recordClassIndex(51569);
        }

        a(x xVar) {
            this.f82785a = xVar;
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
                this.f82785a.n();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.u, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            n();
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f82786a;

        static {
            Covode.recordClassIndex(51570);
        }

        b(x xVar) {
            this.f82786a = xVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f82786a.n();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.aa
    public final void a(f fVar) {
        l.d(fVar, "");
        fVar.a(ai.a(u(), this.v, s.a.a().a()));
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        this.o = (MusicPlayHelper) ae.a(activity, (ad.b) null).a(MusicPlayHelper.class);
        e activity2 = getActivity();
        if (activity2 == null) {
            l.b();
        }
        ac a2 = ae.a(activity2, (ad.b) null).a(SearchStateViewModel.class);
        l.b(a2, "");
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new a(this));
        ((SearchStateViewModel) a2).searchState.observe(this, searchObserver);
        t<Boolean> tVar = b().isShowingFilters;
        if (tVar != null) {
            tVar.observe(this, new b(this));
        }
        super.onViewCreated(view, bundle);
    }
}
