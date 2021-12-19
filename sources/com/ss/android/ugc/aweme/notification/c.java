package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.analytics.page.d;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.e.a;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.adapter.e;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.notification.utils.p;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class c extends com.ss.android.ugc.aweme.notification.i.i implements com.bytedance.analytics.page.d, b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: l  reason: collision with root package name */
    public static final a f113298l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f113299a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f113300b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f113301c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f113302d = true;

    /* renamed from: e  reason: collision with root package name */
    final p f113303e;

    /* renamed from: j  reason: collision with root package name */
    final e f113304j;

    /* renamed from: k  reason: collision with root package name */
    final f f113305k;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f113306m = com.ss.android.ugc.aweme.notification.b.a.a(new n(this));
    private final h.h n = com.ss.android.ugc.aweme.notification.b.a.a(new m(this));
    private final h.h o = com.ss.android.ugc.aweme.notification.b.a.a(t.f113321a);
    private final h.h p = com.ss.android.ugc.aweme.notification.b.a.a(new v(this));
    private final h.h q = com.ss.android.ugc.aweme.notification.b.a.a(b.f113307a);
    private AnalysisStayTimeFragmentComponent r;
    private final androidx.lifecycle.u<List<MusNotice>> s;
    private final androidx.lifecycle.u<com.ss.android.ugc.aweme.notification.bean.i> t;
    private final androidx.lifecycle.u<com.ss.android.ugc.aweme.notification.bean.i> u;
    private final androidx.lifecycle.u<h.p<MusNotice, com.ss.android.ugc.aweme.notification.bean.b>> v;
    private SparseArray w;

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final r f113319a = new r();

        static {
            Covode.recordClassIndex(72855);
        }

        r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(72835);
    }

    private final Map<Integer, com.ss.android.ugc.aweme.notification.adapter.e> p() {
        return (Map) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i
    public final View a(int i2) {
        if (this.w == null) {
            this.w = new SparseArray();
        }
        View view = (View) this.w.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.w.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "8003";
    }

    public final SwipeRefreshLayout e() {
        return (SwipeRefreshLayout) this.f113306m.getValue();
    }

    public final RecyclerView g() {
        return (RecyclerView) this.n.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(211, new org.greenrobot.eventbus.g(c.class, "onResumeRefreshEvent", com.ss.android.ugc.aweme.notice.api.bean.n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(68, new org.greenrobot.eventbus.g(c.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final com.ss.android.ugc.aweme.notification.i.h i() {
        return (com.ss.android.ugc.aweme.notification.i.h) this.o.getValue();
    }

    public final NotificationVM j() {
        return (NotificationVM) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i
    public final void n() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        n();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72836);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Map<Integer, com.ss.android.ugc.aweme.notification.adapter.e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113307a = new b();

        static {
            Covode.recordClassIndex(72837);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, com.ss.android.ugc.aweme.notification.adapter.e> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.i.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f113321a = new t();

        static {
            Covode.recordClassIndex(72857);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.i.h invoke() {
            return new com.ss.android.ugc.aweme.notification.i.h();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0);
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return d.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return d.a.b(this);
    }

    static final class m extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.a(R.id.drj);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<SwipeRefreshLayout> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SwipeRefreshLayout invoke() {
            return this.this$0.a(R.id.e92);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.b
    public final String h() {
        return j().b();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.notification.i.i, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_RESUME, new j(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.notification.i.i, androidx.fragment.app.Fragment
    public final void onStart() {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_START, new k(this));
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, Bundle bundle) {
            super(0);
            this.this$0 = cVar;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c.super.onCreate(this.$savedInstanceState);
            EventBus.a(EventBus.a(), this.this$0);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ LayoutInflater $inflater;

        static {
            Covode.recordClassIndex(72845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.$inflater = layoutInflater;
            this.$container = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = com.a.a(this.$inflater, R.layout.kj, this.$container, false);
            h.f.b.l.b(a2, "");
            a2.setBackgroundColor(androidx.core.content.b.c(a2.getContext(), R.color.f159928l));
            return a2;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c.super.onResume();
            if (this.this$0.f113300b) {
                this.this$0.j().k();
            }
            this.this$0.f113300b = false;
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c.super.onStart();
            UgCommonServiceImpl.j().b(this.this$0.getContext());
            return z.f158842a;
        }
    }

    static final class q implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113317a;

        static {
            Covode.recordClassIndex(72853);
        }

        q(c cVar) {
            this.f113317a = cVar;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
        public final void onRefresh() {
            if (!this.f113317a.j().k()) {
                this.f113317a.e().post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.notification.c.q.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ q f113318a;

                    static {
                        Covode.recordClassIndex(72854);
                    }

                    {
                        this.f113318a = r1;
                    }

                    public final void run() {
                        SwipeRefreshLayout e2 = this.f113318a.f113317a.e();
                        h.f.b.l.b(e2, "");
                        e2.setRefreshing(false);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("message");
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    public final void m() {
        int i2;
        View a2 = a(R.id.fem);
        h.f.b.l.b(a2, "");
        if (g().canScrollVertically(-1)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        a2.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.notification.i.i, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
            com.ss.android.ugc.aweme.notification.e.c.c();
        }
        EventBus.a().b(this);
    }

    public c() {
        com.ss.android.ugc.aweme.inbox.d.e.b();
        c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
        if (b2 != null) {
            b2.j();
        }
        this.f113303e = new p(this);
        this.f113304j = new e(this);
        this.f113305k = new f(this);
        this.s = new C2894c(this);
        this.t = new o(this);
        this.u = new g(this);
        this.v = new d(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i
    public final List<i.a> l() {
        return h.a.n.b(i(), new com.ss.android.ugc.aweme.notification.i.b(), new com.ss.android.ugc.aweme.notification.i.c(), new com.ss.android.ugc.aweme.notification.i.a(), new com.ss.android.ugc.aweme.notification.i.d(), new com.ss.android.ugc.aweme.notification.i.g(), new com.ss.android.ugc.aweme.notification.i.e(), new com.ss.android.ugc.aweme.notification.i.f());
    }

    public final com.ss.android.ugc.aweme.notification.adapter.e k() {
        com.ss.android.ugc.aweme.notification.adapter.e eVar = p().get(Integer.valueOf(j().a()));
        if (eVar == null) {
            eVar = new com.ss.android.ugc.aweme.notification.adapter.e(this);
            DmtStatusView h2 = i().h();
            h.f.b.l.d(h2, "");
            eVar.f113181a = h2;
            i.a aVar = o().get(com.ss.android.ugc.aweme.notification.i.g.class);
            com.ss.android.ugc.aweme.notification.i.f fVar = null;
            if (!(aVar instanceof com.ss.android.ugc.aweme.notification.i.g)) {
                aVar = null;
            }
            com.ss.android.ugc.aweme.notification.i.g gVar = (com.ss.android.ugc.aweme.notification.i.g) aVar;
            if (gVar != null) {
                com.ss.android.ugc.aweme.notification.i.g gVar2 = gVar;
                h.f.b.l.d(gVar2, "");
                eVar.f113182b = gVar2;
                i.a aVar2 = o().get(com.ss.android.ugc.aweme.notification.i.f.class);
                if (aVar2 instanceof com.ss.android.ugc.aweme.notification.i.f) {
                    fVar = aVar2;
                }
                com.ss.android.ugc.aweme.notification.i.f fVar2 = fVar;
                if (fVar2 != null) {
                    com.ss.android.ugc.aweme.notification.i.f fVar3 = fVar2;
                    h.f.b.l.d(fVar3, "");
                    eVar.f113183c = fVar3;
                    p().put(Integer.valueOf(j().a()), eVar);
                } else {
                    throw new IllegalStateException("Cannot find widget: " + com.ss.android.ugc.aweme.notification.i.f.class.getSimpleName());
                }
            } else {
                throw new IllegalStateException("Cannot find widget: " + com.ss.android.ugc.aweme.notification.i.g.class.getSimpleName());
            }
        }
        return eVar;
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ View $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(72848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar, View view, Bundle bundle) {
            super(0);
            this.this$0 = cVar;
            this.$view = view;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            String str;
            c.super.onViewCreated(this.$view, this.$savedInstanceState);
            com.ss.android.ugc.aweme.notification.utils.g.b(this.$view.getContext());
            c cVar = this.this$0;
            this.$view.setBackgroundColor(cVar.getResources().getColor(R.color.f159928l));
            View a2 = cVar.a(R.id.fej);
            h.f.b.l.b(a2, "");
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            Context context = cVar.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
            layoutParams.height = i2;
            ((RelativeLayout) cVar.a(R.id.dp_)).setOnClickListener(r.f113319a);
            cVar.e().setOnRefreshListener(new q(cVar));
            cVar.getContext();
            FixedLinearlayoutManager fixedLinearlayoutManager = new FixedLinearlayoutManager();
            RecyclerView g2 = cVar.g();
            h.f.b.l.b(g2, "");
            g2.setAdapter(cVar.k());
            RecyclerView g3 = cVar.g();
            h.f.b.l.b(g3, "");
            g3.setLayoutManager(fixedLinearlayoutManager);
            com.ss.android.ugc.aweme.notification.utils.q.a(cVar.g(), cVar.e());
            cVar.g().a(cVar.f113303e);
            cVar.g().a(cVar.f113304j);
            com.ss.android.ugc.aweme.notification.utils.p pVar = new com.ss.android.ugc.aweme.notification.utils.p();
            RecyclerView g4 = cVar.g();
            h.f.b.l.b(g4, "");
            pVar.a(g4, fixedLinearlayoutManager, cVar.f113305k);
            LogHelper a3 = LogHelperImpl.a();
            RecyclerView g5 = cVar.g();
            h.f.b.l.b(g5, "");
            a3.a("mus_new_notification", g5);
            if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
                TuxIconView tuxIconView = (TuxIconView) cVar.a(R.id.qa);
                h.f.b.l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                Space space = (Space) cVar.a(R.id.v2);
                h.f.b.l.b(space, "");
                space.setVisibility(8);
                ((TuxIconView) cVar.a(R.id.qa)).setOnClickListener(new s(cVar));
                a.C1099a.a(cVar).c(R.attr.f159902m).f(R.attr.f159902m).a(true).f44923a.d();
            }
            c cVar2 = this.this$0;
            androidx.fragment.app.e activity = cVar2.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
                NotificationVM j2 = cVar2.j();
                if (booleanExtra) {
                    str = "push";
                } else {
                    str = "message";
                }
                j2.a(str);
            }
            c cVar3 = this.this$0;
            cVar3.j().c().observe(cVar3, new u(cVar3));
            cVar3.a(cVar3.j().a(), true);
            cVar3.j().k();
            return z.f158842a;
        }
    }

    public static final class e extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113312a;

        static {
            Covode.recordClassIndex(72841);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(c cVar) {
            this.f113312a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            if (RecyclerView.d(view) == this.f113312a.k().getItemCount() - 1) {
                rect.bottom = (int) com.bytedance.common.utility.n.b(this.f113312a.getContext(), 19.0f);
            }
        }
    }

    public static final class f implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113313a;

        static {
            Covode.recordClassIndex(72842);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(c cVar) {
            this.f113313a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.utils.p.a
        public final void a(int i2) {
            i.a aVar = this.f113313a.o().get(com.ss.android.ugc.aweme.notification.i.d.class);
            if (!(aVar instanceof com.ss.android.ugc.aweme.notification.i.d)) {
                aVar = null;
            }
            com.ss.android.ugc.aweme.notification.i.d dVar = (com.ss.android.ugc.aweme.notification.i.d) aVar;
            if (dVar != null) {
                dVar.b(i2);
                return;
            }
            throw new IllegalStateException("Cannot find widget: " + com.ss.android.ugc.aweme.notification.i.d.class.getSimpleName());
        }
    }

    public static final class p extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113316a;

        static {
            Covode.recordClassIndex(72852);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(c cVar) {
            this.f113316a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            boolean z = true;
            if (!(i2 == 1 || i2 == 2)) {
                z = false;
            }
            c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
            if (b2 != null) {
                b2.a(z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            this.f113316a.m();
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113320a;

        static {
            Covode.recordClassIndex(72856);
        }

        s(c cVar) {
            this.f113320a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113320a.requireActivity().finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i, com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.r = new AnalysisStayTimeFragmentComponent(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.notification.i.i, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE, new h(this, bundle));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        h.f.b.l.d(cVar, "");
        k().notifyDataSetChanged();
    }

    @org.greenrobot.eventbus.r
    public final void onResumeRefreshEvent(com.ss.android.ugc.aweme.notice.api.bean.n nVar) {
        h.f.b.l.d(nVar, "");
        if (ab_()) {
            this.f113300b = true;
        }
    }

    static final class g<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113314a;

        static {
            Covode.recordClassIndex(72843);
        }

        g(c cVar) {
            this.f113314a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == com.ss.android.ugc.aweme.notification.bean.i.ERROR) {
                new com.bytedance.tux.g.b(this.f113314a).e(R.string.de8).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i, com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        if (c(bundle)) {
            super.b(bundle);
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.r;
            if (analysisStayTimeFragmentComponent == null) {
                h.f.b.l.a("stayTimeComponent");
            }
            analysisStayTimeFragmentComponent.a(true);
        }
    }

    static final class d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113311a;

        static {
            Covode.recordClassIndex(72840);
        }

        d(c cVar) {
            this.f113311a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            if (pVar.getSecond() == com.ss.android.ugc.aweme.notification.bean.b.NET_ERR) {
                new com.bytedance.tux.g.b(this.f113311a).e(R.string.de8).b();
            } else if (pVar.getSecond() == com.ss.android.ugc.aweme.notification.bean.b.REQ_ERR) {
                new com.bytedance.tux.g.b(this.f113311a).e(R.string.cml).b();
            }
        }
    }

    private final boolean c(Bundle bundle) {
        String string = bundle.getString(be.f68530b, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        String d2 = Hox.a.a(activity).d("HOME");
        if (!ab_()) {
            return false;
        }
        if (h.f.b.l.a((Object) string, (Object) be.f68532d) || bundle.getBoolean(d2)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$c  reason: collision with other inner class name */
    static final class C2894c<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113309a;

        static {
            Covode.recordClassIndex(72838);
        }

        C2894c(c cVar) {
            this.f113309a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (!this.f113309a.f113301c) {
                com.ss.android.ugc.aweme.cc.c.a("mus_new_notification", (com.ss.android.ugc.aweme.cc.b) null, 6);
                this.f113309a.f113301c = true;
            }
            com.ss.android.ugc.aweme.inbox.d.e.d();
            com.ss.android.ugc.aweme.notification.adapter.e k2 = this.f113309a.k();
            h.f.b.l.b(list, "");
            AnonymousClass1 r2 = new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.notification.c.C2894c.AnonymousClass1 */
                final /* synthetic */ C2894c this$0;

                static {
                    Covode.recordClassIndex(72839);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    i.a aVar = this.this$0.f113309a.o().get(com.ss.android.ugc.aweme.notification.i.d.class);
                    if (!(aVar instanceof com.ss.android.ugc.aweme.notification.i.d)) {
                        aVar = null;
                    }
                    com.ss.android.ugc.aweme.notification.i.d dVar = (com.ss.android.ugc.aweme.notification.i.d) aVar;
                    if (dVar != null) {
                        dVar.h();
                        return z.f158842a;
                    }
                    throw new IllegalStateException("Cannot find widget: " + com.ss.android.ugc.aweme.notification.i.d.class.getSimpleName());
                }
            };
            h.f.b.l.d(list, "");
            if (k2.b().isEmpty() || list.isEmpty()) {
                h.f.b.l.d(list, "");
                k2.b().clear();
                k2.b().addAll(list);
                k2.notifyDataSetChanged();
                r2.invoke();
                k2.f113184d = true;
                return;
            }
            k2.f113184d = false;
            com.ss.android.ugc.aweme.notification.e.d.a(new e.g(h.a.n.k(k2.b()), list), new e.h(k2, list, r2));
        }
    }

    static final class u<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113322a;

        static {
            Covode.recordClassIndex(72858);
        }

        u(c cVar) {
            this.f113322a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.p pVar = (h.p) obj;
            RecyclerView g2 = this.f113322a.g();
            h.f.b.l.b(g2, "");
            g2.setAdapter(this.f113322a.k());
            this.f113322a.a(((Number) pVar.getFirst()).intValue(), false);
            this.f113322a.a(((Number) pVar.getSecond()).intValue(), true);
            this.f113322a.f113299a = true;
            this.f113322a.j().k();
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f113315a;

        static {
            Covode.recordClassIndex(72851);
        }

        o(c cVar) {
            this.f113315a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == com.ss.android.ugc.aweme.notification.bean.i.LOADING) {
                if (this.f113315a.k().getItemCount() > 0) {
                    SwipeRefreshLayout e2 = this.f113315a.e();
                    h.f.b.l.b(e2, "");
                    if (!e2.mRefreshing && this.f113315a.f113299a) {
                        this.f113315a.i().a(true);
                    } else if (this.f113315a.f113302d) {
                        SwipeRefreshLayout e3 = this.f113315a.e();
                        h.f.b.l.b(e3, "");
                        e3.setRefreshing(true);
                    }
                } else {
                    com.ss.android.ugc.aweme.notification.i.h i2 = this.f113315a.i();
                    i2.h().setVisibility(0);
                    i2.h().f();
                }
                BaseNotificationVM.a(this.f113315a.j().a());
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(6, com.ss.android.ugc.aweme.notice.api.b.a(6)));
            } else {
                com.ss.android.ugc.aweme.notification.i.h i3 = this.f113315a.i();
                i3.a(false);
                i3.h().d();
                SwipeRefreshLayout e4 = this.f113315a.e();
                h.f.b.l.b(e4, "");
                e4.setRefreshing(false);
                if (obj == com.ss.android.ugc.aweme.notification.bean.i.ERROR) {
                    new com.bytedance.tux.g.b(this.f113315a).e(R.string.de8).b();
                    if (this.f113315a.k().getItemCount() <= 0) {
                        this.f113315a.i().h().h();
                    }
                } else if (this.f113315a.k().getItemCount() <= 0) {
                    this.f113315a.i().h().g();
                }
            }
            this.f113315a.f113299a = false;
            this.f113315a.f113302d = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i, com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        if (c(bundle)) {
            super.a(bundle);
            j().k();
            c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
            if (b2 != null) {
                b2.j();
            }
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.r;
            if (analysisStayTimeFragmentComponent == null) {
                h.f.b.l.a("stayTimeComponent");
            }
            analysisStayTimeFragmentComponent.a(false);
        }
        com.bytedance.analytics.b.a(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_VIEW_CREATED, new l(this, view, bundle));
    }

    public final void a(int i2, boolean z) {
        com.ss.android.ugc.aweme.notification.vm.c b2 = j().b(i2);
        if (!z) {
            b2.a().removeObserver(this.s);
            b2.b().removeObserver(this.t);
            b2.c().removeObserver(this.u);
            b2.f().removeObserver(this.v);
            return;
        }
        b2.a().observe(this, this.s);
        b2.b().observe(this, this.t);
        b2.c().observe(this, this.u);
        b2.f().observe(this, this.v);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.notification.i.i, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        Object a2 = com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE_VIEW, new i(layoutInflater, viewGroup));
        h.f.b.l.b(a2, "");
        return (View) a2;
    }
}
