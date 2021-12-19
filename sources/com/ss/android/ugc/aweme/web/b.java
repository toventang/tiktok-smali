package com.ss.android.ugc.aweme.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.f;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o.b;
import com.bytedance.ies.xbridge.platform.b.b;
import com.ss.android.newmedia.d;
import com.ss.android.sdk.webview.c;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.attribution.AppsFlyerAttributionMethod;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.ss.android.ugc.aweme.discover.ui.GetABTest;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.fe.method.AddAnchorEventMethod;
import com.ss.android.ugc.aweme.fe.method.AppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.BdturingMethod;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.fe.method.ChooseArticleInfoMethod;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.aweme.fe.method.ClosePopUpWebPageMethod;
import com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod;
import com.ss.android.ugc.aweme.fe.method.DarkModeMethod;
import com.ss.android.ugc.aweme.fe.method.DisableGestureClose;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.FestivalShareMethod;
import com.ss.android.ugc.aweme.fe.method.GetContainerIdMethod;
import com.ss.android.ugc.aweme.fe.method.GetMicroAppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.GetSettingsMethod;
import com.ss.android.ugc.aweme.fe.method.GetWebViewInfo;
import com.ss.android.ugc.aweme.fe.method.HasFeedbackMethod;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.aweme.fe.method.JumpToLiveMethod;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod;
import com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.LoadGeckoResourcesMethod;
import com.ss.android.ugc.aweme.fe.method.LoginMethod;
import com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod;
import com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod;
import com.ss.android.ugc.aweme.fe.method.OnBackPressedMethod;
import com.ss.android.ugc.aweme.fe.method.OpenAdLandPageLinksMethod;
import com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod;
import com.ss.android.ugc.aweme.fe.method.OpenCalendarMethod;
import com.ss.android.ugc.aweme.fe.method.OpenConversationMethod;
import com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.fe.method.OpenPDFMethod;
import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod;
import com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod;
import com.ss.android.ugc.aweme.fe.method.PayMethod;
import com.ss.android.ugc.aweme.fe.method.PreparePayMethod;
import com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod;
import com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission;
import com.ss.android.ugc.aweme.fe.method.RequestPermissionMethod;
import com.ss.android.ugc.aweme.fe.method.RoutePopMethod;
import com.ss.android.ugc.aweme.fe.method.RoutePushMethod;
import com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogV3Method;
import com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.ShareRankMethod;
import com.ss.android.ugc.aweme.fe.method.ShowDmtToastMethod;
import com.ss.android.ugc.aweme.fe.method.ShowToastMethod;
import com.ss.android.ugc.aweme.fe.method.TokenShareMethod;
import com.ss.android.ugc.aweme.fe.method.UpdateAppVersionMethod;
import com.ss.android.ugc.aweme.fe.method.UpdateKProjectStateMethod;
import com.ss.android.ugc.aweme.fe.method.UploadContactsMethod;
import com.ss.android.ugc.aweme.fe.method.UserInfoMethod;
import com.ss.android.ugc.aweme.fe.method.cjpay.CJModalViewMethod;
import com.ss.android.ugc.aweme.fe.method.cjpay.CJOpenH5Method;
import com.ss.android.ugc.aweme.fe.method.cjpay.CJPrefetchMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.OpenECommerceLegalModalMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.OpenGoodDetailMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod;
import com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod;
import com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.net.h;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.specact.pendant.bridge.SpecActFollowMethod;
import com.ss.android.ugc.aweme.specact.pendant.bridge.SyncWatchedVideoTimeMethod;
import com.ss.android.ugc.aweme.specact.popup.calendar.CheckCalendarExistMethod;
import com.ss.android.ugc.aweme.specact.popup.calendar.CreateCalendarEventMethod;
import com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.ss.android.ugc.aweme.web.jsbridge.CopyMethod;
import com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod;
import com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod;
import com.ss.android.ugc.aweme.web.jsbridge.ShowOpenAuthHalf;
import com.ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import com.ss.android.ugc.aweme.web.jsbridge.aa;
import com.ss.android.ugc.aweme.web.jsbridge.ab;
import com.ss.android.ugc.aweme.web.jsbridge.ac;
import com.ss.android.ugc.aweme.web.jsbridge.ad;
import com.ss.android.ugc.aweme.web.jsbridge.m;
import com.ss.android.ugc.aweme.web.jsbridge.r;
import com.ss.android.ugc.aweme.web.jsbridge.u;
import com.ss.android.ugc.aweme.web.jsbridge.v;
import com.ss.android.ugc.aweme.web.jsbridge.w;
import com.ss.android.ugc.aweme.web.jsbridge.x;
import com.ss.android.ugc.aweme.web.jsbridge.y;
import com.ss.android.ugc.aweme.web.jsbridge.z;
import h.a.ag;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b extends i implements f {
    public k A;
    private g B;
    private final a.c C = new a.c() {
        /* class com.ss.android.ugc.aweme.web.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(94734);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            if (r0 != 0) goto L_0x0057;
         */
        @Override // com.ss.android.ugc.aweme.web.jsbridge.a.a.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.web.jsbridge.a.a.b r6, com.ss.android.ugc.aweme.web.jsbridge.a.a.d r7) {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.b.AnonymousClass3.a(com.ss.android.ugc.aweme.web.jsbridge.a.a$b, com.ss.android.ugc.aweme.web.jsbridge.a.a$d):void");
        }
    };

    static {
        Covode.recordClassIndex(94731);
    }

    @Override // com.ss.android.sdk.webview.a
    public final boolean b() {
        if (!a.C2792a.f108997a.f108996a.enableBoe() || !a.C2792a.f108997a.f108996a.enableBoeJsbBypass()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.sdk.webview.a
    public final List<String> a() {
        super.a();
        this.f60156d.add("sendLog");
        this.f60156d.add("openSchoolEdit");
        this.f60156d.add("formDialogClose");
        this.f60156d.add("openSchoolEdit");
        this.f60156d.add("orderResult");
        this.f60156d.add("sendAnalyticsEvent");
        return this.f60156d;
    }

    @Override // com.ss.android.sdk.webview.k
    public final void a(k kVar) {
        this.A = kVar;
    }

    @Override // com.ss.android.ugc.aweme.web.i
    public final void a(g gVar) {
        this.B = gVar;
    }

    @Override // com.ss.android.ugc.aweme.web.f
    public final void c(String str) {
        g gVar = this.B;
        if (gVar != null) {
            gVar.a(str);
        }
    }

    public b(Context context) {
        super(context);
    }

    @Override // com.ss.android.sdk.webview.a, com.ss.android.sdk.webview.a.b.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        if (TextUtils.equals(this.o, "1")) {
            TextUtils.isEmpty(this.p);
        }
    }

    @Override // com.ss.android.sdk.webview.a
    public final boolean a(String str) {
        String str2;
        int indexOf;
        if (!d.a(str)) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                str2 = Uri.parse(str).getHost();
            } else {
                str2 = Uri.parse(str.substring(0, indexOf)).getHost();
            }
            if (str2 == null) {
                return false;
            }
            if (h.a(str2, "host")) {
                return true;
            }
            return super.a(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.sdk.webview.a
    public final List<String> a(List<String> list, boolean z) {
        this.f60158f = h.a(list, z);
        return this.f60158f;
    }

    @Override // com.ss.android.sdk.webview.a
    public final void b(final e eVar, c cVar) {
        int i2;
        Map<String, com.bytedance.ies.web.a.d> map;
        WeakReference weakReference = this.f60155c;
        com.bytedance.ies.xbridge.model.b.c cVar2 = new com.bytedance.ies.xbridge.model.b.c();
        cVar2.a(com.bytedance.ies.web.a.a.class, eVar.f60185b);
        cVar2.a(Context.class, weakReference.get());
        cVar2.b(b.d.class, new b.d() {
            /* class com.ss.android.ugc.aweme.web.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94732);
            }

            @Override // com.bytedance.ies.xbridge.b.d
            public final void a(String str, n nVar) {
                JSONObject jSONObject = new JSONObject();
                if (nVar != null) {
                    jSONObject = com.bytedance.ies.xbridge.o.c.a(nVar);
                }
                eVar.a(str, jSONObject);
            }
        });
        com.ss.android.ugc.aweme.i18n.xbridge.b.a.a();
        com.ss.android.ugc.aweme.i18n.xbridge.c.a.a();
        AnonymousClass2 r6 = new com.bytedance.ies.xbridge.platform.b.a.a() {
            /* class com.ss.android.ugc.aweme.web.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94733);
            }

            @Override // com.bytedance.ies.xbridge.platform.b.a.a
            public final Object a(String str, com.bytedance.ies.web.a.d dVar) {
                return eVar.a(str, dVar);
            }

            @Override // com.bytedance.ies.xbridge.platform.b.a.a
            public final void a(String str, JSONObject jSONObject) {
                com.bytedance.ies.web.a.a aVar = eVar.f60185b;
                if (aVar != null) {
                    aVar.a(str, jSONObject);
                }
            }
        };
        l.c(r6, "");
        com.bytedance.ies.xbridge.e eVar2 = com.bytedance.ies.xbridge.e.WEB;
        l.c(eVar2, "");
        f fVar = new f();
        Map map2 = com.bytedance.ies.xbridge.a.a(eVar2, "DEFAULT");
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                fVar.a((String) entry.getKey(), new b.a(entry, fVar, eVar2, cVar2));
            }
        }
        com.bytedance.ies.xbridge.platform.b.b bVar = (com.bytedance.ies.xbridge.platform.b.b) com.bytedance.ies.xbridge.a.a(com.bytedance.ies.xbridge.platform.b.b.class);
        if (bVar != null) {
            l.c(r6, "");
            l.c(fVar, "");
            for (Map.Entry entry2 : ag.c(fVar.a().f35944a).entrySet()) {
                r6.a((String) entry2.getKey(), new b.a(bVar, r6, fVar));
            }
        }
        eVar.a("fission_withdrawal", new com.ss.android.ugc.aweme.shortcut.a.a.a());
        com.bytedance.ies.web.a.a aVar = eVar.f60185b;
        eVar.a("close", new CloseMethod(aVar).attach(this.f60155c)).a("userInfo", new UserInfoMethod(aVar).attach(this.f60155c)).a("darkMode", new DarkModeMethod(aVar).attach(this.f60155c)).a("updateAppVersion", new UpdateAppVersionMethod(aVar).attach(this.f60155c)).a("addAnchor", new AddAnchorEventMethod(aVar).attach(this.f60155c)).a("sendLog", new SendLogMethod(aVar).attach(this.f60155c)).a("sendLogV3", new SendLogV3Method(aVar).attach(this.f60155c)).a("openSchema", new OpenSchemaMethod(aVar).attach(this.f60155c)).a("x.openPDF", new OpenPDFMethod(aVar).attach(this.f60155c)).a(ShareH5Service.a.a().a(), ShareH5Service.a.a().b(aVar).attach(this.f60155c)).a(ShareH5Service.a.a().b(), ShareH5Service.a.a().c(aVar).attach(this.f60155c)).a(ShareH5Service.a.a().c(), ShareH5Service.a.a().a(aVar).attach(this.f60155c)).a("showToast", new ShowToastMethod(aVar).attach(this.f60155c)).a("openBrowser", new OpenBrowserMethod(aVar).attach(this.f60155c)).a("CJPrefetch", new CJPrefetchMethod(aVar).attach(this.f60155c)).a("CJModalView", new CJModalViewMethod(aVar).attach(this.f60155c)).a("CJOpen", new CJOpenH5Method(aVar).attach(this.f60155c)).a("appInfo", new AppInfoMethod(aVar).attach(this.f60155c)).a("componentDidMount", new ComponentDidMountMethod(aVar).attach(this.f60155c)).a("componentDidMount", new ComponentDidMountMethod(aVar).attach(this.f60155c)).a("routePush", new RoutePushMethod(aVar).attach(cVar)).a("open_short_video", new OpenShortVideoMethod(aVar).attach(this.f60155c)).a("open_long_video", new OpenLongVideoMethod(aVar).attach(this.f60155c)).a("openFeedsFlow", new OpenFeedsFlowMethod(aVar).attach(this.f60155c)).a("openAwemeDetail", new OpenAwemeDetailMethod(aVar).attach(this.f60155c)).a("loadFeeds", new LoadFeedsMethod(aVar).attach(this.f60155c)).a("loadFeedsFlow", new LoadFeedsFlowMethod(aVar).attach(this.f60155c)).a("downloadMedia", new DownloadFileMethod(aVar).attach(this.f60155c)).a("publishMedia", new VideoPublishMethod(aVar).attach(this.f60155c)).a("routePop", new RoutePopMethod(aVar).attach(cVar)).a("getContainerId", new GetContainerIdMethod(aVar).attach(cVar)).a("openAdLandPageLinks", new OpenAdLandPageLinksMethod(aVar).attach(cVar)).a("closePopUpWebPage", new ClosePopUpWebPageMethod(aVar).attach(cVar)).a("loadGeckoResources", new LoadGeckoResourcesMethod(aVar).attach(cVar)).a("calendarOperation", new OpenCalendarMethod(aVar).attach(this.f60155c)).a("popTuringVerifyView", new BdturingMethod(aVar).attach(this.f60155c)).a("reportCustomEvent", new ReportCustomEventMethod(aVar).attach(cVar));
        new com.ss.android.ugc.aweme.web.a.a(aVar, eVar, this.f60155c);
        com.bytedance.ies.web.a.a aVar2 = eVar.f60185b;
        com.bytedance.ies.web.a.d attach = new JsAppDownloadMethod(aVar2).attach(this.f60155c);
        eVar.a("login", new LoginMethod(aVar2, false).attach(this.f60155c)).a("loginWithPlatform", new LoginMethod(aVar2, true).attach(this.f60155c)).a("apiParam", new com.ss.android.ugc.aweme.web.jsbridge.c()).a("openAweme", new com.ss.android.ugc.aweme.web.jsbridge.e(this.f60155c, aVar2)).a("openRecord", new aa(this.f60155c, aVar2)).a("publishVideo", new y(this.f60155c)).a("bindPhone", new com.ss.android.ugc.aweme.web.jsbridge.f(aVar2, this.f60155c)).a("enterUserFeed", new EnterUserPostFeedsMethod(aVar2).attach(this.f60155c)).a("noticePermission", new NoticePermissionMethod(aVar2).attach(this.f60155c)).a("fetch", new r(aVar2, this.C)).a("openSysDialog", new x(this.f60155c, aVar2)).a("uploadFile", new com.ss.android.ugc.aweme.fe.method.e(this.f60155c, aVar2)).a("downloadApp", new com.ss.android.ugc.aweme.web.jsbridge.n(this.f60155c)).a("stickGame", new ab()).a("formDialogClose", new com.ss.android.ugc.aweme.web.jsbridge.l()).a("dpDisableGestureClose", new DisableGestureClose(aVar2)).a("subscribe_app_ad", attach).a("unsubscribe_app_ad", attach).a("download_app_ad", attach).a("cancel_download_app_ad", attach).a("download_order", attach).a("ad_download_list", attach).a("get_download_pause_task", attach).a("get_downloading_task", attach).a("get_install_status", attach).a("accountLogout", new u()).a("launchChat", new LaunchChatMethod().attach(this.f60155c)).a("showDmtToast", new ShowDmtToastMethod().attach(this.f60155c)).a("receiveCoupon", new z()).a("getThirdLoginToken", new OpenThirdLoginVerifyMethod(aVar2).attach(this.f60155c)).a("scan", new v(this.f60155c)).a("copy", new CopyMethod(this.f60153a.f60185b, this.f60155c)).a("gallery", new GalleryPreviewMethod(aVar2).attach(this.f60155c)).a("openSchoolEdit", new w(this.f60155c)).a("broadcast", new BroadcastMethod(aVar2).attach(this.f60155c)).a("openLiveRoom", new LiveMethod(this.f60155c, aVar2)).a("setNativeItem", new SetNativeItemMethod(aVar2)).a("getNativeItem", new GetNativeItemMethod(aVar2)).a("getABTestParams", new GetABTest(aVar2)).a("getSettings", new GetSettingsMethod(aVar2)).a("captureWebView", new com.ss.android.ugc.aweme.web.jsbridge.h(this.f60155c, aVar2)).a("isAppInstall", new IsAppInstalledMethod(aVar2)).a("shareRank", new ShareRankMethod(aVar2).attach(this.f60155c)).a("appSetting", new ad(this.f60155c, aVar2)).a("closeKrCopyright", new m()).a("miniGamePayResult", new com.ss.android.ugc.aweme.web.jsbridge.k(this.f60155c)).a("uploadALog", new FeedbackUploadALog(aVar2)).a("monitorLog", new MonitorLogMethod()).a("mpinfo", new GetMicroAppInfoMethod(aVar2)).a("setTitle", new RefreshNavTitleMethod(this).attach(this.f60155c)).a("jumpToLive", new JumpToLiveMethod()).a("chooseArticleWithInfo", new ChooseArticleInfoMethod(aVar2).attach(this.f60155c)).a("updateNavBar", new UpdateNavBarMethod()).a("fileSelection", new com.ss.android.ugc.aweme.fe.method.c(this.f60155c, aVar2)).a("internationalRegionalSelection", new com.ss.android.ugc.aweme.fe.method.d(this.f60155c)).a("preloadMiniApp", new MiniAppPreloadMethod().attach(this.f60155c)).a("tokenShare", new TokenShareMethod().attach(this.f60155c)).a("donationShare", new FestivalShareMethod(aVar2).attach(this.f60155c)).a("onBackPressed", new OnBackPressedMethod(aVar2).attach(this.f60155c)).a("requestPermission", new RequestPermissionMethod(aVar2).attach(this.f60155c)).a("preparePay", new PreparePayMethod(aVar2).attach(this.f60155c)).a("uploadAddressBook", new UploadContactsMethod(aVar2).attach(this.f60155c)).a("updateCampaginKStatus", new UpdateKProjectStateMethod(aVar2).attach(this.f60155c)).a("requestAddressBookPermission", new RequestAddressBookPermission(aVar2).attach(this.f60155c)).a("choosePhoneArea", new OpenPhoneAreaMethod(aVar2).attach(this.f60155c)).a("shareWebToChat", new ShareWebToChatMethod(aVar2)).a("syncWatchVideoTime", new SyncWatchedVideoTimeMethod(aVar2).attach(this.f60155c)).a("syncSpecActFollowStatus", new SpecActFollowMethod(aVar2).attach(this.f60155c)).a("hasFeedback", new HasFeedbackMethod(aVar2).attach(this.f60155c)).a("appsflyer_attribution", new AppsFlyerAttributionMethod(aVar2).attach(this.f60155c)).a("createCalendarEvent", new CreateCalendarEventMethod(aVar2).attach(this.f60155c)).a("isCalendarEventExist", new CheckCalendarExistMethod(aVar2).attach(this.f60155c)).a("sendAnalyticsEvent", new SendAnalyticsEventMethod(aVar2).attach(this.f60155c));
        com.bytedance.ies.web.jsbridge2.x xVar = eVar.f60187d;
        if (xVar != null) {
            xVar.a("testSecure", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ac());
        }
        eVar.a("openConversation", new OpenConversationMethod(eVar.f60185b).attach(this.f60155c));
        com.bytedance.ies.web.a.a aVar3 = eVar.f60185b;
        eVar.a("launchWXMiniPro", new WXMiniPayMethod(aVar3).attach(this.f60155c)).a("pay", new PayMethod(aVar3).attach(this.f60155c)).a("asyncGoodsEditInfo", new AsyncGoodsEditInfoMethod().attach(this.f60155c)).a("fetchTaoCommand", new TaoCommandMethod(aVar3).attach(this.f60155c)).a("purchasePlatformGoods", new OpenGoodDetailMethod().attach(this.f60155c)).a("openECommerceLegalModal", new OpenECommerceLegalModalMethod().attach(this.f60155c)).a("fetchFeedsAwemeData", new FetchFeedsAwemeDataMethod().attach(this.f60155c));
        ECommerceLiveBridgeMethodServiceImpl.a().a(eVar, this.f60155c);
        com.ss.android.ugc.aweme.web.jsbridge.a aVar4 = new com.ss.android.ugc.aweme.web.jsbridge.a(this.f60155c);
        l.d(eVar, "");
        eVar.a("getPageData", aVar4).a("cardClick", aVar4).a("cardStatus", aVar4).a("closeCardDialog", aVar4).a("openHalfScreenForm", aVar4).a("callNativePhone", aVar4).a("download_click", aVar4).a("setCard", aVar4).a("closeAdModal", aVar4).a("modalInteractionURL", aVar4).a("showModalPage", aVar4).a("setModalSize", aVar4).a("cardInteriorShow", aVar4).a("getLiveRoomInfo", aVar4).a("dontCloseMaskOnResume", aVar4);
        aVar4.f144962a = eVar.f60192i.hashCode();
        eVar.a("closeLoading", new CloseWebViewLoadingMethod(eVar.f60185b)).a("closeJuStickerWindow", new CloseJuStickerWindowMethod(eVar.f60185b)).a("didFinishLoad", new DidLoadFinishMethod(eVar.f60185b)).a("sendThirdTrack", new AdThirdTrackMethod(eVar.f60185b)).a("getWebViewInfo", new GetWebViewInfo(eVar.f60185b)).a("openRechargePanel", new OpenRechargePanel(eVar.f60185b).attach(this.f60155c)).a("openPanel", new com.ss.android.ugc.aweme.web.jsbridge.b(eVar.f60185b)).a("openLightLandingPage", new com.ss.android.ugc.aweme.web.jsbridge.b(eVar.f60185b)).a("closeLightLandingPage", new com.ss.android.ugc.aweme.web.jsbridge.b(eVar.f60185b));
        if (this.f60155c != null) {
            WeakReference weakReference2 = this.f60155c;
            l.d(weakReference2, "");
            l.d(eVar, "");
            new AdCommonJsMethod(weakReference2, eVar, (byte) 0);
        }
        com.ss.android.ugc.aweme.live.c d2 = LiveOuterService.s().d();
        if (d2 != null) {
            i2 = 5;
            map = d2.a(this.f60155c, eVar.f60185b);
        } else {
            i2 = 4;
            map = null;
        }
        com.bytedance.apm.b.a("ttlive_wallet_to_live", i2, (JSONObject) null);
        if (map != null) {
            for (Map.Entry<String, com.bytedance.ies.web.a.d> entry3 : map.entrySet()) {
                eVar.a(entry3.getKey(), entry3.getValue());
            }
        }
        eVar.a("dpShowResult", new DouplusShowResultMethod().attach(this.f60155c));
        Map<String, com.bytedance.ies.web.a.d> javaMethods = com.ss.android.ugc.aweme.account.b.h().getJavaMethods(this.f60155c, eVar.f60185b);
        if (javaMethods != null) {
            for (Map.Entry<String, com.bytedance.ies.web.a.d> entry4 : javaMethods.entrySet()) {
                eVar.a(entry4.getKey(), entry4.getValue());
            }
        }
        com.bytedance.ies.web.a.a aVar5 = eVar.f60185b;
        eVar.a("showOpenAuth", new ShowOpenAuthHalf(aVar5).attach(cVar).attach(this.f60155c)).a("jumpOpenAuthPage", new OpenAuthPageMethod(aVar5).attach(cVar).attach(this.f60155c)).a("shareOpenPlatform", new ShareOpenPlatformMethod(aVar5).attach(cVar).attach(this.f60155c));
        eVar.a("componentDidMount", new ComponentDidMountMethod(eVar.f60185b));
        com.ss.android.ugc.aweme.search.h.f121133a.a(eVar, this.f60155c);
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).addJSMethods(eVar, this.f60155c);
    }
}
