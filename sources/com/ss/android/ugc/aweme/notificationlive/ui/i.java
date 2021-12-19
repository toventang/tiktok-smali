package com.ss.android.ugc.aweme.notificationlive.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Collection;
import java.util.List;

public final class i extends com.ss.android.ugc.aweme.following.ui.a {

    /* renamed from: l  reason: collision with root package name */
    public final User f114456l;

    /* renamed from: m  reason: collision with root package name */
    public PushSettingFollowListAdapter f114457m;
    private final lifecycleAwareLazy n;
    private SparseArray o;

    static {
        Covode.recordClassIndex(73650);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final PushSettingNotificationChoiceViewModel b() {
        return (PushSettingNotificationChoiceViewModel) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int g() {
        return R.layout.aoa;
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

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int q() {
        return R.string.c0g;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int r() {
        return R.string.c0d;
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f114459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f114460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f114461c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f114462d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f114463e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> f114464f;

        static {
            Covode.recordClassIndex(73656);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f114462d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f114463e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> c() {
            return this.f114464f;
        }

        public d(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f114459a = bVar;
            this.f114460b = mVar;
            this.f114461c = mVar2;
            this.f114462d = bVar;
            this.f114463e = mVar;
            this.f114464f = mVar2;
        }
    }

    public static final class e implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f114465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f114466b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f114467c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, z> f114468d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> f114469e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> f114470f;

        static {
            Covode.recordClassIndex(73657);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, z> a() {
            return this.f114468d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> b() {
            return this.f114469e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> c() {
            return this.f114470f;
        }

        public e(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f114465a = bVar;
            this.f114466b = mVar;
            this.f114467c = mVar2;
            this.f114468d = bVar;
            this.f114469e = mVar;
            this.f114470f = mVar2;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
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

    static final class c implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f114458a;

        static {
            Covode.recordClassIndex(73654);
        }

        c(i iVar) {
            this.f114458a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            i iVar = this.f114458a;
            iVar.withState(iVar.b(), new h.f.a.b<NotificationChoiceState, z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.ui.i.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(73655);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    h.f.b.l.d(notificationChoiceState2, "");
                    if (notificationChoiceState2.getListState().getPayload().f96369c != 0) {
                        i iVar = this.this$0.f114458a;
                        iVar.withState(iVar.b(), new o(iVar));
                    }
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final void p() {
        b().f114390f.refresh();
    }

    public final boolean c() {
        return ((Boolean) withState(b(), m.f114471a)).booleanValue();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<PushSettingNotificationChoiceViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_notificationlive_ui_PushSettingNotificationChoiceFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel> r0 = com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.i$b$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.i$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.i.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_notificationlive_ui_PushSettingNotificationChoiceFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public i() {
        User user;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 != null) {
            user = g2.getCurUser();
        } else {
            user = null;
        }
        this.f114456l = user;
        n nVar = new n(this);
        h.k.c a2 = h.f.b.ab.a(PushSettingNotificationChoiceViewModel.class);
        a aVar = new a(a2);
        this.n = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, nVar));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        if (!t.c() || !t.b()) {
            z = false;
        } else {
            z = true;
        }
        b().b(z);
        if (b().f114389e) {
            b().f114390f.a(h.a.z.INSTANCE);
            b().f114390f.refresh();
            b().f114389e = false;
        }
    }

    public static final /* synthetic */ PushSettingFollowListAdapter a(i iVar) {
        PushSettingFollowListAdapter pushSettingFollowListAdapter = iVar.f114457m;
        if (pushSettingFollowListAdapter == null) {
            h.f.b.l.a("mPushSettingFollowListAdapter");
        }
        return pushSettingFollowListAdapter;
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ((DmtStatusView) this.this$0.a(R.id.e_o)).f();
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<NotificationChoiceState, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(NotificationChoiceState notificationChoiceState) {
            h.f.b.l.d(notificationChoiceState, "");
            i.a(this.this$0).ag_();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$i  reason: collision with other inner class name */
    static final class C2930i extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2930i(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            if (!dmtStatusView.j()) {
                i.a(this.this$0).ag_();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<NotificationChoiceState, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f114471a = new m();

        static {
            Covode.recordClassIndex(73667);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(NotificationChoiceState notificationChoiceState) {
            List<Object> a2;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            h.f.b.l.d(notificationChoiceState2, "");
            List<Object> a3 = notificationChoiceState2.getListState().getRefresh().a();
            boolean z = false;
            if ((a3 == null || a3.size() < 2) && ((a2 = notificationChoiceState2.getListState().getLoadMore().a()) == null || a2.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            i.a(this.this$0).j();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<NotificationChoiceState, z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.ui.i.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(73665);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    h.f.b.l.d(notificationChoiceState2, "");
                    PushSettingNotificationChoiceViewModel b2 = this.this$0.this$0.b();
                    boolean z = notificationChoiceState2.getListState().getPayload().f39459a.f39447a;
                    notificationChoiceState2.getListState().getPayload();
                    notificationChoiceState2.getListState().getPayload();
                    if (!b2.a(z)) {
                        if (this.this$0.this$0.c()) {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).g();
                        } else {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).d();
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th2, "");
            i iVar2 = this.this$0;
            DmtStatusView dmtStatusView = (DmtStatusView) iVar2.a(R.id.e_o);
            h.f.b.l.b(dmtStatusView, "");
            iVar2.a(dmtStatusView, (Exception) th2);
            ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list2)) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
            }
            iVar2.withState(this.this$0.b(), new h.f.a.b<NotificationChoiceState, z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.ui.i.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(73661);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    h.f.b.l.d(notificationChoiceState2, "");
                    PushSettingNotificationChoiceViewModel b2 = this.this$0.this$0.b();
                    boolean z = notificationChoiceState2.getListState().getPayload().f39459a.f39447a;
                    notificationChoiceState2.getListState().getPayload();
                    notificationChoiceState2.getListState().getPayload();
                    if (!b2.a(z) && this.this$0.this$0.c()) {
                        ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).g();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue) {
                i.a(this.this$0).ai_();
            } else {
                i.a(this.this$0).ah_();
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<NotificationChoiceState, Bundle, NotificationChoiceState> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(73668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState, Bundle bundle) {
            String str;
            String secUid;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            String str2 = "";
            h.f.b.l.d(notificationChoiceState2, str2);
            User user = this.this$0.f114456l;
            if (user == null || (str = user.getUid()) == null) {
                str = str2;
            }
            User user2 = this.this$0.f114456l;
            if (!(user2 == null || (secUid = user2.getSecUid()) == null)) {
                str2 = secUid;
            }
            return NotificationChoiceState.copy$default(notificationChoiceState2, str, str2, this.this$0.h(), null, false, 0, null, false, null, null, 1016, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
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
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "settings_page";
        }
        h.f.b.l.b(str, "");
        PushSettingFollowListAdapter pushSettingFollowListAdapter = new PushSettingFollowListAdapter(this, str);
        String str2 = this.f96388j;
        h.f.b.l.d(str2, "");
        pushSettingFollowListAdapter.f114421d = str2;
        this.f114457m = pushSettingFollowListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView3, "");
        pushSettingFollowListAdapter.g(androidx.core.content.b.c(recyclerView3.getContext(), R.color.nd));
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView4, "");
        PushSettingFollowListAdapter pushSettingFollowListAdapter2 = this.f114457m;
        if (pushSettingFollowListAdapter2 == null) {
            h.f.b.l.a("mPushSettingFollowListAdapter");
        }
        recyclerView4.setAdapter(pushSettingFollowListAdapter2);
        PushSettingFollowListAdapter pushSettingFollowListAdapter3 = this.f114457m;
        if (pushSettingFollowListAdapter3 == null) {
            h.f.b.l.a("mPushSettingFollowListAdapter");
        }
        pushSettingFollowListAdapter3.a(new c(this));
        ListMiddleware<NotificationChoiceState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = b().f114390f;
        PushSettingFollowListAdapter pushSettingFollowListAdapter4 = this.f114457m;
        if (pushSettingFollowListAdapter4 == null) {
            h.f.b.l.a("mPushSettingFollowListAdapter");
        }
        ListMiddleware.a(listMiddleware, this, pushSettingFollowListAdapter4, false, new d(new f(this), new g(this), new h(this)), new e(new C2930i(this), new j(this), new k(this)), new l(this), null, 908);
        if (!this.f96386d) {
            b().f114390f.refresh();
        }
    }
}
