package com.ss.android.ugc.aweme.commercialize.live.feedLive;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public final class FeedLiveAdLynxCard implements au, a, i, j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f74656k = new a((byte) 0);
    private static Integer w;

    /* renamed from: a  reason: collision with root package name */
    AwemeRawAd f74657a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74658b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74659c;

    /* renamed from: d  reason: collision with root package name */
    String f74660d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74661e;

    /* renamed from: f  reason: collision with root package name */
    boolean f74662f;

    /* renamed from: g  reason: collision with root package name */
    public DataCenter f74663g;

    /* renamed from: h  reason: collision with root package name */
    public View f74664h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f74665i;

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f74666j;

    /* renamed from: l  reason: collision with root package name */
    private String f74667l;

    /* renamed from: m  reason: collision with root package name */
    private String f74668m;
    private Aweme n;
    private CardStruct o;
    private final Handler p = new Handler(Looper.getMainLooper());
    private final h q = h.i.a((h.f.a.a) b.f74669a);
    private final View r;
    private com.ss.android.ugc.aweme.bullet.e s;
    private BulletContainerView t;
    private final com.ss.android.ugc.aweme.bullet.a u;
    private Keva v;

    static {
        Covode.recordClassIndex(46031);
    }

    private final com.ss.android.ugc.aweme.ad.feed.c e() {
        return (com.ss.android.ugc.aweme.ad.feed.c) this.q.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(158, new g(FeedLiveAdLynxCard.class, "onCardCloseEvent", com.ss.android.ugc.aweme.ad.c.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(159, new g(FeedLiveAdLynxCard.class, "onCardStatusEvent", com.ss.android.ugc.aweme.ad.c.g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46032);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f74671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f74672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f74673c = null;

        /* renamed from: d  reason: collision with root package name */
        private final String f74674d;

        static {
            Covode.recordClassIndex(46035);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f74674d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f74671a;
        }

        d(String str) {
            this.f74672b = str;
            this.f74674d = str;
            this.f74671a = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void b() {
        cg.a(this);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f74676a;

        static {
            Covode.recordClassIndex(46037);
        }

        f(FrameLayout frameLayout) {
            this.f74676a = frameLayout;
        }

        public final void run() {
            this.f74676a.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void c() {
        g();
        cg.b(this);
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74669a = new b();

        static {
            Covode.recordClassIndex(46033);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.c invoke() {
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
            if (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c)) {
                return null;
            }
            return a2;
        }
    }

    private final void g() {
        this.f74667l = null;
        this.f74668m = null;
        f();
        this.f74658b = false;
        this.f74659c = false;
        this.f74660d = null;
        this.f74661e = false;
        this.f74662f = false;
        this.p.removeCallbacksAndMessages(null);
        i.a.a.a.a.b.a(this.f74666j);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onActivityDestroy() {
        androidx.lifecycle.i lifecycle;
        Context context = this.f74666j.getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.core.app.d dVar = (androidx.core.app.d) context;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null)) {
            lifecycle.b(this);
        }
        this.t.a();
    }

    private final void f() {
        if (this.f74658b) {
            this.f74658b = false;
            FrameLayout frameLayout = this.f74666j;
            frameLayout.animate().alpha(0.0f).translationY((float) n.a(15.0d)).setDuration(290).withEndAction(new f(frameLayout)).start();
            DataCenter dataCenter = this.f74663g;
            if (dataCenter != null) {
                dataCenter.a("ad_live_card_hide", (Object) null);
            }
        }
    }

    public final void d() {
        com.bytedance.ies.bullet.c.c.i iVar = this.f74665i;
        if (iVar != null) {
            iVar.onEvent(new d("event_card_show"));
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f74657a).b("refer", "card").a("room_id", com.ss.android.ugc.aweme.commercialize.live.service.a.c(this.n)).a("anchor_id", com.ss.android.ugc.aweme.commercialize.live.service.a.b(this.n)).b();
        if (this.f74657a == null) {
            r.onEventV3("card_scoring_show");
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedLiveAdLynxCard f74675a;

        static {
            Covode.recordClassIndex(46036);
        }

        e(FeedLiveAdLynxCard feedLiveAdLynxCard) {
            this.f74675a = feedLiveAdLynxCard;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard.e.run():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a() {
        String cardUrl;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        CardStruct cardStruct = this.o;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
            o oVar = new o();
            AwemeRawAd awemeRawAd = this.f74657a;
            int i2 = 1;
            String str6 = null;
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    str3 = String.valueOf(adId.longValue());
                } else {
                    str3 = null;
                }
                oVar.a("adId", str3);
                oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
                oVar.a("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    str4 = String.valueOf(groupId.longValue());
                } else {
                    str4 = null;
                }
                oVar.a("groupId", str4);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                Objects.requireNonNull(clickTrackUrlList, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                List<String> urlList = clickTrackUrlList.getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    com.google.gson.i iVar = new com.google.gson.i();
                    Iterator<T> it = urlList.iterator();
                    while (it.hasNext()) {
                        iVar.a((String) it.next());
                    }
                    oVar.a("clickTrackUrlList", iVar);
                }
                String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                oVar.a("pageData", nativeSiteAdInfo);
                oVar.a("isVoted", Integer.valueOf(this.v.getBoolean(String.valueOf(awemeRawAd.getCreativeId().longValue()), false) ? 1 : 0));
                ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str5 = nativeSiteConfig.getLynxScheme();
                } else {
                    str5 = null;
                }
                oVar.a("lynxSchema", str5);
            }
            Aweme aweme = this.n;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            oVar.a("itemId", String.valueOf(str));
            oVar.a("isRTL", Integer.valueOf(gb.a(this.f74666j.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = this.o;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData == null || (str2 = cardData.toString()) == null) {
                    str2 = "";
                }
                oVar.a("cardData", str2);
            }
            oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
            oVar.a("isCardState", (Number) 1);
            Context context = this.f74666j.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || (num = w) == null || num.intValue() != activity.hashCode()) {
                i2 = 0;
            }
            oVar.a("userHasVoted", Integer.valueOf(i2));
            oVar.a("enableCardCloseButton", (Number) 0);
            String str7 = this.f74667l;
            if (str7 != null) {
                oVar.a("adLiveJson", str7);
            }
            String str8 = this.f74668m;
            if (str8 != null) {
                oVar.a("productInfo", str8);
            }
            String oVar2 = oVar.toString();
            l.b(oVar2, "");
            buildUpon.appendQueryParameter("initialData", oVar2);
            com.ss.android.ugc.aweme.bullet.e eVar = this.s;
            if (eVar != null) {
                String builder = buildUpon.toString();
                l.b(builder, "");
                Bundle bundle = new Bundle();
                Context context2 = this.f74666j.getContext();
                com.ss.android.ugc.aweme.ad.feed.c e2 = e();
                if (e2 != null) {
                    Aweme aweme2 = this.n;
                    l.b(context2, "");
                    e2.a(bundle, aweme2, context2);
                }
                AwemeRawAd awemeRawAd2 = this.f74657a;
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str6);
                eVar.a(builder, bundle);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a(DataCenter dataCenter) {
        this.f74663g = dataCenter;
    }

    public static final class c extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedLiveAdLynxCard f74670a;

        static {
            Covode.recordClassIndex(46034);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(FeedLiveAdLynxCard feedLiveAdLynxCard) {
            this.f74670a = feedLiveAdLynxCard;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f74670a.f74661e = true;
            this.f74670a.f74664h = view;
            this.f74670a.f74665i = iVar;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a(CardStruct cardStruct) {
        l.d(cardStruct, "");
        this.o = cardStruct;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a(long j2) {
        if (this.o != null && !this.f74658b) {
            this.p.postDelayed(new e(this), j2);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardCloseEvent(com.ss.android.ugc.aweme.ad.c.d dVar) {
        l.d(dVar, "");
        if (dVar.f65590a == this.t.hashCode()) {
            f();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardStatusEvent(com.ss.android.ugc.aweme.ad.c.g gVar) {
        l.d(gVar, "");
        if (gVar.f65596b == this.t.hashCode() && gVar.f65595a == 1) {
            this.f74662f = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct L;
        this.n = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f74657a = awemeRawAd;
        if (awemeRawAd == null) {
            L = com.ss.android.ugc.aweme.commercialize.e.a.b.N(aweme);
        } else {
            L = com.ss.android.ugc.aweme.commercialize.e.a.b.L(aweme);
        }
        this.o = L;
        g();
    }

    public FeedLiveAdLynxCard(FrameLayout frameLayout) {
        com.ss.android.ugc.aweme.bullet.e eVar;
        androidx.lifecycle.i lifecycle;
        String str;
        l.d(frameLayout, "");
        this.f74666j = frameLayout;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.afh, frameLayout, true);
        l.b(a2, "");
        this.r = a2;
        c cVar = new c(this);
        this.u = cVar;
        this.v = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        View findViewById = a2.findViewById(R.id.cbu);
        l.b(findViewById, "");
        this.t = (BulletContainerView) findViewById;
        com.ss.android.ugc.aweme.ad.feed.c e2 = e();
        androidx.core.app.d dVar = null;
        if (e2 != null) {
            BulletContainerView bulletContainerView = this.t;
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                str = f2.g("lynx_feed");
            } else {
                str = null;
            }
            eVar = e2.a(bulletContainerView, str, cVar);
        } else {
            eVar = null;
        }
        this.s = eVar;
        Context context = frameLayout.getContext();
        androidx.core.app.d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.feedLive.a
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f74667l = str;
        this.f74668m = str2;
    }
}
