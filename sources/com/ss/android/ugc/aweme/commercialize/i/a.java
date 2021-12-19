package com.ss.android.ugc.aweme.commercialize.i;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.dc;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import h.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.web.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1678a f74446a = new C1678a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDateFormat f74447b;

    /* renamed from: c  reason: collision with root package name */
    private final String f74448c;

    /* renamed from: d  reason: collision with root package name */
    private final String f74449d;

    /* renamed from: e  reason: collision with root package name */
    private final String f74450e;

    static {
        Covode.recordClassIndex(45920);
    }

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final String a() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final InputStream b(String str) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.a$a  reason: collision with other inner class name */
    public static final class C1678a {
        static {
            Covode.recordClassIndex(45921);
        }

        private C1678a() {
        }

        public /* synthetic */ C1678a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.web.b.a
    public final String c(String str) {
        if (str != null && (p.c(str, ".shtml", false) || p.c(str, ".do", false))) {
            return "text/html";
        }
        String c2 = super.c(str);
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.web.b.a, com.ss.android.sdk.webview.h.a
    public final WebResourceResponse a(String str) {
        boolean z;
        String b2;
        JSONObject b3;
        int a2;
        String str2;
        Map a3;
        MethodCollector.i(10091);
        String str3 = this.f74449d;
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str3 == null || str3.length() == 0) {
            MethodCollector.o(10091);
            return null;
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 == null || (b2 = dc.b(f2.g(this.f74450e), str3)) == null || b2.length() == 0) {
            MethodCollector.o(10091);
            return null;
        }
        IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
        if (f3 == null || (b3 = f3.b(b2)) == null) {
            MethodCollector.o(10091);
            return null;
        }
        JSONObject optJSONObject = b3.optJSONObject(com.ss.android.ugc.aweme.utils.gecko.a.a(str4));
        if (optJSONObject == null) {
            MethodCollector.o(10091);
            return null;
        }
        File file = new File(b2, optJSONObject.optString("fileName"));
        if (!file.exists() || file.isFile()) {
            MethodCollector.o(10091);
            return null;
        }
        if (!TextUtils.isEmpty(str4) && (a2 = p.a((CharSequence) str4, '?', 0, false, 6)) != -1) {
            if (str4 != null) {
                str4 = str4.substring(0, a2);
                l.b(str4, "");
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                MethodCollector.o(10091);
                throw nullPointerException;
            }
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("respHeader");
        if (optJSONObject2 == null || (str2 = optJSONObject2.optString("content-type")) == null) {
            str2 = c(str4);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        l.b(adLandingPageConfig, "");
        int prememCacheMaxAgeInDays = adLandingPageConfig.getPrememCacheMaxAgeInDays();
        if (prememCacheMaxAgeInDays <= 0) {
            a3 = ag.a();
        } else {
            long j2 = ((long) prememCacheMaxAgeInDays) * 86400;
            long currentTimeMillis = System.currentTimeMillis();
            a3 = ag.a(v.a("access-control-allow-credentials", "true"), v.a("access-control-allow-headers", "Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Credentials"), v.a("access-control-allow-methods", "GET"), v.a("access-control-allow-origin", "*"), v.a("access-control-max-age", String.valueOf(j2)), v.a("x-content-type-options", "nosniff"), v.a("x-xss-protection", "0"), v.a("timing-allow-origin", "*"), v.a("age", "0"), v.a("cache-control", "public, max-age=".concat(String.valueOf(j2))), v.a("date", this.f74447b.format(new Date(currentTimeMillis)) + " GMT"), v.a("expires", this.f74447b.format(new Date(currentTimeMillis + (1000 * j2))) + " GMT"));
        }
        WebResourceResponse a4 = a(str2, "", fileInputStream, a3);
        MethodCollector.o(10091);
        return a4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3) {
        super(true);
        l.d(str, "");
        l.d(str3, "");
        this.f74448c = str;
        this.f74449d = str2;
        this.f74450e = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f74447b = simpleDateFormat;
    }
}
