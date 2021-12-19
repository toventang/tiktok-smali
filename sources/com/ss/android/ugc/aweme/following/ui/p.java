package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.controller.RecommendController;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.newfollow.ui.e;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fh;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.utils.gh;
import com.ss.android.ugc.aweme.utils.iv;
import com.ss.android.ugc.aweme.views.FixScrollableLayout;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class p extends a implements KeyboardUtils.a, a.AbstractC1744a, com.ss.android.ugc.aweme.social.widget.card.j, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    private com.ss.android.ugc.aweme.newfollow.ui.e A;
    private boolean B;
    private boolean C;
    private SparseArray D;

    /* renamed from: l  reason: collision with root package name */
    final AtomicBoolean f96542l = new AtomicBoolean(false);

    /* renamed from: m  reason: collision with root package name */
    public FollowListAdapter f96543m;
    public final com.ss.android.ugc.aweme.following.ui.viewmodel.c n;
    public final com.ss.android.ugc.aweme.following.ui.adapter.e o;
    public String p;
    public DmtStatusView.a q;
    public boolean r;
    public int s;
    public final Handler t;
    private final lifecycleAwareLazy u;
    private final lifecycleAwareLazy v;
    private final h.h w = h.i.a((h.f.a.a) new as(this));
    private final h.h y;
    private boolean z;

    static {
        Covode.recordClassIndex(61169);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.D == null) {
            this.D = new SparseArray();
        }
        View view = (View) this.D.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.D.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int g() {
        return R.layout.ao2;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(p.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int i() {
        return R.string.eyk;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public final FollowingRelationViewModel s() {
        return (FollowingRelationViewModel) this.u.getValue();
    }

    public final RecommendListViewModel t() {
        return (RecommendListViewModel) this.v.getValue();
    }

    public final RecommendController u() {
        return (RecommendController) this.w.getValue();
    }

    public final FollowRelationTabViewModel v() {
        return (FollowRelationTabViewModel) this.y.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.p$p  reason: collision with other inner class name */
    public static final class C2327p implements e.b {
        static {
            Covode.recordClassIndex(61219);
        }

        C2327p() {
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final void b(Context context) {
            fg.c(context);
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final boolean a(Context context) {
            return fh.a(context);
        }
    }

    public static final class q implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f96574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96576c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, h.z> f96577d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> f96578e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> f96579f;

        static {
            Covode.recordClassIndex(61220);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, h.z> a() {
            return this.f96577d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> b() {
            return this.f96578e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> c() {
            return this.f96579f;
        }

        public q(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f96574a = bVar;
            this.f96575b = mVar;
            this.f96576c = mVar2;
            this.f96577d = bVar;
            this.f96578e = mVar;
            this.f96579f = mVar2;
        }
    }

    public static final class r implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f96580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96582c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, h.z> f96583d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> f96584e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> f96585f;

        static {
            Covode.recordClassIndex(61221);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, h.z> a() {
            return this.f96583d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> b() {
            return this.f96584e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> c() {
            return this.f96585f;
        }

        public r(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f96580a = bVar;
            this.f96581b = mVar;
            this.f96582c = mVar2;
            this.f96583d = bVar;
            this.f96584e = mVar;
            this.f96585f = mVar2;
        }
    }

    static final class al implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96546a;

        static {
            Covode.recordClassIndex(61183);
        }

        al(p pVar) {
            this.f96546a = pVar;
        }

        public static final class a implements h.f.b.a.a, Iterable<View> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewGroup f96547a;

            static {
                Covode.recordClassIndex(61184);
            }

            /* Return type fixed from 'java.util.Iterator' to match base method */
            @Override // java.lang.Iterable
            public final /* synthetic */ Iterator<View> iterator() {
                return new Object(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.p.al.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    public int f96548a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f96549b;

                    static {
                        Covode.recordClassIndex(61185);
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }

                    public final boolean hasNext() {
                        if (this.f96548a < this.f96549b.f96547a.getChildCount()) {
                            return true;
                        }
                        return false;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.Iterator
                    public final /* synthetic */ View next() {
                        ViewGroup viewGroup = this.f96549b.f96547a;
                        int i2 = this.f96548a;
                        this.f96548a = i2 + 1;
                        return viewGroup.getChildAt(i2);
                    }

                    {
                        this.f96549b = r1;
                    }
                };
            }

            public a(ViewGroup viewGroup) {
                this.f96547a = viewGroup;
            }
        }

        public final void onGlobalLayout() {
            int a2 = com.ss.android.ugc.aweme.base.utils.i.a(this.f96546a.getContext());
            FixScrollableLayout fixScrollableLayout = (FixScrollableLayout) this.f96546a.a(R.id.djk);
            h.f.b.l.b(fixScrollableLayout, "");
            int i2 = 0;
            for (View view : new a(fixScrollableLayout)) {
                i2 += view.getMeasuredHeight();
            }
            if (i2 < a2) {
                this.f96546a.e(0);
                return;
            }
            p pVar = this.f96546a;
            LinearLayout linearLayout = (LinearLayout) pVar.a(R.id.eo1);
            h.f.b.l.b(linearLayout, "");
            pVar.e(linearLayout.getHeight());
        }
    }

    static final class as extends h.f.b.m implements h.f.a.a<RecommendController> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecommendController invoke() {
            return new RecommendController(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int r() {
        h();
        return R.string.c0d;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    static final class f implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96555a;

        static {
            Covode.recordClassIndex(61203);
        }

        f(p pVar) {
            this.f96555a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            p pVar = this.f96555a;
            pVar.withState(pVar.s(), new h.f.a.b<FollowingRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.p.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(61204);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    h.f.b.l.d(followingRelationState2, "");
                    if (followingRelationState2.getListState().getPayload().f96369c != 0) {
                        p pVar = this.this$0.f96555a;
                        pVar.withState(pVar.s(), new aq(pVar));
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.v().a("suggest_user");
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final String j() {
        if (h()) {
            return "following";
        }
        return "other_following";
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        RecyclerView recyclerView = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView, "");
        return recyclerView;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final void p() {
        s().f96638e.refresh();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int q() {
        if (h()) {
            return R.string.c0g;
        }
        return R.string.c0h;
    }

    static final class ar implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96552a;

        static {
            Covode.recordClassIndex(61191);
        }

        ar(p pVar) {
            this.f96552a = pVar;
        }

        public final void run() {
            TopRecommendVM b2 = this.f96552a.u().b();
            if (b2 != null && b2.a()) {
                b2.a(false);
            }
            this.f96552a.e(0);
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            p pVar = this.this$0;
            LinearLayout linearLayout = (LinearLayout) pVar.a(R.id.eo1);
            h.f.b.l.b(linearLayout, "");
            pVar.e(linearLayout.getHeight());
            return h.z.f158842a;
        }
    }

    public final boolean A() {
        return ((Boolean) withState(s(), ak.f96545a)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void b() {
        this.t.removeCallbacksAndMessages(null);
        this.t.postDelayed(new ar(this), 200);
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void c() {
        this.t.removeCallbacksAndMessages(null);
        this.t.postDelayed(new ap(this), 200);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final boolean l() {
        return ((Boolean) withState(s(), new av(this))).booleanValue();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onDestroy() {
        super.onDestroy();
        e.a.f112592a.c();
        com.ss.android.ugc.aweme.cc.c.a("follow_relation", com.ss.android.ugc.aweme.cc.b.CANCEL, 4);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onResume() {
        super.onResume();
        if (h() && com.ss.android.ugc.aweme.social.a.c.f133649c.b()) {
            KeyboardUtils.a(this, getView(), this);
        }
    }

    public final boolean z() {
        if (!h() || !com.ss.android.ugc.aweme.recommend.users.b.f120122a.d()) {
            return false;
        }
        return true;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<FollowRelationTabViewModel> {
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(61170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.$this_activityViewModel
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.p.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class ap implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96551a;

        static {
            Covode.recordClassIndex(61189);
        }

        ap(p pVar) {
            this.f96551a = pVar;
        }

        public final void run() {
            RecommendController u;
            TopRecommendVM b2;
            if (this.f96551a.p.length() == 0 && (b2 = (u = this.f96551a.u()).b()) != null && b2.f96648a.get() && !b2.f96650c && !b2.a() && !u.f96479i) {
                b2.a(true);
            }
            if (this.f96551a.s != -1) {
                this.f96551a.s = -1;
            }
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<FollowingRelationViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel> r0 = com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.p$c$1 r0 = new com.ss.android.ugc.aweme.following.ui.p$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.p.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<RecommendListViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r0 = com.ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.p$e$1 r0 = new com.ss.android.ugc.aweme.following.ui.p$e$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.p.e.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_following_ui_FollowingRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public final void x() {
        ((DmtStatusView) a(R.id.e_o)).d();
        this.p = "";
        ImageButton imageButton = (ImageButton) a(R.id.y0);
        h.f.b.l.b(imageButton, "");
        imageButton.setVisibility(8);
        this.o.b_(new ArrayList());
        this.o.f96442b = this.p;
    }

    public static final class g implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96556a;

        static {
            Covode.recordClassIndex(61205);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f96557a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f96558b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ fo f96559c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f96560d;

            static {
                Covode.recordClassIndex(61206);
            }

            a(User user, g gVar, fo foVar, int i2) {
                this.f96557a = user;
                this.f96558b = gVar;
                this.f96559c = foVar;
                this.f96560d = i2;
            }

            public final void run() {
                String.valueOf(this.f96560d);
                com.ss.android.ugc.aweme.metrics.u q = new com.ss.android.ugc.aweme.metrics.u().a("following_list").q(this.f96558b.f96556a.k());
                q.f109596a = u.c.CARD;
                q.f109597b = u.a.SHOW;
                com.ss.android.ugc.aweme.metrics.u s = q.a(this.f96557a).s(this.f96557a.getRequestId());
                p pVar = this.f96558b.f96556a;
                s.t((String) pVar.withState(pVar.t(), h.f96565a)).f();
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f96561a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f96562b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ fo f96563c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f96564d;

            static {
                Covode.recordClassIndex(61207);
            }

            b(User user, g gVar, fo foVar, int i2) {
                this.f96561a = user;
                this.f96562b = gVar;
                this.f96563c = foVar;
                this.f96564d = i2;
            }

            public final void run() {
                String str;
                if (this.f96562b.f96556a.h()) {
                    str = "following";
                } else {
                    str = "other_following";
                }
                String.valueOf(this.f96564d);
                this.f96561a.getRequestId();
                com.ss.android.ugc.aweme.common.r.a("follow_list_user_show", h.v.a(str, "enter_from"), h.v.a(this.f96561a.getRequestId(), "req_id"), h.v.a(this.f96561a.getUid(), "to_user_id"), h.v.a(Integer.valueOf(this.f96564d), "impr_order"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(p pVar) {
            this.f96556a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, fo foVar) {
            User user;
            h.f.b.l.d(foVar, "");
            Object a2 = p.a(this.f96556a).a(i2);
            if (a2 instanceof com.ss.android.ugc.aweme.following.a.g) {
                com.ss.android.ugc.aweme.following.a.g gVar = (com.ss.android.ugc.aweme.following.a.g) a2;
                if (gVar.f96342a == 13) {
                    User user2 = gVar.f96343b;
                    if (user2 != null) {
                        String uid = user2.getUid();
                        h.f.b.l.b(uid, "");
                        foVar.a(uid, new a(user2, this, foVar, i2));
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.following.a.g gVar2 = (com.ss.android.ugc.aweme.following.a.g) a2;
                if (gVar2.f96342a == 0 && (user = gVar2.f96343b) != null) {
                    String uid2 = user.getUid();
                    h.f.b.l.b(uid2, "");
                    foVar.a(uid2, new b(user, this, foVar, i2));
                }
            }
        }
    }

    static final class m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96570a;

        static {
            Covode.recordClassIndex(61216);
        }

        m(p pVar) {
            this.f96570a = pVar;
        }

        public final void onGlobalLayout() {
            Boolean value;
            TopRecommendVM b2 = this.f96570a.u().b();
            if (b2 != null && b2.f96648a.get() && (value = b2.f96653f.getValue()) != null && value.booleanValue() && !b2.f96650c) {
                LinearLayout linearLayout = (LinearLayout) this.f96570a.a(R.id.eo1);
                h.f.b.l.b(linearLayout, "");
                int height = linearLayout.getHeight();
                this.f96570a.e(height);
                if (height > 0 && ((RecyclerView) this.f96570a.a(R.id.drj)).computeVerticalScrollOffset() > 0) {
                    if (((RecyclerView) this.f96570a.a(R.id.drj)).computeVerticalScrollOffset() > height) {
                        ((FixScrollableLayout) this.f96570a.a(R.id.djk)).scrollTo(0, height);
                    } else {
                        ((RecyclerView) this.f96570a.a(R.id.drj)).b(0);
                    }
                }
            }
        }
    }

    public final void w() {
        List<IMUser> searchFollowIMUser;
        if (this.p.length() != 0) {
            com.ss.android.ugc.aweme.following.ui.viewmodel.c cVar = this.n;
            String str = this.p;
            h.f.b.l.d(str, "");
            if (TextUtils.isEmpty(str)) {
                searchFollowIMUser = new ArrayList<>();
            } else {
                searchFollowIMUser = IMService.createIIMServicebyMonsterPlugin(false).searchFollowIMUser(cVar.f96657a, str);
            }
            if (com.bytedance.common.utility.collection.b.a((Collection) searchFollowIMUser)) {
                ((DmtStatusView) a(R.id.e_o)).g();
            } else {
                ((DmtStatusView) a(R.id.e_o)).d();
            }
            this.o.b_(searchFollowIMUser);
            this.o.f96442b = this.p;
        }
    }

    public final void y() {
        if (!h()) {
            return;
        }
        if (this.z) {
            com.ss.android.ugc.aweme.newfollow.ui.e eVar = this.A;
            if (eVar != null) {
                eVar.a();
            }
            this.z = false;
            return;
        }
        com.ss.android.ugc.aweme.newfollow.ui.e eVar2 = this.A;
        if (eVar2 != null && eVar2.f112623d != null && eVar2.f112622c != null && eVar2.f112624e != null) {
            eVar2.f112624e.a(eVar2.f112623d);
            if (System.currentTimeMillis() - eVar2.b() <= ((long) com.ss.android.ugc.aweme.newfollow.ui.e.f112621b) * 86400000 || eVar2.c() >= ((long) com.ss.android.ugc.aweme.newfollow.ui.e.f112620a)) {
                eVar2.f112622c.setVisibility(8);
            }
        }
    }

    public p() {
        an anVar = new an(this);
        h.k.c a2 = h.f.b.ab.a(FollowingRelationViewModel.class);
        b bVar = new b(a2);
        this.u = new lifecycleAwareLazy(this, bVar, new c(this, bVar, a2, anVar));
        ao aoVar = new ao(this);
        h.k.c a3 = h.f.b.ab.a(RecommendListViewModel.class);
        d dVar = new d(a3);
        this.v = new lifecycleAwareLazy(this, dVar, new e(this, dVar, a3, aoVar));
        h.k.c a4 = h.f.b.ab.a(FollowRelationTabViewModel.class);
        this.y = h.i.a((h.f.a.a) new a(this, a4, a4));
        this.n = new com.ss.android.ugc.aweme.following.ui.viewmodel.c();
        this.o = new com.ss.android.ugc.aweme.following.ui.adapter.e();
        this.p = "";
        this.r = true;
        this.z = true;
        this.s = -1;
        this.t = new Handler(Looper.getMainLooper());
    }

    public static final class k implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96568a;

        static {
            Covode.recordClassIndex(61213);
        }

        public final void afterTextChanged(Editable editable) {
            h.f.b.l.d(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(p pVar) {
            this.f96568a = pVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<FollowRelationState, h.z> {
            final /* synthetic */ CharSequence $s;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(61214);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, CharSequence charSequence) {
                super(1);
                this.this$0 = kVar;
                this.$s = charSequence;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(FollowRelationState followRelationState) {
                FollowRelationState followRelationState2 = followRelationState;
                h.f.b.l.d(followRelationState2, "");
                if (!TextUtils.isEmpty(this.$s) && !followRelationState2.isSearching()) {
                    this.this$0.f96568a.v().a(true);
                } else if (TextUtils.isEmpty(this.$s) && followRelationState2.isSearching()) {
                    this.this$0.f96568a.v().a(false);
                }
                return h.z.f158842a;
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
            p pVar = this.f96568a;
            pVar.withState(pVar.v(), new a(this, charSequence));
            if (!TextUtils.isEmpty(charSequence)) {
                ImageButton imageButton = (ImageButton) this.f96568a.a(R.id.y0);
                h.f.b.l.b(imageButton, "");
                imageButton.setVisibility(0);
                this.f96568a.p = charSequence.toString();
                if (this.f96568a.r) {
                    com.ss.android.ugc.aweme.common.r.a("search_friends", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                    this.f96568a.r = false;
                }
                this.f96568a.w();
                return;
            }
            this.f96568a.x();
        }
    }

    static final class am extends h.f.b.m implements h.f.a.b<RecommendUserListState, com.ss.android.ugc.aweme.recommend.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final am f96550a = new am();

        static {
            Covode.recordClassIndex(61186);
        }

        am() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.recommend.h invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            return recommendUserListState2.getRecommendMobParams();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<RecommendUserListState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f96565a = new h();

        static {
            Covode.recordClassIndex(61208);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            h.f.b.l.d(recommendUserListState2, "");
            return recommendUserListState2.getUserId();
        }
    }

    public static final /* synthetic */ FollowListAdapter a(p pVar) {
        FollowListAdapter followListAdapter = pVar.f96543m;
        if (followListAdapter == null) {
            h.f.b.l.a("mFollowingListAdapter");
        }
        return followListAdapter;
    }

    static final class af extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ((DmtStatusView) this.this$0.a(R.id.e_o)).f();
            return h.z.f158842a;
        }
    }

    static final class av extends h.f.b.m implements h.f.a.b<FollowingRelationState, Boolean> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            return Boolean.valueOf(this.this$0.a(followingRelationState2.getListState()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aw extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final aw f96554a = new aw();

        static {
            Covode.recordClassIndex(61196);
        }

        aw() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_lock;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return h.z.f158842a;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96566a;

        static {
            Covode.recordClassIndex(61209);
        }

        i(p pVar) {
            this.f96566a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            p pVar = this.f96566a;
            pVar.withState(pVar.v(), new h.f.a.b<FollowRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.p.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(61210);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    h.f.b.l.d(followRelationState2, "");
                    if (followRelationState2.isSearching()) {
                        this.this$0.f96566a.v().a(false);
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            p.a(this.this$0).ag_();
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void a(User user) {
        h.f.b.l.d(user, "");
        h.f.b.l.d(user, "");
    }

    static final class ai extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            if (!dmtStatusView.j()) {
                p.a(this.this$0).ag_();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ak extends h.f.b.m implements h.f.a.b<FollowingRelationState, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f96545a = new ak();

        static {
            Covode.recordClassIndex(61182);
        }

        ak() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowingRelationState followingRelationState) {
            List<Object> a2;
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            List<Object> a3 = followingRelationState2.getListState().getRefresh().a();
            boolean z = false;
            if ((a3 == null || a3.isEmpty()) && ((a2 = followingRelationState2.getListState().getLoadMore().a()) == null || a2.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class aq extends h.f.b.m implements h.f.a.b<FollowingRelationState, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aq(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            h.f.b.l.d(followingRelationState2, "");
            List<Object> recommendList = followingRelationState2.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                this.this$0.s().f96638e.loadMore();
            } else {
                p.a(this.this$0).ag_();
                this.this$0.t().l();
            }
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            if (this.this$0.A()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).f();
            } else {
                p.a(this.this$0).ag_();
            }
            return h.z.f158842a;
        }
    }

    public final String b(int i2) {
        if (i2 == 2096) {
            String string = getString(R.string.evd);
            h.f.b.l.b(string, "");
            return string;
        } else if (i2 != 3002060) {
            String string2 = getString(R.string.evd);
            h.f.b.l.b(string2, "");
            return string2;
        } else {
            String string3 = getString(R.string.c0f);
            h.f.b.l.b(string3, "");
            return string3;
        }
    }

    public final String c(int i2) {
        String str;
        if (i2 == 2096) {
            String string = getString(R.string.exz);
            h.f.b.l.b(string, "");
            return string;
        } else if (i2 != 3002060) {
            String string2 = getString(R.string.exz);
            h.f.b.l.b(string2, "");
            return string2;
        } else {
            Object[] objArr = new Object[1];
            User user = this.f96385c;
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String string3 = getString(R.string.c0e, objArr);
            h.f.b.l.b(string3, "");
            return string3;
        }
    }

    public final void e(int i2) {
        if (a(R.id.djk) != null) {
            ScrollableLayout scrollableLayout = (ScrollableLayout) a(R.id.djk);
            h.f.b.l.b(scrollableLayout, "");
            scrollableLayout.getHelper().f76605b = this;
            ((ScrollableLayout) a(R.id.djk)).setMaxScrollHeight(i2);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str == null) {
            return;
        }
        if (h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/follower/list/?", false) || h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
            EventBus.a().d(aVar);
            p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (z2) {
            if (!this.B) {
                this.B = true;
                com.ss.android.ugc.aweme.cc.c.a("follow_relation");
            }
        } else if (a(R.id.ay6) != null) {
            com.ss.android.ugc.aweme.common.f.e.a(getActivity(), a(R.id.ay6));
        }
    }

    static final class at extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final at f96553a = new at();

        static {
            Covode.recordClassIndex(61193);
        }

        at() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_large_person;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void a(com.ss.android.ugc.aweme.social.widget.card.k kVar) {
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar, "");
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void d(int i2) {
        if (A() && this.f35364f && !this.C) {
            this.C = true;
            if (i2 <= 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.b8f);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.e_o);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) a(R.id.e_o)).g();
                LinearLayout linearLayout = (LinearLayout) a(R.id.duy);
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else if (this.f35364f) {
                u().a();
                TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(at.f96553a));
                String string = getString(R.string.byr);
                h.f.b.l.b(string, "");
                TuxStatusView.c a3 = a2.a(string);
                String string2 = getString(R.string.c0g);
                h.f.b.l.b(string2, "");
                ((TuxStatusView) a(R.id.b8f)).setStatus(a3.a((CharSequence) string2));
                TuxStatusView tuxStatusView2 = (TuxStatusView) a(R.id.b8f);
                h.f.b.l.b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(0);
                View a4 = a(R.id.b8f);
                au auVar = new au(this);
                h.f.b.l.d(auVar, "");
                if (a4 != null) {
                    a4.getViewTreeObserver().addOnGlobalLayoutListener(new iv.a(a4, auVar));
                }
                DmtStatusView dmtStatusView2 = (DmtStatusView) a(R.id.e_o);
                h.f.b.l.b(dmtStatusView2, "");
                dmtStatusView2.setVisibility(8);
            }
        }
        if (!A() && i2 <= 0) {
            e(0);
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f96544a = new ab();

        static {
            Covode.recordClassIndex(61172);
        }

        ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            e.a.f112592a.b();
            return h.z.f158842a;
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            p.a(this.this$0).j();
            return h.z.f158842a;
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                this.this$0.v().a("following_relation");
            }
            return h.z.f158842a;
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            p.a(this.this$0).j();
            return h.z.f158842a;
        }
    }

    static final class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96567a;

        static {
            Covode.recordClassIndex(61211);
        }

        j(p pVar) {
            this.f96567a = pVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h.f.b.l.b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            p pVar = this.f96567a;
            pVar.withState(pVar.v(), new h.f.a.b<FollowRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.p.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(61212);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    h.f.b.l.d(followRelationState2, "");
                    if (!followRelationState2.isSearching()) {
                        DmtEditText dmtEditText = (DmtEditText) this.this$0.f96567a.a(R.id.ay6);
                        h.f.b.l.b(dmtEditText, "");
                        dmtEditText.setCursorVisible(true);
                    }
                    return h.z.f158842a;
                }
            });
            return false;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(this.this$0.s(), new h.f.a.b<FollowingRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.p.s.AnonymousClass1 */
                final /* synthetic */ s this$0;

                static {
                    Covode.recordClassIndex(61223);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    h.f.b.l.d(followingRelationState2, "");
                    if (!this.this$0.this$0.s().a(followingRelationState2.getListState().getPayload().f39459a.f39447a, followingRelationState2.getListState().getPayload().f96371e, followingRelationState2.getListState().getPayload().f96372f)) {
                        if (!this.this$0.this$0.A() || this.this$0.this$0.z()) {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).d();
                        } else {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).g();
                        }
                    }
                    this.this$0.this$0.y();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class an extends h.f.b.m implements h.f.a.m<FollowingRelationState, Bundle, FollowingRelationState> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState, Bundle bundle) {
            String secUid;
            FollowingRelationState followingRelationState2 = followingRelationState;
            String str = "";
            h.f.b.l.d(followingRelationState2, str);
            String str2 = ((a) this.this$0).f96384b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.this$0.f96385c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return FollowingRelationState.copy$default(followingRelationState2, str2, str, this.this$0.h(), null, null, false, 0, null, null, null, 1016, null);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            if (!this.this$0.A()) {
                p.a(this.this$0).ah_();
            } else {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
            }
            return h.z.f158842a;
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            int i2;
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            for (T t : list2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    h.a.n.a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    h.f.b.l.b(requestId, "");
                    arrayList.add(new com.ss.android.ugc.aweme.following.a.g(13, t2, i4, requestId));
                    i4++;
                }
                i3 = i5;
            }
            if (!list2.isEmpty()) {
                Resources resources = this.this$0.getResources();
                if (com.ss.android.ugc.aweme.social.a.b.e()) {
                    i2 = R.string.p_;
                } else {
                    i2 = R.string.ey_;
                }
                String string = resources.getString(i2);
                h.f.b.l.b(string, "");
                arrayList.add(0, new com.ss.android.ugc.aweme.following.a.f(14, string));
            }
            this.this$0.s().a(arrayList);
            return h.z.f158842a;
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th2, "");
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th2;
                if (aVar.getErrorCode() == 2096 || aVar.getErrorCode() == 3002060) {
                    ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                    p pVar = this.this$0;
                    pVar.a(pVar.b(aVar.getErrorCode()), this.this$0.c(aVar.getErrorCode()));
                    this.this$0.u().a();
                    return h.z.f158842a;
                }
            }
            p pVar2 = this.this$0;
            DmtStatusView dmtStatusView = (DmtStatusView) pVar2.a(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            pVar2.a(dmtStatusView, (Exception) th2);
            ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
            this.this$0.u().a();
            return h.z.f158842a;
        }
    }

    static final class ao extends h.f.b.m implements h.f.a.m<RecommendUserListState, Bundle, RecommendUserListState> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState, Bundle bundle) {
            String secUid;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            String str = "";
            h.f.b.l.d(recommendUserListState2, str);
            String str2 = ((a) this.this$0).f96384b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.this$0.f96385c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.this$0.h(), 13, null, new com.ss.android.ugc.aweme.recommend.h(this.this$0.j(), this.this$0.k(), "empty"), null, 80, null);
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            if (list2.isEmpty() && this.this$0.A()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
            } else if (!com.ss.android.ugc.aweme.social.a.b.e() && this.this$0.A()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                FollowingRelationViewModel s = this.this$0.s();
                h.f.b.l.d("", "");
                s.b_(new FollowingRelationViewModel.g(s, ""));
                this.this$0.t.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.p.x.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ x f96589a;

                    static {
                        Covode.recordClassIndex(61230);
                    }

                    {
                        this.f96589a = r1;
                    }

                    public final void run() {
                        p pVar = this.f96589a.this$0;
                        RecyclerView recyclerView = (RecyclerView) this.f96589a.this$0.a(R.id.drj);
                        h.f.b.l.b(recyclerView, "");
                        pVar.e(recyclerView.getHeight());
                    }
                });
            }
            com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
            h.f.b.l.b(eVar, "");
            if (!TextUtils.isEmpty(eVar.a())) {
                e.a.f112592a.b();
            }
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                DmtEditText dmtEditText = (DmtEditText) this.this$0.a(R.id.ay6);
                h.f.b.l.b(dmtEditText, "");
                dmtEditText.setCursorVisible(true);
                RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.drj);
                h.f.b.l.b(recyclerView, "");
                recyclerView.setAdapter(this.this$0.o);
                ((DmtStatusView) this.this$0.a(R.id.e_o)).setBuilder(this.this$0.q);
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                this.this$0.n.a();
            } else {
                DmtEditText dmtEditText2 = (DmtEditText) this.this$0.a(R.id.ay6);
                h.f.b.l.b(dmtEditText2, "");
                dmtEditText2.setCursorVisible(false);
                ((DmtEditText) this.this$0.a(R.id.ay6)).clearFocus();
                DmtEditText dmtEditText3 = (DmtEditText) this.this$0.a(R.id.ay6);
                Objects.requireNonNull(dmtEditText3, "null cannot be cast to non-null type android.widget.TextView");
                dmtEditText3.setText("");
                com.ss.android.ugc.aweme.common.f.e.a(this.this$0.getActivity(), this.this$0.a(R.id.ay6));
                RecyclerView recyclerView2 = (RecyclerView) this.this$0.a(R.id.drj);
                h.f.b.l.b(recyclerView2, "");
                recyclerView2.setAdapter(p.a(this.this$0));
                ((DmtStatusView) this.this$0.a(R.id.e_o)).setBuilder(this.this$0.e());
                this.this$0.x();
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            Integer num;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                p.a(this.this$0).ai_();
            } else if (this.this$0.z()) {
                if (com.ss.android.ugc.aweme.social.a.c.f133649c.c()) {
                    p pVar = this.this$0;
                    if (!((Boolean) com.ss.android.ugc.aweme.social.a.b.f133634b.getValue()).booleanValue() && (!com.ss.android.ugc.aweme.social.a.b.b() || pVar.A() || !com.ss.android.ugc.aweme.social.a.c.f133649c.b())) {
                        FollowListAdapter followListAdapter = pVar.f96543m;
                        if (followListAdapter == null) {
                            h.f.b.l.a("mFollowingListAdapter");
                        }
                        followListAdapter.ah_();
                        RecyclerView recyclerView = (RecyclerView) pVar.a(R.id.drj);
                        h.f.b.l.b(recyclerView, "");
                        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                        if (!(layoutManager instanceof LinearLayoutManager)) {
                            layoutManager = null;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        if (linearLayoutManager != null) {
                            num = Integer.valueOf(linearLayoutManager.k());
                        } else {
                            num = null;
                        }
                        RecyclerView recyclerView2 = (RecyclerView) pVar.a(R.id.drj);
                        h.f.b.l.b(recyclerView2, "");
                        RecyclerView.a[] aVarArr = new RecyclerView.a[2];
                        FollowListAdapter followListAdapter2 = pVar.f96543m;
                        if (followListAdapter2 == null) {
                            h.f.b.l.a("mFollowingListAdapter");
                        }
                        aVarArr[0] = followListAdapter2;
                        h.f.b.l.d(pVar, "");
                        h.f.b.l.d(pVar, "");
                        com.ss.android.ugc.aweme.social.widget.card.i iVar2 = com.ss.android.ugc.aweme.social.widget.card.i.f133800a;
                        com.ss.android.ugc.aweme.social.widget.a aVar = new com.ss.android.ugc.aweme.social.widget.a(null, pVar, null, null, 13);
                        i.a aVar2 = new i.a();
                        aVar2.f133757a = 7;
                        i.a a2 = aVar2.a(RecommendController.a.a(com.ss.android.ugc.aweme.social.widget.card.a.a.RECTANGLE, true)).a(RecommendController.a.a(com.ss.android.ugc.aweme.social.widget.card.a.a.RECTANGLE, 20, Integer.MAX_VALUE, null)).a(pVar);
                        RecommendController.a.C2325a aVar3 = RecommendController.a.C2325a.f96481a;
                        a2.f133758b = true;
                        a2.f133759c = aVar3;
                        aVarArr[1] = iVar2.b(aVar, a2.a("following_list").b("bottom").c("personal_homepage").a());
                        recyclerView2.setAdapter(new androidx.recyclerview.widget.g(aVarArr));
                        RecyclerView recyclerView3 = (RecyclerView) pVar.a(R.id.drj);
                        h.f.b.l.b(recyclerView3, "");
                        recyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new al(pVar));
                        if (num != null) {
                            ((RecyclerView) pVar.a(R.id.drj)).b(num.intValue());
                        }
                    } else {
                        if (!pVar.A()) {
                            com.ss.android.ugc.aweme.recommend.h hVar = (com.ss.android.ugc.aweme.recommend.h) pVar.withState(pVar.t(), am.f96550a);
                            RecommendListViewModel t = pVar.t();
                            String str = hVar.f120064a;
                            String str2 = hVar.f120065b;
                            h.f.b.l.d(str, "");
                            h.f.b.l.d(str2, "");
                            h.f.b.l.d("nonempty", "");
                            com.ss.android.ugc.aweme.recommend.h hVar2 = new com.ss.android.ugc.aweme.recommend.h(str, str2, "nonempty");
                            h.f.b.l.d(hVar2, "");
                            t.c(new RecommendListViewModel.j(hVar2));
                        }
                        pVar.t().k();
                    }
                } else {
                    p.a(this.this$0).ah_();
                }
                com.ss.android.ugc.aweme.social.a.c cVar = com.ss.android.ugc.aweme.social.a.c.f133649c;
                if (!cVar.b() && !cVar.c() && this.this$0.A()) {
                    DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.e_o);
                    h.f.b.l.b(dmtStatusView, "");
                    dmtStatusView.setVisibility(0);
                    ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
                }
            } else if (this.this$0.l()) {
                FollowingRelationViewModel s = this.this$0.s();
                s.b_(new FollowingRelationViewModel.f(s));
                p.a(this.this$0).ai_();
            } else {
                p.a(this.this$0).ah_();
                ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str, String str2) {
        ((TuxStatusView) a(R.id.b8n)).setStatus(new TuxStatusView.c().a(com.bytedance.tux.c.c.a(aw.f96554a)).a(str).a((CharSequence) str2));
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.b8n);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
    }

    static final class ah extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.ies.powerlist.e a2;
            MethodCollector.i(8424);
            com.bytedance.jedi.arch.i iVar2 = iVar;
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list2)) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                this.this$0.y();
                com.ss.android.ugc.aweme.cc.c.a("follow_relation", (com.ss.android.ugc.aweme.cc.b) null, 6);
            }
            iVar2.withState(this.this$0.s(), new h.f.a.b<FollowingRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.p.ah.AnonymousClass1 */
                final /* synthetic */ ah this$0;

                static {
                    Covode.recordClassIndex(61179);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    h.f.b.l.d(followingRelationState2, "");
                    if (!this.this$0.this$0.s().a(followingRelationState2.getListState().getPayload().f39459a.f39447a, followingRelationState2.getListState().getPayload().f96371e, followingRelationState2.getListState().getPayload().f96372f) && !this.this$0.this$0.A() && this.this$0.this$0.h() && IMService.createIIMServicebyMonsterPlugin(false).isIMAvailable()) {
                        LinearLayout linearLayout = (LinearLayout) this.this$0.this$0.a(R.id.duy);
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        gh.a((RecyclerView) this.this$0.this$0.a(R.id.drj), 0);
                    }
                    return h.z.f158842a;
                }
            });
            p pVar = this.this$0;
            if (pVar.h() && ((!com.ss.android.ugc.aweme.social.a.b.b() || !pVar.A()) && com.ss.android.ugc.aweme.social.a.c.f133649c.b() && !pVar.f96542l.getAndSet(true))) {
                RecommendController u = pVar.u();
                LinearLayout linearLayout = (LinearLayout) pVar.a(R.id.eo1);
                h.f.b.l.b(linearLayout, "");
                DmtStatusView dmtStatusView = (DmtStatusView) pVar.a(R.id.e_o);
                h.f.b.l.b(dmtStatusView, "");
                h.f.b.l.d(linearLayout, "");
                h.f.b.l.d(dmtStatusView, "");
                h.f.b.l.d(pVar, "");
                TopRecommendVM b2 = u.b();
                if (b2 != null && !b2.f96648a.getAndSet(true)) {
                    Fragment fragment = u.f96480j;
                    u.f96473c = linearLayout;
                    u.f96478h = dmtStatusView;
                    View findViewById = linearLayout.findViewById(R.id.eo2);
                    h.f.b.l.b(findViewById, "");
                    u.f96474d = (PowerList) findViewById;
                    u.f96472b = new com.ss.android.ugc.aweme.social.widget.a(null, fragment, null, null, 13);
                    LinearLayout linearLayout2 = u.f96473c;
                    if (linearLayout2 == null) {
                        h.f.b.l.a("container");
                    }
                    linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(u);
                    u.f96480j.getLifecycle().a(u);
                    u.f96475e = pVar;
                    com.ss.android.ugc.aweme.social.widget.card.g a3 = com.ss.android.ugc.aweme.social.widget.card.i.f133800a.a();
                    com.ss.android.ugc.aweme.social.widget.a aVar = u.f96472b;
                    if (aVar == null) {
                        h.f.b.l.a("socialContext");
                    }
                    com.ss.android.ugc.aweme.social.widget.card.view.a a4 = a3.a(aVar, new RecommendController.d(u, b2));
                    LinearLayout linearLayout3 = u.f96473c;
                    if (linearLayout3 == null) {
                        h.f.b.l.a("container");
                    }
                    linearLayout3.addView(a4, 0);
                    if (!u.f96471a) {
                        LayoutInflater from = LayoutInflater.from(u.f96480j.requireContext());
                        LinearLayout linearLayout4 = u.f96473c;
                        if (linearLayout4 == null) {
                            h.f.b.l.a("container");
                        }
                        u.f96476f = com.a.a(from, R.layout.ant, linearLayout4, false);
                        LinearLayout linearLayout5 = u.f96473c;
                        if (linearLayout5 == null) {
                            h.f.b.l.a("container");
                        }
                        linearLayout5.addView(u.f96476f, 2);
                    }
                    PowerList powerList = u.f96474d;
                    if (powerList == null) {
                        h.f.b.l.a("topRecommendList");
                    }
                    powerList.setVisibility(0);
                    u.f96480j.requireContext();
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(com.ss.android.ugc.aweme.social.a.b.b() ? 1 : 0);
                    powerList.setLayoutManager(wrapLinearLayoutManager);
                    if (wrapLinearLayoutManager.f3778j == 0) {
                        Resources system = Resources.getSystem();
                        h.f.b.l.a((Object) system, "");
                        com.bytedance.tux.h.i.b(powerList, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, null, false, 29);
                        Resources system2 = Resources.getSystem();
                        h.f.b.l.a((Object) system2, "");
                        com.bytedance.tux.h.i.a((View) powerList, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) null, (Integer) null, (Integer) null, false, 30);
                        powerList.setClipToPadding(false);
                        powerList.setItemAnimator(new com.ss.android.ugc.aweme.friends.ui.t());
                        powerList.a(com.ss.android.ugc.aweme.social.widget.card.i.f133800a.a().a());
                    }
                    if (com.ss.android.ugc.aweme.social.a.b.b()) {
                        com.ss.android.ugc.aweme.social.widget.card.i iVar3 = com.ss.android.ugc.aweme.social.widget.card.i.f133800a;
                        com.ss.android.ugc.aweme.social.widget.a aVar2 = u.f96472b;
                        if (aVar2 == null) {
                            h.f.b.l.a("socialContext");
                        }
                        i.a aVar3 = new i.a();
                        aVar3.f133757a = 7;
                        i.a a5 = aVar3.a("following_list").c("personal_homepage").b("top").a(RecommendController.a.a(com.ss.android.ugc.aweme.social.widget.card.a.a.RECTANGLE, false));
                        Fragment fragment2 = u.f96480j;
                        TopRecommendVM b3 = u.b();
                        if (b3 == null) {
                            h.f.b.l.b();
                        }
                        DmtStatusView dmtStatusView2 = u.f96478h;
                        if (dmtStatusView2 == null) {
                            h.f.b.l.a("statusView");
                        }
                        com.ss.android.ugc.aweme.social.widget.card.j jVar = u.f96475e;
                        if (jVar == null) {
                            h.f.b.l.a("externalStateListener");
                        }
                        a2 = iVar3.a(aVar2, a5.a(new com.ss.android.ugc.aweme.following.ui.controller.b(fragment2, b3, dmtStatusView2, jVar)).a());
                    } else if (com.ss.android.ugc.aweme.social.a.b.c() || com.ss.android.ugc.aweme.social.a.b.d()) {
                        i.a aVar4 = new i.a();
                        aVar4.f133757a = 7;
                        i.a a6 = aVar4.a("following_list").c("personal_homepage").b("top").a(RecommendController.a.a(com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE, true));
                        com.ss.android.ugc.aweme.social.widget.card.a.a aVar5 = com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE;
                        PowerList powerList2 = u.f96474d;
                        if (powerList2 == null) {
                            h.f.b.l.a("topRecommendList");
                        }
                        i.a a7 = a6.a(RecommendController.a.a(aVar5, 30, 30, powerList2));
                        if (com.ss.android.ugc.aweme.social.a.b.d()) {
                            TopRecommendVM b4 = u.b();
                            if (b4 == null) {
                                h.f.b.l.b();
                            }
                            DmtStatusView dmtStatusView3 = u.f96478h;
                            if (dmtStatusView3 == null) {
                                h.f.b.l.a("statusView");
                            }
                            com.ss.android.ugc.aweme.social.widget.card.j jVar2 = u.f96475e;
                            if (jVar2 == null) {
                                h.f.b.l.a("externalStateListener");
                            }
                            a7.a(new com.ss.android.ugc.aweme.following.ui.controller.c(b4, dmtStatusView3, jVar2));
                        } else {
                            TopRecommendVM b5 = u.b();
                            if (b5 == null) {
                                h.f.b.l.b();
                            }
                            DmtStatusView dmtStatusView4 = u.f96478h;
                            if (dmtStatusView4 == null) {
                                h.f.b.l.a("statusView");
                            }
                            com.ss.android.ugc.aweme.social.widget.card.j jVar3 = u.f96475e;
                            if (jVar3 == null) {
                                h.f.b.l.a("externalStateListener");
                            }
                            a7.a(new com.ss.android.ugc.aweme.following.ui.controller.a(b5, dmtStatusView4, jVar3));
                        }
                        com.ss.android.ugc.aweme.social.widget.card.i iVar4 = com.ss.android.ugc.aweme.social.widget.card.i.f133800a;
                        com.ss.android.ugc.aweme.social.widget.a aVar6 = u.f96472b;
                        if (aVar6 == null) {
                            h.f.b.l.a("socialContext");
                        }
                        a2 = iVar4.a(aVar6, a7.a());
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("experiment group 1 shouldn't enter here.");
                        MethodCollector.o(8424);
                        throw illegalStateException;
                    }
                    powerList.a(a2);
                    b2.f96652e.observe(u, new RecommendController.e(u));
                    b2.f96654g.observe(u, new RecommendController.f(u));
                }
                LinearLayout linearLayout6 = (LinearLayout) pVar.a(R.id.eo1);
                h.f.b.l.b(linearLayout6, "");
                linearLayout6.getViewTreeObserver().addOnGlobalLayoutListener(new m(pVar));
                RecommendController u2 = pVar.u();
                n nVar = new n(pVar);
                h.f.b.l.d(nVar, "");
                u2.f96477g = nVar;
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(8424);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PrivacySetting privacySetting;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        User user = this.f96385c;
        if (user == null || (privacySetting = user.getPrivacySetting()) == null || privacySetting.getFollowingVisibility() != 2) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e91);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setEnabled(false);
            DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            a(dmtStatusView);
            getActivity();
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
            wrapLinearLayoutManager.b(1);
            RecyclerView recyclerView = (RecyclerView) a(R.id.drj);
            h.f.b.l.b(recyclerView, "");
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.drj);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setItemAnimator(new com.ss.android.ugc.aweme.friends.ui.t());
            gh.a((RecyclerView) a(R.id.drj), 8);
            if (h()) {
                z.a aVar = new z.a();
                aVar.element = true;
                ((RecyclerView) a(R.id.drj)).a(new o(this, wrapLinearLayoutManager, aVar));
            }
            if (h()) {
                ((NoticeView) a(R.id.bcf)).setIconImage(2131233390);
                SpannableString spannableString = new SpannableString(com.ss.android.ugc.aweme.base.utils.h.b(R.string.c0j));
                SpannableString spannableString2 = new SpannableString(com.ss.android.ugc.aweme.base.utils.h.b(R.string.c0k) + " ");
                Context context = getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                spannableString2.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bx)), 0, spannableString2.length(), 34);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) spannableString2);
                if (getContext() != null) {
                    Context context2 = getContext();
                    if (context2 == null) {
                        h.f.b.l.b();
                    }
                    spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context2, R.color.m3)), 0, spannableString.length(), 34);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                ((NoticeView) a(R.id.bcf)).setTitleText(spannableStringBuilder);
                com.ss.android.ugc.aweme.newfollow.ui.e eVar = new com.ss.android.ugc.aweme.newfollow.ui.e((NoticeView) a(R.id.bcf), new C2327p());
                this.A = eVar;
                eVar.f112625f = e.a.Follow;
            }
            FollowListAdapter followListAdapter = new FollowListAdapter(this, "following_relation", h());
            followListAdapter.a(this.f96388j);
            this.f96543m = followListAdapter;
            RecyclerView recyclerView3 = (RecyclerView) a(R.id.drj);
            h.f.b.l.b(recyclerView3, "");
            followListAdapter.g(androidx.core.content.b.c(recyclerView3.getContext(), R.color.nd));
            RecyclerView recyclerView4 = (RecyclerView) a(R.id.drj);
            h.f.b.l.b(recyclerView4, "");
            FollowListAdapter followListAdapter2 = this.f96543m;
            if (followListAdapter2 == null) {
                h.f.b.l.a("mFollowingListAdapter");
            }
            recyclerView4.setAdapter(followListAdapter2);
            FollowListAdapter followListAdapter3 = this.f96543m;
            if (followListAdapter3 == null) {
                h.f.b.l.a("mFollowingListAdapter");
            }
            followListAdapter3.a(new f(this));
            RecyclerView recyclerView5 = (RecyclerView) a(R.id.drj);
            h.f.b.l.b(recyclerView5, "");
            new fo(recyclerView5, new g(this));
            if (h()) {
                this.q = DmtStatusView.a.a(getContext());
                MtEmptyView a2 = MtEmptyView.a(getContext());
                a2.setStatus(new d.a(getContext()).a(2131232660).b(R.string.h36).c(R.string.h37).f33648a);
                DmtStatusView.a aVar2 = this.q;
                if (aVar2 != null) {
                    aVar2.b(a2);
                }
                DmtEditText dmtEditText = (DmtEditText) a(R.id.ay6);
                Objects.requireNonNull(dmtEditText, "null cannot be cast to non-null type android.widget.TextView");
                dmtEditText.setHint(getResources().getString(R.string.c0c));
                ((ImageButton) a(R.id.y0)).setOnClickListener(new i(this));
                ((DmtEditText) a(R.id.ay6)).setOnTouchListener(new j(this));
                ((DmtEditText) a(R.id.ay6)).addTextChangedListener(new k(this));
                ((DmtEditText) a(R.id.ay6)).setOnEditorActionListener(new l(this));
                this.n.a();
            }
            f.a.b.b unused = selectSubscribe(v(), q.f96590a, new com.bytedance.jedi.arch.ah(), new y(this));
            f.a.b.b unused2 = selectSubscribe(v(), y.f96661a, new com.bytedance.jedi.arch.ah(), new ae(this));
            ListMiddleware<FollowingRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = s().f96638e;
            FollowListAdapter followListAdapter4 = this.f96543m;
            if (followListAdapter4 == null) {
                h.f.b.l.a("mFollowingListAdapter");
            }
            ListMiddleware.a(listMiddleware, this, followListAdapter4, false, new q(new af(this), new ag(this), new ah(this)), new r(new ai(this), new aj(this), new s(this)), new t(this), null, 908);
            f.a.b.b unused3 = selectSubscribe(s(), r.f96591a, s.f96592a, new com.bytedance.jedi.arch.ah(), new u(this));
            h.a.a(this, t(), t.f96593a, (com.bytedance.jedi.arch.ah) null, new w(this), new v(this), new x(this), 2);
            h.a.a(this, t(), u.f96594a, (com.bytedance.jedi.arch.ah) null, new aa(this), new z(this), ab.f96544a, 2);
            f.a.b.b unused4 = selectSubscribe(t(), v.f96595a, new com.bytedance.jedi.arch.ah(), new ac(this));
            f.a.b.b unused5 = selectSubscribe(t(), w.f96659a, x.f96660a, new com.bytedance.jedi.arch.ah(), new ad(this));
            if (!this.f96386d) {
                s().f96638e.refresh();
                return;
            }
            return;
        }
        a(b(3002060), c(3002060));
    }

    static final class l implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96569a;

        static {
            Covode.recordClassIndex(61215);
        }

        l(p pVar) {
            this.f96569a = pVar;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 3) {
                return false;
            }
            this.f96569a.w();
            return true;
        }
    }

    public static final class o extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f96571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WrapLinearLayoutManager f96572b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f96573c;

        static {
            Covode.recordClassIndex(61218);
        }

        o(p pVar, WrapLinearLayoutManager wrapLinearLayoutManager, z.a aVar) {
            this.f96571a = pVar;
            this.f96572b = wrapLinearLayoutManager;
            this.f96573c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            ViewGroup.LayoutParams layoutParams;
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (this.f96572b.l() == 0) {
                ((AppBarLayout) this.f96571a.a(R.id.l9)).a(true, true, true);
            }
            p pVar = this.f96571a;
            if (!pVar.A() && (linearLayout = (LinearLayout) pVar.a(R.id.duy)) != null && linearLayout.getVisibility() == 8 && (linearLayout2 = (LinearLayout) pVar.a(R.id.duy)) != null) {
                linearLayout2.setVisibility(0);
            }
            if (this.f96573c.element) {
                this.f96573c.element = false;
                int n = this.f96572b.n() + 1;
                RecyclerView recyclerView2 = (RecyclerView) this.f96571a.a(R.id.drj);
                h.f.b.l.b(recyclerView2, "");
                RecyclerView.a adapter = recyclerView2.getAdapter();
                if (adapter != null && n == adapter.getItemCount()) {
                    LinearLayout linearLayout3 = (LinearLayout) this.f96571a.a(R.id.duy);
                    if (linearLayout3 != null) {
                        layoutParams = linearLayout3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                    AppBarLayout.b bVar = (AppBarLayout.b) layoutParams;
                    if (bVar != null) {
                        bVar.f52175a = 0;
                    }
                    LinearLayout linearLayout4 = (LinearLayout) this.f96571a.a(R.id.duy);
                    if (linearLayout4 != null) {
                        linearLayout4.setLayoutParams(bVar);
                    }
                }
            }
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, List<? extends User>, com.bytedance.jedi.arch.ext.list.b, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(p pVar) {
            super(3);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list, com.bytedance.jedi.arch.ext.list.b bVar) {
            List<? extends User> list2 = list;
            com.bytedance.jedi.arch.ext.list.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            h.f.b.l.d(bVar2, "");
            if (bVar2.f39447a) {
                p.a(this.this$0).ai_();
            } else if (!this.this$0.A() || !list2.isEmpty()) {
                p.a(this.this$0).ah_();
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, ListState<Object, com.ss.android.ugc.aweme.following.repository.f>, List<? extends Object>, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(61225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(p pVar) {
            super(3);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState, List<? extends Object> list) {
            final ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState2 = listState;
            final List<? extends Object> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(listState2, "");
            h.f.b.l.d(list2, "");
            RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.drj);
            h.f.b.l.b(recyclerView, "");
            if (!recyclerView.l()) {
                ((RecyclerView) this.this$0.a(R.id.drj)).post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.p.u.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ u f96586a;

                    static {
                        Covode.recordClassIndex(61226);
                    }

                    {
                        this.f96586a = r1;
                    }

                    public final void run() {
                        p.a(this.f96586a.this$0).a(h.a.n.d((Collection) listState2.getList(), (Iterable) list2));
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j
    public final void a(com.ss.android.ugc.aweme.social.widget.card.a.f fVar, com.ss.android.ugc.aweme.social.widget.card.a.e eVar, List<? extends User> list) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(eVar, "");
    }
}
