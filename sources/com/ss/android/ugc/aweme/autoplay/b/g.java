package com.ss.android.ugc.aweme.autoplay.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.autoplay.d.o;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.ss.android.ugc.aweme.discover.e.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class g extends o implements com.ss.android.ugc.aweme.discover.b.b, com.ss.android.ugc.aweme.search.j.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f67298e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f67299a;

    /* renamed from: b  reason: collision with root package name */
    public String f67300b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f67301c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.b.g f67302d;

    /* renamed from: g  reason: collision with root package name */
    private final h f67303g;

    /* renamed from: h  reason: collision with root package name */
    private final h f67304h;

    /* renamed from: i  reason: collision with root package name */
    private final h f67305i;

    static {
        Covode.recordClassIndex(41452);
    }

    public final c a() {
        return (c) this.f67303g.getValue();
    }

    public final LinearLayout b() {
        return (LinearLayout) this.f67304h.getValue();
    }

    public final TextView c() {
        return (TextView) this.f67305i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final com.ss.android.ugc.aweme.search.model.d g() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int i() {
        return 72;
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
            Covode.recordClassIndex(41453);
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
        return this.f67301c;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final View h() {
        return this.f67299a;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int k() {
        return getAdapterPosition();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int l() {
        return getAdapterPosition();
    }

    static final class e extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            View findViewById = this.$itemView.findViewById(R.id.dwu);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return findViewById;
        }
    }

    static final class f extends m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.$itemView.findViewById(R.id.dwc);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return a().c().m();
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f67308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h f67309b;

        static {
            Covode.recordClassIndex(41455);
        }

        public c(r rVar, com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            this.f67308a = rVar;
            this.f67309b = hVar;
        }

        public final void run() {
            String str;
            com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(this.f67308a).g(this.f67308a.n);
            com.ss.android.ugc.aweme.discover.mixfeed.g gVar = this.f67309b.f81785g;
            String str2 = null;
            if (gVar == null || (str = gVar.f81774b) == null || str.length() == 0) {
                str2 = "live_card";
            } else {
                com.ss.android.ugc.aweme.discover.mixfeed.g gVar2 = this.f67309b.f81785g;
                if (gVar2 != null) {
                    str2 = gVar2.f81774b;
                }
            }
            dVar.x(str2).f();
        }
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

    static final class d extends m implements h.f.a.a<c> {
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.a $containerStatusProvider;
        final /* synthetic */ View $itemView;
        final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.b $mPlayVideoObserver;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(41456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
            super(0);
            this.this$0 = gVar;
            this.$itemView = view;
            this.$containerStatusProvider = aVar;
            this.$mPlayVideoObserver = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            MethodCollector.i(1909);
            this.this$0.f67299a.removeAllViews();
            View view = this.$itemView;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.$containerStatusProvider;
                com.ss.android.ugc.aweme.flowfeed.a.b bVar = this.$mPlayVideoObserver;
                l.d(viewGroup, "");
                l.d(aVar, "");
                l.d(bVar, "");
                View a2 = com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awn);
                c cVar = new c(new com.ss.android.ugc.aweme.discover.alading.d(a2), aVar, bVar, a2);
                this.this$0.f67299a.addView(cVar.d());
                this.this$0.a(cVar);
                cVar.a(this.this$0);
                MethodCollector.o(1909);
                return cVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(1909);
            throw nullPointerException;
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f67306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h f67307b;

        static {
            Covode.recordClassIndex(41454);
        }

        public b(r rVar, com.ss.android.ugc.aweme.discover.mixfeed.h hVar) {
            this.f67306a = rVar;
            this.f67307b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((com.ss.android.ugc.aweme.search.k.d) ((at) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(this.f67306a).x("live_card")).r("live")).s("live").g(this.f67306a.n)).B("click_more_button").v(this.f67306a.n).a((Integer) 0)).d((Integer) 0).f();
            if (!com.ss.android.ugc.aweme.a.a.a()) {
                Context context = GlobalContext.getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.discover.activity.b bVar = new com.ss.android.ugc.aweme.discover.activity.b();
                bVar.setSearchKeyword(this.f67306a.f121271f);
                bVar.setEnterFrom(this.f67306a.f121272g);
                bVar.setSearchId("searchId");
                bVar.setSearchType("general");
                bVar.setRoomIdList(com.ss.android.ugc.aweme.discover.ui.c.a.a(this.f67307b.o.f81644a));
                bVar.setEnterMethod("click_more_general_list");
                SearchLiveListActivity.a.a(context, bVar, com.ss.android.ugc.aweme.search.h.f121133a.e());
                return;
            }
            com.ss.android.ugc.d.a.c.a(new p(j.f121160h));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.discover.b.g gVar) {
        super(view, (byte) 0);
        l.d(view, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f67302d = gVar;
        View findViewById = view.findViewById(R.id.du9);
        l.b(findViewById, "");
        this.f67299a = (ViewGroup) findViewById;
        this.f67303g = i.a((h.f.a.a) new d(this, view, aVar, bVar));
        this.f67304h = i.a((h.f.a.a) new e(view));
        this.f67305i = i.a((h.f.a.a) new f(view));
    }
}
