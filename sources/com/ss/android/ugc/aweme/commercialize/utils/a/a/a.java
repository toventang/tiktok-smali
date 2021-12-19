package com.ss.android.ugc.aweme.commercialize.utils.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.bullet.ab.c;
import com.ss.android.ugc.aweme.bullet.b;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class a extends com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a {

    /* renamed from: g  reason: collision with root package name */
    public static final C1722a f75511g = new C1722a((byte) 0);

    static {
        Covode.recordClassIndex(46602);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a$a  reason: collision with other inner class name */
    public static final class C1722a {
        static {
            Covode.recordClassIndex(46603);
        }

        private C1722a() {
        }

        public /* synthetic */ C1722a(byte b2) {
            this();
        }
    }

    private final String e() {
        return d().f75408b.f75444a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean a() {
        if (e().length() == 0) {
            return false;
        }
        if (!d.a(e())) {
            String e2 = e();
            if (!TextUtils.isEmpty(e2)) {
                Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = e2.toLowerCase();
                l.b(lowerCase, "");
                if (p.b(lowerCase, "aweme://lynxview", false)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.e
    public final boolean b() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        if (c.f68844a) {
            String.valueOf(d().f75407a.f75416c);
            l.d("ad_lynx_download_WebUrlHandler_doHandle", "");
        }
        Intent intent = new Intent(c(), CrossPlatformActivity.class);
        Uri parse = Uri.parse(e());
        if (!d().f75408b.f75447d.isEmpty()) {
            Uri.Builder buildUpon = Uri.parse(e()).buildUpon();
            for (Map.Entry<String, String> entry : d().f75408b.f75447d.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            parse = buildUpon.build();
        }
        intent.setData(parse);
        if (!TextUtils.equals(parse.getQueryParameter("launch_mode"), "standard")) {
            intent.addFlags(268435456);
        }
        if (d().f75408b.f75445b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            intent.putExtra("title", d().f75408b.f75445b);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", d().f75408b.f75449f);
        intent.putExtra("bundle_app_ad_from", d().f75408b.o);
        if (d().f75407a.f75416c != 0) {
            intent.putExtra("ad_id", d().f75407a.f75416c);
            intent.putExtra("aweme_creative_id", String.valueOf(d().f75407a.f75416c));
            a(intent, "ad_type", d().f75407a.f75419f);
            intent.putExtra("ad_system_origin", d().f75407a.f75420g);
            a(intent, "bundle_download_app_log_extra", d().f75407a.f75417d);
            intent.putExtra("landing_page_info", d().f75408b.t);
            if (d().f75408b.u == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            intent.putExtra("need_bottom_out", z2);
        }
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> jsActlogUrl = inst.getJsActlogUrl();
        l.b(jsActlogUrl, "");
        String c2 = jsActlogUrl.c();
        if (c2 != null && c2.length() > 0) {
            intent.putExtra("ad_js_url", c2);
        }
        intent.putExtra("bundle_disable_download_dialog", d().f75412f.f75426d);
        if (d().f75412f.f75423a.length() > 0) {
            intent.putExtra("bundle_download_url", d().f75412f.f75423a);
            a(intent, "aweme_package_name", d().f75412f.f75424b);
            intent.putExtra("bundle_is_from_app_ad", d().f75412f.f75427e);
            a(intent, "bundle_ad_quick_app_url", d().f75412f.f75425c);
            intent.putExtra("bundle_download_app_name", d().f75412f.f75428f);
            intent.putExtra("bundle_download_mode", d().f75412f.f75429g);
            intent.putExtra("bundle_link_mode", d().f75412f.f75430h);
            intent.putExtra("bundle_support_multiple_download", d().f75412f.f75431i);
            intent.putExtra("bundle_web_url", d().f75412f.f75432j);
            intent.putExtra("bundle_web_title", d().f75412f.f75433k);
            intent.putExtra("bundle_open_url", d().f75412f.f75434l);
        }
        String jSONObject = j.a(c(), d().f75407a.f75414a, false, (Map<String, String>) null).toString();
        if (jSONObject == null) {
            jSONObject = "";
        }
        intent.putExtra("aweme_json_extra", jSONObject);
        Long valueOf = Long.valueOf(d().f75407a.f75418e);
        if (valueOf.longValue() > 0 && valueOf != null) {
            intent.putExtra("group_id", valueOf.longValue());
        }
        Integer num = d().f75408b.f75450g;
        if (num != null) {
            intent.putExtra("bundle_webview_background", num.intValue());
        }
        intent.putExtra("aweme_id", d().f75407a.f75421h);
        intent.putExtra("owner_id", d().f75407a.f75422i);
        intent.putExtra("bundle_forbidden_jump", d().f75408b.f75451h);
        intent.putExtra("use_ordinary_web", d().f75408b.f75448e);
        intent.putExtra("preload_channel_name", d().f75408b.f75455l);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", d().f75408b.f75453j);
        intent.putExtra("preload_web_status_new", d().f75408b.f75454k);
        intent.putExtra("preload_is_web_url", d().f75408b.f75456m);
        intent.putExtra("web_type", d().f75408b.n);
        intent.putExtra("user_click_time", d().f75408b.p);
        intent.putExtra("is_from_lynx_land_page", d().f75408b.q);
        intent.putExtra("second_page_preload_channel_name", d().f75408b.r);
        ay.f75622a = d().f75407a.f75414a;
        if (c.f68844a) {
            String.valueOf(d().f75407a.f75416c);
            l.d("ad_lynx_download_WebUrlHandler_doHandle", "");
        }
        Context c3 = c();
        Bundle a2 = a(intent);
        if (!p.b(e(), "aweme://lynxview", false)) {
            return a(c(), intent);
        }
        if (a2 == null) {
            a2 = new Bundle();
        }
        a2.putBoolean("is_lynx_landing_page", true);
        a2.putBoolean("hide_nav_bar", true);
        a2.putBoolean("hide_status_bar", false);
        a2.putBoolean("bundle_nav_bar_status_padding", true);
        a2.putBoolean("need_bottom_out", true);
        if (d().f75408b.C == 1) {
            if (!TextUtils.isEmpty(d().f75408b.w)) {
                a2.putString("bundle_full_screen_bg_image", d().f75408b.w);
            }
            a2.putInt("bundle_webview_background", 0);
        }
        a2.putString("lynx_channel_name", d().f75408b.x);
        a2.putString("bundle_native_site_custom_data", d().f75408b.y);
        List<String> list = d().f75408b.B;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 == null || (str2 = f2.b(Long.valueOf(d().f75407a.f75415b))) == null) {
                str2 = "";
            }
            a2.putString("second_page_preload_channel_prefix", str2);
            f2.a().b(d().f75408b.B);
        }
        a2.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(c3), 1073741824));
        a2.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(c3) - hh.b(), 1073741824));
        Uri parse2 = Uri.parse(e());
        l.b(parse2, "");
        if (parse2.isHierarchical()) {
            a2.putString("bundle_origin_url", parse2.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse2.getQueryParameter("async_layout"), "1")) {
                a2.putBoolean("preset_safe_point", true);
                a2.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon2 = parse2.buildUpon();
        o oVar = new o();
        com.ss.android.ugc.aweme.commercialize.feed.c.a aVar = d().f75408b.f75452i;
        if (aVar == null || (str = aVar.getSiteId()) == null) {
            str = "";
        }
        oVar.a("siteId", str);
        oVar.a("adId", String.valueOf(d().f75407a.f75415b));
        oVar.a("creativeId", String.valueOf(d().f75407a.f75416c));
        oVar.a("logExtra", d().f75407a.f75417d);
        oVar.a("groupId", String.valueOf(d().f75407a.f75418e));
        oVar.a("webUrl", e());
        oVar.a("pageData", d().f75408b.z);
        oVar.a("appData", d().f75408b.A);
        oVar.a("isRTL", Integer.valueOf(gb.a(c()) ? 1 : 0));
        oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        buildUpon2.appendQueryParameter("lynx_landing_page_data", oVar2);
        buildUpon2.appendQueryParameter("lynx_landing_page_title", d().f75408b.f75445b);
        String builder = buildUpon2.toString();
        l.b(builder, "");
        b.a(c3, builder, "ad_commerce", a2);
        return true;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Intent intent, String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            intent.putExtra(str, str2);
        }
    }
}
