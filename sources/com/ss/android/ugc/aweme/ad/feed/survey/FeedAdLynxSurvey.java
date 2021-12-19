package com.ss.android.ugc.aweme.ad.feed.survey;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.ad.c.q;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.h;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class FeedAdLynxSurvey implements au, i, j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f66066k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Aweme f66067a;

    /* renamed from: b  reason: collision with root package name */
    AwemeRawAd f66068b;

    /* renamed from: c  reason: collision with root package name */
    l f66069c;

    /* renamed from: d  reason: collision with root package name */
    long f66070d = -1;

    /* renamed from: e  reason: collision with root package name */
    e f66071e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f66072f;

    /* renamed from: g  reason: collision with root package name */
    String f66073g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66074h;

    /* renamed from: i  reason: collision with root package name */
    final a f66075i;

    /* renamed from: j  reason: collision with root package name */
    final FrameLayout f66076j;

    /* renamed from: l  reason: collision with root package name */
    private Integer f66077l;

    /* renamed from: m  reason: collision with root package name */
    private final h f66078m = h.i.a((h.f.a.a) b.f66079a);
    private final View n;
    private BulletContainerView o;
    private final com.ss.android.ugc.aweme.bullet.a p;

    static {
        Covode.recordClassIndex(40619);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.ad.feed.c a() {
        return (com.ss.android.ugc.aweme.ad.feed.c) this.f66078m.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(48, new g(FeedAdLynxSurvey.class, "onHomeTabPressed", com.ss.android.ugc.aweme.ad.feed.c.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(49, new g(FeedAdLynxSurvey.class, "onSwipeUpEvent", q.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40620);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f66081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f66083c;

        /* renamed from: d  reason: collision with root package name */
        private final String f66084d;

        static {
            Covode.recordClassIndex(40623);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f66084d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f66081a;
        }

        d(String str, JSONObject jSONObject) {
            this.f66082b = str;
            this.f66083c = jSONObject;
            this.f66084d = str;
            this.f66081a = jSONObject;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66079a = new b();

        static {
            Covode.recordClassIndex(40621);
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

    public static final class c extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxSurvey f66080a;

        static {
            Covode.recordClassIndex(40622);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(FeedAdLynxSurvey feedAdLynxSurvey) {
            this.f66080a = feedAdLynxSurvey;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f66080a.f66074h = true;
            this.f66080a.f66072f = iVar;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwipeUpEvent(q qVar) {
        DataCenter dataCenter;
        String str = "";
        h.f.b.l.d(qVar, str);
        if (qVar.f65607a == this.o.hashCode()) {
            String str2 = qVar.f65608b;
            if (str2 != null) {
                str = str2;
            }
            this.f66073g = str;
            a aVar = this.f66075i;
            b bVar = aVar.f66091c;
            if (bVar != null && (dataCenter = aVar.f66089a) != null) {
                dataCenter.a("action_ad_swipe_up_video", bVar);
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onHomeTabPressed(com.ss.android.ugc.aweme.ad.feed.c.a aVar) {
        Long l2;
        int i2;
        h.f.b.l.d(aVar, "");
        if (this.f66075i.f66090b) {
            this.f66075i.b();
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_over", this.f66068b);
            AwemeRawAd awemeRawAd = this.f66068b;
            if (awemeRawAd != null) {
                l2 = awemeRawAd.getAdId();
            } else {
                l2 = null;
            }
            a.C0791a a3 = a2.b("ad_id", l2).a("duration", Long.valueOf(System.currentTimeMillis() - this.f66070d));
            l lVar = this.f66069c;
            if (lVar != null) {
                i2 = lVar.getId();
            } else {
                i2 = 0;
            }
            a3.a("five_star_survey_id", Integer.valueOf(i2)).b();
        }
        EventBus.a().b(this);
    }

    public final void a(Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        this.f66067a = aweme;
        l lVar = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f66068b = awemeRawAd;
        this.f66077l = Integer.valueOf(i2);
        AwemeRawAd awemeRawAd2 = this.f66068b;
        if (awemeRawAd2 != null) {
            lVar = awemeRawAd2.getAdQuestionnaire();
        }
        this.f66069c = lVar;
    }

    public FeedAdLynxSurvey(a aVar, FrameLayout frameLayout) {
        e eVar;
        androidx.lifecycle.i lifecycle;
        String str;
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(frameLayout, "");
        MethodCollector.i(3816);
        this.f66075i = aVar;
        this.f66076j = frameLayout;
        androidx.core.app.d dVar = null;
        View inflate = View.inflate(frameLayout.getContext(), R.layout.aff, null);
        h.f.b.l.b(inflate, "");
        this.n = inflate;
        this.f66073g = "";
        c cVar = new c(this);
        this.p = cVar;
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.a0f);
        h.f.b.l.b(findViewById, "");
        this.o = (BulletContainerView) findViewById;
        com.ss.android.ugc.aweme.ad.feed.c a2 = a();
        if (a2 != null) {
            BulletContainerView bulletContainerView = this.o;
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                str = f2.g("lynx_feed");
            } else {
                str = null;
            }
            eVar = a2.a(bulletContainerView, str, cVar);
        } else {
            eVar = null;
        }
        this.f66071e = eVar;
        Context context = frameLayout.getContext();
        androidx.core.app.d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.o(3816);
            return;
        }
        lifecycle.a(this);
        MethodCollector.o(3816);
    }
}
