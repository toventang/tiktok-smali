package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.a.d;
import com.ss.android.sdk.webview.i;
import com.ss.android.sdk.webview.m;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.a.a;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.web.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebStatBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f78605a;

    /* renamed from: b  reason: collision with root package name */
    private static int f78606b;

    /* renamed from: c  reason: collision with root package name */
    private long f78607c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f78608d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f78609e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f78610f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Integer> f78611g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final a f78612h = new a();

    static {
        Covode.recordClassIndex(48807);
    }

    public final void a(List<Pattern> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f78617k.f78742b.J) {
            try {
                List<String> adCardPreloadCommonPrefix = c.f99077a.f99078b.getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
                if (!b.a((Collection) adCardPreloadCommonPrefix)) {
                    for (String str : adCardPreloadCommonPrefix) {
                        list.add(Pattern.compile(str));
                    }
                }
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0181 A[Catch:{ JSONException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b6 A[LOOP:0: B:61:0x01b0->B:63:0x01b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r19) {
        /*
        // Method dump skipped, instructions count: 543
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness.a(boolean):void");
    }

    public static int a() {
        if (!f78605a || f78606b == 1) {
            return 1;
        }
        return 0;
    }

    public final void b() {
        this.f78607c = System.currentTimeMillis();
        this.f78608d = false;
        this.f78609e = false;
        this.f78610f = false;
        this.f78612h.a();
    }

    public AdWebStatBusiness(e eVar) {
        super(eVar);
    }

    private static JSONObject a(com.ss.android.ugc.aweme.crossplatform.d.b bVar) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(bVar.f78769k)) {
                jSONObject = new JSONObject(bVar.f78769k);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_extra", bVar.f78767i);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void b(String str) {
        a.C3850a.a();
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        com.ss.android.ugc.aweme.crossplatform.business.a.a aVar = this.f78612h;
        aVar.f78653a = System.currentTimeMillis();
        aVar.f78661i = false;
        aVar.f78662j = 0;
        aVar.f78663k = str;
        if (aVar.f78664l == -1) {
            aVar.f78664l = AdLandPagePreloadServiceImpl.f().a(bVar.f78759a, aVar.f78653a);
        }
        f78605a = false;
        f78606b = 0;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("bytedance://log_event_v3")) {
            try {
                Uri parse = Uri.parse(str);
                if (!"log_event_v3".equals(parse.getHost())) {
                    return;
                }
                if (!this.f78609e) {
                    r.a(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                    this.f78609e = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void b(i iVar, m mVar) {
        IAdLandPagePreloadService f2;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        String str = bVar.P;
        if (bVar.O && !TextUtils.isEmpty(str) && (f2 = AdLandPagePreloadServiceImpl.f()) != null) {
            String g2 = f2.g("lynx_feed");
            if (!TextUtils.isEmpty(g2)) {
                iVar.a(new com.ss.android.ugc.aweme.web.a(mVar.a(g2), str, "lynx_feed"));
            }
        }
    }

    private static JSONObject a(com.ss.android.ugc.aweme.crossplatform.d.b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", bVar.y);
            if (!TextUtils.isEmpty(bVar.u) && bVar.y == 1) {
                jSONObject.put("channel_name", bVar.u);
                int i2 = 0;
                if (AdLandPagePreloadServiceImpl.f() != null) {
                    i2 = 2;
                }
                jSONObject.put("landing_type", i2);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void b(WebView webView, String str) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        com.ss.android.ugc.aweme.crossplatform.business.a.a aVar = this.f78612h;
        long j2 = bVar.f78759a;
        String str2 = bVar.f78771m;
        JSONObject a2 = a(bVar);
        JSONObject a3 = a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str) && !aVar.f78656d && !aVar.f78657e) {
            aVar.f78655c = System.currentTimeMillis();
            aVar.f78657e = true;
            aVar.a(webView.getContext(), str, j2, str2, a2, a3);
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (Build.VERSION.SDK_INT >= 21 && f2 != null) {
            String jSONObject = bVar.a().toString();
            if (bVar.f78759a != 0 && webView != null) {
                String f3 = f2.f(jSONObject);
                if (!bVar.z) {
                    if (!TextUtils.isEmpty(f3)) {
                        webView.evaluateJavascript(f3, c.f78672a);
                    }
                    if (bVar.w == 4 && bVar.x != 0 && a() == 1) {
                        String b2 = f2.b();
                        if (!TextUtils.isEmpty(b2)) {
                            webView.evaluateJavascript(b2.replace("_platform", "true"), d.f78673a);
                        }
                    }
                }
            }
        }
    }

    public final void a(WebView webView, int i2) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        if (i2 > 10 && !this.f78611g.contains(10)) {
            this.f78611g.add(10);
            this.f78612h.a(webView.getContext(), webView.getUrl(), bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, (String) null), 10);
        }
        if (i2 > 30 && !this.f78611g.contains(30)) {
            this.f78611g.add(30);
            this.f78612h.a(webView.getContext(), webView.getUrl(), bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, (String) null), 30);
        }
        if (i2 > 50 && !this.f78611g.contains(50)) {
            this.f78611g.add(50);
            this.f78612h.a(webView.getContext(), webView.getUrl(), bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, (String) null), 50);
        }
        if (i2 > 75 && !this.f78611g.contains(75)) {
            this.f78611g.add(75);
            this.f78612h.a(webView.getContext(), webView.getUrl(), bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, (String) null), 75);
        }
        if (i2 == 100 && !this.f78611g.contains(100)) {
            this.f78611g.add(100);
            this.f78612h.a(webView.getContext(), webView.getUrl(), bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, (String) null), 100);
        }
    }

    public final void c(WebView webView, String str) {
        boolean z;
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        com.ss.android.ugc.aweme.crossplatform.business.a.a aVar = this.f78612h;
        long j2 = bVar.f78759a;
        JSONObject a2 = a(bVar);
        JSONObject a3 = a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f78659g == null) {
                aVar.f78659g = aVar.f78658f;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f78657e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f78656d = z;
            if (j2 > 0) {
                if (a2 == null) {
                    a2 = new JSONObject();
                }
                try {
                    a2.put("is_ad_event", "1");
                    a2.put("tag", "draw_ad");
                    if (a3 == null) {
                        a3 = new JSONObject();
                    }
                    a3.put("present_url", aVar.f78659g);
                    a3.put("next_url", str);
                    a2.put("ad_extra_data", a3.toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "jump_page", String.valueOf(j2), "", "0");
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a4.b(next, a2.opt(next));
                }
                a4.c();
                if (d.b()) {
                    r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(a2));
                } else if (d.a()) {
                    try {
                        a2.put("_ad_staging_flag", "1");
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    r.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(a2));
                }
            }
            aVar.f78659g = str;
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a aVar2 = this.f78612h;
        if (!TextUtils.isEmpty(webView.getUrl()) && !TextUtils.equals(webView.getUrl(), str) && !aVar2.f78657e && !TextUtils.isEmpty(a.C1826a.f78666a) && !aVar2.f78665m) {
            aVar2.f78665m = true;
            if (a.C1826a.f78668c) {
                f.b a5 = f.a();
                a5.f74809f = a.C1826a.f78666a;
                a5.f74804a = "redirect";
                a5.b(a.C1826a.f78670e).a(a.C1826a.f78669d).a(Long.valueOf(bVar.f78759a)).e(bVar.f78767i).b();
                return;
            }
            f.b a6 = f.a();
            a6.f74804a = a.C1826a.f78666a;
            a6.f74805b = "redirect";
            a6.c(a.C1826a.f78667b).a(Long.valueOf(bVar.f78759a)).e(bVar.f78767i).a((Context) null);
            com.bytedance.ies.ugc.aweme.rich.a.a.a(a.C1826a.f78666a, "redirect", String.valueOf(bVar.f78759a), bVar.f78767i, "0").b("refer", a.C1826a.f78667b).c();
        }
    }

    public final void a(WebView webView, String str) {
        IAdLandPagePreloadService f2;
        Context context;
        ITalentAdRevenueShareService e2;
        JSONObject jSONObject;
        String str2;
        this.f78611g.clear();
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        if (this.f78617k.f78742b.f78759a > 0) {
            f78605a = true;
            f78606b++;
        }
        com.ss.android.ugc.aweme.crossplatform.business.a.a aVar = this.f78612h;
        long j2 = bVar.f78759a;
        String str3 = bVar.f78771m;
        JSONObject a2 = a(bVar);
        JSONObject a3 = a(bVar, (String) null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f78658f == null) {
                aVar.f78658f = str;
            }
            if (aVar.f78653a == 0) {
                aVar.f78653a = System.currentTimeMillis();
            }
            String str4 = bVar.u;
            String str5 = bVar.v;
            if (bVar.w == 7) {
                aVar.f78654b = 5;
            } else if (!TextUtils.isEmpty(str4) && bVar.y == 1 && bVar.w == 4 && (f2 = AdLandPagePreloadServiceImpl.f()) != null) {
                aVar.f78654b = f2.a().a(str4, str5);
                if (aVar.f78654b > 0 && aVar.f78664l != -1) {
                    aVar.f78654b = 3;
                }
            }
            if (aVar.f78660h && (context = webView.getContext()) != null && j2 > 0 && (e2 = TalentAdRevenueShareServiceImpl.e()) != null && e2.c()) {
                try {
                    l.a a4 = com.ss.android.ugc.aweme.crossplatform.business.a.a.a(context);
                    if (a4 != l.a.NONE) {
                        if (a2 == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = a2;
                        }
                        jSONObject.put("ac", l.a(a4));
                        long currentTimeMillis = System.currentTimeMillis() - aVar.f78653a;
                        if (a4 == l.a.WIFI) {
                            if (currentTimeMillis < 1) {
                            }
                        } else if (currentTimeMillis < 1) {
                        }
                        if (currentTimeMillis > 0) {
                            jSONObject.put("duration", Math.min(currentTimeMillis, 90000L));
                            if (str != null) {
                                str2 = str;
                            } else {
                                str2 = aVar.f78658f;
                                if (str2 == null) {
                                }
                            }
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (a3 == null) {
                                a3 = new JSONObject();
                            }
                            a3.put("next_url", str2);
                            if (aVar.f78654b != -1) {
                                a3.put("preload_status", aVar.f78654b);
                            }
                            jSONObject.put("ad_extra_data", a3.toString());
                            e2.a(str3, a2);
                            a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "detail_show", String.valueOf(j2), "", "0");
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                a5.b(next, jSONObject.opt(next));
                            }
                            a5.c();
                            if (d.b()) {
                                r.onEvent(MobClick.obtain().setLabelName("detail_show").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(jSONObject));
                            } else if (d.a()) {
                                try {
                                    a2.put("_ad_staging_flag", "1");
                                } catch (JSONException e3) {
                                    e3.printStackTrace();
                                }
                                r.onEvent(MobClick.obtain().setLabelName("detail_show").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(jSONObject));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            aVar.f78660h = false;
            aVar.f78661i = true;
            aVar.f78662j++;
        }
        IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
        if (!str.equals("about:blank") && !this.f78610f) {
            if (f3 != null) {
                e a6 = f3.a();
                String str6 = bVar.u;
                String str7 = bVar.v;
                int i2 = bVar.w;
                int i3 = bVar.y;
                String str8 = bVar.f78767i;
                String str9 = bVar.f78771m;
                if (TextUtils.isEmpty(str9)) {
                    str9 = String.valueOf(bVar.f78759a);
                }
                a6.a(str6, str7, i2, i3, str8, str9, this.f78612h.f78664l);
            }
            this.f78610f = true;
        }
        if (Build.VERSION.SDK_INT >= 21 && f3 != null) {
            try {
                f3.d(c.f99077a.f99078b.getAdLandingPageConfig().getAnalytics());
                if (bVar.x != 0) {
                    f3.e(c.f99077a.f99078b.getAdLandingPageConfig().getPrememAnalytics());
                }
            } catch (com.bytedance.ies.a e4) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(i iVar, m mVar) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        if (!TextUtils.isEmpty(bVar.u) && bVar.w == 4 && bVar.y == 1) {
            try {
                if (!c.f99077a.f99078b.getAdLandingPageConfig().getAdLandingPagePreloadEnabled().booleanValue()) {
                    return;
                }
            } catch (Exception unused) {
            }
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                String g2 = f2.g("feed");
                String str = bVar.u;
                if (!TextUtils.isEmpty(g2)) {
                    iVar.a(new com.ss.android.ugc.aweme.web.a(mVar.a(g2), str, "feed"));
                }
                String g3 = f2.g("splash");
                if (!TextUtils.isEmpty(g3)) {
                    iVar.a(new com.ss.android.ugc.aweme.web.a(mVar.a(g3), str, "splash"));
                }
            }
        }
    }

    public final void a(WebView webView, WebResourceRequest webResourceRequest, String str) {
        if (webView != null && webResourceRequest != null && Build.VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
            a(webView, webResourceRequest.getUrl().toString(), str);
        }
    }

    public final void a(WebView webView, String str, String str2) {
        com.ss.android.ugc.aweme.crossplatform.d.b bVar = this.f78617k.f78742b;
        this.f78612h.a(webView, str, bVar.f78759a, bVar.f78771m, a(bVar), a(bVar, str2));
    }
}
