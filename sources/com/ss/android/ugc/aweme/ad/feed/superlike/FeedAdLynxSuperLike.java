package com.ss.android.ugc.aweme.ad.feed.superlike;

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
import com.ss.android.ugc.aweme.ad.c.h;
import com.ss.android.ugc.aweme.ad.feed.d;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class FeedAdLynxSuperLike implements d, au, i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f66036j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Aweme f66037a;

    /* renamed from: b  reason: collision with root package name */
    AwemeRawAd f66038b;

    /* renamed from: c  reason: collision with root package name */
    String f66039c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.ad.feed.c f66040d;

    /* renamed from: e  reason: collision with root package name */
    e f66041e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f66042f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f66043g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66044h;

    /* renamed from: i  reason: collision with root package name */
    final FrameLayout f66045i;

    /* renamed from: k  reason: collision with root package name */
    private final View f66046k;

    /* renamed from: l  reason: collision with root package name */
    private BulletContainerView f66047l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.a f66048m;
    private final a n;

    static {
        Covode.recordClassIndex(40612);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(400, new g(FeedAdLynxSuperLike.class, "onPopupWindowCloseEvent", h.class, ThreadMode.MAIN, 0, false));
        hashMap.put(401, new g(FeedAdLynxSuperLike.class, "onSuperLikeStatusEvent", com.ss.android.ugc.aweme.ad.c.i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40613);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f66050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f66052c = null;

        /* renamed from: d  reason: collision with root package name */
        private final String f66053d;

        static {
            Covode.recordClassIndex(40615);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f66053d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f66050a;
        }

        c(String str, JSONObject jSONObject) {
            this.f66051b = str;
            this.f66053d = str;
            this.f66050a = null;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxSuperLike f66049a;

        static {
            Covode.recordClassIndex(40614);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FeedAdLynxSuperLike feedAdLynxSuperLike) {
            this.f66049a = feedAdLynxSuperLike;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f66049a.f66043g = true;
            this.f66049a.f66042f = iVar;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onSuperLikeStatusEvent(com.ss.android.ugc.aweme.ad.c.i iVar) {
        l.d(iVar, "");
        if (iVar.f65598a == 1) {
            this.f66044h = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.d
    public final void a(String str) {
        l.d(str, "");
        com.bytedance.ies.bullet.c.c.i iVar = this.f66042f;
        if (iVar != null) {
            iVar.onEvent(new c(str, null));
        }
    }

    public final void b(String str) {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", this.f66038b).b("refer", "superlike").a("fail_reason", str).b();
    }

    @r(a = ThreadMode.MAIN)
    public final void onPopupWindowCloseEvent(h hVar) {
        l.d(hVar, "");
        if (hVar.f65597a == this.f66047l.hashCode()) {
            this.n.b();
        }
    }

    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        com.ss.android.ugc.aweme.commercialize.model.j lynxEntryData;
        this.f66037a = aweme;
        String str = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f66038b = awemeRawAd;
        if (!(aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (lynxEntryData = awemeRawAd2.getLynxEntryData()) == null)) {
            str = lynxEntryData.getLynxScheme();
        }
        this.f66039c = str;
        if (aweme != null) {
            EventBus.a(EventBus.a(), this);
        }
    }

    public FeedAdLynxSuperLike(a aVar, FrameLayout frameLayout) {
        e eVar;
        androidx.lifecycle.i lifecycle;
        String str;
        l.d(aVar, "");
        l.d(frameLayout, "");
        MethodCollector.i(3825);
        this.n = aVar;
        this.f66045i = frameLayout;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        androidx.core.app.d dVar = null;
        this.f66040d = (com.ss.android.ugc.aweme.ad.feed.c) (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c) ? null : a2);
        View inflate = View.inflate(frameLayout.getContext(), R.layout.afe, null);
        l.b(inflate, "");
        this.f66046k = inflate;
        b bVar = new b(this);
        this.f66048m = bVar;
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.b0t);
        l.b(findViewById, "");
        BulletContainerView bulletContainerView = (BulletContainerView) findViewById;
        this.f66047l = bulletContainerView;
        com.ss.android.ugc.aweme.ad.feed.c cVar = this.f66040d;
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
        this.f66041e = eVar;
        Context context = frameLayout.getContext();
        androidx.core.app.d dVar2 = context instanceof androidx.fragment.app.e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.o(3825);
            return;
        }
        lifecycle.a(this);
        MethodCollector.o(3825);
    }
}
