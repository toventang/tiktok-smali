package com.ss.android.ugc.aweme.discover.jedi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.discover.a.w;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mixfeed.cs.ClickSearchViewModel;
import com.ss.android.ugc.aweme.discover.mixfeed.lynx.d;
import com.ss.android.ugc.aweme.discover.mixfeed.u;
import com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.GradientBgData;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchObserver;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.l.l;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.e;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController;
import com.zhiliaoapp.musically.R;
import h.p;
import h.v;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class b extends a<com.ss.android.ugc.aweme.discover.mixfeed.h> implements com.ss.android.ugc.aweme.common.m {

    /* renamed from: m  reason: collision with root package name */
    public static final a f81338m = new a((byte) 0);
    private ag Y;
    private ClickSearchViewModel Z;
    private final h.h aa = h.i.a((h.f.a.a) m.f81361a);
    private com.ss.android.ugc.aweme.discover.lynx.e.a ab;
    private u ac;
    private final androidx.lifecycle.u<Integer> ad;
    private EventCenter ae;
    private boolean af;
    private final h.h ag;
    private SparseArray ah;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f81339b;

    /* renamed from: c  reason: collision with root package name */
    public MusicPlayHelper f81340c;

    /* renamed from: d  reason: collision with root package name */
    public SurveyViewModel f81341d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.mixfeed.ui.a f81342e = new com.ss.android.ugc.aweme.discover.mixfeed.ui.a();

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.b.g f81343j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.theme.b f81344k;

    /* renamed from: l  reason: collision with root package name */
    public SearchRecyclerView f81345l;

    static final class m extends h.f.b.m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f81361a = new m();

        static {
            Covode.recordClassIndex(50559);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(50543);
    }

    private final int[] Q() {
        return (int[]) this.aa.getValue();
    }

    private final C1894b.AnonymousClass1 S() {
        return (C1894b.AnonymousClass1) this.ag.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.jedi.a, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.ah == null) {
            this.ah = new SparseArray();
        }
        View view = (View) this.ah.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.ah.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.jedi.a, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.ah;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "general_search";
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.discover.ui.av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(2, new org.greenrobot.eventbus.g(b.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(186, new org.greenrobot.eventbus.g(b.class, "onReceiveCancelEvent", com.ss.android.ugc.aweme.discover.e.a.class, ThreadMode.BACKGROUND, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final boolean s() {
        return false;
    }

    static final class a {
        static {
            Covode.recordClassIndex(50544);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class o implements com.ss.android.ugc.aweme.discover.lynx.e.c {
        static {
            Covode.recordClassIndex(50561);
        }

        o() {
        }

        @Override // com.ss.android.ugc.aweme.discover.lynx.e.c
        public final List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            h.f.b.l.d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.h(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.e(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.g(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.f(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.c(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.i(bVar));
            return arrayList;
        }
    }

    public final void a(GlobalDoodleConfig globalDoodleConfig) {
        if (globalDoodleConfig != null) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            if (!(A instanceof com.ss.android.ugc.aweme.discover.jedi.a.c)) {
                A = null;
            }
            com.ss.android.ugc.aweme.discover.jedi.a.c cVar = (com.ss.android.ugc.aweme.discover.jedi.a.c) A;
            if (cVar != null) {
                cVar.a(globalDoodleConfig);
            }
            com.ss.android.ugc.aweme.search.theme.b bVar = this.f81344k;
            if (bVar != null) {
                bVar.a(globalDoodleConfig);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        super.a(dVar);
        if (P()) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            h.f.b.l.d(dVar, "");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).f81318a = dVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void a(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list, boolean z) {
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.search.l.k.INSTANCE.await();
        super.a(list, z);
        ClickSearchViewModel clickSearchViewModel = this.Z;
        if (clickSearchViewModel != null) {
            clickSearchViewModel.d();
        }
        com.ss.android.ugc.aweme.discover.mixfeed.d.d.a(hashCode());
        com.ss.android.ugc.aweme.search.ecom.video.b.a(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(FollowStatus followStatus) {
        h.f.b.l.d(followStatus, "");
        if (ab_() && A() != null) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).a(followStatus);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$b  reason: collision with other inner class name */
    static final class C1894b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(50545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1894b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.aweme.flowfeed.a.a(this) {
                /* class com.ss.android.ugc.aweme.discover.jedi.b.C1894b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1894b f81346a;

                static {
                    Covode.recordClassIndex(50546);
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Fragment g() {
                    return this.f81346a.this$0;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final com.ss.android.ugc.playerkit.videoview.k h() {
                    return new a(this);
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean c() {
                    return this.f81346a.this$0.getUserVisibleHint();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean e() {
                    return this.f81346a.this$0.getUserVisibleHint();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Context f() {
                    ViewGroup viewGroup = this.f81346a.this$0.f81339b;
                    if (viewGroup != null) {
                        return viewGroup.getContext();
                    }
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final String d() {
                    Integer num;
                    StringBuilder sb = new StringBuilder("MixFeedFragment_");
                    androidx.fragment.app.e activity = this.f81346a.this$0.getActivity();
                    if (activity != null) {
                        num = Integer.valueOf(activity.hashCode());
                    } else {
                        num = null;
                    }
                    return sb.append(num).toString();
                }

                /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$b$1$a */
                public static final class a implements com.ss.android.ugc.playerkit.videoview.k {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f81347a;

                    static {
                        Covode.recordClassIndex(50547);
                    }

                    @Override // com.ss.android.ugc.playerkit.videoview.k
                    public final void aB_() {
                    }

                    @Override // com.ss.android.ugc.playerkit.videoview.k
                    public final void b(int i2, int i3) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    a(AnonymousClass1 r1) {
                        this.f81347a = r1;
                    }

                    @Override // com.ss.android.ugc.playerkit.videoview.k
                    public final void a(int i2, int i3) {
                        com.ss.android.ugc.aweme.discover.b.g gVar;
                        Integer value;
                        t<Integer> tVar = this.f81347a.f81346a.this$0.C().searchState;
                        if ((tVar == null || (value = tVar.getValue()) == null || value.intValue() != 3) && (gVar = this.f81347a.f81346a.this$0.f81343j) != null) {
                            gVar.e();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81346a = r1;
                }
            };
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.search.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81349a;

        static {
            Covode.recordClassIndex(50549);
        }

        @Override // com.ss.android.ugc.aweme.search.d.c
        public final void a() {
            ae.f95300e = (com.ss.android.ugc.aweme.common.e.a) this.f81349a.f81342e.f76396h;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f81349a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.search.d.c
        public final void a(com.ss.android.ugc.aweme.search.d.a aVar) {
            androidx.core.app.b bVar;
            String str;
            String str2;
            String str3;
            int i2;
            NextLiveData<Boolean> nextLiveData;
            Integer valueOf;
            h.f.b.l.d(aVar, "");
            View view = aVar.f120990a;
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && aVar.f120991b != null && this.f81349a.getActivity() != null) {
                Aweme aweme = aVar.f120991b;
                com.ss.android.ugc.aweme.search.ecom.a.a aVar2 = aVar.f120994e;
                ae.f95296a = (com.ss.android.ugc.aweme.common.e.a) this.f81349a.f81342e.f76396h;
                r rVar = aVar.f120993d;
                Integer num = null;
                if (view != null) {
                    bVar = androidx.core.app.b.a(view, view.getWidth() / 2, view.getHeight() / 2);
                } else {
                    bVar = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(this.f81349a.getActivity(), "//aweme/detail").withParam("id", aweme.getAid()).withParam("refer", "general_search").withParam("video_from", "from_search_mix").withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("page_type", 9).withParam("search_keyword", this.f81349a.u());
                if (rVar != null) {
                    str = rVar.f121274i;
                } else {
                    str = null;
                }
                SmartRoute withParam2 = withParam.withParam("search_id", str);
                if (rVar != null) {
                    str2 = rVar.f121274i;
                } else {
                    str2 = null;
                }
                SmartRoute withParam3 = withParam2.withParam("playlist_search_id", str2).withParam("is_from_video", 1);
                if (rVar != null) {
                    str3 = rVar.f121269d;
                } else {
                    str3 = null;
                }
                SmartRoute withParam4 = withParam3.withParam("key_search_type", str3).withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                if (aVar2 != null) {
                    withParam4.withParam("feed_anchor_custom_data", new AnchorCustomData(true, com.ss.android.ugc.aweme.search.ecom.b.c.a(com.ss.android.ugc.aweme.search.ecom.b.c.a(aweme, aVar2, rVar))));
                }
                if (bVar != null) {
                    withParam4.withBundleAnimation(bVar.a());
                    withParam4.withParam("activity_has_activity_options", true);
                }
                withParam4.open();
                com.ss.android.ugc.aweme.feed.d.b.a(aweme);
                if (this.f81349a.w().getLayoutManager() == null || view == null || (valueOf = Integer.valueOf(RecyclerView.i.e(view))) == null) {
                    i2 = -1;
                } else {
                    i2 = valueOf.intValue();
                }
                if (rVar != null) {
                    num = Integer.valueOf(rVar.f121278m);
                }
                String u = this.f81349a.u();
                if (num != null) {
                    i2 = num.intValue();
                }
                com.ss.android.ugc.aweme.discover.mob.o.a(view, "general_search", aweme, u, i2);
                SurveyViewModel surveyViewModel = this.f81349a.f81341d;
                if (!(surveyViewModel == null || (nextLiveData = surveyViewModel.f121648c) == null)) {
                    nextLiveData.postValue(true);
                }
                e.a.a(h.a.ag.a(v.a("search_result_id", aweme.getAid()), v.a("is_from_video", "1")));
            }
        }
    }

    private static boolean R() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final String V() {
        String searchFrom;
        com.ss.android.ugc.aweme.search.model.d dVar = this.s;
        if (dVar == null || (searchFrom = dVar.getSearchFrom()) == null) {
            return "null";
        }
        return searchFrom;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.av
    public final void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81343j;
        if (gVar != null) {
            gVar.f80849h = true;
        }
        j();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void q() {
        super.q();
        com.ss.android.ugc.aweme.search.theme.b bVar = this.f81344k;
        if (bVar != null) {
            bVar.a((GradientBgData) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final String t() {
        com.ss.android.ugc.aweme.discover.j.f fVar;
        com.ss.android.ugc.aweme.discover.mixfeed.ui.a aVar = this.f81342e;
        if (aVar == null || (fVar = (com.ss.android.ugc.aweme.discover.j.f) aVar.f76396h) == null) {
            return null;
        }
        return fVar.r;
    }

    /* access modifiers changed from: package-private */
    public static final class j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f81356b;

        static {
            Covode.recordClassIndex(50555);
        }

        j(b bVar, boolean z) {
            this.f81355a = bVar;
            this.f81356b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = ((com.ss.android.ugc.aweme.discover.j.f) this.f81355a.f81342e.f76396h).p;
            b bVar = this.f81355a;
            bVar.a("general_search", str, bVar.u(), this.f81356b);
            return z.f158842a;
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.m f81358b;

        static {
            Covode.recordClassIndex(50556);
        }

        k(b bVar, com.ss.android.ugc.aweme.discover.mixfeed.m mVar) {
            this.f81357a = bVar;
            this.f81358b = mVar;
        }

        public final void run() {
            b.i<com.ss.android.ugc.aweme.discover.mixfeed.m> iVar = this.f81358b.f81829g;
            if (iVar != null) {
                iVar.a(new b.g(this) {
                    /* class com.ss.android.ugc.aweme.discover.jedi.b.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f81359a;

                    static {
                        Covode.recordClassIndex(50557);
                    }

                    {
                        this.f81359a = r1;
                    }

                    @Override // b.g
                    public final /* synthetic */ Object then(b.i iVar) {
                        this.f81359a.f81357a.aU_();
                        return z.f158842a;
                    }
                }, b.i.f4826c, null);
            }
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final l f81360a = new l();

        static {
            Covode.recordClassIndex(50558);
        }

        l() {
        }

        public final void run() {
            if (com.ss.android.ugc.aweme.search.l.l.f121431a > 0) {
                b.i.b(new l.a(System.currentTimeMillis() - com.ss.android.ugc.aweme.search.l.l.f121431a), b.i.f4824a);
                com.ss.android.ugc.aweme.search.l.l.f121431a = 0;
            }
        }
    }

    private final String T() {
        com.ss.android.ugc.aweme.search.model.b searchEnterParam;
        String enterSearchFrom;
        com.ss.android.ugc.aweme.search.model.d dVar = this.s;
        if (dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
            return "null";
        }
        return enterSearchFrom;
    }

    private static String U() {
        q a2 = am.a();
        if (a2 != null) {
            return com.ss.android.ugc.aweme.search.j.a(a2.a());
        }
        return "null";
    }

    public final void n() {
        com.ss.android.ugc.aweme.common.a.f A = A();
        Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
        ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).l();
        b_(true);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final boolean o() {
        View view;
        List<View> a2 = B().a();
        com.ss.android.ugc.aweme.discover.lynx.e.a aVar = this.ab;
        if (aVar != null) {
            view = aVar.itemView;
        } else {
            view = null;
        }
        return h.a.n.a((Iterable) a2, (Object) view);
    }

    public final void p() {
        SearchRecyclerView searchRecyclerView = this.f81345l;
        if (searchRecyclerView == null) {
            h.f.b.l.b();
        }
        searchRecyclerView.q();
        N();
        L();
    }

    public b() {
        SearchObserver listener = new SearchObserver().setListener(new i(this));
        h.f.b.l.b(listener, "");
        this.ad = listener;
        this.ag = h.i.a((h.f.a.a) new C1894b(this));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void f() {
        if (this.f81342e.f76396h instanceof com.ss.android.ugc.aweme.discover.j.f) {
            com.ss.android.ugc.aweme.discover.ui.d.b E = E();
            T t = this.f81342e.f76396h;
            h.f.b.l.b(t, "");
            com.bytedance.ies.dmt.ui.widget.d a2 = com.ss.android.ugc.aweme.discover.ui.d.b.a(E, t.mData, null, 2);
            if (a2 != null) {
                a(a2);
                return;
            }
        }
        K();
        N();
    }

    public final void j() {
        if (P() && (A() instanceof com.ss.android.ugc.aweme.discover.jedi.a.c)) {
            Objects.requireNonNull(A(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            com.ss.android.ugc.aweme.autoplay.e.a.c();
            com.ss.android.ugc.aweme.autoplay.e.a.b();
        }
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81343j;
        if (gVar != null) {
            gVar.f();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.c(2));
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.av
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.post(l.f81360a);
        }
        com.ss.android.ugc.aweme.search.h.f121133a.a(hashCode());
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81343j;
        if (gVar != null) {
            gVar.f80849h = false;
        }
        k();
        com.ss.android.ugc.aweme.xsearch.d.f145150a = hashCode();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void aU_() {
        com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f81342e.f76396h;
        h.f.b.l.b(aVar, "");
        if (!aVar.isDataEmpty()) {
            com.ss.android.ugc.aweme.common.e.a aVar2 = (com.ss.android.ugc.aweme.common.e.a) this.f81342e.f76396h;
            h.f.b.l.b(aVar2, "");
            if (aVar2.isHasMore()) {
                u uVar = this.ac;
                if (uVar == null || !uVar.f81249m) {
                    this.f81342e.a(4, u(), 0, 0, 0, Integer.valueOf(this.C), this.D, O());
                }
            }
        }
    }

    public final void k() {
        com.ss.android.ugc.aweme.discover.b.g gVar;
        SearchIntermediateViewModel searchIntermediateViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState;
        Integer value;
        Boolean bool = null;
        if (P() && (A() instanceof com.ss.android.ugc.aweme.discover.jedi.a.c) && (searchIntermediateViewModel = this.M) != null && (intermediateState = searchIntermediateViewModel.getIntermediateState()) != null && (value = intermediateState.getValue()) != null && value.intValue() == 0) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            com.ss.android.ugc.aweme.discover.b.g gVar2 = ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).f81319b;
            if (gVar2 != null) {
                gVar2.e();
            }
        }
        t<Boolean> tVar = C().isRefreshingData;
        if (tVar != null) {
            bool = tVar.getValue();
        }
        if (!h.f.b.l.a((Object) bool, (Object) true)) {
            t<Boolean> tVar2 = C().isShowingFilters;
            h.f.b.l.b(tVar2, "");
            if ((!h.f.b.l.a((Object) tVar2.getValue(), (Object) true)) && (gVar = this.f81343j) != null) {
                gVar.d();
            }
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.c(1));
    }

    @Override // com.ss.android.ugc.aweme.discover.jedi.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void onDestroyView() {
        super.onDestroyView();
        C().searchState.removeObservers(this);
        com.ss.android.ugc.aweme.discover.lynx.b.b.a();
        com.ss.android.ugc.aweme.bullet.e.a aVar = com.ss.android.ugc.aweme.bullet.e.b.f69286a;
        Iterator<T> it = aVar.f69283a.iterator();
        while (it.hasNext()) {
            it.next().f69285b.f69288a.a();
        }
        aVar.f69283a.clear();
        this.f81342e.cd_();
        this.f81342e.h();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.c(3));
        aT_();
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f81363b;

        static {
            Covode.recordClassIndex(50560);
        }

        n(b bVar, int i2) {
            this.f81362a = bVar;
            this.f81363b = i2;
        }

        public final void run() {
            b bVar = this.f81362a;
            com.ss.android.ugc.aweme.common.a.f A = bVar.A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            com.ss.android.ugc.aweme.search.l.i iVar = ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).f81322e;
            Context context = bVar.getContext();
            String u = bVar.u();
            if (context != null) {
                iVar.f121406e.post(new Runnable(context, u) {
                    /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Context f121417a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f121418b;

                    static {
                        Covode.recordClassIndex(79100);
                    }

                    public final void run() {
                        b.i<com.ss.android.ugc.aweme.discover.mixfeed.lynx.a> iVar;
                        if (i.f121401f.get() != 2 && (iVar = d.f81820a) != null) {
                            d.f81820a = null;
                            if (!iVar.a() || iVar.d() == null) {
                                iVar.c(new g<com.ss.android.ugc.aweme.discover.mixfeed.lynx.a, Object>() {
                                    /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass4.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(79101);
                                    }

                                    @Override // b.g
                                    public final Object then(final b.i<com.ss.android.ugc.aweme.discover.mixfeed.lynx.a> iVar) {
                                        if (!iVar.a() || iVar.d() == null) {
                                            return null;
                                        }
                                        i.this.f121406e.post(new Runnable() {
                                            /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass4.AnonymousClass1.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(79102);
                                            }

                                            public final void run() {
                                                i.a(AnonymousClass4.this.f121417a, AnonymousClass4.this.f121418b, (com.ss.android.ugc.aweme.discover.mixfeed.lynx.a) iVar.d());
                                            }
                                        });
                                        return null;
                                    }
                                });
                            } else {
                                i.a(this.f121417a, this.f121418b, iVar.d());
                            }
                        }
                    }

                    {
                        this.f121417a = r2;
                        this.f121418b = r3;
                    }
                });
            }
            com.ss.android.ugc.aweme.discover.mixfeed.ui.a aVar = this.f81362a.f81342e;
            int i2 = com.ss.android.ugc.aweme.discover.ui.am.H;
            if (aVar.f76396h != null) {
                ((com.ss.android.ugc.aweme.discover.j.f) aVar.f76396h).o = i2;
            }
            com.ss.android.ugc.aweme.discover.mixfeed.ui.a aVar2 = this.f81362a.f81342e;
            String str = this.f81362a.v;
            h.f.b.l.d(str, "");
            aVar2.f81872a = str;
            if (aVar2.f76396h != null) {
                com.ss.android.ugc.aweme.discover.j.f fVar = (com.ss.android.ugc.aweme.discover.j.f) aVar2.f76396h;
                String str2 = aVar2.f81872a;
                if (str2 == null) {
                    h.f.b.l.b();
                }
                fVar.b(str2);
            }
            this.f81362a.f81342e.a(1, this.f81362a.u(), Integer.valueOf(this.f81363b), 0, 0, Integer.valueOf(this.f81362a.C), this.f81362a.D, this.f81362a.O());
            this.f81362a.C().setIsRefreshingData(true);
            b bVar2 = this.f81362a;
            com.ss.android.ugc.aweme.common.a.f A2 = bVar2.A();
            Objects.requireNonNull(A2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A2).f81322e.a();
            com.ss.android.ugc.aweme.common.a.f A3 = bVar2.A();
            Objects.requireNonNull(A3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A3).f81322e.f121403b.a(1);
            com.ss.android.ugc.aweme.common.a.f A4 = bVar2.A();
            Objects.requireNonNull(A4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A4).f81322e.f121405d.a(1);
            com.ss.android.ugc.aweme.common.a.f A5 = bVar2.A();
            Objects.requireNonNull(A5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A5).f81322e.a();
            this.f81362a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        com.ss.android.ugc.aweme.discover.mixfeed.i iVar;
        if (com.ss.android.ugc.aweme.search.l.m.a()) {
            com.ss.android.ugc.aweme.discover.mixfeed.i iVar2 = new com.ss.android.ugc.aweme.discover.mixfeed.i();
            iVar2.f81794c = this.f81342e;
            iVar = iVar2;
        } else {
            iVar = new u();
        }
        this.ac = iVar;
        this.f81342e.a_(this);
        this.f81342e.a(this.ac);
        com.ss.android.ugc.aweme.common.a.l lVar = null;
        ClickSearchViewModel clickSearchViewModel = (ClickSearchViewModel) androidx.lifecycle.ae.a(this, (ad.b) null).a(ClickSearchViewModel.class);
        this.Z = clickSearchViewModel;
        if (clickSearchViewModel != null) {
            h.f.b.l.d(this, "");
            clickSearchViewModel.f81683a = new WeakReference<>(this);
        }
        com.ss.android.ugc.aweme.common.a.l A = A();
        if (A instanceof com.ss.android.ugc.aweme.discover.jedi.a.c) {
            lVar = A;
        }
        com.ss.android.ugc.aweme.discover.jedi.a.c cVar = (com.ss.android.ugc.aweme.discover.jedi.a.c) lVar;
        if (cVar != null) {
            cVar.f81321d = this.Z;
        }
        if (getActivity() != null) {
            t<Integer> tVar = C().searchState;
            if (tVar != null) {
                tVar.observe(this, new SearchObserver().setListener(new e(this)));
            }
            C().isShowingSuicide.observe(this, new f(this));
            t<Boolean> tVar2 = C().isRefreshingData;
            if (tVar2 != null) {
                tVar2.observe(this, new g(this));
            }
            t<Boolean> tVar3 = C().isShowingFilters;
            if (tVar3 != null) {
                tVar3.observe(this, new h(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        ViewGroup viewGroup;
        float f2;
        SearchJediMixFeedFragment$initAdapter$layoutManager$1 searchJediMixFeedFragment$initAdapter$layoutManager$1 = new SearchJediMixFeedFragment$initAdapter$layoutManager$1(this, getContext());
        View view = getView();
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.dva);
        } else {
            viewGroup = null;
        }
        this.f81339b = viewGroup;
        w().setLayoutManager(searchJediMixFeedFragment$initAdapter$layoutManager$1);
        boolean a2 = w.a();
        RecyclerView w = w();
        Context context = getContext();
        if (a2) {
            f2 = 8.0f;
        } else {
            f2 = 1.0f;
        }
        w.a(new com.ss.android.ugc.aweme.discover.jedi.a.b((int) com.bytedance.common.utility.n.b(context, f2), a2));
        if (!this.af) {
            com.ss.android.ugc.aweme.discover.jedi.a.c cVar = new com.ss.android.ugc.aweme.discover.jedi.a.c(w(), S(), new d(this), this);
            w().addOnAttachStateChangeListener(new c(this));
            com.ss.android.ugc.aweme.discover.b.g gVar = new com.ss.android.ugc.aweme.discover.b.g(w(), y());
            this.f81343j = gVar;
            h.f.b.l.d(gVar, "");
            cVar.f81319b = gVar;
            a(cVar);
            this.af = true;
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81348a;

        static {
            Covode.recordClassIndex(50548);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f81348a = bVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            com.ss.android.ugc.aweme.discover.mixfeed.d.d.a(this.f81348a.hashCode());
        }
    }

    static final class i implements SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81354a;

        static {
            Covode.recordClassIndex(50554);
        }

        i(b bVar) {
            this.f81354a = bVar;
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
            MusicPlayHelper musicPlayHelper;
            if (!z && (musicPlayHelper = this.f81354a.f81340c) != null) {
                musicPlayHelper.a();
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onReceiveCancelEvent(com.ss.android.ugc.aweme.discover.e.a aVar) {
        u uVar;
        if (aVar != null && (uVar = this.ac) != null) {
            uVar.a(aVar.f80942a, aVar.f80943b);
        }
    }

    static final class f<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81351a;

        static {
            Covode.recordClassIndex(50551);
        }

        f(b bVar) {
            this.f81351a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.ss.android.ugc.aweme.discover.b.g gVar = this.f81351a.f81343j;
                if (gVar != null) {
                    gVar.f80850i = false;
                }
                this.f81351a.j();
            }
        }
    }

    private static String c(SearchApiResult searchApiResult) {
        if (searchApiResult.queryCorrectInfo == null) {
            return "none";
        }
        if (searchApiResult.queryCorrectInfo.getCorrectedLevel() == 2) {
            return "strong";
        }
        return "weak";
    }

    private static boolean d(SearchApiResult searchApiResult) {
        String str;
        GlobalDoodleConfig globalDoodleConfig;
        if (searchApiResult == null || (globalDoodleConfig = searchApiResult.globalDoodleConfig) == null) {
            str = null;
        } else {
            str = globalDoodleConfig.getRequestKeyword();
        }
        return TextUtils.isEmpty(str);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(View view) {
        h.f.b.l.d(view, "");
        super.a(view);
        RecyclerView w = w();
        Objects.requireNonNull(w, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchRecyclerView");
        this.f81345l = (SearchRecyclerView) w;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void b_(boolean z) {
        u uVar = this.ac;
        if (uVar != null && !uVar.f81249m) {
            b.i.b(new j(this, z), b.i.f4824a);
        }
    }

    static final class g<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81352a;

        static {
            Covode.recordClassIndex(50552);
        }

        g(b bVar) {
            this.f81352a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.discover.b.g gVar = this.f81352a.f81343j;
            if (gVar != null) {
                h.f.b.l.b(bool, "");
                gVar.f80851j = bool.booleanValue();
            }
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f81352a.j();
            }
        }
    }

    static final class h<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81353a;

        static {
            Covode.recordClassIndex(50553);
        }

        h(b bVar) {
            this.f81353a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f81353a.j();
                MusicPlayHelper musicPlayHelper = this.f81353a.f81340c;
                if (musicPlayHelper != null) {
                    musicPlayHelper.a();
                    return;
                }
                return;
            }
            this.f81353a.k();
        }
    }

    private static void b(List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h> list) {
        com.ss.android.ugc.aweme.ad.preload.e a2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.newfollow.b.a aVar : list) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aVar.getAweme())) {
                    Aweme aweme = aVar.getAweme();
                    h.f.b.l.b(aweme, "");
                    arrayList.add(aweme);
                }
            }
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (!(f2 == null || (a2 = f2.a()) == null)) {
                a2.a(arrayList);
            }
        }
    }

    static final class e implements SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f81350a;

        static {
            Covode.recordClassIndex(50550);
        }

        e(b bVar) {
            this.f81350a = bVar;
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
            t<Boolean> tVar = this.f81350a.C().isShowingSuicide;
            h.f.b.l.b(tVar, "");
            boolean z2 = true;
            boolean a2 = h.f.b.l.a((Object) tVar.getValue(), (Object) true);
            t<Boolean> tVar2 = this.f81350a.C().isShowingSuicide;
            h.f.b.l.b(tVar2, "");
            tVar2.getValue();
            if (z) {
                com.ss.android.ugc.aweme.discover.b.g gVar = this.f81350a.f81343j;
                if (gVar != null) {
                    if (a2) {
                        z2 = false;
                    }
                    gVar.f80850i = z2;
                }
                this.f81350a.k();
                return;
            }
            com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81350a.f81343j;
            if (gVar2 != null) {
                gVar2.f80850i = false;
            }
            this.f81350a.j();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void setUserVisibleHint(boolean z) {
        EventCenter eventCenter;
        if (!(getUserVisibleHint() == z || (eventCenter = this.ae) == null)) {
            eventCenter.a("mix_feed_fragment_status", Boolean.valueOf(z));
        }
        super.setUserVisibleHint(z);
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81343j;
        if (gVar != null) {
            gVar.f80850i = z;
        }
        com.ss.android.ugc.aweme.search.theme.b bVar = this.f81344k;
        if (bVar != null) {
            DarkThemeController a2 = bVar.a();
            a2.f121713b = z;
            if (z && a2.f121712a) {
                a2.f121712a = false;
                com.ss.android.ugc.aweme.search.theme.c cVar = a2.f121715d;
                if (cVar != null) {
                    a2.c().a(cVar);
                    a2.f121714c = true;
                }
            }
        }
        MusicPlayHelper musicPlayHelper = this.f81340c;
        if (musicPlayHelper != null) {
            musicPlayHelper.a();
        }
        if (!z) {
            j();
        } else {
            k();
        }
    }

    public final void b(com.ss.android.ugc.aweme.discover.mixfeed.m mVar) {
        String str;
        int i2;
        boolean z;
        com.ss.android.ugc.aweme.discover.mixfeed.h hVar;
        SearchRecyclerView searchRecyclerView = this.f81345l;
        if (searchRecyclerView == null) {
            h.f.b.l.b();
        }
        searchRecyclerView.q();
        com.ss.android.ugc.aweme.search.l.a.g.a(this.s).c();
        com.ss.android.ugc.aweme.search.l.a.h.a(this.s).c();
        if (mVar == null) {
            f();
            return;
        }
        List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = mVar.f81826c;
        boolean z2 = mVar.f81825b;
        h.f.b.l.b(list, "");
        List<com.ss.android.ugc.aweme.discover.mixfeed.h> a2 = com.ss.android.ugc.aweme.discover.c.e.a(list);
        a((SearchApiResult) mVar);
        a(mVar.globalDoodleConfig);
        if (!list.isEmpty()) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).e(a2);
            a(a2, z2);
        } else if (mVar.suicidePrevent == null) {
            f();
        }
        boolean z3 = true;
        a((SearchApiResult) mVar, true);
        a(mVar.suicidePrevent, mVar.globalDoodleConfig);
        a(mVar.guideSearchWordList);
        a(mVar.dynamicHeader);
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar = mVar.dynamicMask;
        GlobalDoodleConfig globalDoodleConfig = mVar.globalDoodleConfig;
        Boolean bool = null;
        if (globalDoodleConfig != null) {
            str = globalDoodleConfig.getUseScenario();
        } else {
            str = null;
        }
        a(dVar, str);
        a(mVar.queryCorrectInfo);
        GlobalDoodleConfig globalDoodleConfig2 = mVar.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            i2 = globalDoodleConfig2.getDisplayFilterBar();
        } else {
            i2 = 1;
        }
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        c_(z);
        b((SearchApiResult) mVar);
        u uVar = this.ac;
        if (uVar == null || (bool = Boolean.valueOf(uVar.mIsLoading)) == null) {
            h.f.b.l.b();
        }
        if (!bool.booleanValue() && getView() != null) {
            View view = getView();
            if (view == null) {
                h.f.b.l.b();
            }
            view.post(new k(this, mVar));
        }
        LogPbBean logPbBean = mVar.logPb;
        if (logPbBean != null) {
            logPbBean.getImprId();
        }
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81343j;
        if (gVar != null) {
            com.ss.android.ugc.aweme.discover.mixfeed.h hVar2 = (com.ss.android.ugc.aweme.discover.mixfeed.h) h.a.n.b((List) a2, 0);
            if ((hVar2 == null || !com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(hVar2)) && ((hVar = (com.ss.android.ugc.aweme.discover.mixfeed.h) h.a.n.b((List) a2, 1)) == null || !com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(hVar))) {
                z3 = false;
            }
            gVar.a(z3, z());
        }
        b(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if ((r2 - r1) >= r0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        if (r0 > 0) goto L_0x0109;
     */
    @org.greenrobot.eventbus.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVideoEvent(com.ss.android.ugc.aweme.feed.i.ag r13) {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.b.onVideoEvent(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
        View view;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, String> searchTrackMap;
        com.ss.android.ugc.aweme.search.k.ad c2;
        com.ss.android.ugc.aweme.search.k.ad c3;
        View view2;
        View view3;
        View view4 = null;
        if (dVar == null) {
            com.ss.android.ugc.aweme.discover.c.a B = B();
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar = this.ab;
            if (aVar != null) {
                view2 = aVar.itemView;
            } else {
                view2 = null;
            }
            B.b(view2);
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar2 = this.ab;
            if (!(aVar2 == null || (view3 = aVar2.itemView) == null)) {
                view3.setVisibility(8);
            }
            this.ab = null;
            return;
        }
        com.ss.android.ugc.aweme.discover.c.a B2 = B();
        com.ss.android.ugc.aweme.discover.lynx.e.a aVar3 = this.ab;
        if (aVar3 != null) {
            view = aVar3.itemView;
        } else {
            view = null;
        }
        B2.b(view);
        if (!TextUtils.isEmpty(dVar.getSchema())) {
            this.ab = a.C1902a.a(w(), new o());
            com.ss.android.ugc.aweme.search.theme.dark.b.a(Integer.valueOf(hashCode()), this.ab);
            q a2 = am.a();
            if (a2 == null || (c3 = a2.c()) == null) {
                str = null;
            } else {
                str = c3.f121172a;
            }
            String a3 = com.ss.android.ugc.aweme.search.j.a(this.B);
            q a4 = am.a();
            if (a4 == null || (c2 = a4.c()) == null) {
                str2 = null;
            } else {
                str2 = c2.f121175d;
            }
            p[] pVarArr = new p[3];
            String str6 = "";
            if (str == null) {
                str3 = str6;
            } else {
                str3 = str;
            }
            pVarArr[0] = v.a("search_id", str3);
            pVarArr[1] = v.a("search_type", a3);
            if (str2 != null) {
                str6 = str2;
            }
            pVarArr[2] = v.a("use_scenario", str6);
            Map a5 = h.a.ag.a(pVarArr);
            com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_id", str);
            jSONObject.put("use_scenario", str2);
            if (b2 != null) {
                str4 = b2.getSearchId();
            } else {
                str4 = null;
            }
            jSONObject.put("search_id_x", str4);
            if (b2 == null || (searchTrackMap = b2.getSearchTrackMap()) == null) {
                str5 = null;
            } else {
                str5 = searchTrackMap.get("use_scenario");
            }
            jSONObject.put("use_scenario_x", str5);
            com.ss.android.ugc.aweme.common.r.a("ref_search_jedi_set_dynamic_header", jSONObject);
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar4 = this.ab;
            if (aVar4 != null) {
                com.ss.android.ugc.aweme.discover.lynx.e.a.a(aVar4, dVar, a5, 24);
            }
            com.ss.android.ugc.aweme.discover.c.a B3 = B();
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar5 = this.ab;
            if (aVar5 != null) {
                view4 = aVar5.itemView;
            }
            B3.a(0, view4);
        }
    }

    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.m mVar) {
        h.f.b.l.d(mVar, "");
        List<com.ss.android.ugc.aweme.discover.mixfeed.h> list = mVar.f81826c;
        boolean z = mVar.f81825b;
        if (!mVar.f81830h) {
            a((SearchApiResult) mVar, false);
        }
        h.f.b.l.b(list, "");
        List<com.ss.android.ugc.aweme.discover.mixfeed.h> a2 = com.ss.android.ugc.aweme.discover.c.e.a(list);
        com.ss.android.ugc.aweme.common.a.f A = A();
        Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
        ((com.ss.android.ugc.aweme.discover.jedi.a.c) A).e(a2);
        b(a2, z);
        if (z) {
            com.ss.android.ugc.aweme.common.a.f A2 = A();
            Objects.requireNonNull(A2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            ((com.ss.android.ugc.aweme.discover.jedi.a.c) A2).l();
        }
        ag agVar = this.Y;
        if (agVar != null) {
            onVideoEvent(agVar);
            this.Y = null;
        }
        b(list);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        C().searchState.observe(this, this.ad);
        androidx.fragment.app.e activity = getActivity();
        EventCenter eventCenter = null;
        if (activity != null) {
            eventCenter = (EventCenter) androidx.lifecycle.ae.a(activity, (ad.b) null).a(EventCenter.class);
        }
        this.ae = eventCenter;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(int i2, com.ss.android.ugc.aweme.search.g.b bVar) {
        super.a(i2, bVar);
        getActivity();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = R();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
            com.ss.android.ugc.aweme.search.l.k.INSTANCE.async(new n(this, i2));
        } else {
            q();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.discover.model.SearchApiResult r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.b.a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.f81340c = (MusicPlayHelper) androidx.lifecycle.ae.a(activity, (ad.b) null).a(MusicPlayHelper.class);
            h.f.b.l.b(activity, "");
            this.f81344k = new com.ss.android.ugc.aweme.search.theme.b(activity, w(), S());
            this.f81341d = (SurveyViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(SurveyViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, String str) {
        com.ss.android.ugc.aweme.search.i.b.a(new com.ss.android.ugc.aweme.search.i.a(getActivity(), dVar, str, this.B, getView()));
    }
}
