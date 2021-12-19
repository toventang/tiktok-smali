package com.ss.android.ugc.aweme.autoplay.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autoplay.d.k;
import com.ss.android.ugc.aweme.autoplay.d.n;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.live.SearchLiveView;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.a.ag;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView;
import com.ss.android.ugc.aweme.search.k.ak;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.k.s;
import com.ss.android.ugc.aweme.search.l.j;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.iu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class d extends k implements View.OnAttachStateChangeListener {

    /* renamed from: g  reason: collision with root package name */
    public static final a f67258g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f67259a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f67260b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f67261c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.autoplay.a.a f67262d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.utils.g f67263e;

    /* renamed from: f  reason: collision with root package name */
    public final View f67264f;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f67265l = h.i.a((h.f.a.a) new C1517d(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f67266m;
    private final h.h n;
    private final h.h o;
    private final h.h p;
    private final SearchVideoView q;
    private final com.ss.android.ugc.aweme.autoplay.d.c r;

    static {
        Covode.recordClassIndex(41420);
    }

    private final TextView n() {
        return (TextView) this.f67266m.getValue();
    }

    private final TextView o() {
        return (TextView) this.n.getValue();
    }

    private final TextView p() {
        return (TextView) this.p.getValue();
    }

    public final SearchLiveView a() {
        return (SearchLiveView) this.f67265l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41434);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(ViewGroup viewGroup, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.utils.g gVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
            l.d(viewGroup, "");
            l.d(aVar, "");
            l.d(gVar, "");
            l.d(bVar, "");
            return new d(m.a(viewGroup, R.layout.aus), aVar, gVar, bVar, viewGroup);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.k
    public final SearchVideoView l() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.k
    public final com.ss.android.ugc.aweme.autoplay.d.c m() {
        return this.r;
    }

    static final class c extends h.f.b.m implements h.f.a.a<SmartCircleImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartCircleImageView invoke() {
            View findViewById = this.$itemView.findViewById(R.id.or);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartCircleImageView");
            return findViewById;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.$itemView.findViewById(R.id.f2f);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.$itemView.findViewById(R.id.dqd);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(41440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.$itemView.findViewById(R.id.fdm);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$d  reason: collision with other inner class name */
    static final class C1517d extends h.f.b.m implements h.f.a.a<SearchLiveView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(41437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1517d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchLiveView invoke() {
            View findViewById = this.this$0.itemView.findViewById(R.id.fhs);
            l.b(findViewById, "");
            return findViewById;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public SmartImageView j() {
        View view = this.itemView;
        l.b(view, "");
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.bs4);
        l.b(smartImageView, "");
        return smartImageView;
    }

    private final View r() {
        View view = this.itemView;
        l.b(view, "");
        View findViewById = view.findViewById(R.id.ce6);
        l.b(findViewById, "");
        return findViewById;
    }

    public final TopLiveProductView k() {
        View view = this.itemView;
        l.b(view, "");
        TopLiveProductView topLiveProductView = (TopLiveProductView) view.findViewById(R.id.d_3);
        l.b(topLiveProductView, "");
        return topLiveProductView;
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f67275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.g f67276c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User f67277d;

        static {
            Covode.recordClassIndex(41441);
        }

        h(d dVar, r rVar, com.ss.android.ugc.aweme.discover.mixfeed.g gVar, User user) {
            this.f67274a = dVar;
            this.f67275b = rVar;
            this.f67276c = gVar;
            this.f67277d = user;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            String str4;
            com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(this.f67275b).g(this.f67275b.n);
            com.ss.android.ugc.aweme.discover.mixfeed.g gVar = this.f67276c;
            Long l2 = null;
            if (gVar == null || (str4 = gVar.f81774b) == null || str4.length() == 0) {
                str = "live_card";
            } else {
                com.ss.android.ugc.aweme.discover.mixfeed.g gVar2 = this.f67276c;
                if (gVar2 != null) {
                    str = gVar2.f81774b;
                } else {
                    str = null;
                }
            }
            com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) dVar.x(str);
            User user = this.f67277d;
            if (user != null) {
                str2 = user.getRoomTitle();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.search.k.d dVar3 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar2.s(str2)).d(Integer.valueOf(this.f67274a.getLayoutPosition()))).r("live");
            User user2 = this.f67277d;
            if (user2 != null) {
                l2 = Long.valueOf(user2.roomId);
            }
            com.ss.android.ugc.aweme.search.k.c v = dVar3.v(String.valueOf(l2));
            if (this.f67274a.f67261c) {
                str3 = "search_live_merge_entrance";
            } else {
                str3 = "";
            }
            v.c("anchor_info", str3).f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f67278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f67279b;

        static {
            Covode.recordClassIndex(41442);
        }

        i(r rVar, User user) {
            this.f67278a = rVar;
            this.f67279b = user;
        }

        public final void run() {
            Long l2;
            String str;
            int i2;
            ak akVar = (ak) new s().a(this.f67278a.f121274i).b(this.f67278a.f121271f).f(this.f67278a.f121269d).g(this.f67278a.n);
            User user = this.f67279b;
            Long l3 = null;
            if (user != null) {
                l2 = Long.valueOf(user.roomId);
            } else {
                l2 = null;
            }
            String valueOf = String.valueOf(l2);
            l.d(valueOf, "");
            akVar.c(s.q, valueOf);
            com.ss.android.ugc.aweme.search.k.c q = ((com.ss.android.ugc.aweme.search.k.c) akVar.r("general_search").p("live_cell")).q("click");
            User user2 = this.f67279b;
            if (user2 != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            ak akVar2 = (ak) q.e(str);
            User user3 = this.f67279b;
            if (user3 != null) {
                l3 = Long.valueOf(user3.roomId);
            }
            s sVar = (s) akVar2.s(String.valueOf(l3)).n(this.f67278a.f121274i);
            User user4 = this.f67279b;
            if (user4 != null) {
                i2 = user4.getFollowStatus();
            } else {
                i2 = 0;
            }
            sVar.a(i2).f();
        }
    }

    public void onViewAttachedToWindow(View view) {
        l.d(view, "");
        com.ss.android.ugc.aweme.autoplay.e.a.a(a().getLiveCore());
    }

    public void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        com.ss.android.ugc.aweme.autoplay.e.a.b(a().getLiveCore());
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f67270b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f67271c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.AbstractC1937b f67272d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f67273e;

        static {
            Covode.recordClassIndex(41435);
        }

        b(d dVar, Aweme aweme, h hVar, b.AbstractC1937b bVar, r rVar) {
            this.f67269a = dVar;
            this.f67270b = aweme;
            this.f67271c = hVar;
            this.f67272d = bVar;
            this.f67273e = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.discover.ui.c.a aVar = com.ss.android.ugc.aweme.discover.ui.c.a.f82491a;
            Aweme aweme = this.f67270b;
            h hVar = this.f67271c;
            b.AbstractC1937b bVar = this.f67272d;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            String livePlayerTag = this.f67269a.a().getLivePlayerTag();
            View view2 = this.f67269a.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            aVar.a(aweme, hVar, bVar, enterRoomConfig, livePlayerTag, context);
            this.f67269a.a("search_result_click", this.f67270b, this.f67273e, this.f67271c.f67310a);
            e.f67280g = true;
        }
    }

    public final void a(String str, Aweme aweme, r rVar, com.ss.android.ugc.aweme.discover.mixfeed.g gVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (rVar != null) {
            User author = aweme.getAuthor();
            if (TextUtils.equals(str, "search_result_show")) {
                j.a(this.itemView, new h(this, rVar, gVar, author));
            } else if (TextUtils.equals(str, "search_result_click")) {
                com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(rVar).g(rVar.n);
                Long l2 = null;
                if (gVar == null || (str5 = gVar.f81774b) == null || str5.length() == 0) {
                    str2 = "live_card";
                } else if (gVar != null) {
                    str2 = gVar.f81774b;
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) dVar.x(str2);
                if (author != null) {
                    str3 = author.getRoomTitle();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.search.k.d dVar3 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar2.s(str3)).d(Integer.valueOf(getLayoutPosition()))).r("live");
                if (author != null) {
                    l2 = Long.valueOf(author.roomId);
                }
                com.ss.android.ugc.aweme.search.k.c v = dVar3.v(String.valueOf(l2));
                if (this.f67261c) {
                    str4 = "search_live_merge_entrance";
                } else {
                    str4 = "";
                }
                ((at) v.c("anchor_info", str4)).B("click_live").f();
            } else if (TextUtils.equals(str, s.f121282a)) {
                j.a(this.itemView, new i(rVar, author));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, final com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.utils.g gVar, final com.ss.android.ugc.aweme.flowfeed.a.b bVar, View view2) {
        super(view, aVar, gVar, bVar);
        com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider;
        l.d(view, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        l.d(view2, "");
        this.f67263e = gVar;
        this.f67264f = view2;
        this.f67266m = h.i.a((h.f.a.a) new e(view));
        this.n = h.i.a((h.f.a.a) new f(view));
        this.o = h.i.a((h.f.a.a) new c(view));
        this.p = h.i.a((h.f.a.a) new g(view));
        this.f67259a = 1.78f;
        this.r = new b(a().getLiveCore());
        com.ss.android.ugc.aweme.autoplay.player.live.g.a(new h.f.a.b<com.ss.android.ugc.aweme.autoplay.player.live.i, z>(this) {
            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1 */
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(41421);
            }

            {
                this.this$0 = r2;
            }

            /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$1$a */
            static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.flowfeed.utils.g> {
                final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.utils.g $manager;

                static {
                    Covode.recordClassIndex(41431);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(com.ss.android.ugc.aweme.flowfeed.utils.g gVar) {
                    super(0);
                    this.$manager = gVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.flowfeed.utils.g invoke() {
                    return this.$manager;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.autoplay.player.live.i iVar) {
                com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider;
                com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider2;
                com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider3;
                com.ss.android.ugc.aweme.autoplay.player.live.e dataProvider4;
                final com.ss.android.ugc.aweme.autoplay.player.live.i iVar2 = iVar;
                l.d(iVar2, "");
                iVar2.a(new h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.live.d>(this) {
                    /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass1 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(41422);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.live.d invoke() {
                        return this.this$0.this$0.a().getLiveCore();
                    }
                });
                this.this$0.a().setOutCorner(true);
                com.ss.android.ugc.aweme.flowfeed.utils.g gVar = this.this$0.f67263e;
                if (gVar != null) {
                    a aVar = new a(gVar);
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.autoplay.player.live.d dVar = iVar2.f67538a;
                    if (!(dVar == null || (dataProvider4 = dVar.getDataProvider()) == null)) {
                        dataProvider4.f67519c = (com.ss.android.ugc.aweme.flowfeed.utils.g) aVar.invoke();
                    }
                }
                AnonymousClass2 r2 = new h.f.a.a<com.ss.android.ugc.aweme.flowfeed.a.a>(this) {
                    /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass2 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(41423);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.a invoke() {
                        return aVar;
                    }
                };
                l.d(r2, "");
                com.ss.android.ugc.aweme.autoplay.player.live.d dVar2 = iVar2.f67538a;
                if (!(dVar2 == null || (dataProvider3 = dVar2.getDataProvider()) == null)) {
                    dataProvider3.f67517a = (com.ss.android.ugc.aweme.flowfeed.a.a) r2.invoke();
                }
                AnonymousClass3 r22 = new h.f.a.a<com.ss.android.ugc.aweme.flowfeed.a.b>(this) {
                    /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass3 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(41424);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.flowfeed.a.b invoke() {
                        return bVar;
                    }
                };
                l.d(r22, "");
                com.ss.android.ugc.aweme.autoplay.player.live.d dVar3 = iVar2.f67538a;
                if (!(dVar3 == null || (dataProvider2 = dVar3.getDataProvider()) == null)) {
                    dataProvider2.f67518b = (com.ss.android.ugc.aweme.flowfeed.a.b) r22.invoke();
                }
                d dVar4 = this.this$0;
                AnonymousClass4 r1 = new h.f.a.b<com.ss.android.ugc.aweme.autoplay.a.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass4 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(41425);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.autoplay.a.a aVar) {
                        com.ss.android.ugc.aweme.autoplay.a.a aVar2 = aVar;
                        l.d(aVar2, "");
                        aVar2.a(new h.f.a.a<b.d>(this) {
                            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass4.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass4 this$0;

                            static {
                                Covode.recordClassIndex(41426);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* bridge */ /* synthetic */ b.d invoke() {
                                return iVar2.f67538a;
                            }
                        });
                        aVar2.d(new h.f.a.a<Aweme>(this) {
                            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass4.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass4 this$0;

                            static {
                                Covode.recordClassIndex(41427);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* bridge */ /* synthetic */ Aweme invoke() {
                                return this.this$0.this$0.this$0.f67260b;
                            }
                        });
                        aVar2.c(new h.f.a.a<Integer>(this) {
                            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass4.AnonymousClass3 */
                            final /* synthetic */ AnonymousClass4 this$0;

                            static {
                                Covode.recordClassIndex(41428);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ Integer invoke() {
                                return Integer.valueOf(this.this$0.this$0.this$0.getAdapterPosition());
                            }
                        });
                        aVar2.b(new h.f.a.a<b.c>(this) {
                            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass4.AnonymousClass4 */
                            final /* synthetic */ AnonymousClass4 this$0;

                            static {
                                Covode.recordClassIndex(41429);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* bridge */ /* synthetic */ b.c invoke() {
                                return iVar2;
                            }
                        });
                        return z.f158842a;
                    }
                };
                l.d(r1, "");
                com.ss.android.ugc.aweme.autoplay.a.a aVar2 = new com.ss.android.ugc.aweme.autoplay.a.a();
                r1.invoke(aVar2);
                dVar4.f67262d = aVar2;
                AnonymousClass5 r23 = new h.f.a.a<com.ss.android.ugc.aweme.flowfeed.utils.i>(this) {
                    /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass1.AnonymousClass5 */
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(41430);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ com.ss.android.ugc.aweme.flowfeed.utils.i invoke() {
                        com.ss.android.ugc.aweme.autoplay.a.a aVar = this.this$0.this$0.f67262d;
                        if (aVar == null) {
                            l.b();
                        }
                        return aVar;
                    }
                };
                l.d(r23, "");
                com.ss.android.ugc.aweme.autoplay.player.live.d dVar5 = iVar2.f67538a;
                if (!(dVar5 == null || (dataProvider = dVar5.getDataProvider()) == null)) {
                    dataProvider.f67520d = (com.ss.android.ugc.aweme.flowfeed.utils.i) r23.invoke();
                }
                return z.f158842a;
            }
        });
        a().setMCoverView(j());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f67267a;

            static {
                Covode.recordClassIndex(41432);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f67267a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f67267a.f67263e.a(this.f67267a.f67262d);
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f67267a.f67263e.b(this.f67267a.f67262d);
            }
        });
        SearchLiveView a2 = a();
        if (a2 != null && (dataProvider = a2.getDataProvider()) != null) {
            dataProvider.f67529m = new com.ss.android.ugc.aweme.autoplay.player.live.a(this) {
                /* class com.ss.android.ugc.aweme.autoplay.b.d.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f67268a;

                static {
                    Covode.recordClassIndex(41433);
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.live.b, com.ss.android.ugc.aweme.autoplay.player.live.a
                public final void a() {
                    if (com.ss.android.ugc.aweme.search.ecom.live.c.a()) {
                        TopLiveProductView k2 = this.f67268a.k();
                        if (k2.f121078c > 1) {
                            k2.f121081f = true;
                            k2.getMHandler().removeCallbacks(k2.getShowRunnable());
                            k2.getMHandler().postDelayed(k2.getShowRunnable(), 4000);
                        }
                    }
                    super.a();
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.live.b, com.ss.android.ugc.aweme.autoplay.player.live.a
                public final void b() {
                    if (com.ss.android.ugc.aweme.search.ecom.live.c.a()) {
                        TopLiveProductView k2 = this.f67268a.k();
                        if (k2.f121078c > 1) {
                            k2.f121081f = false;
                            k2.getMHandler().removeCallbacks(k2.getShowRunnable());
                        }
                    }
                    super.b();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f67268a = r1;
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.live.b, com.ss.android.ugc.aweme.autoplay.player.live.a
                public final void a(View view, int i2, int i3) {
                    super.a(view, i2, i3);
                    d dVar = this.f67268a;
                    if (view != null) {
                        view.hashCode();
                        if (i2 > 0 && i3 > 0) {
                            View view2 = dVar.itemView;
                            l.b(view2, "");
                            SearchLiveView searchLiveView = (SearchLiveView) view2.findViewById(R.id.fhs);
                            l.b(searchLiveView, "");
                            int width = searchLiveView.getWidth();
                            View view3 = dVar.itemView;
                            l.b(view3, "");
                            SearchLiveView searchLiveView2 = (SearchLiveView) view3.findViewById(R.id.fhs);
                            l.b(searchLiveView2, "");
                            int height = searchLiveView2.getHeight();
                            if (width > 0 && height > 0 && view.getLayoutParams() != null) {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                float f2 = ((float) i3) / ((float) i2);
                                float f3 = (float) height;
                                float f4 = (float) width;
                                if (f2 >= f3 / f4) {
                                    layoutParams2.width = (int) (f3 / f2);
                                    layoutParams2.height = height;
                                } else {
                                    layoutParams2.width = width;
                                    layoutParams2.height = (int) (f4 * f2);
                                }
                                layoutParams2.gravity = 17;
                                view.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            };
        }
    }

    public final void a(String str, Aweme aweme, h hVar, b.AbstractC1937b bVar, com.ss.android.ugc.aweme.search.ecom.live.b bVar2) {
        r rVar;
        String str2;
        String str3;
        UrlModel urlModel;
        UrlModel urlModel2;
        Aweme aweme2;
        int i2;
        boolean z;
        com.ss.android.ugc.aweme.search.ecom.a.a aVar;
        int i3;
        List<String> list;
        String str4;
        String str5;
        List<com.ss.android.ugc.aweme.search.ecom.a.a> list2;
        int i4;
        Aweme aweme3;
        int i5;
        List<com.ss.android.ugc.aweme.search.ecom.a.a> productsInfo;
        LiveRoomStruct newLiveRoomData;
        UrlModel urlModel3;
        l.d(str, "");
        l.d(aweme, "");
        if (hVar != null) {
            rVar = hVar.f67311b;
        } else {
            rVar = null;
        }
        User author = aweme.getAuthor();
        if (!(author == null || (urlModel3 = author.roomCover) == null)) {
            urlModel3.getUri();
        }
        this.f67260b = aweme;
        com.ss.android.ugc.aweme.autoplay.player.video.c b2 = b();
        if (b2 != null) {
            b2.x = rVar;
        }
        com.ss.android.ugc.aweme.autoplay.player.video.c b3 = b();
        if (b3 != null) {
            b3.b(str);
        }
        n c2 = c();
        if (c2 != null) {
            c2.f67456d = getPosition();
        }
        SearchLiveView a2 = a();
        if (rVar == null) {
            l.b();
        }
        l.d(aweme, "");
        l.d(rVar, "");
        a2.getDataProvider().f67524h = rVar;
        j.a.a(a2, rVar);
        a2.f67492b = true;
        a2.f67491a.a(aweme);
        a2.f67491a.b();
        TextView o2 = o();
        a.C0730a aVar2 = new a.C0730a();
        User author2 = aweme.getAuthor();
        if (author2 == null || (str2 = author2.getRoomTitle()) == null) {
            str2 = "";
        }
        o2.setText(aVar2.b(str2).f33382a);
        TextView p2 = p();
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            str3 = author3.getSearchUserName();
        } else {
            str3 = null;
        }
        p2.setText(str3);
        if (ag.a()) {
            ViewGroup.LayoutParams layoutParams = r().getLayoutParams();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 104.0f, system.getDisplayMetrics()));
            View r2 = r();
            View view = this.itemView;
            l.b(view, "");
            r2.setBackground(androidx.core.content.b.a(view.getContext(), (int) R.drawable.bec));
        } else if (ag.b() || ag.c()) {
            ViewGroup.LayoutParams layoutParams2 = r().getLayoutParams();
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, 136.0f, system2.getDisplayMetrics()));
            View r3 = r();
            View view2 = this.itemView;
            l.b(view2, "");
            r3.setBackground(androidx.core.content.b.a(view2.getContext(), (int) R.drawable.bed));
        } else {
            ViewGroup.LayoutParams layoutParams3 = r().getLayoutParams();
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            layoutParams3.height = h.g.a.a(TypedValue.applyDimension(1, 104.0f, system3.getDisplayMetrics()));
        }
        Aweme aweme4 = this.f67260b;
        if (aweme4 == null || (newLiveRoomData = aweme4.getNewLiveRoomData()) == null || newLiveRoomData.liveEventInfo == null) {
            TextView n2 = n();
            View view3 = this.itemView;
            l.b(view3, "");
            Context context = view3.getContext();
            l.b(context, "");
            n2.setText(context.getResources().getString(R.string.ef6));
        } else {
            TextView n3 = n();
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            com.ss.android.ugc.aweme.live.c.a j2 = s.j();
            View view4 = this.itemView;
            l.b(view4, "");
            n3.setText(j2.a(view4.getContext(), "pm_mt_live_events_live_consumer_live_events"));
        }
        SmartImageView q2 = j();
        User author4 = aweme.getAuthor();
        if (author4 != null) {
            urlModel = author4.roomCover;
        } else {
            urlModel = null;
        }
        q2.setPlaceholderImage(R.drawable.b1c);
        if (urlModel != null) {
            v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            a3.E = q2;
            a3.c();
        }
        User author5 = aweme.getAuthor();
        if (author5 != null) {
            urlModel2 = author5.getAvatarThumb();
        } else {
            urlModel2 = null;
        }
        v a4 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel2)).b(em.a(100)).a("AbsCellViewHolder");
        a4.E = (SmartCircleImageView) this.o.getValue();
        a4.c();
        View view5 = this.itemView;
        l.b(view5, "");
        l.d(view5, "");
        View view6 = this.itemView;
        l.b(view6, "");
        Context context2 = view6.getContext();
        ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
        Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
        float a5 = (float) com.bytedance.common.utility.n.a(context2);
        if (a5 < com.bytedance.common.utility.n.b(context2, 375.0f)) {
            marginLayoutParams.width = (int) com.bytedance.common.utility.n.b(context2, 200.0f);
            marginLayoutParams.height = (int) com.bytedance.common.utility.n.b(context2, 356.0f);
        } else {
            float f2 = a5 * 0.53333336f;
            marginLayoutParams.width = (int) f2;
            marginLayoutParams.height = (int) (f2 * this.f67259a);
        }
        View view7 = this.itemView;
        l.b(view7, "");
        int b4 = (int) com.bytedance.common.utility.n.b(view7.getContext(), 8.0f);
        View view8 = this.itemView;
        l.b(view8, "");
        ViewGroup.LayoutParams layoutParams5 = view8.getLayoutParams();
        Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(b4);
        view5.setLayoutParams(marginLayoutParams);
        if (com.ss.android.ugc.aweme.search.ecom.live.c.a()) {
            if (bVar2 != null) {
                aweme2 = bVar2.f121104a;
            } else {
                aweme2 = null;
            }
            if (aweme2 == null || (productsInfo = aweme2.getProductsInfo()) == null) {
                i2 = 0;
            } else {
                i2 = productsInfo.size();
            }
            if (i2 > 0) {
                k().setVisibility(0);
                o().setVisibility(8);
                View view9 = this.itemView;
                l.b(view9, "");
                ViewGroup.LayoutParams layoutParams6 = view9.getLayoutParams();
                Objects.requireNonNull(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                TextView p3 = p();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams6).width;
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                int a6 = i6 - h.g.a.a(TypedValue.applyDimension(1, 200.0f, system4.getDisplayMetrics()));
                Resources system5 = Resources.getSystem();
                l.a((Object) system5, "");
                p3.setMaxWidth(a6 + h.g.a.a(TypedValue.applyDimension(1, 79.0f, system5.getDisplayMetrics())));
                TopLiveProductView k2 = k();
                View view10 = this.itemView;
                l.b(view10, "");
                Context context3 = view10.getContext();
                l.b(context3, "");
                k2.setProductHandler(new com.ss.android.ugc.aweme.search.ecom.live.a(bVar2, hVar, bVar, context3, a().getLivePlayerTag(), getLayoutPosition()));
                this.f67261c = true;
                z = false;
                aVar = null;
            } else {
                k().setVisibility(8);
                z = false;
                o().setVisibility(0);
                TextView p4 = p();
                Resources system6 = Resources.getSystem();
                l.a((Object) system6, "");
                p4.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 155.0f, system6.getDisplayMetrics())));
                this.f67261c = false;
                aVar = null;
                k().setProductHandler(null);
            }
            TopLiveProductView k3 = k();
            k3.f121076a = bVar2;
            if (bVar2 != null) {
                i3 = bVar2.f121105b;
            } else {
                i3 = 0;
            }
            k3.setDisplayIndex(i3);
            if (bVar2 == null || (list = bVar2.f121106c) == null) {
                list = new ArrayList<>();
            }
            k3.f121085j = list;
            if (!(bVar2 == null || (aweme3 = bVar2.f121104a) == null)) {
                k3.f121081f = z;
                k3.f121077b = aweme3.getProductsInfo();
                List<com.ss.android.ugc.aweme.search.ecom.a.a> productsInfo2 = aweme3.getProductsInfo();
                if (productsInfo2 != null) {
                    i5 = productsInfo2.size();
                } else {
                    i5 = 0;
                }
                k3.f121078c = i5;
            }
            if (k3.f121078c > 0 && (list2 = k3.f121077b) != null) {
                com.ss.android.ugc.aweme.search.ecom.live.b bVar3 = k3.f121076a;
                if (bVar3 != null) {
                    i4 = bVar3.f121105b;
                } else {
                    i4 = 0;
                }
                aVar = list2.get(i4);
            }
            k3.f121084i = aVar;
            com.ss.android.ugc.aweme.search.ecom.a.a aVar3 = k3.f121084i;
            if (!(aVar3 == null || (str5 = aVar3.f121035c) == null)) {
                k3.setCover(str5);
            }
            TuxTextView tuxTextView = k3.f121080e;
            com.ss.android.ugc.aweme.search.ecom.a.a aVar4 = k3.f121084i;
            if (aVar4 == null || (str4 = aVar4.f121038f) == null) {
                str4 = "";
            }
            tuxTextView.setText(str4);
            com.ss.android.ugc.aweme.search.ecom.live.a aVar5 = k3.f121083h;
            if (aVar5 != null) {
                k3.f121079d.setOnClickListener(new TopLiveProductView.b(aVar5, k3));
            }
        }
        a("search_result_show", aweme, rVar, hVar.f67310a);
        a(s.f121282a, aweme, rVar, hVar.f67310a);
        a().setOnClickListener(new b(this, aweme, hVar, bVar, rVar));
        a().getLiveCore().setLivePlayerEntranceParam(new com.bytedance.android.livesdkapi.depend.model.c.a("general_search", "live_cell", ""));
        if (ag.c()) {
            iu.a(o());
            iu.a(p());
        }
    }
}
