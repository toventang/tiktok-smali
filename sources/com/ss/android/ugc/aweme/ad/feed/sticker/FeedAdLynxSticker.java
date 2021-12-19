package com.ss.android.ugc.aweme.ad.feed.sticker;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
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

public final class FeedAdLynxSticker extends AbstractFeedLynxView implements au, i, j {

    /* renamed from: k  reason: collision with root package name */
    public static final a f66016k = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f66017j;

    /* renamed from: l  reason: collision with root package name */
    private String f66018l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.a f66019m;
    private e n;
    private m o;

    static {
        Covode.recordClassIndex(40605);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(159, new g(FeedAdLynxSticker.class, "onCardStatusEvent", com.ss.android.ugc.aweme.ad.c.g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(302, new g(FeedAdLynxSticker.class, "onAdPlayEvent", com.ss.android.ugc.aweme.ad.feed.c.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40606);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final String a() {
        return this.f66018l;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final e c() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final void f() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", this.f65927b).b("refer", "sticker").b();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final o e() {
        User author;
        String str;
        String str2;
        o e2 = super.e();
        AwemeRawAd awemeRawAd = this.f65927b;
        String str3 = null;
        if (awemeRawAd != null) {
            JSONObject frontendData = awemeRawAd.getFrontendData();
            if (frontendData != null) {
                str = frontendData.toString();
            } else {
                str = null;
            }
            e2.a("frontendData", str);
            ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig != null) {
                str2 = nativeSiteConfig.getLynxScheme();
            } else {
                str2 = null;
            }
            e2.a("lynxSchema", str2);
        }
        Aweme aweme = this.f65926a;
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            str3 = author.getNickname();
        }
        e2.a("accountName", str3);
        return e2;
    }

    public static final class b extends com.ss.android.ugc.aweme.bullet.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedAdLynxSticker f66020a;

        static {
            Covode.recordClassIndex(40607);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FeedAdLynxSticker feedAdLynxSticker) {
            this.f66020a = feedAdLynxSticker;
        }

        @Override // com.ss.android.ugc.aweme.bullet.a, com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            super.a(view, uri, iVar);
            this.f66020a.f65929d = true;
            this.f66020a.f65931f = iVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final void a(Aweme aweme) {
        String str;
        super.a(aweme);
        m R = com.ss.android.ugc.aweme.commercialize.e.a.b.R(aweme);
        this.o = R;
        if (R != null) {
            str = R.getStickerUrl();
        } else {
            str = null;
        }
        this.f66018l = str;
        if (aweme != null) {
            EventBus.a(EventBus.a(), this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView
    public final void b(String str) {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", this.f65927b).b("refer", "sticker").a("fail_reason", str).b();
    }

    @r(a = ThreadMode.MAIN)
    public final void onCardStatusEvent(com.ss.android.ugc.aweme.ad.c.g gVar) {
        l.d(gVar, "");
        if (gVar.f65596b == b().hashCode() && gVar.f65595a == 1) {
            this.f66017j = true;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onAdPlayEvent(com.ss.android.ugc.aweme.ad.feed.c.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.ad.feed.e eVar = this.f65934i;
        if (!(eVar instanceof a)) {
            eVar = null;
        }
        a aVar = (a) eVar;
        if (aVar != null && !aVar.d() && this.f65934i.c()) {
            a("event_card_show");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedAdLynxSticker(ViewGroup viewGroup, a aVar) {
        super(viewGroup, aVar);
        l.d(viewGroup, "");
        l.d(aVar, "");
        b bVar = new b(this);
        this.f66019m = bVar;
        c cVar = this.f65928c;
        e eVar = null;
        String g2 = null;
        if (cVar != null) {
            BulletContainerView b2 = b();
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            eVar = cVar.a(b2, f2 != null ? f2.g("lynx_feed") : g2, bVar);
        }
        this.n = eVar;
    }
}
