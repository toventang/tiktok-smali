package com.ss.android.ugc.aweme.discover.ui;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.content.b;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.adapter.aj;
import com.ss.android.ugc.aweme.discover.adapter.k;
import com.ss.android.ugc.aweme.discover.e.p;
import com.ss.android.ugc.aweme.discover.mob.m;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.ss.android.ugc.aweme.keyword.SearchKeywordViewModel;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.search.survey.SurveyViewController;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.ss.android.ugc.aweme.search.theme.c;
import com.ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.ss.android.ugc.aweme.utils.ef;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class ap extends a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    protected d f82311a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f82312b = true;

    /* renamed from: c  reason: collision with root package name */
    ViewPager f82313c;

    /* renamed from: d  reason: collision with root package name */
    DmtTabLayout f82314d;

    /* renamed from: e  reason: collision with root package name */
    View f82315e;

    /* renamed from: j  reason: collision with root package name */
    ViewPager.e f82316j;

    /* renamed from: k  reason: collision with root package name */
    public int f82317k;

    /* renamed from: l  reason: collision with root package name */
    boolean f82318l;

    /* renamed from: m  reason: collision with root package name */
    int f82319m;
    int n;
    final ArgbEvaluator o = new ArgbEvaluator();
    public SurveyViewModel p;
    boolean q = false;
    public DmtTabLayout.c r;
    private aj<am> s;
    private AnalysisStayTimeFragmentComponent t;
    private SearchIntermediateViewModel u;
    private SearchKeywordViewModel v;
    private ThemeViewModel w;
    private SurveyViewController y;

    static {
        Covode.recordClassIndex(51231);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(304, new g(ap.class, "onSearchViewAllEvent", p.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.q = true;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        return new Analysis().setLabelName("search");
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        if (this.f82318l) {
            return R.layout.aw3;
        }
        return R.layout.aw2;
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        com.ss.android.ugc.aweme.search.l.a.a.f121302c.a(2, "SearchContainerFragment#onDetach");
    }

    public final void c() {
        com.ss.android.ugc.aweme.search.n.d fetchOwnSource = com.ss.android.ugc.aweme.search.n.d.fetchOwnSource();
        if (d() != null && fetchOwnSource != null) {
            fetchOwnSource.update(new at(this, fetchOwnSource));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.q = false;
        SearchTabJumpCenter.INSTANCE.setSearchTabViewModel((SearchTabViewModel) ae.a(getActivity(), (ad.b) null).a(SearchTabViewModel.class));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventBus a2 = EventBus.a();
        if (!a2.a(this)) {
            EventBus.a(a2, this);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventBus a2 = EventBus.a();
        if (a2.a(this)) {
            a2.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i2;
        Context context = getContext();
        if (this.f82318l) {
            i2 = R.color.a_;
        } else {
            i2 = R.color.bx;
        }
        return b.c(context, i2);
    }

    public final am d() {
        int i2;
        if (this.u.getSearchTabIndex() != null) {
            i2 = this.u.getSearchTabIndex().getValue().intValue();
        } else {
            i2 = 0;
        }
        return (am) this.s.c(i2);
    }

    public final void a(int i2) {
        ViewPager viewPager = this.f82313c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(c cVar) {
        if (this.f82318l) {
            return cVar.f121705b;
        }
        return R.color.b2;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.t = new AnalysisStayTimeFragmentComponent(this, true);
    }

    public static ap a(d dVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", dVar);
        ap apVar = new ap();
        apVar.setArguments(bundle);
        return apVar;
    }

    public final void b(int i2) {
        if (d() != null) {
            com.ss.android.ugc.aweme.search.n.c cVar = new com.ss.android.ugc.aweme.search.n.c(i2);
            com.ss.android.ugc.aweme.search.n.b bVar = d().p;
            l.d(bVar, "");
            cVar.f121543a = bVar;
            e activity = getActivity();
            l.d(activity, "");
            l.d(cVar, "");
            com.bytedance.track.c.a(activity).f44410c.a().a("Search", cVar, com.ss.android.ugc.aweme.search.n.c.class);
        }
    }

    @r
    public void onSearchViewAllEvent(p pVar) {
        if (this.f82313c != null) {
            com.ss.android.ugc.aweme.discover.mob.d.f81883b = true;
            com.ss.android.ugc.aweme.discover.mob.d.f81884c = true;
            com.ss.android.ugc.aweme.discover.mob.d.f81885d = true;
            if (pVar.f80970b != null) {
                this.f82311a.setIsFilterFromSchema(true);
                this.f82311a.setFilterOption(pVar.f80970b);
            }
            this.f82313c.setCurrentItem(pVar.f80969a);
        }
    }

    public final void a(ViewPager.e eVar) {
        this.f82316j = eVar;
        ViewPager viewPager = this.f82313c;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(eVar);
        }
    }

    public final void b(d dVar) {
        this.f82311a = dVar;
        if (ab_()) {
            SearchResultParamProvider.a.a(getContext(), dVar);
            this.s.f80368b = this.f82311a;
        }
        if (ab_()) {
            for (am amVar : new ArrayList(((k) this.s).f80560a.values())) {
                amVar.a(this.f82311a);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f82311a == null && getArguments() != null) {
            this.f82311a = (d) getArguments().getSerializable("search_param");
            SearchResultParamProvider.a.a(getActivity(), this.f82311a);
        }
        this.u = (SearchIntermediateViewModel) ae.a(getActivity(), (ad.b) null).a(SearchIntermediateViewModel.class);
        this.v = (SearchKeywordViewModel) ae.a(getActivity(), (ad.b) null).a(SearchKeywordViewModel.class);
        this.w = (ThemeViewModel) ae.a(getActivity(), (ad.b) null).a(ThemeViewModel.class);
        this.p = (SurveyViewModel) ae.a(getActivity(), (ad.b) null).a(SurveyViewModel.class);
    }

    public final void c(int i2) {
        boolean z;
        com.ss.android.ugc.aweme.keyword.b value = this.v.a().getValue();
        if (value != null && !TextUtils.isEmpty(value.f105233a)) {
            this.v.a().setValue(new com.ss.android.ugc.aweme.keyword.b(value.f105233a, ""));
        }
        this.u.getSearchTabIndex().setValue(Integer.valueOf(i2));
        q a2 = am.a();
        if (a2 != null) {
            a2.a(i2);
        }
        b(i2);
        c();
        if (ak.f80153a) {
            am amVar = (am) this.s.c(i2);
            com.ss.android.ugc.aweme.discover.ui.a.b.a.a a3 = com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(com.ss.android.ugc.aweme.search.j.a(i2));
            boolean z2 = false;
            if (amVar != null) {
                com.ss.android.ugc.aweme.search.g.b bVar = amVar.D;
                if (bVar != null) {
                    com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot = this.u.getShowSearchFilterDot();
                    if (bVar.isDefaultOption() || bVar.isFromSchema()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    showSearchFilterDot.setValue(Boolean.valueOf(z));
                } else {
                    this.u.getShowSearchFilterDot().setValue(false);
                }
                com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter = this.u.getEnableSearchFilter();
                if (com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(a3) && amVar.r() && amVar.E) {
                    z2 = true;
                }
                enableSearchFilter.setValue(Boolean.valueOf(z2));
            } else if (i2 == 0) {
                this.u.getEnableSearchFilter().setValue(Boolean.valueOf(com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(a3)));
            } else {
                this.u.getShowSearchFilterDot().setValue(false);
                this.u.getEnableSearchFilter().setValue(Boolean.valueOf(com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(a3)));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        aj<am> ajVar = new aj<>(getChildFragmentManager(), getContext(), com.ss.android.ugc.aweme.search.j.a());
        this.s = ajVar;
        ajVar.f80368b = this.f82311a;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.fkc);
        this.f82313c = viewPager;
        viewPager.setOffscreenPageLimit(0);
        this.f82313c.setAdapter(this.s);
        ViewPager.e eVar = this.f82316j;
        if (eVar != null) {
            this.f82313c.addOnPageChangeListener(eVar);
        }
        this.f82314d = (DmtTabLayout) view.findViewById(R.id.ehe);
        this.f82315e = view.findViewById(R.id.dvh);
        this.f82314d.setCustomTabViewResId(R.layout.aw2);
        this.f82314d.setupWithViewPager(this.f82313c);
        this.f82314d.setOnTabClickListener(new DmtTabLayout.b() {
            /* class com.ss.android.ugc.aweme.discover.ui.ap.AnonymousClass2 */

            static {
                Covode.recordClassIndex(51233);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
            public final void a(DmtTabLayout.f fVar) {
                fVar.a();
                ap.this.c(fVar.f33752e);
            }
        });
        this.f82314d.a(new DmtTabLayout.c() {
            /* class com.ss.android.ugc.aweme.discover.ui.ap.AnonymousClass3 */

            static {
                Covode.recordClassIndex(51234);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void b(DmtTabLayout.f fVar) {
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void a(DmtTabLayout.f fVar) {
                int i2 = fVar.f33752e;
                ap.this.f82311a.setIndex(i2);
                if (ap.this.f82317k != i2 && TextUtils.equals(m.c(ap.this.f82317k), com.ss.android.ugc.aweme.search.i.TOP.getTabName())) {
                    com.ss.android.ugc.aweme.search.l.a.a.f121302c.a(2, "select other tab.");
                }
                ap.this.f82317k = i2;
                ap.this.p.f121648c.postValue(true);
                ap.this.c(i2);
            }
        });
        c(this.f82313c.getCurrentItem());
        DmtTabLayout.c cVar = this.r;
        if (cVar != null) {
            this.f82314d.a(cVar);
        }
        this.f82314d.setTabMode(0);
        this.f82314d.setAutoFillWhenScrollable(true);
        this.f82314d.a(n.a(16.0d), n.a(16.0d));
        this.f82314d.post(new au(this));
        a(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.discover.ui.ap.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51232);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
                if (ap.this.f82312b && f2 == 0.0f && i3 == 0) {
                    ap.this.b(i2);
                    ap.this.c();
                    ap.this.f82312b = false;
                }
            }
        });
        SearchTabViewModel.addObserver(view, this, new aq(this));
        d dVar = this.f82311a;
        if (!(dVar == null || dVar.getIndex() == 0)) {
            a(this.f82311a.getIndex());
        }
        this.w.d().observe(this, new ar(this));
        this.w.c().observe(this, new as(this));
        this.y = new SurveyViewController();
        if (getActivity() != null) {
            SurveyViewController surveyViewController = this.y;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.dw0);
            e activity = getActivity();
            l.d(viewStub, "");
            l.d(activity, "");
            surveyViewController.f121612a = viewStub;
            surveyViewController.f121613b = activity;
            ef.a(surveyViewController.b().f121647b, activity, new SurveyViewController.e(surveyViewController));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.ss.android.ugc.aweme.search.l.k.INSTANCE.getView(getContext(), R.layout.av2, viewGroup);
    }
}
