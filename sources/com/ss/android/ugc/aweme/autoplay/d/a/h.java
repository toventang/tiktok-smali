package com.ss.android.ugc.aweme.autoplay.d.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.autoplay.player.video.f;
import com.ss.android.ugc.aweme.discover.c.e;
import com.ss.android.ugc.aweme.discover.mixfeed.q;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import h.a.z;
import h.f.b.m;
import h.i;
import java.util.List;
import org.json.JSONObject;

public final class h extends com.ss.android.ugc.aweme.autoplay.d.h implements com.ss.android.ugc.aweme.discover.alading.a.c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67369c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f67370a = -1;

    /* renamed from: b  reason: collision with root package name */
    final h.h f67371b = i.a((h.f.a.a) c.f67374a);

    /* renamed from: k  reason: collision with root package name */
    private q f67372k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f67373l;

    static {
        Covode.recordClassIndex(41485);
    }

    /* access modifiers changed from: package-private */
    public final g f() {
        return (g) this.f67373l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f67374a = new c();

        static {
            Covode.recordClassIndex(41488);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new f() {
                /* class com.ss.android.ugc.aweme.autoplay.d.a.h.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41489);
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void A() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void B() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
                public final void c() {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final OnUIPlayListener getWrapperedListener() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
                public final boolean m() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedPercent(String str, long j2, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedTimeMs(String str, long j2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onCompleteLoaded(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onDecoderBuffering(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPausePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompletedFirstTime(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(l lVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(String str, l lVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPause(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPrepare(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(float f2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(String str, long j2, long j3) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayRelease(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlaying(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreParePlay(String str, n nVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreRenderSessionMissed(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreparePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(o oVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(String str, o oVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrameFromResume(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderReady(n nVar) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(l lVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRetryOnError(String str, l lVar) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekEnd(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekStart(String str, int i2, float f2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onVideoSizeChanged(String str, int i2, int i3) {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
                public final View w() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void x() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void y() {
                }

                @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
                public final void z() {
                }
            };
        }
    }

    public final String g() {
        String str;
        q qVar = this.f67372k;
        if (qVar == null || (str = qVar.f81856c) == null) {
            return "";
        }
        return str;
    }

    public final String h() {
        String str;
        q qVar = this.f67372k;
        if (qVar == null || (str = qVar.f81857d) == null) {
            return "";
        }
        return str;
    }

    static final class b extends m implements h.f.a.a<g> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.alading.d $viewHolder;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, com.ss.android.ugc.aweme.discover.alading.d dVar) {
            super(0);
            this.this$0 = hVar;
            this.$viewHolder = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            View view = this.$viewHolder.itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            h.f.b.l.b(context, "");
            h hVar = this.this$0;
            g gVar = new g(context, hVar, hVar, hVar.c().b(), this.this$0.c().a(), this.this$0.a(), (f) this.this$0.f67371b.getValue());
            this.this$0.a(gVar);
            return gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Aweme aweme) {
            return this.this$0.h();
        }
    }

    private final Bundle a(Aweme aweme) {
        r rVar = f().f67355b;
        String str = "general_search";
        if (!TextUtils.equals(rVar.f121272g, str)) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_search_ad_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", rVar.f121271f);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
        bundle.putString("search_id", rVar.f121274i);
        bundle.putString("key_search_type", rVar.f121270e);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        return bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.ss.android.ugc.aweme.discover.alading.d dVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(dVar, aVar, bVar);
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        this.f67373l = i.a((h.f.a.a) new b(this, dVar));
    }

    public final void a(q qVar, AwemeRawAd awemeRawAd, r rVar) {
        String str;
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(rVar, "");
        List<? extends Aweme> list = qVar.f81854a;
        if (list == null) {
            list = z.INSTANCE;
        }
        a(list);
        e.a(true, this.f67407f, 0);
        List<? extends Aweme> list2 = this.f67407f;
        if (list2 == null) {
            h.f.b.l.b();
        }
        super.a(list2, f());
        this.f67372k = qVar;
        f().f67354a = awemeRawAd;
        g f2 = f();
        q qVar2 = this.f67372k;
        if (qVar2 == null || (str = qVar2.f81857d) == null) {
            str = "";
        }
        h.f.b.l.d(str, "");
        f2.f67356c = str;
        g f3 = f();
        h.f.b.l.d(rVar, "");
        f3.f67355b = rVar;
        g f4 = f();
        List<? extends Aweme> list3 = this.f67407f;
        if (list3 == null) {
            h.f.b.l.b();
        }
        f4.a(list3);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void b(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(list, "");
        View view2 = this.f80747j.itemView;
        h.f.b.l.b(view2, "");
        ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(j.a.a(view2)).x(g())).r("video")).s(aweme.getDesc()).a(Integer.valueOf(this.f67370a))).d(Integer.valueOf(i2))).v(aweme.getAid()).g(h()).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.c
    public final void a(int i2, View view, Aweme aweme, List<? extends Aweme> list) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(list, "");
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        a(context, view, aweme, list);
        View view2 = this.f80747j.itemView;
        h.f.b.l.b(view2, "");
        ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((at) ((com.ss.android.ugc.aweme.search.k.d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(j.a.a(view2)).x(g())).r("video")).B("click_video").s(aweme.getDesc()).a(Integer.valueOf(this.f67370a))).d(Integer.valueOf(i2))).v(aweme.getAid()).g(h()).f();
        com.ss.android.ugc.aweme.discover.mob.o.a(view, "general_search", aweme, this.f80746i.f121271f, this.f67370a, h(), aweme.getAid(), "aladdin_card");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, View view, Aweme aweme, List<? extends Aweme> list) {
        androidx.core.app.b bVar;
        Bundle bundle;
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar;
        com.ss.android.ugc.aweme.discover.mixfeed.r rVar2;
        String str;
        String str2 = "";
        h.f.b.l.d(context, str2);
        h.f.b.l.d(aweme, str2);
        h.f.b.l.d(list, str2);
        Bundle a2 = a(aweme);
        String str3 = null;
        if (view != null) {
            bVar = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
        } else {
            bVar = null;
        }
        com.ss.android.ugc.aweme.feed.x.h.f95332b = list;
        com.ss.android.ugc.aweme.discover.j.d dVar = new com.ss.android.ugc.aweme.discover.j.d();
        dVar.a_(list);
        ae.f95296a = dVar;
        SmartRoute withParam = new SmartRoute(context).withParam(a2);
        if (bVar != null) {
            bundle = bVar.a();
        } else {
            bundle = null;
        }
        SmartRoute withParam2 = withParam.withBundleAnimation(bundle).withParam("activity_has_activity_options", true);
        q qVar = this.f67372k;
        if (!(qVar == null || (rVar2 = qVar.f81855b) == null || (str = rVar2.f81858a) == null)) {
            str2 = str;
        }
        if (!TrendingDetailServiceImpl.b().a() || TextUtils.isEmpty(str2)) {
            withParam2.withUrl("//aweme/detail");
        } else {
            this.f67405d = aweme;
            SmartRoute withParam3 = withParam2.withUrl("//trending/detail").withParam("outer_aweme_id", aweme.getAid()).withParam("is_from_trending_card", "1").withParam("trending_event_id", str2);
            q qVar2 = this.f67372k;
            if (!(qVar2 == null || (rVar = qVar2.f81855b) == null)) {
                str3 = rVar.f81859b;
            }
            withParam3.withParam("trending_event_name", str3).withParam("video_from", "from_trending_inflow").withParam("search_result_id", h());
        }
        withParam2.open();
        com.ss.android.ugc.aweme.feed.d.b.a(aweme);
        q qVar3 = this.f67372k;
        if (qVar3 != null && qVar3.f81855b != null) {
            this.f80746i.a(new d(this));
            com.ss.android.ugc.aweme.search.r.b.a(this.f80746i);
            com.ss.android.ugc.aweme.autoplay.d.b bVar2 = c().f67443d;
            if (bVar2 != null) {
                bVar2.a(true);
            }
            com.ss.android.ugc.aweme.autoplay.e.a.f67464b = this.f67370a;
        }
    }
}
