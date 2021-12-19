package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.b;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.o;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.ss.android.ugc.aweme.landpage.IAdLandPageService;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;

public final class c {

    public interface a {
        static {
            Covode.recordClassIndex(20862);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(20861);
    }

    private static String a() {
        return "snssdk" + d.n;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(a aVar) {
        i.a(5000).a(new e(aVar));
    }

    private static Boolean a(String str) {
        boolean z = false;
        if (m.a(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str)) {
            return true;
        }
        String a2 = a();
        if (!m.a(a2) && TextUtils.equals(a2, str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean a(Context context, String str, Long l2, String str2, g gVar) {
        boolean z;
        String str3;
        int lastIndexOf;
        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().a(context, "splash");
        String scheme = Uri.parse(str).getScheme();
        if ("sslocal".equalsIgnoreCase(scheme) || "localsdk".equalsIgnoreCase(scheme)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("splash_ad", "open_url_app", String.valueOf(l2), str2, "0").b();
            com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().b("splash_ad");
        }
        if (str.contains("__back_url__")) {
            str3 = str.replace("__back_url__", Uri.encode(a.AbstractC1652a.f73756a));
        } else {
            str3 = str;
        }
        g gVar2 = new g(str3);
        if (a(str).booleanValue()) {
            gVar2.a("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            gVar2.a("enter_from", "open_screen_ad");
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            gVar2.a("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers") && (lastIndexOf = str.lastIndexOf("/") + 1) < str.length()) {
            r.a("enter_prop_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "splash_ad").a("prop_id", str.substring(lastIndexOf)).f66730a);
        }
        gVar.a(context, gVar2.a());
        if (z) {
            a(new d(l2, str2));
        }
        return true;
    }

    public static boolean a(Context context, String str, String str2, Long l2, String str3, ag agVar, String str4, String str5) {
        String str6;
        com.bytedance.ies.ugc.aweme.rich.a.a.a("splash_ad", "open_url_h5", String.valueOf(l2), str3, "0").b();
        com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().b("splash_ad");
        Intent b2 = com.bytedance.ies.ugc.aweme.commercialize.splash.core.a.a().b(context);
        b2.setData(Uri.parse(str));
        b2.setFlags(268435456);
        if (TextUtils.isEmpty(str2)) {
            b2.putExtra("title", " ");
        } else {
            b2.putExtra("title", str2);
        }
        b2.putExtra("bundle_forbidden_jump", true);
        b2.putExtra("ad_id", l2);
        b2.putExtra("bundle_download_app_log_extra", str3);
        b2.putExtra("bundle_webview_background", b.c(context, R.color.a9));
        b2.putExtra("commerce_enter_from", "splash");
        b2.putExtra("enter_from", "splash");
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            String a2 = f2.a(l2);
            if (!TextUtils.isEmpty(a2)) {
                b2.putExtra("preload_channel_name", a2);
                b2.putExtra("preload_scene", "splash");
                b2.putExtra("preload_web_status", 4);
                b2.putExtra("preload_is_web_url", 1);
            }
        }
        Bundle a3 = a(b2);
        if (!(a3 == null || agVar == null)) {
            String lynxScheme = agVar.getLynxScheme();
            if (!m.a(lynxScheme) && lynxScheme.startsWith("aweme://lynxview")) {
                a3.putBoolean("is_lynx_landing_page", true);
                a3.putBoolean("hide_nav_bar", true);
                a3.putBoolean("hide_status_bar", false);
                a3.putBoolean("bundle_nav_bar_status_padding", true);
                a3.putBoolean("need_bottom_out", true);
                if (agVar.getLynxLandingStyle() == 1) {
                    a3.putInt("bundle_webview_background", 0);
                }
                if (agVar.getGeckoChannel() != null && !agVar.getGeckoChannel().isEmpty()) {
                    a3.putString("lynx_channel_name", agVar.getGeckoChannel().get(0));
                }
                a3.putString("bundle_native_site_custom_data", str5);
                String str7 = "";
                if (agVar.getSecondPageGeckoChannel() != null && !agVar.getSecondPageGeckoChannel().isEmpty()) {
                    IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.f();
                    if (f3 != null) {
                        str6 = f3.b(l2);
                        f3.a().b(agVar.getSecondPageGeckoChannel());
                    } else {
                        str6 = str7;
                    }
                    a3.putString("second_page_preload_channel_prefix", str6);
                }
                a3.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(context), 1073741824));
                a3.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(context) - hh.b(), 1073741824));
                Uri parse = Uri.parse(agVar.getLynxScheme());
                if (parse.isHierarchical()) {
                    a3.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                    if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                        a3.putBoolean("preset_safe_point", true);
                        a3.putInt("thread_strategy", 1);
                    }
                }
                Uri.Builder buildUpon = parse.buildUpon();
                o oVar = new o();
                oVar.a("creativeId", l2);
                oVar.a("logExtra", str3);
                oVar.a("pageData", str4);
                oVar.a("isRTL", Integer.valueOf(gb.a(context) ? 1 : 0));
                oVar.a("topSafeAreaHeight", Integer.valueOf(hh.b()));
                buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
                buildUpon.appendQueryParameter("lynx_landing_page_title", str2);
                String builder = buildUpon.toString();
                IAdLandPageService b3 = AdLandPageServiceImpl.b();
                if (b3 != null) {
                    str7 = b3.a();
                }
                com.ss.android.ugc.aweme.bullet.b.a(context, builder, str7, a3);
                return true;
            }
        }
        try {
            com.ss.android.ugc.tiktok.security.a.a.a(b2, context);
            context.startActivity(b2);
            return true;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "openSplashScheme: url = " + str + " e = " + e2.toString());
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return false;
        }
    }
}
