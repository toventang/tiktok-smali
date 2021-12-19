package com.ss.android.ugc.aweme.autoplay.d.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.autoplay.d.o;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.discover.mixfeed.q;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.l.j;
import com.ss.android.ugc.aweme.search.n.d;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class i extends o implements com.ss.android.ugc.aweme.discover.b.b, com.ss.android.ugc.aweme.search.j.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f67375i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f67376a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f67377b;

    /* renamed from: c  reason: collision with root package name */
    public AwemeRawAd f67378c;

    /* renamed from: d  reason: collision with root package name */
    public int f67379d = 16;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67380e;

    /* renamed from: g  reason: collision with root package name */
    public final d f67381g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.model.d f67382h;

    /* renamed from: m  reason: collision with root package name */
    private final h f67383m;

    static {
        Covode.recordClassIndex(41491);
    }

    public final h a() {
        return (h) this.f67383m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int i() {
        return 70;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final void n() {
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final SmartImageView p() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final b.d q() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean r() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void s() {
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void t() {
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final Aweme u() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean v() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41492);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final com.ss.android.ugc.aweme.search.j.a d() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean e() {
        return this.f80425l;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean f() {
        return this.f67380e;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final com.ss.android.ugc.aweme.search.model.d g() {
        return this.f67382h;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final View h() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int k() {
        return getAdapterPosition();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int l() {
        return getAdapterPosition();
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f67387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f67388b;

        static {
            Covode.recordClassIndex(41494);
        }

        public c(i iVar, q qVar) {
            this.f67387a = iVar;
            this.f67388b = qVar;
        }

        public final void run() {
            this.f67387a.a("search_result_show", this.f67388b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f67389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f67390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f67391c;

        static {
            Covode.recordClassIndex(41496);
        }

        e(i iVar, String str, q qVar) {
            this.f67389a = iVar;
            this.f67390b = str;
            this.f67391c = qVar;
        }

        public final void run() {
            this.f67389a.f67381g.a(this.f67390b, this.f67391c);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return a().c().m();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int j() {
        View view = this.itemView;
        l.b(view, "");
        if (!(view.getLayoutParams() instanceof GridLayoutManager.b)) {
            return -1;
        }
        View view2 = this.itemView;
        l.b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        return ((GridLayoutManager.b) layoutParams).f3768a;
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Aweme aweme;
            i iVar = this.this$0;
            List<? extends Aweme> list = iVar.a().f67407f;
            if (list == null || !(!list.isEmpty())) {
                list = null;
            }
            List<? extends Aweme> list2 = iVar.a().f67407f;
            if (list2 != null) {
                aweme = (Aweme) n.b((List) list2, 0);
            } else {
                aweme = null;
            }
            if (!(list == null || aweme == null)) {
                iVar.a().a(iVar.G(), (View) null, aweme, list);
            }
            ((at) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(iVar.a().f().f67355b).g(iVar.a().h())).x(iVar.a().g())).B("click_title").a(Integer.valueOf(iVar.D())).f();
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<h> {
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.a $containerStatusProvider;
        final /* synthetic */ View $itemView;
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.b $mPlayVideoObserver;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
            super(0);
            this.this$0 = iVar;
            this.$itemView = view;
            this.$containerStatusProvider = aVar;
            this.$mPlayVideoObserver = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            MethodCollector.i(271);
            this.this$0.f67376a.removeAllViews();
            View view = this.$itemView;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.$containerStatusProvider;
                com.ss.android.ugc.aweme.flowfeed.a.b bVar = this.$mPlayVideoObserver;
                l.d(viewGroup, "");
                l.d(aVar, "");
                l.d(bVar, "");
                h hVar = new h(new com.ss.android.ugc.aweme.discover.alading.d(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awf)), aVar, bVar);
                this.this$0.f67376a.addView(hVar.d());
                this.this$0.a(hVar);
                hVar.a(this.this$0);
                MethodCollector.o(271);
                return hVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(271);
            throw nullPointerException;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.o, com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        super.onViewDetachedFromWindow(view);
        this.f67380e = false;
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f67384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f67385b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f67386c;

        static {
            Covode.recordClassIndex(41493);
        }

        public b(i iVar, q qVar, r rVar) {
            this.f67384a = iVar;
            this.f67385b = qVar;
            this.f67386c = rVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                Context G = this.f67384a.G();
                com.ss.android.ugc.aweme.discover.mixfeed.r rVar = this.f67385b.f81855b;
                String str4 = null;
                if (rVar != null) {
                    str = rVar.f81863f;
                } else {
                    str = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(G, str).withParam("pre_search_id", this.f67386c.f121274i);
                com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(this.f67384a.H()).f82794a;
                if (bVar != null) {
                    str2 = bVar.getEnterSearchFrom();
                } else {
                    str2 = null;
                }
                withParam.withParam("enter_from", str2).open();
                this.f67384a.a("search_result_click", this.f67385b);
                JSONObject jSONObject = new JSONObject();
                com.ss.android.ugc.aweme.search.model.b bVar2 = SearchEnterViewModel.a.a(this.f67384a.H()).f82794a;
                if (bVar2 != null) {
                    str3 = bVar2.getEnterSearchFrom();
                } else {
                    str3 = null;
                }
                jSONObject.put("enter_from", str3);
                com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(this.f67384a.H());
                if (!(b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null)) {
                    str4 = searchCommonModel.getEnterFrom();
                }
                jSONObject.put("enter_from_x", str4);
                c.a.a("ref_search_hot_spot_bind", jSONObject, am.c("enter_from"));
            }
        }
    }

    public final void a(String str, q qVar) {
        l.d(str, "");
        l.d(qVar, "");
        if (TextUtils.equals(str, "search_result_show")) {
            j.a(this.itemView, new e(this, str, qVar));
        } else {
            this.f67381g.a(str, qVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(com.ss.android.ugc.aweme.search.model.d dVar, View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(view, (byte) 0);
        l.d(view, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f67382h = dVar;
        View findViewById = view.findViewById(R.id.du9);
        l.b(findViewById, "");
        this.f67376a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.a04);
        l.b(findViewById2, "");
        this.f67377b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bfn);
        l.b(findViewById3, "");
        this.f67381g = new b((ViewStub) findViewById3, new d(this));
        this.f67383m = h.i.a((h.f.a.a) new f(this, view, aVar, bVar));
    }
}
