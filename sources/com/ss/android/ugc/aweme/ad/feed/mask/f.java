package com.ss.android.ugc.aweme.ad.feed.mask;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.google.gson.i;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public final class f implements u<b>, h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65983b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    DataCenter f65984a;

    /* renamed from: c  reason: collision with root package name */
    private FeedAdLynxMaskContainer f65985c;

    /* renamed from: d  reason: collision with root package name */
    private BulletContainerView f65986d;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f65987e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f65988f;

    /* renamed from: g  reason: collision with root package name */
    private final c f65989g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewStub f65990h;

    static {
        Covode.recordClassIndex(40585);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40586);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final boolean d() {
        return this.f65988f;
    }

    public final void c() {
        DataCenter dataCenter = this.f65984a;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_resume_video", (Object) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final boolean b() {
        BulletContainerView bulletContainerView;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        c cVar = this.f65989g;
        if (cVar == null || !cVar.b(this.f65987e) || (bulletContainerView = this.f65986d) == null || this.f65988f || (feedAdLynxMaskContainer = this.f65985c) == null || !feedAdLynxMaskContainer.f65947h) {
            return false;
        }
        bulletContainerView.setAlpha(0.0f);
        bulletContainerView.setVisibility(0);
        bulletContainerView.animate().alpha(1.0f).setDuration(150).start();
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.f65985c;
        if (feedAdLynxMaskContainer2 != null) {
            feedAdLynxMaskContainer2.a("maskShow");
        }
        this.f65988f = true;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final void a() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        String cardUrl;
        String str;
        String str2;
        String str3;
        String str4;
        List<String> urlList;
        if (!this.f65988f && (feedAdLynxMaskContainer = this.f65985c) != null) {
            feedAdLynxMaskContainer.f65947h = false;
            CardStruct cardStruct = feedAdLynxMaskContainer.f65942c;
            if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
                Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
                o oVar = new o();
                AwemeRawAd awemeRawAd = feedAdLynxMaskContainer.f65941b;
                String str5 = null;
                if (awemeRawAd != null) {
                    Long adId = awemeRawAd.getAdId();
                    if (adId != null) {
                        str2 = String.valueOf(adId.longValue());
                    } else {
                        str2 = null;
                    }
                    oVar.a("adId", str2);
                    oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str3 = String.valueOf(groupId.longValue());
                    } else {
                        str3 = null;
                    }
                    oVar.a("groupId", str3);
                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                    if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                        i iVar = new i();
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
                    ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                    if (nativeSiteConfig == null || (str4 = nativeSiteConfig.getLynxScheme()) == null) {
                        str4 = "";
                    }
                    oVar.a("lynxSchema", str4);
                }
                JSONObject jSONObject = feedAdLynxMaskContainer.f65943d;
                if (jSONObject == null || (str = jSONObject.toString()) == null) {
                    str = "";
                }
                oVar.a("cardData", str);
                oVar.a("isRTL", Integer.valueOf(gb.a(feedAdLynxMaskContainer.f65948i.getContext()) ? 1 : 0));
                String oVar2 = oVar.toString();
                l.b(oVar2, "");
                buildUpon.appendQueryParameter("initialData", oVar2);
                e eVar = feedAdLynxMaskContainer.f65946g;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    l.b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxMaskContainer.f65948i.getContext();
                    c cVar = feedAdLynxMaskContainer.f65945f;
                    if (cVar != null) {
                        Aweme aweme = feedAdLynxMaskContainer.f65940a;
                        l.b(context, "");
                        cVar.a(bundle, aweme, context);
                    }
                    AwemeRawAd awemeRawAd2 = feedAdLynxMaskContainer.f65941b;
                    if (awemeRawAd2 != null) {
                        str5 = awemeRawAd2.getNativeSiteCustomData();
                    }
                    bundle.putString("bundle_native_site_custom_data", str5);
                    eVar.a(builder, bundle);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final void a(DataCenter dataCenter) {
        this.f65984a = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<b>) this);
        }
    }

    public final void b(boolean z) {
        DataCenter dataCenter = this.f65984a;
        if (dataCenter != null) {
            dataCenter.a("action_ad_hide_lynx_mask", Boolean.valueOf(z));
        }
    }

    public f(ViewStub viewStub) {
        this.f65990h = viewStub;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        this.f65989g = (c) (!(a2 instanceof c) ? null : a2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final void a(boolean z) {
        BulletContainerView bulletContainerView = this.f65986d;
        if (bulletContainerView != null) {
            bulletContainerView.setAlpha(1.0f);
            bulletContainerView.setVisibility(8);
            bulletContainerView.animate().alpha(0.0f).setDuration(150).start();
            this.f65988f = false;
            if (z) {
                c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.h
    public final void a(Aweme aweme) {
        MethodCollector.i(3325);
        c cVar = this.f65989g;
        if (cVar == null || !cVar.b(aweme)) {
            this.f65987e = null;
            FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.f65985c;
            if (feedAdLynxMaskContainer != null) {
                feedAdLynxMaskContainer.a((Aweme) null);
                MethodCollector.o(3325);
                return;
            }
            MethodCollector.o(3325);
            return;
        }
        this.f65987e = aweme;
        ViewStub viewStub = this.f65990h;
        if (!(viewStub == null || viewStub.getParent() == null)) {
            this.f65990h.setLayoutResource(R.layout.afc);
            View inflate = this.f65990h.inflate();
            if (inflate != null) {
                this.f65986d = (BulletContainerView) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
                MethodCollector.o(3325);
                throw nullPointerException;
            }
        }
        BulletContainerView bulletContainerView = this.f65986d;
        if (bulletContainerView == null) {
            MethodCollector.o(3325);
            return;
        }
        if (this.f65985c == null) {
            this.f65985c = new FeedAdLynxMaskContainer(this, bulletContainerView);
        }
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.f65985c;
        if (feedAdLynxMaskContainer2 != null) {
            feedAdLynxMaskContainer2.a(aweme);
        }
        BulletContainerView bulletContainerView2 = this.f65986d;
        if (bulletContainerView2 != null) {
            bulletContainerView2.setVisibility(8);
        }
        this.f65988f = false;
        MethodCollector.o(3325);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2;
        b bVar2 = bVar;
        c cVar = this.f65989g;
        if (cVar != null && cVar.b(this.f65987e) && bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (feedAdLynxMaskContainer2 = this.f65985c) != null) {
                    EventBus.a(EventBus.a(), feedAdLynxMaskContainer2);
                }
            } else if (str.equals("ad_feed_on_page_unselected") && (feedAdLynxMaskContainer = this.f65985c) != null) {
                EventBus.a().b(feedAdLynxMaskContainer);
            }
        }
    }
}
