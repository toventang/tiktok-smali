package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.a.c;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.bullet.module.base.e;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.web.h;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f  reason: invalid package */
public final class f extends c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69510b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f69511a;

    static {
        Covode.recordClassIndex(42867);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f$a */
    public static final class a {
        static {
            Covode.recordClassIndex(42868);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.f$b */
    public static final class b extends com.bytedance.ies.bullet.kit.web.a.a {
        static {
            Covode.recordClassIndex(42869);
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final String b() {
            return "ToutiaoJSBridge";
        }

        b() {
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final Boolean a() {
            return false;
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final List<String> c() {
            return h.a((List<String>) n.a("host"), false);
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final List<String> d() {
            return h.a((List<String>) n.a("host"), true);
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final Boolean g() {
            boolean z;
            if (!a.C2792a.f108997a.f108996a.enableBoe() || !a.C2792a.f108997a.f108996a.enableBoeJsbBypass()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final List<String> e() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("config");
            arrayList.add("appInfo");
            arrayList.add("login");
            arrayList.add("close");
            arrayList.add("gallery");
            arrayList.add("toggleGalleryBars");
            arrayList.add("slideShow");
            arrayList.add("relatedShow");
            arrayList.add("toast");
            arrayList.add("slideDownload");
            arrayList.add("requestChangeOrientation");
            arrayList.add("adInfo");
            l.d(arrayList, "");
            arrayList.add("sendLog");
            arrayList.add("openSchoolEdit");
            arrayList.add("formDialogClose");
            arrayList.add("openSchoolEdit");
            arrayList.add("orderResult");
            return arrayList;
        }

        @Override // com.bytedance.ies.bullet.kit.web.b.b, com.bytedance.ies.bullet.kit.web.a.a
        public final List<String> f() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("isAppInstalled");
            arrayList.add("share");
            arrayList.add("open");
            arrayList.add("openThirdApp");
            arrayList.add("copyToClipboard");
            arrayList.add("userInfo");
            arrayList.add("apiParam");
            arrayList.add("openAweme");
            arrayList.add("openSchema");
            arrayList.add("openRecord");
            arrayList.add("publishVideo");
            arrayList.add("openBrowser");
            arrayList.add("bindPhone");
            arrayList.add("fetch");
            arrayList.add("nativeStorage");
            arrayList.add("fetchTaoCommand");
            l.d(arrayList, "");
            return arrayList;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.c, com.bytedance.ies.bullet.kit.web.f
    public final com.bytedance.ies.bullet.kit.web.b.b b() {
        return new b();
    }

    private final int c() {
        Uri uri = (Uri) this.f69511a.c(Uri.class);
        List<String> list = null;
        String decode = Uri.decode(uri != null ? uri.toString() : null);
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            list = iESSettingsProxy.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (list == null || decode == null) {
            return -1;
        }
        for (String str : list) {
            if (p.a((CharSequence) decode, (CharSequence) str, false)) {
                return 2;
            }
        }
        return -1;
    }

    public f(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        this.f69511a = bVar;
    }

    @Override // com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.kit.web.a.c
    public final q a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new e();
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.c, com.bytedance.ies.bullet.kit.web.f
    public final Map<String, Object> a(com.bytedance.ies.bullet.kit.web.c cVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(cVar, "");
        l.d(bVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("statusBarHeight", Integer.valueOf(com.ss.android.ugc.aweme.base.utils.n.b((double) i.b())));
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.bullet.kit.web.a.c, com.bytedance.ies.bullet.kit.web.f
    public final void a(WebSettings webSettings, WebView webView) {
        l.d(webSettings, "");
        l.d(webView, "");
        super.a(webSettings, webView);
        Context context = (Context) this.f69511a.c(Context.class);
        if (context != null) {
            com.ss.android.newmedia.e.a.a a2 = com.ss.android.newmedia.e.a.a.a(context);
            a2.f59953a = true;
            a2.a(webView);
        }
        webSettings.setCacheMode(c());
        webView.setFocusableInTouchMode(true);
        webView.setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
