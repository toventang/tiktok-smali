package com.ss.android.ugc.aweme.ad.feed.card;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.c.k;
import com.ss.android.ugc.aweme.ad.c.q;
import com.ss.android.ugc.aweme.ad.network.ScoreApi;
import com.ss.android.ugc.aweme.ad.network.VoteApi;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class FeedAdLynxCard implements d, au, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    private static Integer C;

    /* renamed from: l  reason: collision with root package name */
    public static final a f65759l = new a((byte) 0);
    private com.ss.android.ugc.aweme.ad.feed.h.b A;
    private final f.a.b.a B;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f65760a;

    /* renamed from: b  reason: collision with root package name */
    public AwemeRawAd f65761b;

    /* renamed from: c  reason: collision with root package name */
    public final View f65762c;

    /* renamed from: d  reason: collision with root package name */
    public View f65763d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f65764e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f65765f;

    /* renamed from: g  reason: collision with root package name */
    public int f65766g;

    /* renamed from: h  reason: collision with root package name */
    public Keva f65767h;

    /* renamed from: i  reason: collision with root package name */
    public final a f65768i;

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f65769j;

    /* renamed from: k  reason: collision with root package name */
    boolean f65770k = false;

    /* renamed from: m  reason: collision with root package name */
    private CardStruct f65771m;
    private int n = -100;
    private int o = -100;
    private int p;
    private String q;
    private String r;
    private int s = -1;
    private int t = -1;
    private final h.h u = h.i.a((h.f.a.a) d.f65776a);
    private com.ss.android.ugc.aweme.bullet.e v;
    private BulletContainerView w;
    private final com.ss.android.ugc.aweme.bullet.a x;
    private boolean y;
    private boolean z;

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f65779a = new g();

        static {
            Covode.recordClassIndex(40478);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f65781a = new i();

        static {
            Covode.recordClassIndex(40480);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40470);
    }

    private final com.ss.android.ugc.aweme.ad.feed.c k() {
        return (com.ss.android.ugc.aweme.ad.feed.c) this.u.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(158, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onCardCloseEvent", com.ss.android.ugc.aweme.ad.c.d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(404, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onCardExpandEvent", com.ss.android.ugc.aweme.ad.c.f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(405, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onSwipeUpVideoEvent", q.class, ThreadMode.MAIN, 0, false));
        hashMap.put(159, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onCardStatusEvent", com.ss.android.ugc.aweme.ad.c.g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(406, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onCardCollapseEvent", com.ss.android.ugc.aweme.ad.c.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(407, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onGetScoreEvent", com.ss.android.ugc.aweme.ad.c.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(408, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onGetVoteCardOptionEvent", k.class, ThreadMode.MAIN, 0, false));
        hashMap.put(409, new org.greenrobot.eventbus.g(FeedAdLynxCard.class, "onPopupWebShowEvent", com.ss.android.ugc.aweme.bullet.module.ad.k.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void h() {
        this.f65770k = true;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            sendCardShowState();
        } else if (aVar == i.a.ON_PAUSE) {
            sendCardHideState();
        } else if (aVar == i.a.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40471);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class j implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f65782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65783b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f65784c;

        /* renamed from: d  reason: collision with root package name */
        private final String f65785d;

        static {
            Covode.recordClassIndex(40481);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f65785d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f65782a;
        }

        j(String str, JSONObject jSONObject) {
            this.f65783b = str;
            this.f65784c = jSONObject;
            this.f65785d = str;
            this.f65782a = jSONObject;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final boolean e() {
        return this.f65765f;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final boolean f() {
        return this.y;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void c() {
        EventBus.a(EventBus.a(), this);
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65776a = new d();

        static {
            Covode.recordClassIndex(40475);
        }

        d() {
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

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void d() {
        EventBus.a().b(this);
        this.q = null;
        this.r = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void g() {
        if (this.f65766g == 2) {
            this.f65768i.g();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void sendCardHideState() {
        com.bytedance.ies.bullet.c.c.i iVar;
        if (this.z && (iVar = this.f65764e) != null) {
            iVar.k();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void sendCardShowState() {
        com.bytedance.ies.bullet.c.c.i iVar;
        if (this.z && (iVar = this.f65764e) != null) {
            iVar.j();
        }
    }

    public final void j() {
        if (this.f65766g != 1) {
            this.f65766g = 1;
            com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.A;
            if (bVar != null) {
                bVar.a(false);
            }
            this.f65762c.post(new b(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxCard f65772a;

        static {
            Covode.recordClassIndex(40472);
        }

        b(FeedAdLynxCard feedAdLynxCard) {
            this.f65772a = feedAdLynxCard;
        }

        public final void run() {
            this.f65772a.f65762c.animate().translationYBy((float) this.f65772a.f65762c.getHeight()).setInterpolator(new com.ss.android.ugc.aweme.bd.a()).setDuration(300).withEndAction(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f65773a;

                static {
                    Covode.recordClassIndex(40473);
                }

                {
                    this.f65773a = r1;
                }

                public final void run() {
                    DataCenter dataCenter = this.f65773a.f65772a.f65768i.f65790d;
                    if (dataCenter != null) {
                        dataCenter.a("action_ad_pop_up_web_resume_video", (Object) null);
                    }
                    FrameLayout i2 = this.f65773a.f65772a.i();
                    if (i2 != null) {
                        i2.setVisibility(8);
                    }
                    FeedAdLynxCard feedAdLynxCard = this.f65773a.f65772a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expand", 0);
                    feedAdLynxCard.a("event_expand_state", jSONObject);
                }
            }).start();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onActivityDestroy() {
        androidx.lifecycle.i lifecycle;
        Context context = this.f65769j.getContext();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.core.app.d dVar = (androidx.core.app.d) context;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null)) {
            lifecycle.b(this);
        }
        com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.A;
        if (bVar != null) {
            bVar.a(false);
        }
        this.w.a();
        this.B.dispose();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a() {
        a("event_card_show", (JSONObject) null);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f65761b).b("refer", "card").a("room_id", com.ss.android.ugc.aweme.commercialize.live.service.a.c(this.f65760a)).a("anchor_id", com.ss.android.ugc.aweme.commercialize.live.service.a.b(this.f65760a)).b();
        if (!(this.n == -100 && this.o == -100)) {
            r.a("ad_ui_adjust", new com.ss.android.ugc.aweme.app.f.d().a("original_time", this.n).a("real_time", this.o).a("tag", 3).a("is_adjusted", this.p).f66730a);
        }
        if (this.f65761b == null) {
            r.onEventV3("card_scoring_show");
        }
    }

    public final FrameLayout i() {
        View inflate;
        MethodCollector.i(1157);
        Context context = this.f65769j.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            MethodCollector.o(1157);
            return null;
        }
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.ei);
        if (viewStub == null) {
            inflate = activity.findViewById(R.id.eh);
        } else {
            inflate = viewStub.inflate();
            if (inflate == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.o(1157);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = (FrameLayout) inflate;
        MethodCollector.o(1157);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void b() {
        String cardUrl;
        String str;
        Integer num;
        Number number;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2;
        String str2;
        String str3;
        String str4;
        String str5;
        List<String> urlList;
        int i2 = 0;
        this.f65765f = false;
        this.y = false;
        CardStruct cardStruct = this.f65771m;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
            o oVar = new o();
            AwemeRawAd awemeRawAd = this.f65761b;
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
                if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
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
                oVar.a("landPageShowType", (Number) 0);
                oVar.a("isVoted", Integer.valueOf(this.f65767h.getBoolean(String.valueOf(awemeRawAd.getCreativeId().longValue()), false) ? 1 : 0));
                ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str5 = nativeSiteConfig.getLynxScheme();
                } else {
                    str5 = null;
                }
                oVar.a("lynxSchema", str5);
            }
            Aweme aweme = this.f65760a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            oVar.a("itemId", String.valueOf(str));
            oVar.a("isRTL", Integer.valueOf(gb.a(this.f65769j.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = this.f65771m;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData == null || (str2 = cardData.toString()) == null) {
                    str2 = "";
                }
                oVar.a("cardData", str2);
            }
            oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
            oVar.a("isCardState", (Number) 1);
            Context context = this.f65769j.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (!(activity == null || (num = C) == null || num.intValue() != activity.hashCode())) {
                i2 = 1;
            }
            oVar.a("userHasVoted", Integer.valueOf(i2));
            oVar.a("enableCardCloseButton", (Number) 0);
            Aweme aweme2 = this.f65760a;
            if (aweme2 == null || (commerceVideoAuthInfo2 = aweme2.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo2.getAdEventType() != 0) {
                Aweme aweme3 = this.f65760a;
                if (aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null) {
                    number = null;
                } else {
                    number = Integer.valueOf(commerceVideoAuthInfo.getAdEventType());
                }
                oVar.a("ad_event_type", number);
            } else {
                int i3 = this.s;
                if (!(i3 == -1 || i3 == -1)) {
                    oVar.a("ad_event_type", Integer.valueOf(i3));
                    oVar.a("industry_id", Integer.valueOf(this.t));
                }
            }
            String str7 = this.q;
            if (str7 != null) {
                oVar.a("adLiveJson", str7);
            }
            String str8 = this.r;
            if (str8 != null) {
                oVar.a("productInfo", str8);
            }
            String oVar2 = oVar.toString();
            l.b(oVar2, "");
            buildUpon.appendQueryParameter("initialData", oVar2);
            com.ss.android.ugc.aweme.bullet.e eVar = this.v;
            if (eVar != null) {
                String builder = buildUpon.toString();
                l.b(builder, "");
                Bundle bundle = new Bundle();
                Context context2 = this.f65769j.getContext();
                com.ss.android.ugc.aweme.ad.feed.c k2 = k();
                if (k2 != null) {
                    Aweme aweme4 = this.f65760a;
                    l.b(context2, "");
                    k2.a(bundle, aweme4, context2);
                }
                AwemeRawAd awemeRawAd2 = this.f65761b;
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str6);
                eVar.a(builder, bundle);
            }
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxCard f65777a;

        static {
            Covode.recordClassIndex(40476);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(FeedAdLynxCard feedAdLynxCard) {
            this.f65777a = feedAdLynxCard;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            int a2;
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f65777a.f65765f = true;
            this.f65777a.f65763d = view;
            this.f65777a.f65764e = iVar;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.e(this.f65777a.f65761b)) {
                Context context = this.f65777a.f65769j.getContext();
                l.b(context, "");
                a2 = com.ss.android.ugc.aweme.ad.feed.a.a(context);
            } else if (this.f65777a.f65770k) {
                Context context2 = this.f65777a.f65769j.getContext();
                l.b(context2, "");
                a2 = com.bytedance.tux.h.f.a(context2) - n.a(25.0d);
            } else {
                a2 = n.a(270.0d);
            }
            view.setLayoutParams(new FrameLayout.LayoutParams(a2, -2));
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxCard f65778a;

        static {
            Covode.recordClassIndex(40477);
        }

        f(FeedAdLynxCard feedAdLynxCard) {
            this.f65778a = feedAdLynxCard;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme;
            com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
            if (this.f65778a.f65761b == null && (aweme = this.f65778a.f65760a) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                commerceVideoAuthInfo.setHasUserSubmittedFeedback(true);
            }
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxCard f65780a;

        static {
            Covode.recordClassIndex(40479);
        }

        h(FeedAdLynxCard feedAdLynxCard) {
            this.f65780a = feedAdLynxCard;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long creativeId;
            AwemeRawAd awemeRawAd = this.f65780a.f65761b;
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                this.f65780a.f65767h.storeBoolean(String.valueOf(creativeId.longValue()), true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2) {
        boolean z2;
        com.bytedance.ies.bullet.c.c.i iVar;
        this.f65762c.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.z = z2;
        if (z2 && (iVar = this.f65764e) != null) {
            iVar.j();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardCloseEvent(com.ss.android.ugc.aweme.ad.c.d dVar) {
        l.d(dVar, "");
        if (dVar.f65590a == this.w.hashCode()) {
            this.f65768i.d();
            com.bytedance.ies.bullet.c.c.i iVar = this.f65764e;
            if (iVar != null) {
                iVar.k();
            }
            this.z = false;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardStatusEvent(com.ss.android.ugc.aweme.ad.c.g gVar) {
        l.d(gVar, "");
        if (gVar.f65596b == this.w.hashCode() && gVar.f65595a == 1) {
            this.y = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onPopupWebShowEvent(com.ss.android.ugc.aweme.bullet.module.ad.k kVar) {
        l.d(kVar, "");
        com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.A;
        if (bVar != null) {
            bVar.a(!kVar.f69377a);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onSwipeUpVideoEvent(q qVar) {
        DataCenter dataCenter;
        l.d(qVar, "");
        if (qVar.f65607a == this.w.hashCode() && (dataCenter = this.f65768i.f65790d) != null) {
            dataCenter.a("action_ad_swipe_up_video", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct L;
        this.f65760a = aweme;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f65761b = awemeRawAd;
        if (awemeRawAd == null) {
            L = com.ss.android.ugc.aweme.commercialize.e.a.b.N(aweme);
        } else {
            L = com.ss.android.ugc.aweme.commercialize.e.a.b.L(aweme);
        }
        this.f65771m = L;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(String str) {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", this.f65761b).b("refer", "card").a("fail_reason", str).b();
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardCollapseEvent(com.ss.android.ugc.aweme.ad.c.e eVar) {
        MethodCollector.i(1263);
        l.d(eVar, "");
        if (eVar.f65592b != this.w.hashCode()) {
            MethodCollector.o(1263);
        } else if (eVar.f65591a == 1) {
            j();
            MethodCollector.o(1263);
        } else {
            if (eVar.f65591a == 2 && this.f65766g != 0) {
                this.f65766g = 0;
                ViewParent parent = this.f65762c.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f65762c);
                }
                this.f65762c.setAlpha(0.0f);
                this.f65762c.setTranslationY(0.0f);
                this.f65769j.addView(this.f65762c, new ViewGroup.LayoutParams(n.a(270.0d), -2));
                View view = this.f65763d;
                if (view != null) {
                    view.setLayoutParams(new FrameLayout.LayoutParams(n.a(270.0d), -2));
                }
                this.f65762c.animate().alpha(1.0f).setInterpolator(new com.ss.android.ugc.aweme.bd.a()).setDuration(300).start();
            }
            MethodCollector.o(1263);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCardExpandEvent(com.ss.android.ugc.aweme.ad.c.f fVar) {
        MethodCollector.i(1227);
        l.d(fVar, "");
        if (fVar.f65594b != this.w.hashCode()) {
            MethodCollector.o(1227);
            return;
        }
        if (fVar.f65593a == 1 && this.f65766g != 2) {
            this.f65766g = 2;
            FrameLayout i2 = i();
            if (i2 == null) {
                MethodCollector.o(1227);
                return;
            }
            ViewParent parent = this.f65762c.getParent();
            Activity activity = null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.f65762c);
            }
            i2.addView(this.f65762c, new FrameLayout.LayoutParams(-1, -1));
            View view = this.f65763d;
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            i2.setVisibility(0);
            this.f65768i.g();
            if (this.A == null) {
                Context context = this.f65769j.getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                Activity activity2 = activity;
                if (activity2 == null) {
                    MethodCollector.o(1227);
                    return;
                }
                this.A = new c(this, activity2, activity2);
            }
            com.ss.android.ugc.aweme.ad.feed.h.b bVar = this.A;
            if (bVar != null) {
                bVar.a(true);
                MethodCollector.o(1227);
                return;
            }
        }
        MethodCollector.o(1227);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onGetScoreEvent(com.ss.android.ugc.aweme.ad.c.j jVar) {
        l.d(jVar, "");
        if (jVar.f65599a == this.w.hashCode()) {
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(ScoreApi.class);
            l.b(a2, "");
            ScoreApi scoreApi = (ScoreApi) a2;
            Aweme aweme = this.f65760a;
            if (aweme != null && com.ss.android.ugc.aweme.commercialize.e.a.b.P(aweme)) {
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                l.b(commerceVideoAuthInfo, "");
                String itemId = commerceVideoAuthInfo.getItemId();
                l.b(itemId, "");
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
                l.b(commerceVideoAuthInfo2, "");
                String advId = commerceVideoAuthInfo2.getAdvId();
                l.b(advId, "");
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo3 = aweme.getCommerceVideoAuthInfo();
                l.b(commerceVideoAuthInfo3, "");
                String adId = commerceVideoAuthInfo3.getAdId();
                l.b(adId, "");
                com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo4 = aweme.getCommerceVideoAuthInfo();
                l.b(commerceVideoAuthInfo4, "");
                String creativeId = commerceVideoAuthInfo4.getCreativeId();
                l.b(creativeId, "");
                this.B.a(scoreApi.sendScoreOption(itemId, advId, adId, creativeId, jVar.f65600b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), g.f65779a));
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onGetVoteCardOptionEvent(k kVar) {
        int i2;
        Long l2;
        l.d(kVar, "");
        if (kVar.f65601a == this.w.hashCode()) {
            Context context = this.f65769j.getContext();
            Long l3 = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            int i3 = 0;
            if (context != null) {
                i2 = context.hashCode();
            } else {
                i2 = 0;
            }
            Integer num = C;
            if (num == null || i2 != num.intValue()) {
                if (context != null) {
                    i3 = context.hashCode();
                }
                C = Integer.valueOf(i3);
            }
            Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(VoteApi.class);
            l.b(a2, "");
            VoteApi voteApi = (VoteApi) a2;
            Aweme aweme = this.f65760a;
            if (aweme != null) {
                String aid = aweme.getAid();
                l.b(aid, "");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    l2 = awemeRawAd.getCreativeId();
                } else {
                    l2 = null;
                }
                String valueOf = String.valueOf(l2);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    l3 = awemeRawAd2.getAdId();
                }
                this.B.a(voteApi.sendVoteOption(aid, valueOf, String.valueOf(l3), kVar.f65602b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), i.f65781a));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2, int i3) {
        this.s = i2;
        this.t = i3;
    }

    public static final class c extends com.ss.android.ugc.aweme.ad.feed.h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxCard f65774a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f65775b;

        static {
            Covode.recordClassIndex(40474);
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || this.f65774a.f65766g != 2) {
                return false;
            }
            this.f65774a.j();
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FeedAdLynxCard feedAdLynxCard, Activity activity, Activity activity2) {
            super(activity2);
            this.f65774a = feedAdLynxCard;
            this.f65775b = activity;
        }
    }

    public FeedAdLynxCard(a aVar, FrameLayout frameLayout) {
        com.ss.android.ugc.aweme.bullet.e eVar;
        androidx.lifecycle.i lifecycle;
        String str;
        l.d(aVar, "");
        l.d(frameLayout, "");
        MethodCollector.i(1317);
        this.f65768i = aVar;
        this.f65769j = frameLayout;
        androidx.core.app.d dVar = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.afb, null);
        l.b(inflate, "");
        this.f65762c = inflate;
        e eVar2 = new e(this);
        this.x = eVar2;
        this.f65767h = Keva.getRepo("feed_ad_lynx_vote_card_repo");
        this.B = new f.a.b.a();
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.a0g);
        l.b(findViewById, "");
        this.w = (BulletContainerView) findViewById;
        com.ss.android.ugc.aweme.ad.feed.c k2 = k();
        if (k2 != null) {
            BulletContainerView bulletContainerView = this.w;
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                str = f2.g("lynx_feed");
            } else {
                str = null;
            }
            eVar = k2.a(bulletContainerView, str, eVar2);
        } else {
            eVar = null;
        }
        this.v = eVar;
        Context context = frameLayout.getContext();
        androidx.core.app.d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.o(1317);
            return;
        }
        lifecycle.a(this);
        MethodCollector.o(1317);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.q = str;
        this.r = str2;
    }

    public final void a(String str, JSONObject jSONObject) {
        com.bytedance.ies.bullet.c.c.i iVar = this.f65764e;
        if (iVar != null) {
            iVar.onEvent(new j(str, jSONObject));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.card.d
    public final void a(int i2, int i3, int i4) {
        this.n = i2;
        this.o = i3;
        this.p = i4;
    }
}
