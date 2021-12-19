package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.ss.android.sdk.webview.i;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.f;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.aw;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.aj;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.utils.au;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.commercialize.utils.h;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.crossplatform.activity.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class c implements com.ss.android.ugc.aweme.ad.b.c {

    /* renamed from: a  reason: collision with root package name */
    private k f73787a;

    static {
        Covode.recordClassIndex(45414);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String h() {
        return "snssdk";
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c() {
        aw.a();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void f() {
        k kVar = this.f73787a;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final CardStruct i() {
        return com.ss.android.ugc.aweme.web.jsbridge.a.f144956d;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final CardStruct j() {
        return com.ss.android.ugc.aweme.web.jsbridge.a.f144957e;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final CardStruct k() {
        return com.ss.android.ugc.aweme.web.jsbridge.a.f144955c;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final Aweme l() {
        return com.ss.android.ugc.aweme.web.jsbridge.a.f144959g;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final Map<String, String> m() {
        return com.ss.android.ugc.aweme.web.jsbridge.a.f144960h;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(String str, List<String> list, Long l2, String str2, String str3, String str4) {
        l.d(str, "");
        aj.a(str, list, l2, str2, new b(str4, str3));
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Aweme aweme) {
        return bs.b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean b(Aweme aweme) {
        return bs.c(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(String str) {
        h.a(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(String str, String str2, int i2, int i3, String str3, String str4) {
        f.f66130b.a(str, str2, i2, i3, str3, str4, -1);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Context context, String str) {
        return w.c(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Uri uri, String str, Context context, String str2, Aweme aweme, boolean z) {
        l.d(uri, "");
        l.d(str, "");
        if (context == null) {
            return false;
        }
        if (l.a((Object) uri.getScheme(), (Object) "market")) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, aweme, str2);
            } else if (com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, uri)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, aweme, str2);
            }
            return true;
        } else if (com.ss.android.ugc.aweme.commercialize.utils.b.b.a(uri)) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context)) {
                return false;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.b.b.b(context, uri)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, aweme, str2);
            }
            return true;
        } else if (w.a(uri)) {
            if ((!bs.b(aweme) && !bs.c(aweme)) || !com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, uri)) {
                return false;
            }
            if (!z) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, aweme, str2);
                return false;
            }
            if (com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, uri)) {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, aweme, str2);
            }
            return true;
        } else if (!bs.b(aweme) && !bs.c(aweme)) {
            return false;
        } else {
            if (com.ss.android.ugc.aweme.commercialize.utils.b.a.d(context, uri)) {
                if (!z) {
                    com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, aweme, str2);
                    return false;
                }
                if (com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, uri)) {
                    com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, aweme, str2);
                }
                return true;
            } else if (!(!l.a((Object) "sslocal", (Object) str)) || !(!l.a((Object) "localsdk", (Object) str))) {
                return false;
            } else {
                com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, aweme, str2);
                return true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(e eVar, String str) {
        ShareH5Service.a.a().a(((com.ss.android.ugc.aweme.bullet.module.base.f) eVar).f69449b, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(com.bytedance.ies.bullet.ui.common.b.c cVar, String str) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().a(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().a(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z, sSWebView);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(com.bytedance.ies.bullet.ui.common.b.c cVar, boolean z) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().a(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(String str, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        l.d(awemeRawAd, "");
        new aj.a().a(str).a(System.currentTimeMillis() - 5000).a(awemeRawAd).a();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(String str, boolean z) {
        com.ss.android.ugc.aweme.crossplatform.platform.a.a(str, z, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(String str, String str2, List<String> list) {
        return com.ss.android.newmedia.c.a(str, str2, list);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Activity activity) {
        return CrossPlatformLegacyServiceImpl.f().a(activity);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(androidx.fragment.app.e eVar, String str, String str2) {
        String str3;
        AwemeRawAd awemeRawAd;
        String str4;
        View findViewById;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        String str5 = "";
        l.d(eVar, str5);
        l.d(str, str5);
        l.d(str2, str5);
        l.d(eVar, str5);
        l.d(str, str5);
        l.d(str2, str5);
        AdPopUpWebPageHelper adPopUpWebPageHelper = AdPopUpWebPageHelper.f75490g.get(Integer.valueOf(eVar.hashCode()));
        if (adPopUpWebPageHelper == null) {
            adPopUpWebPageHelper = new AdPopUpWebPageHelper(eVar);
            AdPopUpWebPageHelper.f75490g.put(Integer.valueOf(eVar.hashCode()), adPopUpWebPageHelper);
        }
        l.d(str, str5);
        l.d(str2, str5);
        androidx.fragment.app.e b2 = adPopUpWebPageHelper.b();
        if (b2 != null) {
            androidx.fragment.app.e b3 = adPopUpWebPageHelper.b();
            if (b3 != null) {
                Aweme a2 = AdPopUpWebPageHelper.a();
                AwemeRawAd awemeRawAd5 = null;
                if (!TextUtils.isEmpty((a2 == null || (awemeRawAd4 = a2.getAwemeRawAd()) == null) ? null : awemeRawAd4.getSource())) {
                    Aweme a3 = AdPopUpWebPageHelper.a();
                    str3 = (a3 == null || (awemeRawAd3 = a3.getAwemeRawAd()) == null) ? null : awemeRawAd3.getSource();
                } else {
                    Aweme a4 = AdPopUpWebPageHelper.a();
                    if (a4 == null || (awemeRawAd = a4.getAwemeRawAd()) == null || (str3 = awemeRawAd.getWebTitle()) == null) {
                        str3 = str5;
                    }
                }
                AdPopUpWebPageWidget.a aVar = AdPopUpWebPageWidget.s;
                ac.a aVar2 = new ac.a();
                Aweme a5 = AdPopUpWebPageHelper.a();
                if (a5 == null || (awemeRawAd2 = a5.getAwemeRawAd()) == null || (str4 = awemeRawAd2.getWebUrl()) == null) {
                    str4 = str5;
                }
                ac.a a6 = aVar2.a(str4).a(b3);
                int b4 = hh.b();
                l.d(b3, str5);
                FrameLayout b5 = AdPopUpWebPageWidget.a.b(b3);
                if (b5 != null && b5.getId() == R.id.dl && (findViewById = b3.findViewById(R.id.a0l)) != null && findViewById.getPaddingTop() > 0) {
                    b4 = 0;
                }
                ac.a a7 = a6.a(b4);
                if (str3 != null) {
                    str5 = str3;
                }
                ac.a b6 = a7.b(str5);
                Bundle bundle = new Bundle();
                Aweme a8 = AdPopUpWebPageHelper.a();
                if (!(a8 == null || a8.getAwemeRawAd() == null)) {
                    d.a(bundle, AdPopUpWebPageHelper.a(), b3);
                    d.b(bundle, AdPopUpWebPageHelper.a(), b3);
                    d.c(bundle, AdPopUpWebPageHelper.a(), b3);
                    AdPopUpWebPageHelper.a();
                    d.a(bundle, b3);
                }
                ac.a a9 = b6.a(bundle);
                Aweme a10 = AdPopUpWebPageHelper.a();
                if (a10 != null) {
                    awemeRawAd5 = a10.getAwemeRawAd();
                }
                ac.a a11 = a9.a(awemeRawAd5);
                a11.f75560g = true;
                adPopUpWebPageHelper.f75494c = aVar.a(b3, a11.a(), adPopUpWebPageHelper.f75495d, adPopUpWebPageHelper.f75496e);
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageHelper.f75494c;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adPopUpWebPageHelper.f75497f);
                }
            }
            AdPopUpWebPageView adPopUpWebPageView2 = adPopUpWebPageHelper.f75494c;
            if (adPopUpWebPageView2 != null) {
                adPopUpWebPageView2.a(new AdPopUpWebPageHelper.c(adPopUpWebPageHelper, adPopUpWebPageView2, b2, str, str2, null));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Context context, String str, boolean z) {
        Aweme aweme;
        l.d(context, "");
        if (!z) {
            com.ss.android.ugc.aweme.commercialize.utils.k a2 = au.a();
            if (a2 != null) {
                aweme = a2.f75793m;
            } else {
                aweme = null;
            }
            if (n.a(context, aweme) || com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme)) {
                return true;
            }
        }
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean a(Context context, Aweme aweme) {
        return n.a(context, aweme);
    }

    static final class a extends m implements h.f.a.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73788a = new a();

        static {
            Covode.recordClassIndex(45415);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return i.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String b() {
        String str = com.ss.android.c.b.f59141e;
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void g() {
        k kVar = this.f73787a;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String a() {
        return String.valueOf(com.ss.android.ugc.aweme.app.application.b.f66649a);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean d() {
        l.b(com.ss.android.ugc.aweme.web.k.f145061a, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final List<Pattern> e() {
        List<Pattern> b2 = com.ss.android.ugc.aweme.web.l.b();
        l.b(b2, "");
        return h.a.n.g((Collection) b2);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final int n() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        return curUser.getAccountType();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(String str) {
        com.ss.android.ugc.aweme.lancet.b.a.b(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final CardStruct c(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.L(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(Activity activity) {
        l.d(activity, "");
        AdPopUpWebPageHelper.a.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c(Activity activity) {
        l.d(activity, "");
        ez.a(activity, 0);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c(com.bytedance.ies.bullet.ui.common.b.c cVar) {
        DownloadBusiness downloadBusiness;
        if ((cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) && (downloadBusiness = (DownloadBusiness) ((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z.a(DownloadBusiness.class)) != null) {
            downloadBusiness.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final Map<String, Object> a(com.bytedance.ies.bullet.ui.common.b.c cVar) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            return ShareH5Service.a.a().a(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z);
        }
        return ag.a();
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final List<com.bytedance.ies.bullet.c.c.a.k> b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        if (aVar != null) {
            com.ss.android.ugc.aweme.web.jsbridge.b bVar2 = new com.ss.android.ugc.aweme.web.jsbridge.b(aVar);
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openPanel", bVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openLightLandingPage", bVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "closeLightLandingPage", bVar2));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final List<com.bytedance.ies.bullet.c.c.a.k> c(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "closeLoading", new CloseWebViewLoadingMethod(aVar)));
        arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "closeJuStickerWindow", new CloseJuStickerWindowMethod(aVar)));
        arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "didFinishLoad", new DidLoadFinishMethod(aVar)));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(com.bytedance.ies.bullet.ui.common.b.c cVar) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().b(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final List<com.bytedance.ies.bullet.c.c.a.k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        Object c2 = bVar.c(Context.class);
        if (!(aVar == null || c2 == null)) {
            com.ss.android.ugc.aweme.web.jsbridge.a aVar2 = new com.ss.android.ugc.aweme.web.jsbridge.a(new WeakReference(c2));
            l.d(aVar, "");
            aVar2.f144962a = aVar.f35513d.hashCode();
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "cardClick", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "cardStatus", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "closeCardDialog", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openHalfScreenForm", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "callNativePhone", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "download_click", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "setCard", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "closeAdModal", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "modalInteractionURL", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "showModalPage", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "setModalSize", aVar2));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "cardInteriorShow", aVar2));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean c(String str) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(WebView webView) {
        com.ss.android.newmedia.a.b.a(webView);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(Context context, WebView webView) {
        com.ss.android.newmedia.a.b.a(context, webView);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final int a(String str, String str2) {
        return f.f66130b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String a(String str, int i2) {
        return com.ss.android.ugc.aweme.crossplatform.a.b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String b(String str, String str2) {
        IAdLandPagePreloadService f2;
        if (TextUtils.isEmpty(str) || (f2 = AdLandPagePreloadServiceImpl.f()) == null) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return dc.b(f2.g(str2), str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final String d(String str, String str2) {
        if (l.a((Object) "sslocal", (Object) str) || l.a((Object) "localsdk", (Object) str)) {
            return com.ss.android.newmedia.b.a.a(str2);
        }
        return str2;
    }

    static final class b extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ String $adId;
        final /* synthetic */ String $groupId;

        static {
            Covode.recordClassIndex(45416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(2);
            this.$groupId = str;
            this.$adId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            Long l2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                bVar2.f74807d = this.$groupId;
                return bVar2;
            }
            String str = this.$adId;
            if (str != null) {
                l2 = p.g(str);
            } else {
                l2 = null;
            }
            return bVar2.c(l2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView) {
        DownloadBusiness downloadBusiness;
        if ((cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) && (downloadBusiness = (DownloadBusiness) ((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z.a(DownloadBusiness.class)) != null) {
            downloadBusiness.a(sSWebView);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().b(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z, sSWebView);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c(String str, String str2) {
        h.h a2 = h.i.a((h.f.a.a) a.f73788a);
        i iVar = (i) a2.getValue();
        if (iVar != null) {
            iVar.b();
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            if (!TextUtils.isEmpty(str)) {
                String g2 = f2.g("feed");
                if (!TextUtils.isEmpty(g2)) {
                    String a3 = com.ss.android.ugc.aweme.web.k.f145061a.a(g2);
                    l.b(a3, "");
                    ((i) a2.getValue()).a(new com.ss.android.ugc.aweme.web.a(a3, str, "feed"));
                }
                String g3 = f2.g("splash");
                if (!TextUtils.isEmpty(g3)) {
                    String a4 = com.ss.android.ugc.aweme.web.k.f145061a.a(g3);
                    l.b(a4, "");
                    ((i) a2.getValue()).a(new com.ss.android.ugc.aweme.web.a(a4, str, "splash"));
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                String g4 = f2.g("lynx_feed");
                if (!TextUtils.isEmpty(g4)) {
                    String a5 = com.ss.android.ugc.aweme.web.k.f145061a.a(g4);
                    l.b(a5, "");
                    ((i) a2.getValue()).a(new com.ss.android.ugc.aweme.web.a(a5, str2, "lynx_feed"));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(Activity activity, String str) {
        Aweme d2 = AwemeService.b().d(str);
        IReportService a2 = com.ss.android.ugc.aweme.compliance.api.a.a();
        l.b(d2, "");
        a2.a(com.ss.android.ugc.aweme.report.b.a(d2, "homepage_hot"));
        com.ss.android.ugc.aweme.compliance.api.a.a().b(activity, com.ss.android.ugc.aweme.report.b.a(d2, "landing_page", "ad"));
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(com.bytedance.ies.bullet.ui.common.b.c cVar, String str) {
        if (cVar instanceof com.ss.android.ugc.aweme.bullet.module.base.b) {
            ShareH5Service.a.a().b(((com.ss.android.ugc.aweme.bullet.module.base.a) cVar).z, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void c(String str, boolean z) {
        com.ss.android.ugc.aweme.crossplatform.platform.a.c(str, z, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void b(String str, boolean z) {
        com.ss.android.ugc.aweme.crossplatform.platform.a.b(str, z, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean b(Activity activity, String str) {
        return CrossPlatformLegacyServiceImpl.f().a((Context) activity, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final boolean b(Context context, String str) {
        return com.ss.android.newmedia.b.a.b(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(int i2, int i3, Intent intent) {
        com.ss.android.sdk.a.a aVar = new com.ss.android.sdk.a.a();
        aVar.f60128a = i2;
        aVar.f60129b = i3;
        aVar.f60130c = intent;
        com.ss.android.ugc.d.a.c.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(Activity activity, String str, long j2) {
        Aweme d2 = AwemeService.b().d(str);
        if (d2 != null) {
            com.ss.android.ugc.aweme.compliance.api.a.a().b(activity, com.ss.android.ugc.aweme.report.b.a(d2, "live_ad", j2, "ad"));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.b.c
    public final void a(Context context, View view, j jVar) {
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(context, view, jVar);
        }
    }
}
