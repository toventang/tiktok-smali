package com.ss.android.ugc.aweme.discover.adapter;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.helper.ac;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.helper.k;
import com.ss.android.ugc.aweme.discover.helper.p;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.mob.o;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.bc;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.fu;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class ah extends b implements b.d, c.d, com.ss.android.ugc.aweme.discover.adapter.a.a, com.ss.android.ugc.aweme.discover.adapter.a.b {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f80328a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f80329b;

    /* renamed from: c  reason: collision with root package name */
    public Music f80330c;

    /* renamed from: d  reason: collision with root package name */
    public String f80331d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.c.d f80332e;

    /* renamed from: f  reason: collision with root package name */
    public p f80333f;

    /* renamed from: g  reason: collision with root package name */
    public String f80334g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f80335h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.b.a f80336i;

    /* renamed from: m  reason: collision with root package name */
    public int f80337m;
    public final b n = null;
    public final i o;
    private final h.h q;
    private final SmartRoundImageView r;
    private final ImageView s;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final TextView w;
    private final RecyclerView x;
    private k y;
    private com.ss.android.ugc.aweme.discover.helper.f z;

    public interface b {
        static {
            Covode.recordClassIndex(50013);
        }
    }

    static {
        Covode.recordClassIndex(50007);
    }

    private final com.ss.android.ugc.aweme.discover.h.b c() {
        return (com.ss.android.ugc.aweme.discover.h.b) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50012);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ah a(ViewGroup viewGroup, i iVar) {
            l.d(viewGroup, "");
            return new ah(m.a(viewGroup, R.layout.avv), iVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this.itemView;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f80349a;

        static {
            Covode.recordClassIndex(50014);
        }

        c(ah ahVar) {
            this.f80349a = ahVar;
        }

        public final void run() {
            p pVar = this.f80349a.f80333f;
            if (pVar != null) {
                pVar.f81161b = this.f80349a.F();
            }
        }
    }

    public static final class h implements f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f80356a;

        static {
            Covode.recordClassIndex(50019);
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.f.c
        public final List<com.ss.android.ugc.aweme.search.d> a() {
            Music music = this.f80356a.f80330c;
            if (music != null) {
                return music.getHighlightInfoList();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(ah ahVar) {
            this.f80356a = ahVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.f.c
        public final List<Object> a(String str, String str2, Position position) {
            l.d(str, "");
            l.d(str2, "");
            l.d(position, "");
            int hashCode = str2.hashCode();
            if (hashCode != 1257385826) {
                if (hashCode != 1257679708 || !str2.equals("search_music_name")) {
                    return null;
                }
                View view = this.f80356a.itemView;
                l.b(view, "");
                return n.c(new com.ss.android.ugc.aweme.discover.m.a(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)), new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.bx)));
            } else if (!str2.equals("search_music_desc")) {
                return null;
            } else {
                View view2 = this.f80356a.itemView;
                l.b(view2, "");
                return n.c(new ForegroundColorSpan(androidx.core.content.b.c(view2.getContext(), R.color.bx)), new com.ss.android.ugc.aweme.discover.m.a(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)));
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.discover.h.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f80357a = new i();

        static {
            Covode.recordClassIndex(50020);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.h.b invoke() {
            return SearchServiceImpl.t().f();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        com.ss.android.ugc.aweme.discover.c.d dVar = this.f80332e;
        if (dVar != null) {
            return dVar.b(this.f80330c);
        }
        return false;
    }

    public final int b() {
        Music music;
        int a2;
        i iVar = this.o;
        if (iVar == null || (music = this.f80330c) == null || (a2 = iVar.a(music)) < 0) {
            return getAdapterPosition();
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.b(r2) != false) goto L_0x0026;
     */
    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.discover.c.d r5 = r6.f80332e
            if (r5 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r4 = r5.f80904a
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.f80908e
            r2 = -1
            if (r0 == 0) goto L_0x002f
            long r0 = r0.getId()
        L_0x0010:
            boolean r0 = r4.a(r0)
            if (r0 != 0) goto L_0x0026
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r1 = r5.f80904a
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.f80908e
            if (r0 == 0) goto L_0x0020
            long r2 = r0.getId()
        L_0x0020:
            boolean r0 = r1.b(r2)
            if (r0 == 0) goto L_0x002b
        L_0x0026:
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r5.f80904a
            r0.a()
        L_0x002b:
            r0 = 0
            r6.f80335h = r0
            return
        L_0x002f:
            r0 = -1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.ah.y():void");
    }

    public final String a() {
        String str;
        String str2;
        String mid;
        if (l.a((Object) this.f80331d, (Object) "search_result")) {
            Music music = this.f80330c;
            if (music == null || (str = music.getMid()) == null) {
                return "";
            }
        } else if (!l.a((Object) this.f80331d, (Object) "general_search")) {
            return "";
        } else {
            com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f80336i;
            if (aVar != null) {
                str2 = aVar.getSearchResultId();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar2 = this.f80336i;
                if (aVar2 == null || (str = aVar2.getSearchResultId()) == null) {
                    return "";
                }
            } else {
                Music music2 = this.f80330c;
                if (music2 == null || (mid = music2.getMid()) == null) {
                    return "";
                }
                return mid;
            }
        }
        return str;
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f80352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Music f80353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.b.a f80354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f80355d;

        static {
            Covode.recordClassIndex(50017);
        }

        f(ah ahVar, Music music, com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, int i2) {
            this.f80352a = ahVar;
            this.f80353b = music;
            this.f80354c = aVar;
            this.f80355d = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            List<MusicTag> list;
            String str2;
            String str3;
            String str4;
            User user;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String tokenType;
            User user2;
            au a2 = com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(this.f80352a.F());
            com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f80352a.f80336i;
            String str10 = null;
            if (aVar == null || (user2 = aVar.getUser()) == null) {
                str = null;
            } else {
                str = user2.getUniqueId();
            }
            a2.u(str);
            GsonProvider c2 = GsonHolder.c();
            String str11 = "";
            l.b(c2, str11);
            com.google.gson.f b2 = c2.b();
            Music music = this.f80352a.f80330c;
            if (music != null) {
                list = music.getMusicTags();
            } else {
                list = null;
            }
            a2.z(b2.b(list));
            String str12 = "search_result";
            if (this.f80353b.getSoundsListType() == 0) {
                com.ss.android.ugc.aweme.search.k.c x = a2.x("music");
                Music music2 = this.f80352a.f80330c;
                if (music2 == null || (str5 = music2.getMid()) == null) {
                    str5 = str11;
                }
                String str13 = "0";
                com.ss.android.ugc.aweme.search.k.c a3 = ((com.ss.android.ugc.aweme.search.k.d) x.g(str5)).w(str13).a(Integer.valueOf(this.f80352a.F().f121278m));
                String str14 = this.f80352a.f80331d;
                if (str14 != null) {
                    str12 = str14;
                }
                com.ss.android.ugc.aweme.search.k.c cVar = (com.ss.android.ugc.aweme.search.k.c) a3.o(str12);
                r F = this.f80352a.F();
                if (F != null) {
                    str6 = F.f121274i;
                } else {
                    str6 = null;
                }
                com.ss.android.ugc.aweme.search.k.c a4 = cVar.a(str6);
                r F2 = this.f80352a.F();
                if (F2 != null) {
                    str7 = F2.f121277l;
                } else {
                    str7 = null;
                }
                a4.c(str7);
                if (l.a((Object) this.f80352a.f80331d, (Object) "general_search")) {
                    a2.y(String.valueOf(this.f80352a.getAdapterPosition()));
                }
                if (l.a((Object) this.f80352a.f80331d, (Object) "general_search") && this.f80354c != null) {
                    com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar2 = this.f80352a.f80336i;
                    if (aVar2 == null || (str8 = aVar2.getSearchResultId()) == null) {
                        str8 = str11;
                    }
                    com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) a2.g(str8);
                    com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar3 = this.f80352a.f80336i;
                    if (aVar3 != null && aVar3.isAladdin()) {
                        str13 = "1";
                    }
                    com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) dVar.w(str13).a(Integer.valueOf(this.f80352a.F().f121278m));
                    com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar4 = this.f80352a.f80336i;
                    if (!(aVar4 == null || (tokenType = aVar4.getTokenType()) == null)) {
                        str11 = tokenType;
                    }
                    com.ss.android.ugc.aweme.search.k.d dVar3 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar2.x(str11)).r("top_music");
                    Music music3 = this.f80353b;
                    if (music3 != null) {
                        str9 = music3.getMid();
                    } else {
                        str9 = null;
                    }
                    com.ss.android.ugc.aweme.search.k.d dVar4 = (com.ss.android.ugc.aweme.search.k.d) dVar3.v(str9);
                    Music music4 = this.f80353b;
                    if (music4 != null) {
                        str10 = music4.getSearchMusicName();
                    }
                    ((com.ss.android.ugc.aweme.search.k.d) dVar4.s(str10)).d(Integer.valueOf(this.f80355d));
                }
            } else if (this.f80353b.getSoundsListType() == 2) {
                com.ss.android.ugc.aweme.search.k.c x2 = a2.x("tiktok_playlist_search");
                String mid = this.f80353b.getMid();
                if (mid != null) {
                    str11 = mid;
                }
                com.ss.android.ugc.aweme.search.k.c a5 = x2.g(str11).a(Integer.valueOf(this.f80352a.F().f121278m));
                String str15 = this.f80352a.f80331d;
                if (str15 != null) {
                    str12 = str15;
                }
                ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) a5.o(str12)).a(this.f80352a.F().f121274i)).r("music")).v(this.f80353b.getMid())).d(Integer.valueOf(this.f80352a.getAdapterPosition()))).s(this.f80353b.getSearchMusicName());
            } else if (this.f80353b.getSoundsListType() == 3) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar5 = this.f80352a.f80336i;
                if (aVar5 != null) {
                    str4 = aVar5.getTokenType();
                } else {
                    str4 = null;
                }
                com.ss.android.ugc.aweme.search.k.c x3 = a2.x(str4);
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar6 = this.f80352a.f80336i;
                if (!(aVar6 == null || (user = aVar6.getUser()) == null)) {
                    str10 = user.getUid();
                }
                ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) ((com.ss.android.ugc.aweme.search.k.d) x3.g(str10).a(Integer.valueOf(this.f80352a.F().f121278m)).l(this.f80352a.F().q)).t(this.f80352a.F().r).o(this.f80352a.f80331d)).a(this.f80352a.F().f121274i)).r("top_music")).v(this.f80353b.getMid())).d(Integer.valueOf(this.f80352a.getAdapterPosition()))).s(this.f80353b.getSearchMusicName());
            } else {
                com.ss.android.ugc.aweme.discover.mixfeed.g gVar = (com.ss.android.ugc.aweme.discover.mixfeed.g) this.f80353b.getExtraParamFromPretreatment().get(com.ss.android.ugc.aweme.discover.mixfeed.g.class);
                if (gVar == null || (str2 = gVar.f81774b) == null) {
                    str2 = str11;
                }
                com.ss.android.ugc.aweme.search.k.c x4 = a2.x(str2);
                if (!(gVar == null || (str3 = gVar.f81773a) == null)) {
                    str11 = str3;
                }
                com.ss.android.ugc.aweme.search.k.c a6 = x4.g(str11).a(Integer.valueOf(this.f80352a.F().f121278m));
                String str16 = this.f80352a.f80331d;
                if (str16 != null) {
                    str12 = str16;
                }
                ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) a6.o(str12)).a(this.f80352a.F().f121274i)).r("music")).v(this.f80353b.getMid())).d(Integer.valueOf(this.f80352a.getAdapterPosition()))).s(this.f80353b.getSearchMusicName());
            }
            a2.f();
            return z.f158842a;
        }
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f80351a;

        static {
            Covode.recordClassIndex(50016);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(ah ahVar) {
            this.f80351a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f80351a.itemView.performClick();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f80350a;

        static {
            Covode.recordClassIndex(50015);
        }

        d(ah ahVar) {
            this.f80350a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f80350a.f80328a.performClick();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.a.a
    public final void b(String str) {
        l.d(str, "");
        this.f80331d = str;
        com.ss.android.ugc.aweme.discover.c.d dVar = this.f80332e;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewAttachedToWindow(View view) {
        l.d(view, "");
        super.onViewAttachedToWindow(view);
        com.ss.android.ugc.aweme.autoplay.e.a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        super.onViewDetachedFromWindow(view);
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<View, Integer> {
        final /* synthetic */ ah this$0;

        static {
            Covode.recordClassIndex(50018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ah ahVar) {
            super(1);
            this.this$0 = ahVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(View view) {
            MethodCollector.i(1725);
            View view2 = view;
            l.d(view2, "");
            this.this$0.f80329b.addView(view2);
            Integer valueOf = Integer.valueOf(gb.a(this.this$0.f80329b.getContext()) ? 1 : 0);
            MethodCollector.o(1725);
            return valueOf;
        }
    }

    private final void a(Music music) {
        if (music.getSoundsListType() == 2) {
            if (this.y == null) {
                this.y = new ac(new k.b(this.f80329b, new g(this)));
            }
            k kVar = this.y;
            if (kVar == null) {
                l.b();
            }
            k.a aVar = new k.a();
            aVar.f81126a = ((Number) music.getExtraParamFromPretreatment().get("rank", (Object) -1)).intValue();
            kVar.a(aVar);
            return;
        }
        k kVar2 = this.y;
        if (kVar2 != null) {
            kVar2.a(new k.a());
        }
    }

    private final void b(Music music) {
        boolean z2;
        if (music.getHighlightInfoList() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.t.setTypeface(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33795a));
            TextView textView = this.t;
            View view = this.itemView;
            l.b(view, "");
            textView.setTextColor(androidx.core.content.b.c(view.getContext(), R.color.c4));
            this.z = new com.ss.android.ugc.aweme.discover.helper.f(new h(this));
            return;
        }
        this.t.setTypeface(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        TextView textView2 = this.t;
        View view2 = this.itemView;
        l.b(view2, "");
        textView2.setTextColor(androidx.core.content.b.c(view2.getContext(), R.color.bx));
        this.z = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(final View view, i iVar) {
        super(view);
        l.d(view, "");
        this.o = iVar;
        this.q = h.i.a((h.f.a.a) i.f80357a);
        View findViewById = view.findViewById(R.id.c00);
        l.b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f80328a = imageView;
        View findViewById2 = view.findViewById(R.id.bu0);
        l.b(findViewById2, "");
        this.r = (SmartRoundImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bzl);
        l.b(findViewById3, "");
        this.s = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f39);
        l.b(findViewById4, "");
        this.t = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f33);
        l.b(findViewById5, "");
        this.u = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.f__);
        l.b(findViewById6, "");
        this.v = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.f35);
        l.b(findViewById7, "");
        this.w = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cra);
        l.b(findViewById8, "");
        this.x = (RecyclerView) findViewById8;
        View findViewById9 = view.findViewById(R.id.b4d);
        l.b(findViewById9, "");
        this.f80329b = (FrameLayout) findViewById9;
        this.f80334g = "";
        this.f80337m = -1;
        com.ss.android.ugc.aweme.discover.c.d dVar = new com.ss.android.ugc.aweme.discover.c.d(imageView, H(), iVar, new h.f.a.a<z>(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.ah.AnonymousClass1 */
            final /* synthetic */ ah this$0;

            static {
                Covode.recordClassIndex(50008);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                final String str;
                com.ss.android.ugc.aweme.discover.c.d dVar;
                com.ss.android.ugc.aweme.discover.c.d dVar2;
                com.ss.android.ugc.aweme.discover.c.d dVar3 = this.this$0.f80332e;
                if (dVar3 == null || !dVar3.b(this.this$0.f80330c)) {
                    str = "click_pause_music";
                } else {
                    str = "click_play_music";
                }
                ah ahVar = this.this$0;
                ahVar.f80335h = !ahVar.f80335h;
                final com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.this$0.f80336i;
                final Music music = this.this$0.f80330c;
                final int i2 = this.this$0.f80337m;
                com.ss.android.ugc.aweme.discover.c.d dVar4 = this.this$0.f80332e;
                if (dVar4 == null || !dVar4.b(this.this$0.f80330c)) {
                    p pVar = this.this$0.f80333f;
                    if (!(pVar == null || pVar.f81162c || (dVar = pVar.f81160a) == null)) {
                        dVar.f80904a.a(pVar);
                    }
                } else {
                    com.ss.android.ugc.aweme.autoplay.e.a.d(this.this$0);
                    p pVar2 = this.this$0.f80333f;
                    if (!(pVar2 == null || (dVar2 = pVar2.f81160a) == null)) {
                        dVar2.f80904a.a(dVar2.f80912i, pVar2);
                    }
                }
                b.i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.discover.adapter.ah.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f80338a;

                    static {
                        Covode.recordClassIndex(50009);
                    }

                    {
                        this.f80338a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        List<MusicTag> list;
                        String str;
                        com.ss.android.ugc.aweme.discover.mixfeed.g gVar;
                        int i2;
                        String str2;
                        String str3;
                        String str4;
                        String str5;
                        String str6;
                        String str7;
                        User user;
                        String str8;
                        String str9;
                        String mid;
                        String str10;
                        String str11;
                        String str12;
                        String str13;
                        String str14;
                        String str15;
                        fu extraParamFromPretreatment;
                        User user2;
                        at b2 = com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(this.f80338a.this$0.F());
                        GsonProvider c2 = GsonHolder.c();
                        String str16 = "";
                        l.b(c2, str16);
                        com.google.gson.f b3 = c2.b();
                        Music music = this.f80338a.this$0.f80330c;
                        String str17 = null;
                        if (music != null) {
                            list = music.getMusicTags();
                        } else {
                            list = null;
                        }
                        b2.z(b3.b(list));
                        com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f80338a.this$0.f80336i;
                        if (aVar == null || (user2 = aVar.getUser()) == null) {
                            str = null;
                        } else {
                            str = user2.getUniqueId();
                        }
                        b2.u(str);
                        Music music2 = music;
                        if (music2 == null || (extraParamFromPretreatment = music2.getExtraParamFromPretreatment()) == null) {
                            gVar = null;
                        } else {
                            gVar = (com.ss.android.ugc.aweme.discover.mixfeed.g) extraParamFromPretreatment.get(com.ss.android.ugc.aweme.discover.mixfeed.g.class);
                        }
                        Music music3 = music;
                        if (music3 != null) {
                            i2 = music3.getSoundsListType();
                        } else {
                            i2 = 0;
                        }
                        String str18 = "search_result";
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.search.k.c x = b2.x("music");
                            Music music4 = this.f80338a.this$0.f80330c;
                            if (music4 == null || (str10 = music4.getMid()) == null) {
                                str10 = str16;
                            }
                            String str19 = "0";
                            com.ss.android.ugc.aweme.search.k.c a2 = ((com.ss.android.ugc.aweme.search.k.d) x.g(str10)).w(str19).a(Integer.valueOf(this.f80338a.this$0.F().f121278m));
                            String str20 = this.f80338a.this$0.f80331d;
                            if (str20 != null) {
                                str18 = str20;
                            }
                            at A = ((at) a2.o(str18)).A(str);
                            r F = this.f80338a.this$0.F();
                            if (F != null) {
                                str11 = F.f121274i;
                            } else {
                                str11 = null;
                            }
                            com.ss.android.ugc.aweme.search.k.c a3 = A.a(str11);
                            r F2 = this.f80338a.this$0.F();
                            if (F2 != null) {
                                str12 = F2.f121277l;
                            } else {
                                str12 = null;
                            }
                            a3.c(str12);
                            if (l.a((Object) this.f80338a.this$0.f80331d, (Object) "general_search")) {
                                b2.y(String.valueOf(this.f80338a.this$0.getAdapterPosition()));
                            }
                            if (l.a((Object) this.f80338a.this$0.f80331d, (Object) "general_search") && aVar != null) {
                                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar2 = this.f80338a.this$0.f80336i;
                                if (aVar2 == null || (str13 = aVar2.getSearchResultId()) == null) {
                                    str13 = str16;
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) b2.g(str13);
                                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar3 = this.f80338a.this$0.f80336i;
                                if (aVar3 != null && aVar3.isAladdin()) {
                                    str19 = "1";
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) dVar.w(str19).a(Integer.valueOf(this.f80338a.this$0.F().f121278m));
                                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar4 = this.f80338a.this$0.f80336i;
                                if (aVar4 == null || (str14 = aVar4.getTokenType()) == null) {
                                    str14 = str16;
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar3 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar2.x(str14)).r("top_music");
                                Music music5 = music;
                                if (music5 != null) {
                                    str15 = music5.getMid();
                                } else {
                                    str15 = null;
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar4 = (com.ss.android.ugc.aweme.search.k.d) dVar3.v(str15);
                                Music music6 = music;
                                if (music6 != null) {
                                    str17 = music6.getSearchMusicName();
                                }
                                ((at) ((at) dVar4.s(str17)).B(str).d(Integer.valueOf(i2))).A(str16);
                            }
                        } else {
                            Music music7 = music;
                            if (music7 == null || music7.getSoundsListType() != 2) {
                                Music music8 = music;
                                if (music8 == null || music8.getSoundsListType() != 3) {
                                    if (gVar == null || (str2 = gVar.f81774b) == null) {
                                        str2 = str16;
                                    }
                                    com.ss.android.ugc.aweme.search.k.c x2 = b2.x(str2);
                                    if (!(gVar == null || (str4 = gVar.f81773a) == null)) {
                                        str16 = str4;
                                    }
                                    com.ss.android.ugc.aweme.search.k.c a4 = x2.g(str16).a(Integer.valueOf(this.f80338a.this$0.F().f121278m));
                                    String str21 = this.f80338a.this$0.f80331d;
                                    if (str21 != null) {
                                        str18 = str21;
                                    }
                                    com.ss.android.ugc.aweme.search.k.d dVar5 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) a4.o(str18)).a(this.f80338a.this$0.F().f121274i)).r("music");
                                    Music music9 = music;
                                    if (music9 != null) {
                                        str3 = music9.getMid();
                                    } else {
                                        str3 = null;
                                    }
                                    com.ss.android.ugc.aweme.search.k.d dVar6 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar5.v(str3)).d(Integer.valueOf(this.f80338a.this$0.getAdapterPosition()));
                                    Music music10 = music;
                                    if (music10 != null) {
                                        str17 = music10.getSearchMusicName();
                                    }
                                    ((at) dVar6.s(str17)).B(str);
                                } else {
                                    com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar5 = this.f80338a.this$0.f80336i;
                                    if (aVar5 != null) {
                                        str5 = aVar5.getTokenType();
                                    } else {
                                        str5 = null;
                                    }
                                    com.ss.android.ugc.aweme.search.k.c x3 = b2.x(str5);
                                    com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar6 = this.f80338a.this$0.f80336i;
                                    if (aVar6 == null || (user = aVar6.getUser()) == null) {
                                        str6 = null;
                                    } else {
                                        str6 = user.getUid();
                                    }
                                    com.ss.android.ugc.aweme.search.k.d dVar7 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) x3.g(str6).a(Integer.valueOf(this.f80338a.this$0.F().f121278m)).o(this.f80338a.this$0.f80331d)).a(this.f80338a.this$0.F().f121274i).l(this.f80338a.this$0.F().q)).t(this.f80338a.this$0.F().r)).r("top_music");
                                    Music music11 = music;
                                    if (music11 != null) {
                                        str7 = music11.getMid();
                                    } else {
                                        str7 = null;
                                    }
                                    com.ss.android.ugc.aweme.search.k.d dVar8 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar7.v(str7)).d(Integer.valueOf(this.f80338a.this$0.getAdapterPosition()));
                                    Music music12 = music;
                                    if (music12 != null) {
                                        str17 = music12.getSearchMusicName();
                                    }
                                    ((at) dVar8.s(str17)).B(str);
                                }
                            } else {
                                if (gVar == null || (str8 = gVar.f81774b) == null) {
                                    str8 = "tiktok_playlist_search";
                                }
                                com.ss.android.ugc.aweme.search.k.c x4 = b2.x(str8);
                                Music music13 = music;
                                if (!(music13 == null || (mid = music13.getMid()) == null)) {
                                    str16 = mid;
                                }
                                com.ss.android.ugc.aweme.search.k.c a5 = x4.g(str16).a(Integer.valueOf(this.f80338a.this$0.F().f121278m));
                                String str22 = this.f80338a.this$0.f80331d;
                                if (str22 != null) {
                                    str18 = str22;
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar9 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.c) a5.o(str18)).a(this.f80338a.this$0.F().f121274i)).r("music");
                                Music music14 = music;
                                if (music14 != null) {
                                    str9 = music14.getMid();
                                } else {
                                    str9 = null;
                                }
                                com.ss.android.ugc.aweme.search.k.d dVar10 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar9.v(str9)).d(Integer.valueOf(this.f80338a.this$0.getAdapterPosition()));
                                Music music15 = music;
                                if (music15 != null) {
                                    str17 = music15.getSearchMusicName();
                                }
                                ((at) dVar10.s(str17)).B(str);
                            }
                        }
                        b2.f();
                        return z.f158842a;
                    }
                }, com.ss.android.ugc.aweme.common.r.a());
                return z.f158842a;
            }
        });
        p pVar = new p();
        l.d(dVar, "");
        pVar.f81160a = dVar;
        this.f80333f = pVar;
        this.f80332e = dVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.ah.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ah f80343a;

            static {
                Covode.recordClassIndex(50010);
            }

            {
                this.f80343a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    int b2 = this.f80343a.b();
                    if (this.f80343a.f80330c != null) {
                        IMusicService m2 = MusicService.m();
                        Music music = this.f80343a.f80330c;
                        if (music == null) {
                            l.b();
                        }
                        if (!m2.a(music.convertToMusicModel(), view.getContext(), true)) {
                            com.ss.android.ugc.aweme.search.k.b j2 = new com.ss.android.ugc.aweme.search.k.i().i("").j("");
                            Music music2 = this.f80343a.f80330c;
                            if (music2 == null) {
                                l.b();
                            }
                            j2.k(music2.getMid()).o(this.f80343a.f80331d).f();
                            return;
                        }
                        if (TextUtils.isEmpty(this.f80343a.f80334g)) {
                            Object[] objArr = new Object[3];
                            int i2 = b2 + 1;
                            objArr[0] = Integer.valueOf(i2);
                            Music music3 = this.f80343a.f80330c;
                            if (music3 == null) {
                                l.b();
                            }
                            objArr[1] = music3.getMid();
                            Music music4 = this.f80343a.f80330c;
                            if (music4 == null) {
                                l.b();
                            }
                            objArr[2] = music4.getSearchMusicName();
                            l.b(com.a.a("click_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "");
                            com.ss.android.ugc.aweme.search.k.g gVar = new com.ss.android.ugc.aweme.search.k.g();
                            Music music5 = this.f80343a.f80330c;
                            if (music5 == null) {
                                l.b();
                            }
                            gVar.c("music_id", music5.getMid()).c("client_order", Integer.toString(i2)).f();
                        }
                        final com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f80343a.f80336i;
                        final Music music6 = this.f80343a.f80330c;
                        final int i3 = this.f80343a.f80337m;
                        b.i.b(new Callable(this) {
                            /* class com.ss.android.ugc.aweme.discover.adapter.ah.AnonymousClass2.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass2 f80345a;

                            static {
                                Covode.recordClassIndex(50011);
                            }

                            {
                                this.f80345a = r1;
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ea, code lost:
                                if (r0 != null) goto L_0x02ed;
                             */
                            @Override // java.util.concurrent.Callable
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ java.lang.Object call() {
                                /*
                                // Method dump skipped, instructions count: 917
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.ah.AnonymousClass2.AnonymousClass1.call():java.lang.Object");
                            }
                        }, com.ss.android.ugc.aweme.common.r.a());
                    }
                    String uuid = UUID.randomUUID().toString();
                    l.b(uuid, "");
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.f80343a.G(), "//music/detail");
                    Music music7 = this.f80343a.f80330c;
                    if (music7 != null) {
                        str = music7.getMid();
                    } else {
                        str = null;
                    }
                    buildRoute.withParam("id", str).withParam("extra_music_from", this.f80343a.f80331d).withParam("previous_page_position", "music_card").withParam("process_id", uuid).open();
                    if (this.f80343a.n == null) {
                        int i4 = this.f80343a.F().f121268c;
                        View view2 = view;
                        String str2 = this.f80343a.f80334g;
                        Music music8 = this.f80343a.f80330c;
                        if (music8 == null) {
                            l.b();
                        }
                        String requestId = music8.getRequestId();
                        Music music9 = this.f80343a.f80330c;
                        if (music9 == null) {
                            l.b();
                        }
                        String a2 = this.f80343a.a();
                        if (TextUtils.isEmpty(requestId)) {
                            requestId = com.ss.android.ugc.aweme.discover.mob.d.a();
                        }
                        com.ss.android.ugc.aweme.metrics.m mVar = new com.ss.android.ugc.aweme.metrics.m();
                        com.ss.android.ugc.aweme.metrics.m mVar2 = (com.ss.android.ugc.aweme.metrics.m) mVar.b();
                        mVar2.p = music9.getMid();
                        com.ss.android.ugc.aweme.metrics.m mVar3 = (com.ss.android.ugc.aweme.metrics.m) mVar2.o(o.a(i4)).c().b(String.valueOf(b2));
                        mVar3.r = uuid;
                        mVar3.q = requestId;
                        com.ss.android.ugc.aweme.discover.mixfeed.g gVar2 = (com.ss.android.ugc.aweme.discover.mixfeed.g) music9.getExtraParamFromPretreatment().get(com.ss.android.ugc.aweme.discover.mixfeed.g.class);
                        r a3 = j.a.a(view2);
                        HashMap hashMap = new HashMap();
                        if (gVar2 != null && (music9.getSoundsListType() == 1 || music9.getSoundsListType() == 2)) {
                            com.ss.android.ugc.aweme.metrics.m mVar4 = (com.ss.android.ugc.aweme.metrics.m) mVar.l(a3.f121274i).f(gVar2.f81773a);
                            mVar4.Z = "aladdin_music_card";
                            mVar4.i(music9.getMid());
                            hashMap.put("list_item_id", music9.getMid());
                        } else if (music9.getSoundsListType() == 3) {
                            com.ss.android.ugc.aweme.metrics.m mVar5 = (com.ss.android.ugc.aweme.metrics.m) mVar.l(a3.f121274i);
                            mVar5.Z = "user_music_card";
                            mVar5.f(a2);
                        } else if (music9.getSoundsListType() == 0) {
                            com.ss.android.ugc.aweme.metrics.m mVar6 = (com.ss.android.ugc.aweme.metrics.m) mVar.l(a3.f121274i);
                            mVar6.Z = "music_card";
                            mVar6.f(a2);
                        } else if (music9.getSoundsListType() == 2 && i4 == 1) {
                            com.ss.android.ugc.aweme.metrics.m mVar7 = (com.ss.android.ugc.aweme.metrics.m) mVar.l(a3.f121274i);
                            mVar7.Z = "aladdin_music_card";
                            mVar7.f(a2);
                        }
                        com.ss.android.ugc.aweme.discover.mob.d.a(view2, music9.getMid(), b2, hashMap);
                        o.a(b2, str2, requestId, mVar, i4, "click_search_result");
                        if (i4 != 3) {
                            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                            if (!TextUtils.isEmpty(str2)) {
                                cVar.a("search_keyword", str2);
                                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setExtValueString(music9.getMid()).setJsonObject(cVar.a()));
                                return;
                            }
                            cVar.a("source", "recommend");
                            cVar.a("id", music9.getMid());
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setJsonObject(cVar.a()));
                            return;
                        }
                        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("general_search").setValue(music9.getMid()));
                    } else if (this.f80343a.f80330c == null) {
                        l.b();
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.h.c.d
    public final void a(int i2, int i3) {
        if (i2 == 0 && i3 != 0 && this.f80330c != null && TextUtils.isEmpty(this.f80334g)) {
            Object[] objArr = new Object[3];
            int b2 = b() + 1;
            objArr[0] = Integer.valueOf(b2);
            Music music = this.f80330c;
            if (music == null) {
                l.b();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f80330c;
            if (music2 == null) {
                l.b();
            }
            objArr[2] = music2.getSearchMusicName();
            l.b(com.a.a("show_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "");
            bc bcVar = new bc();
            Music music3 = this.f80330c;
            if (music3 == null) {
                l.b();
            }
            bcVar.c("music_id", music3.getMid()).c("client_order", Integer.toString(b2)).f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    @Override // com.ss.android.ugc.aweme.discover.adapter.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.music.model.Music r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.ah.a(com.ss.android.ugc.aweme.music.model.Music, java.lang.String):void");
    }
}
