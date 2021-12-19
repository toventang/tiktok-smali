package com.ss.android.ugc.aweme.crossplatform.d.a;

import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.d.c;
import com.ss.android.ugc.aweme.crossplatform.d.e;
import com.ss.android.ugc.aweme.crossplatform.d.f;
import com.ss.android.ugc.aweme.crossplatform.d.g;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class b extends a {
    static {
        Covode.recordClassIndex(48876);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.crossplatform.d.a f78747a;

        /* renamed from: b  reason: collision with root package name */
        public e f78748b;

        /* renamed from: c  reason: collision with root package name */
        public f f78749c;

        /* renamed from: d  reason: collision with root package name */
        public g f78750d;

        /* renamed from: e  reason: collision with root package name */
        public com.ss.android.ugc.aweme.crossplatform.d.b f78751e;

        /* renamed from: f  reason: collision with root package name */
        public c f78752f;

        static {
            Covode.recordClassIndex(48877);
        }

        a() {
        }

        public final a a() {
            a aVar = new a();
            aVar.f78741a = this.f78747a;
            aVar.f78743c = this.f78748b;
            aVar.f78744d = this.f78749c;
            aVar.f78745e = this.f78750d;
            aVar.f78742b = this.f78751e;
            aVar.f78746f = this.f78752f;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.b$b  reason: collision with other inner class name */
    public static final class C1830b {
        static {
            Covode.recordClassIndex(48878);
        }

        public static a a(Bundle bundle) {
            a aVar = new a();
            aVar.f78747a = b(bundle);
            if (aVar.f78747a.f78728a.intValue() == 2) {
                aVar.f78748b = c(bundle);
            }
            aVar.f78751e = b(bundle, aVar.f78747a);
            aVar.f78752f = d(bundle);
            aVar.f78749c = c(bundle, aVar.f78747a);
            aVar.f78750d = a(bundle, aVar.f78747a);
            return aVar.a();
        }

        private static c d(Bundle bundle) {
            c cVar = new c((char) 0);
            cVar.f78774c = bundle.getString("bundle_item_id_from_aweme");
            cVar.f78773b = bundle.getString("bundle_ad_id_from_aweme");
            cVar.f78772a = bundle.getString("bundle_creative_id_from_aweme");
            cVar.f78775d = bundle.getString("bundle_advertiser_id_from_aweme");
            cVar.f78778g = bundle.getString("bundle_cover_url_from_aweme");
            cVar.f78776e = bundle.getString("bundle_desc_from_aweme");
            cVar.f78777f = bundle.getLong("bundle_view_time_from_aweme");
            return cVar;
        }

        private static com.ss.android.ugc.aweme.crossplatform.d.a b(Bundle bundle) {
            int i2;
            String trim;
            boolean z;
            com.ss.android.ugc.aweme.crossplatform.d.a aVar = new com.ss.android.ugc.aweme.crossplatform.d.a((byte) 0);
            if (!TextUtils.isEmpty(bundle.getString("rn_schema"))) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aVar.f78728a = Integer.valueOf(i2);
            aVar.f78729b = bundle;
            String a2 = a(b(bundle.getString("url"), bundle), bundle);
            if (TextUtils.isEmpty(a2)) {
                trim = "";
            } else {
                trim = a2.trim();
            }
            aVar.f78730c = trim;
            Uri parse = Uri.parse(aVar.f78730c);
            aVar.f78731d = bundle.getBoolean("safeTemplate", false);
            if (aVar.f78731d && parse.isHierarchical()) {
                String decode = Uri.decode(parse.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    Uri parse2 = Uri.parse(decode);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        for (String str : queryParameterNames) {
                            if (!"target".equals(str)) {
                                buildUpon.appendQueryParameter(str, parse2.getQueryParameter(str));
                            }
                        }
                    }
                    aVar.f78730c = buildUpon.build().toString();
                }
            }
            if (parse.isHierarchical()) {
                z = com.ss.android.ugc.aweme.crossplatform.a.b.a(parse.getQueryParameter("auto_play_bgm"));
            } else {
                z = false;
            }
            aVar.f78734g = bundle.getBoolean("bundle_auto_play_audio", z);
            aVar.f78732e = com.ss.android.ugc.aweme.crossplatform.a.b.a(com.ss.android.ugc.aweme.crossplatform.a.b.b(aVar.f78730c), bundle, "group_id");
            aVar.f78733f = bundle.getString("enter_from");
            aVar.f78736i = bundle.getBoolean("from_notification", false);
            aVar.f78737j = bundle.getString("aweme_id", "");
            aVar.f78738k = bundle.getBoolean("control_request_url", false);
            if (parse.isHierarchical()) {
                aVar.f78739l = com.ss.android.ugc.aweme.crossplatform.a.b.a(parse.getQueryParameter("no_hw"));
            }
            if (!aVar.f78739l) {
                aVar.f78739l = false;
            }
            aVar.a(bundle.getString("owner_id", ""));
            aVar.n = com.ss.android.ugc.aweme.crossplatform.a.b.a(parse.getQueryParameter("hide_system_video_poster"));
            aVar.o = com.ss.android.ugc.aweme.crossplatform.a.b.a(parse, bundle, "report_type");
            aVar.p = ((Integer) com.ss.android.ugc.aweme.crossplatform.a.b.a(parse, "page_depth_of_report_show", bundle, "page_depth_of_report_show", Integer.class, 0)).intValue();
            return aVar;
        }

        private static e c(Bundle bundle) {
            String str;
            e eVar = new e();
            eVar.f78780a = bundle.getString("channel_name");
            eVar.f78782c = bundle.getString("bundle_name");
            eVar.f78784e = bundle.getString("module_name");
            String string = bundle.getString("force_h5");
            if (string == null) {
                string = "0";
            }
            eVar.f78785f = string;
            eVar.f78786g = bundle.getString("fallback_url");
            eVar.f78787h = bundle.getString("dev");
            String string2 = PreferenceManager.getDefaultSharedPreferences(d.a()).getString("rn_setting_bundle_url", "");
            if (string2 == null || string2.isEmpty()) {
                string2 = bundle.getString("rn_bundle_url");
            }
            eVar.f78788i = string2;
            eVar.f78789j = bundle.getString("rn_schema");
            String string3 = bundle.getString("dynamic");
            eVar.f78790k = TextUtils.equals(string3, "1");
            try {
                com.ss.android.ugc.aweme.crossplatform.d.d parse = com.ss.android.ugc.aweme.crossplatform.d.d.parse(Integer.parseInt(string3));
                l.d(parse, "");
                eVar.f78791l = parse;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            eVar.f78783d = bundle.getString("bundle");
            eVar.f78781b = bundle.getString("channel");
            eVar.n = TextUtils.equals(bundle.getString("need_share_bridge"), "1");
            eVar.o = bundle.getString("hybrid_report_source");
            String string4 = bundle.getString("a_surl");
            if (!TextUtils.isEmpty(string4)) {
                eVar.f78792m = string4;
            } else {
                Map map = (Map) ((d) d.f78754b.getValue()).f78756a.getValue();
                if (!TextUtils.isEmpty(eVar.f78781b)) {
                    str = eVar.f78781b;
                    if (str == null) {
                        l.b();
                    }
                } else {
                    str = eVar.f78780a;
                    if (!TextUtils.isEmpty(str)) {
                        if (str == null) {
                            l.b();
                        }
                        if (!p.c(str, "_android", false)) {
                            str = str + "_android";
                        }
                    }
                }
                if (map != null && !TextUtils.isEmpty(str) && map.containsKey(str)) {
                    eVar.f78792m = (String) map.get(str);
                }
            }
            return eVar;
        }

        private static String b(String str, Bundle bundle) {
            if (str == null) {
                return null;
            }
            if (Uri.parse(str) == null) {
                return str;
            }
            boolean z = bundle.getBoolean("need_sec_link", false);
            String string = bundle.getString("sec_link_scene");
            ISecLinkService b2 = SecLinkServiceImpl.b();
            if (!b2.a() || !z || TextUtils.isEmpty(string)) {
                return str;
            }
            return b2.a(str, string);
        }

        private static g a(Bundle bundle, com.ss.android.ugc.aweme.crossplatform.d.a aVar) {
            Uri parse;
            g gVar = new g();
            gVar.f78806a = bundle.getString("load_no_cache");
            gVar.f78808c = bundle.getString("resso_key");
            gVar.f78810e = bundle.getBoolean("need_sec_link", false);
            gVar.f78811f = bundle.getBoolean("need_detect_2_jump", false);
            gVar.f78809d = bundle.getString("sec_link_scene");
            String str = aVar.f78730c;
            if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && !parse.isOpaque() && TextUtils.equals(parse.getQueryParameter("is_view_only"), "1")) {
                gVar.f78807b = true;
            }
            return gVar;
        }

        private static String a(String str, Bundle bundle) {
            boolean z;
            if (str == null) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return str;
            }
            if (!parse.isHierarchical() || (!TextUtils.equals("1", parse.getQueryParameter("append_common_params")) && !TextUtils.equals("1", bundle.getString("add_common")))) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = bundle.getBoolean("safeTemplate", false);
            if (z) {
                a(parse, z2);
                if (!SettingsManager.a().a("awewebview_append_common_params_enabled", true)) {
                    return str;
                }
            } else if (z2) {
                try {
                    Uri parse2 = Uri.parse(Uri.decode(parse.getQueryParameter("target")));
                    if (TextUtils.equals("1", parse2.getQueryParameter("append_common_params"))) {
                        a(parse2, true);
                    }
                } catch (Exception unused) {
                }
            }
            StringBuilder sb = new StringBuilder(str);
            if (z) {
                AppLog.appendCommonParams(sb, false);
            }
            return sb.toString();
        }

        private static void a(Uri uri, boolean z) {
            int i2;
            try {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", path);
                    String host = uri.getHost();
                    if (!TextUtils.isEmpty(host)) {
                        hashMap.put("host", host);
                    }
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    hashMap.put("is_sec_url_wrapped", String.valueOf(i2));
                    r.a("awewebview_append_common_params", hashMap);
                }
            } catch (Exception unused) {
            }
        }

        private static com.ss.android.ugc.aweme.crossplatform.d.b b(Bundle bundle, com.ss.android.ugc.aweme.crossplatform.d.a aVar) {
            Uri uri;
            boolean z;
            boolean z2;
            String str = aVar.f78730c;
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            com.ss.android.ugc.aweme.crossplatform.d.b bVar = new com.ss.android.ugc.aweme.crossplatform.d.b((byte) 0);
            bVar.H = (String) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "commerce_enter_from", bundle, "commerce_enter_from", String.class, "");
            bVar.K = (String) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "challenge_id", bundle, "challenge_id", String.class, "");
            bVar.L = (String) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "sticker_id", bundle, "sticker_id", String.class, "");
            bVar.f78759a = bundle.getLong("ad_id", 0);
            if (bVar.f78759a <= 0) {
                Long l2 = (Long) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "cid", Long.class, (Object) 0L);
                Long l3 = (Long) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "ad_id", Long.class, (Object) 0L);
                if (l2.longValue() > 0) {
                    bVar.f78759a = l2.longValue();
                } else if (l3.longValue() > 0) {
                    bVar.f78759a = l3.longValue();
                }
            }
            bVar.f78760b = bundle.getString("ad_type", "");
            bVar.f78761c = bundle.getInt("ad_system_origin", 0);
            bVar.f78762d = bundle.getBoolean("bundle_is_from_app_ad", false);
            bVar.D = bundle.getBoolean("bundle_is_from_comment_app_ad", false);
            bVar.f78763e = bundle.getString("bundle_download_url");
            bVar.t = bundle.getString("bundle_ad_quick_app_url");
            bVar.f78764f = bundle.getString("bundle_download_app_name");
            bVar.f78765g = bundle.getString("aweme_package_name");
            bVar.f78766h = bundle.getString("bundle_download_app_extra");
            bVar.f78767i = (String) com.ss.android.ugc.aweme.crossplatform.a.b.a(uri, "log_extra", bundle, "bundle_download_app_log_extra", String.class, "");
            bVar.F = bundle.getString("has_ad_info_json");
            bVar.G = bundle.getString("ad_info_json");
            bVar.f78768j = bundle.getString("gd_label");
            bVar.f78769k = bundle.getString("gd_ext_json");
            bVar.o = bundle.getBoolean("bundle_forbidden_jump", false);
            bVar.f78770l = bundle.getBoolean("bundle_disable_download_dialog", true);
            bVar.f78771m = bundle.getString("aweme_creative_id");
            bVar.n = bundle.getBoolean("bundle_show_download_status_bar", true);
            if (bVar.f78759a > 0 || !TextUtils.isEmpty(bVar.f78768j)) {
                z = true;
            } else {
                z = false;
            }
            bVar.p = z;
            String string = bundle.getString("ad_js_url");
            if (bVar.f78759a > 0 && TextUtils.isEmpty(string)) {
                string = SharePrefCache.inst().getJsActlogUrl().c();
            }
            bVar.q = string;
            bVar.r = bundle.getString("dou_plus_fail_monitor_url");
            if (!bundle.getBoolean("enable_dou_plus_full_process_monitor", false) || !TextUtils.equals("TTWebView", "SystemWebView")) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar.s = z2;
            bVar.u = bundle.getString("preload_channel_name");
            bVar.v = bundle.getString("preload_scene");
            bVar.w = bundle.getInt("preload_web_status");
            bVar.x = bundle.getInt("preload_web_status_new");
            bVar.y = bundle.getInt("preload_is_web_url");
            bVar.B = bundle.getInt("web_type");
            bVar.S = bundle.getBoolean("enable_web_google_login");
            bVar.C = bundle.getString("quick_shop_enter_from");
            bVar.E = bundle.getBoolean("enable_web_report", false);
            bVar.I = bundle.getBoolean("bundle_enable_open_browser_to_download_apk", false);
            bVar.J = bundle.getBoolean("bundle_enable_card_preload", true);
            bVar.M = bundle.getLong("user_click_time", 0);
            bVar.N = bundle.getBoolean("hide_web_button", false);
            bVar.z = bundle.getBoolean("disable_js_calculate", false);
            bVar.O = bundle.getBoolean("is_from_lynx_land_page", false);
            bVar.P = bundle.getString("second_page_preload_channel_name");
            bVar.Q = bundle.getString("enter_from");
            bVar.R = bundle.getString("landing_page_info");
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.ss.android.ugc.aweme.crossplatform.d.f c(android.os.Bundle r9, com.ss.android.ugc.aweme.crossplatform.d.a r10) {
            /*
            // Method dump skipped, instructions count: 457
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.d.a.b.C1830b.c(android.os.Bundle, com.ss.android.ugc.aweme.crossplatform.d.a):com.ss.android.ugc.aweme.crossplatform.d.f");
        }
    }
}
