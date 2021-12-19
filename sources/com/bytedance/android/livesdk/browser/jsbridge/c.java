package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.browser.c.a;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.jsbridge.d.d;
import com.bytedance.android.livesdk.browser.jsbridge.d.f;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.LiveOpenFirstRechargeDialogMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SendRedEnvelopSuccessMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.af;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ah;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.al;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.am;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.an;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ao;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ap;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ar;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.as;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.at;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.az;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ba;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bd;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ca;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.cb;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.i;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.n;
import com.bytedance.android.livesdk.livesetting.hybrid.JsbEnablePermissionCheckSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableXBridgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveJsbEnableHostSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveJsbAllowedListSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.l;
import com.bytedance.ies.web.jsbridge2.o;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.ies.web.jsbridge2.y;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class c implements a, b {

    /* renamed from: d  reason: collision with root package name */
    private static List<String> f14448d;

    /* renamed from: e  reason: collision with root package name */
    private static List<String> f14449e;

    /* renamed from: a  reason: collision with root package name */
    int f14450a;

    /* renamed from: b  reason: collision with root package name */
    public x f14451b;

    /* renamed from: c  reason: collision with root package name */
    public y f14452c;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f14453f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f14454g;

    /* renamed from: h  reason: collision with root package name */
    private String f14455h;

    static {
        Covode.recordClassIndex(8007);
    }

    @Override // com.bytedance.android.livesdk.browser.c.a
    public final x a() {
        return this.f14451b;
    }

    @Override // com.bytedance.android.livesdk.browser.c.a
    public final y c() {
        return this.f14452c;
    }

    @Override // com.bytedance.android.livesdk.browser.c.b
    public final String d() {
        return this.f14455h;
    }

    @Override // com.bytedance.android.livesdk.browser.c.a
    public final void b() {
        this.f14451b.a();
        this.f14452c.f35719a.a();
    }

    public static List<String> e() {
        List<String> list = f14448d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f14448d = arrayList;
        arrayList.add("tiktokv.com");
        f14448d.add("tiktok.com");
        f14448d.add("s16a.tiktokcdn.com");
        String[] value = LiveJsbAllowedListSetting.INSTANCE.getValue();
        if (value.length > 0) {
            for (String str : value) {
                if (!f14448d.contains(str)) {
                    f14448d.add(str);
                }
            }
        }
        k kVar = (k) com.bytedance.android.live.t.a.a(k.class);
        if (kVar != null) {
            f14448d.addAll(kVar.a());
        }
        return f14448d;
    }

    private static List<String> f() {
        List<String> list = f14449e;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f14449e = arrayList;
        arrayList.add("config");
        f14449e.add("login");
        f14449e.add("logout");
        f14449e.add("close");
        f14449e.add("gallery");
        f14449e.add("toggleGalleryBars");
        f14449e.add("slideShow");
        f14449e.add("relatedShow");
        f14449e.add("toast");
        f14449e.add("slideDownload");
        f14449e.add("requestChangeOrientation");
        f14449e.add("adInfo");
        return f14449e;
    }

    @Override // com.bytedance.android.livesdk.browser.c.a
    public final void a(String str) {
        this.f14455h = str;
    }

    public final <T> void a(String str, T t) {
        this.f14451b.a(str, (Object) t);
    }

    public static c a(Activity activity, final com.bytedance.ies.web.jsbridge2.b bVar) {
        AnonymousClass2 r2 = new com.bytedance.ies.web.jsbridge2.a() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8009);
            }

            @Override // com.bytedance.ies.web.jsbridge2.a
            public final View a() {
                return bVar.b();
            }
        };
        l lVar = new l(r2);
        lVar.f35677f = activity;
        lVar.f35674c = bVar;
        l a2 = lVar.a(new o() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(8010);
            }

            @Override // com.bytedance.ies.web.jsbridge2.o
            public final <T> String a(T t) {
                if (t instanceof com.google.gson.o) {
                    return t.toString();
                }
                if (t instanceof String) {
                    return t.toString();
                }
                return e.a.f9628b.b(t);
            }

            @Override // com.bytedance.ies.web.jsbridge2.o
            public final <T> T a(String str, Type type) {
                return (T) e.a.f9628b.a(str, type);
            }
        });
        a2.f35678g = false;
        a2.f35679h = true;
        l a3 = a2.a(e());
        a3.f35680i = JsbEnablePermissionCheckSetting.INSTANCE.getValue();
        a3.f35683l = "webcast";
        l b2 = a3.b(new com.bytedance.android.livesdk.browser.e.a(r2));
        b2.f35675d = "ToutiaoJSBridge";
        if (TextUtils.equals(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel(), "local_test")) {
            b2.p = true;
        }
        x d2 = b2.d();
        c cVar = new c(activity, d2, y.a((WebView) null, d2), 1);
        com.bytedance.android.livesdk.browser.g.a.a(cVar);
        return cVar;
    }

    public static c a(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        x xVar;
        l a2 = x.a(webView);
        a2.f35677f = activity;
        l a3 = a2.a(new o() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8008);
            }

            @Override // com.bytedance.ies.web.jsbridge2.o
            public final <T> String a(T t) {
                return e.a.f9628b.b(t);
            }

            @Override // com.bytedance.ies.web.jsbridge2.o
            public final <T> T a(String str, Type type) {
                return (T) e.a.f9628b.a(str, type);
            }
        });
        a3.f35678g = false;
        a3.f35679h = true;
        l b2 = a3.a(e()).b(new com.bytedance.webx.monitor.a.a(webView));
        b2.f35683l = "webcast";
        b2.f35675d = "ToutiaoJSBridge";
        x d2 = b2.d();
        y a4 = y.a(webView, d2).b("bytedance").a(webViewClient).a(webChromeClient).b(e()).a(f());
        if (LiveJsbEnableHostSetting.INSTANCE.getValue() && (xVar = (x) ((k) com.bytedance.android.live.t.a.a(k.class)).a(activity, d2)) != null) {
            d2.a("host", xVar);
        }
        c cVar = new c(activity, d2, a4, 0);
        com.bytedance.android.livesdk.browser.g.a.a(cVar);
        return cVar;
    }

    private c(Activity activity, x xVar, y yVar, int i2) {
        this.f14454g = activity;
        this.f14453f = new WeakReference<>(activity);
        this.f14451b = xVar;
        this.f14452c = yVar;
        this.f14450a = i2;
        f fVar = new f(this.f14453f, this);
        x xVar2 = this.f14451b;
        xVar2.f35714e = this.f14452c;
        xVar2.a("appInfo", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.f()).a("getXTtToken", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ad()).a("userInfo", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ca()).a("apiParam", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.e()).a("toast", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ToastMethod()).a("sendRedEnvelopSuccess", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new SendRedEnvelopSuccessMethod()).a("sendLogV3", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new bc()).a("sendLogV1", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new bd()).a("sendMonitor", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new am()).a("setBannerVisibility", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new h()).a("baseInfo", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new i()).a("close", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new n(this.f14454g)).a("getLiveHouseRoomStatus", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new al()).a("isTeenMode", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new af()).a("sendPokemon", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ah()).a("statusNotification", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new an()).a("sendGift", d.f14457a).a("payPanel", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new as()).a("registerMessage", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new az()).a("cashdesk", e.f14476a).a("liveLoading", p.f14808a).a("iapForSubscription", q.f14809a).a("openStoreSubscribePage", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ar()).a("userAction", r.f14810a).a("fetch", (e.b) new s(this)).a("fetchPb", t.f14812a).a("app.showModal", u.f14813a).a("login", v.f14814a).a("setFansStatus", w.f14815a).a("lotteryAction", f.f14477a).a("dialog", g.f14478a).a(UGCMonitor.EVENT_COMMENT, h.f14479a).a("downloadMediaToSystem", i.f14480a).a("openFirstRechargeDialog", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new LiveOpenFirstRechargeDialogMethod()).a("saveLocalData", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ba()).a("openKoiRedpacket", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ap()).a("addRedDot", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.a()).a("viewController", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new g()).a("notifyBoxOpened", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ao()).a("copyToClipboard", j.f14481a).a("liveOpenExchangeCoinsDialog", k.f14482a).a("uploadImage", l.f14483a).a("webviewNavigation", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new cb(this.f14451b.f35712c)).a("openRegionListPage", m.f14484a).a("getLinkMicStatus", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ae()).a("webviewNavigation", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new cb(this.f14451b.f35712c)).a("prefetchSchema", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new at()).a("queryCachedGifts", n.f14485a).a("linkMicWithAnchor", o.f14807a);
        if (LiveEnableXBridgeSetting.INSTANCE.getValue()) {
            x.a(this.f14454g, this.f14451b, this.f14450a);
        }
        this.f14451b.a("setStorage", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ag.c()).a("getStorage", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ag.a()).a("removeStorage", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new ag.b());
        this.f14452c.a("openHotsoon", fVar).a("openLive", fVar).a("userStatusChange", new com.bytedance.android.livesdk.browser.jsbridge.d.i()).a("livePay", new d(this.f14453f)).a("startLive", new com.bytedance.android.livesdk.browser.jsbridge.d.a.b(this.f14453f)).a("liveCashVerify", new com.bytedance.android.livesdk.browser.jsbridge.d.b(this.f14453f, this.f14452c)).a("openLiveRecharge", new com.bytedance.android.livesdk.browser.jsbridge.d.g());
        this.f14452c.a("openBindPhone", new com.bytedance.android.livesdk.browser.jsbridge.d.e(this.f14453f));
    }
}
