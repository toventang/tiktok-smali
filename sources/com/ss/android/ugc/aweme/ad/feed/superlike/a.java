package com.ss.android.ugc.aweme.ad.feed.superlike;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.i;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.ad.feed.e;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public final class a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, e {

    /* renamed from: d  reason: collision with root package name */
    public static final C1477a f66054d = new C1477a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FeedAdLynxSuperLike f66055a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66056b;

    /* renamed from: c  reason: collision with root package name */
    public String f66057c;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f66058e;

    /* renamed from: f  reason: collision with root package name */
    private DataCenter f66059f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f66060g;

    /* renamed from: h  reason: collision with root package name */
    private j f66061h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f66062i = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    private ViewStub f66063j;

    static {
        Covode.recordClassIndex(40616);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.a$a  reason: collision with other inner class name */
    public static final class C1477a {
        static {
            Covode.recordClassIndex(40617);
        }

        private C1477a() {
        }

        public /* synthetic */ C1477a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final boolean c() {
        return this.f66056b;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void b() {
        FrameLayout frameLayout = this.f66060g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f66056b = false;
        this.f66062i.removeCallbacksAndMessages(null);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f66064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f66065b;

        static {
            Covode.recordClassIndex(40618);
        }

        b(a aVar, FrameLayout frameLayout) {
            this.f66064a = aVar;
            this.f66065b = frameLayout;
        }

        public final void run() {
            FeedAdLynxSuperLike feedAdLynxSuperLike = this.f66064a.f66055a;
            if (feedAdLynxSuperLike == null || !feedAdLynxSuperLike.f66043g) {
                this.f66064a.f66057c = "data_load_fail";
                FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f66064a.f66055a;
                if (feedAdLynxSuperLike2 != null) {
                    feedAdLynxSuperLike2.b(this.f66064a.f66057c);
                    return;
                }
                return;
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike3 = this.f66064a.f66055a;
            if (feedAdLynxSuperLike3 == null || !feedAdLynxSuperLike3.f66044h) {
                this.f66064a.f66057c = "load_timeout";
                FeedAdLynxSuperLike feedAdLynxSuperLike4 = this.f66064a.f66055a;
                if (feedAdLynxSuperLike4 != null) {
                    feedAdLynxSuperLike4.b(this.f66064a.f66057c);
                    return;
                }
                return;
            }
            this.f66065b.setVisibility(0);
            this.f66064a.f66056b = true;
            FeedAdLynxSuperLike feedAdLynxSuperLike5 = this.f66064a.f66055a;
            if (feedAdLynxSuperLike5 != null) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", feedAdLynxSuperLike5.f66038b).b("refer", "superlike").b();
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike6 = this.f66064a.f66055a;
            if (feedAdLynxSuperLike6 != null) {
                feedAdLynxSuperLike6.a("event_superlike_show");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a() {
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        String str;
        String str2;
        String str3;
        List<String> urlList;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aY(this.f66058e) && !this.f66056b && (feedAdLynxSuperLike = this.f66055a) != null) {
            feedAdLynxSuperLike.f66043g = false;
            feedAdLynxSuperLike.f66044h = false;
            String str4 = feedAdLynxSuperLike.f66039c;
            if (str4 != null) {
                Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
                o oVar = new o();
                AwemeRawAd awemeRawAd = feedAdLynxSuperLike.f66038b;
                String str5 = null;
                if (awemeRawAd != null) {
                    oVar.a("adId", String.valueOf(awemeRawAd.getAdId().longValue()));
                    oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str = String.valueOf(groupId.longValue());
                    } else {
                        str = null;
                    }
                    oVar.a("groupId", str);
                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                    if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                        i iVar = new i();
                        Iterator<T> it = urlList.iterator();
                        while (it.hasNext()) {
                            iVar.a((String) it.next());
                        }
                        oVar.a("clickTrackUrlList", iVar);
                    }
                    JSONObject frontendData = awemeRawAd.getFrontendData();
                    if (frontendData != null) {
                        str2 = frontendData.toString();
                    } else {
                        str2 = null;
                    }
                    oVar.a("frontendData", str2);
                    ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                    if (nativeSiteConfig != null) {
                        str3 = nativeSiteConfig.getLynxScheme();
                    } else {
                        str3 = null;
                    }
                    oVar.a("lynxSchema", str3);
                }
                Aweme aweme = feedAdLynxSuperLike.f66037a;
                if (aweme != null) {
                    str5 = aweme.getAid();
                }
                oVar.a("itemId", String.valueOf(str5));
                oVar.a("isRTL", Integer.valueOf(gb.a(feedAdLynxSuperLike.f66045i.getContext()) ? 1 : 0));
                oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
                buildUpon.appendQueryParameter("initialData", oVar.toString());
                com.ss.android.ugc.aweme.bullet.e eVar = feedAdLynxSuperLike.f66041e;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    l.b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxSuperLike.f66045i.getContext();
                    c cVar = feedAdLynxSuperLike.f66040d;
                    if (cVar != null) {
                        Aweme aweme2 = feedAdLynxSuperLike.f66037a;
                        l.b(context, "");
                        cVar.a(bundle, aweme2, context);
                    }
                    eVar.a(builder, bundle);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(DataCenter dataCenter) {
        this.f66059f = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    public a(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f66063j = viewStub;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(long j2) {
        FrameLayout frameLayout;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aY(this.f66058e) && !this.f66056b && (frameLayout = this.f66060g) != null) {
            this.f66062i.postDelayed(new b(this, frameLayout), j2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aY(this.f66058e) && bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (feedAdLynxSuperLike = this.f66055a) != null) {
                    EventBus.a(EventBus.a(), feedAdLynxSuperLike);
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f66055a;
                if (feedAdLynxSuperLike2 != null) {
                    EventBus.a(EventBus.a(), feedAdLynxSuperLike2);
                }
                b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e
    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        MethodCollector.i(3841);
        j jVar = null;
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aY(aweme)) {
            this.f66058e = null;
            FeedAdLynxSuperLike feedAdLynxSuperLike = this.f66055a;
            if (feedAdLynxSuperLike != null) {
                feedAdLynxSuperLike.a((Aweme) null);
                MethodCollector.o(3841);
                return;
            }
            MethodCollector.o(3841);
            return;
        }
        j aZ = com.ss.android.ugc.aweme.commercialize.e.a.b.aZ(aweme);
        if (aZ == null || aZ.getEntryType() != 1) {
            this.f66058e = null;
            FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f66055a;
            if (feedAdLynxSuperLike2 != null) {
                feedAdLynxSuperLike2.a((Aweme) null);
            }
            MethodCollector.o(3841);
            return;
        }
        this.f66058e = aweme;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            jVar = awemeRawAd.getLynxEntryData();
        }
        this.f66061h = jVar;
        if (this.f66063j.getParent() != null) {
            this.f66063j.setLayoutResource(R.layout.afe);
            View inflate = this.f66063j.inflate();
            if (inflate != null) {
                this.f66060g = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.o(3841);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f66060g;
        if (frameLayout == null) {
            MethodCollector.o(3841);
            return;
        }
        if (this.f66055a == null) {
            this.f66055a = new FeedAdLynxSuperLike(this, frameLayout);
        }
        FeedAdLynxSuperLike feedAdLynxSuperLike3 = this.f66055a;
        if (feedAdLynxSuperLike3 != null) {
            feedAdLynxSuperLike3.a(aweme);
        }
        b();
        MethodCollector.o(3841);
    }
}
