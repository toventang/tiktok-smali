package com.ss.android.ugc.aweme.bullet.module.ad;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.c;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.base.web.g;
import com.bytedance.ies.bullet.service.base.web.h;
import com.bytedance.ies.bullet.service.f.a.b.j;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ax.a.v;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.bullet.business.XpathBusiness;
import com.ss.android.ugc.aweme.bullet.module.base.f;
import com.ss.android.ugc.aweme.commercialize.log.ag;
import h.f.b.l;
import h.m.p;
import java.net.URISyntaxException;
import java.util.Set;
import org.json.JSONObject;

public final class a extends f {

    /* renamed from: d  reason: collision with root package name */
    private long f69352d = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69353f;

    static {
        Covode.recordClassIndex(42758);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        super(bVar, bVar2);
        boolean z;
        j jVar;
        Long l2;
        l.d(bVar, "");
        l.d(bVar2, "");
        com.bytedance.ies.bullet.service.f.a.b b2 = bVar2.b();
        j jVar2 = (j) (!(b2 instanceof j) ? null : b2);
        if (jVar2 == null || (jVar = jVar2.az) == null || (l2 = (Long) jVar.b()) == null || l2.longValue() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f69353f = z;
    }

    private static void a(String str, c cVar) {
        if (!TextUtils.isEmpty(str)) {
            if (cVar != null) {
                cVar.b(o.class);
            }
            new an("webview_safe_log", null, null, 254);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "filter_scheme");
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            com.bytedance.ies.bullet.c.a.c.a(jSONObject, new v(parse, "intent_scheme_", null, 4).getFormatData());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final WebResourceResponse b(WebView webView, h hVar) {
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        if (!(Build.VERSION.SDK_INT < 21 || hVar == null || hVar.a() == null || !(!hVar.c().isEmpty()) || (passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f69449b.a(PassBackWebInfoBusiness.class)) == null)) {
            passBackWebInfoBusiness.a(String.valueOf(hVar.a()), hVar.c());
        }
        return super.b(webView, hVar);
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f
    public final void onPageFinished(WebView webView, String str) {
        SSWebView b2 = b(this.f32407e);
        XpathBusiness xpathBusiness = (XpathBusiness) this.f69449b.a(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(b2);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69449b.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.b(b2, str);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f69449b.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.a();
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f69449b.a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.a((WebView) b2, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f, android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.o
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && str != null && p.a((CharSequence) str, (CharSequence) "__back_url__", false)) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                String encode = Uri.encode(a2.h() + a2.a() + "://adx");
                l.b(encode, "");
                str = p.a(str, "__back_url__", encode);
            }
        }
        return b(this.f32407e, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dd, code lost:
        if (r4.a(r3, r9, r0) != true) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
        if (r4.a(r3, r9, r0) == true) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f9, code lost:
        r24 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(com.bytedance.ies.bullet.kit.web.c r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.ad.a.b(com.bytedance.ies.bullet.kit.web.c, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f
    public final void a(JSONObject jSONObject, boolean z) {
        Long l2;
        l.d(jSONObject, "");
        com.bytedance.ies.bullet.service.f.a.b b2 = this.f69449b.b();
        if (!(b2 instanceof j)) {
            b2 = null;
        }
        j jVar = (j) b2;
        if (jVar != null && (l2 = (Long) jVar.Y.b()) != null && l2.longValue() > 0) {
            a(jSONObject, "creativeId", jVar.Y.b());
            if (!z) {
                com.bytedance.apm.b.a("aweme_ad_landingpage_open_error", 1, jSONObject);
            } else if (this.f69352d > 0) {
                a(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f69352d));
            }
            com.bytedance.apm.b.a("aweme_ad_landingpage_open_error_rate", !z ? 1 : 0, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f69352d = SystemClock.elapsedRealtime();
        super.onPageStarted(webView, str, bitmap);
        SSWebView b2 = b(this.f32407e);
        PreRenderWebViewBusiness.a.a(this.f69449b);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69449b.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(b2, str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.o
    public final void a(WebView webView, h hVar, WebResourceResponse webResourceResponse) {
        AdWebStatBusiness adWebStatBusiness;
        String str;
        Uri a2;
        super.a(webView, hVar, webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21 && (adWebStatBusiness = (AdWebStatBusiness) this.f69449b.a(AdWebStatBusiness.class)) != null) {
            String str2 = null;
            if (hVar == null || (a2 = hVar.a()) == null) {
                str = null;
            } else {
                str = a2.toString();
            }
            if (webResourceResponse != null) {
                str2 = webResourceResponse.getReasonPhrase();
            }
            adWebStatBusiness.a(str, str2);
        }
    }

    private static void a(String str, String str2, com.ss.android.ugc.aweme.ad.settings.c cVar) {
        String shortClassName;
        String str3;
        String packageName;
        String str4;
        String className;
        String str5;
        String str6;
        if (str2 != null && !p.a((CharSequence) str2) && str != null && !p.a((CharSequence) str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scheme", str2);
            jSONObject.put("from", a.class.getSimpleName());
            if (cVar != null) {
                jSONObject.put("pattern", cVar.f66152a);
                jSONObject.put("config_type", cVar.f66153b);
            }
            if (l.a((Object) "intent", (Object) str2)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parseUri != null) {
                        String str7 = parseUri.getPackage();
                        if (str7 != null && !p.a((CharSequence) str7)) {
                            jSONObject.put("package", parseUri.getPackage());
                        }
                        if (a(parseUri) != null) {
                            Bundle a2 = a(parseUri);
                            if (a2 != null) {
                                str6 = a2.toString();
                            } else {
                                str6 = null;
                            }
                            jSONObject.put("extra", str6);
                        }
                        ComponentName component = parseUri.getComponent();
                        if (!(component == null || (className = component.getClassName()) == null || !(!p.a((CharSequence) className)))) {
                            ComponentName component2 = parseUri.getComponent();
                            if (component2 != null) {
                                str5 = component2.getClassName();
                            } else {
                                str5 = null;
                            }
                            jSONObject.put("className", str5);
                        }
                        ComponentName component3 = parseUri.getComponent();
                        if (!(component3 == null || (packageName = component3.getPackageName()) == null || !(!p.a((CharSequence) packageName)))) {
                            ComponentName component4 = parseUri.getComponent();
                            if (component4 != null) {
                                str4 = component4.getPackageName();
                            } else {
                                str4 = null;
                            }
                            jSONObject.put("packageName", str4);
                        }
                        ComponentName component5 = parseUri.getComponent();
                        if (!(component5 == null || (shortClassName = component5.getShortClassName()) == null || !(!p.a((CharSequence) shortClassName)))) {
                            ComponentName component6 = parseUri.getComponent();
                            if (component6 != null) {
                                str3 = component6.getShortClassName();
                            } else {
                                str3 = null;
                            }
                            jSONObject.put("shortClassName", str3);
                        }
                        String action = parseUri.getAction();
                        if (action != null && !p.a((CharSequence) action)) {
                            jSONObject.put("action", parseUri.getAction());
                        }
                        Set<String> categories = parseUri.getCategories();
                        if (categories != null && !categories.isEmpty()) {
                            jSONObject.put("categories", parseUri.getCategories().toString());
                        }
                        String dataString = parseUri.getDataString();
                        if (dataString != null && !p.a((CharSequence) dataString)) {
                            jSONObject.put("data", parseUri.getDataString());
                        }
                        String type = parseUri.getType();
                        if (type != null && !p.a((CharSequence) type)) {
                            jSONObject.put(StringSet.type, parseUri.getType());
                        }
                        jSONObject.put("flag", parseUri.getFlags());
                    }
                } catch (Exception e2) {
                    jSONObject.put("exception_name", e2.getClass().getSimpleName());
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    jSONObject.put("exception_message", message);
                }
            }
            ag.a("webview_intent_scheme_log", null, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f, com.bytedance.ies.bullet.service.base.web.o
    public final void a(WebView webView, h hVar, g gVar) {
        String str;
        CharSequence b2;
        Uri a2;
        super.a(webView, hVar, gVar);
        if (Build.VERSION.SDK_INT >= 21) {
            b(this.f32407e);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69449b.a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                String str2 = null;
                if (hVar == null || (a2 = hVar.a()) == null) {
                    str = null;
                } else {
                    str = a2.toString();
                }
                if (!(gVar == null || (b2 = gVar.b()) == null)) {
                    str2 = b2.toString();
                }
                adWebStatBusiness.a(str, str2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.f
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        b(this.f32407e);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69449b.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(str2, String.valueOf(i2));
        }
    }

    private static boolean a(String str, boolean z, String str2, SSWebView sSWebView) {
        String a2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && l.a((Object) "intent", (Object) str) && !z) {
            try {
                Intent parseUri = Intent.parseUri(str2, 1);
                if (!(parseUri == null || (a2 = a(parseUri, "browser_fallback_url")) == null)) {
                    if (sSWebView != null) {
                        sSWebView.loadUrl(a2);
                    }
                    return true;
                }
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private final boolean a(String str, Uri uri, String str2, boolean z, String str3, SSWebView sSWebView, c cVar) {
        Intent intent;
        PackageManager packageManager;
        if (!TextUtils.isEmpty(str) && uri != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (l.a((Object) "market", (Object) str2)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent2.addFlags(268435456);
                a(str3, cVar);
                Activity a2 = this.f69449b.a();
                if (a2 != null) {
                    a(a2, intent2);
                }
                return true;
            } else if (l.a((Object) "intent", (Object) str2) && z) {
                String str4 = null;
                try {
                    intent = Intent.parseUri(str3, 1);
                } catch (URISyntaxException e2) {
                    e2.printStackTrace();
                    intent = null;
                }
                Activity a3 = this.f69449b.a();
                if (a3 != null) {
                    packageManager = a3.getPackageManager();
                    if (!(packageManager == null || intent == null || intent.resolveActivity(packageManager) == null)) {
                        intent.addFlags(268435456);
                        a(str3, cVar);
                        Activity a4 = this.f69449b.a();
                        if (a4 != null) {
                            a(a4, intent);
                        }
                        return true;
                    }
                } else {
                    packageManager = null;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                if (intent != null) {
                    l.b(b.a.f65586a, "");
                    com.ss.android.ugc.aweme.ad.b.c a5 = com.ss.android.ugc.aweme.ad.b.b.a();
                    if (a5 != null && a5.a(this.f69449b.a())) {
                        intent3.setData(Uri.parse("market://details?id=" + intent.getPackage()));
                        if (!(packageManager == null || intent3.resolveActivity(packageManager) == null)) {
                            intent.addFlags(268435456);
                            a(str3, cVar);
                            Activity a6 = this.f69449b.a();
                            if (a6 != null) {
                                a(a6, intent3);
                            }
                            return true;
                        }
                    }
                    String a7 = a(intent, "browser_fallback_url");
                    if (a7 != null) {
                        if (sSWebView != null) {
                            sSWebView.loadUrl(a7);
                        }
                        return true;
                    }
                }
                l.b(b.a.f65586a, "");
                com.ss.android.ugc.aweme.ad.b.c a8 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a8 != null && !a8.a(this.f69449b.a())) {
                    Activity a9 = this.f69449b.a();
                    if (intent != null) {
                        str4 = intent.getPackage();
                    }
                    return a8.b(a9, str4);
                }
            }
        }
        return false;
    }
}
