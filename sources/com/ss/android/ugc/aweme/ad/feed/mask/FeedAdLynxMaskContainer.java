package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.core.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ad.c.l;
import com.ss.android.ugc.aweme.ad.c.n;
import com.ss.android.ugc.aweme.ad.c.o;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class FeedAdLynxMaskContainer implements au, i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f65939j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Aweme f65940a;

    /* renamed from: b  reason: collision with root package name */
    AwemeRawAd f65941b;

    /* renamed from: c  reason: collision with root package name */
    CardStruct f65942c;

    /* renamed from: d  reason: collision with root package name */
    JSONObject f65943d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f65944e;

    /* renamed from: f  reason: collision with root package name */
    final com.ss.android.ugc.aweme.ad.feed.c f65945f;

    /* renamed from: g  reason: collision with root package name */
    e f65946g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f65947h;

    /* renamed from: i  reason: collision with root package name */
    final BulletContainerView f65948i;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.a f65949k;

    /* renamed from: l  reason: collision with root package name */
    private final f f65950l;

    static {
        Covode.recordClassIndex(40567);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(326, new g(FeedAdLynxMaskContainer.class, "onHideMaskLayoutEvent", l.class, ThreadMode.MAIN, 0, false));
        hashMap.put(327, new g(FeedAdLynxMaskContainer.class, "onPopUpPageHideResumeVideoEvent", n.class, ThreadMode.MAIN, 0, false));
        hashMap.put(328, new g(FeedAdLynxMaskContainer.class, "onPopUpPageShowHideMaskLayoutEvent", o.class, ThreadMode.MAIN, 0, false));
        hashMap.put(329, new g(FeedAdLynxMaskContainer.class, "onCardGetCodeButtonClickedEvent", com.ss.android.ugc.aweme.ad.c.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40568);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f65952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f65954c = null;

        /* renamed from: d  reason: collision with root package name */
        private final String f65955d;

        static {
            Covode.recordClassIndex(40570);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f65955d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f65952a;
        }

        c(String str) {
            this.f65953b = str;
            this.f65955d = str;
            this.f65952a = null;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxMaskContainer f65951a;

        static {
            Covode.recordClassIndex(40569);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FeedAdLynxMaskContainer feedAdLynxMaskContainer) {
            this.f65951a = feedAdLynxMaskContainer;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f65951a.f65944e = iVar;
            this.f65951a.f65947h = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        com.bytedance.ies.bullet.c.c.i iVar = this.f65944e;
        if (iVar != null) {
            iVar.onEvent(new c(str));
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onCardGetCodeButtonClickedEvent(com.ss.android.ugc.aweme.ad.c.c cVar) {
        h.f.b.l.d(cVar, "");
        a("gameCodeClicked");
    }

    @r(a = ThreadMode.MAIN)
    public final void onPopUpPageHideResumeVideoEvent(n nVar) {
        h.f.b.l.d(nVar, "");
        this.f65950l.c();
    }

    @r(a = ThreadMode.MAIN)
    public final void onHideMaskLayoutEvent(l lVar) {
        h.f.b.l.d(lVar, "");
        if (lVar.f65603a == this.f65948i.hashCode()) {
            this.f65950l.b(true);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onPopUpPageShowHideMaskLayoutEvent(o oVar) {
        h.f.b.l.d(oVar, "");
        this.f65950l.b(false);
        DataCenter dataCenter = this.f65950l.f65984a;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_pause_video", (Object) null);
        }
    }

    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct cardStruct;
        Map<String, CardStruct> cardInfos;
        this.f65940a = aweme;
        JSONObject jSONObject = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f65941b = awemeRawAd;
        if (awemeRawAd == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            cardStruct = null;
        } else {
            cardStruct = cardInfos.get("5");
        }
        this.f65942c = cardStruct;
        if (cardStruct != null) {
            jSONObject = cardStruct.getCardData();
        }
        this.f65943d = jSONObject;
    }

    public FeedAdLynxMaskContainer(f fVar, BulletContainerView bulletContainerView) {
        e eVar;
        androidx.lifecycle.i lifecycle;
        String str;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bulletContainerView, "");
        this.f65950l = fVar;
        this.f65948i = bulletContainerView;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        d dVar = null;
        com.ss.android.ugc.aweme.ad.feed.c cVar = (com.ss.android.ugc.aweme.ad.feed.c) (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c) ? null : a2);
        this.f65945f = cVar;
        b bVar = new b(this);
        this.f65949k = bVar;
        if (cVar != null) {
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                str = f2.g("lynx_feed");
            } else {
                str = null;
            }
            eVar = cVar.a(bulletContainerView, str, bVar);
        } else {
            eVar = null;
        }
        this.f65946g = eVar;
        Context context = bulletContainerView.getContext();
        d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }
}
