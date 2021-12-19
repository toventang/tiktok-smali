package com.ss.android.ugc.aweme.bf;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;
import com.ss.android.ugc.aweme.sp.h;
import com.twitter.sdk.android.core.p;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f68647a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f68648b;

    /* renamed from: c  reason: collision with root package name */
    private static int f68649c;

    /* renamed from: d  reason: collision with root package name */
    private static HashSet<String> f68650d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private static HashSet<String> f68651e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f68652f = {"is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "wschannel_multi_process_config", "device_register_migrate_detector", "com.ss.android.deviceregister.utils.Cdid", "rec_user", "ab_test_mock_config", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "share_setting_preference", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences", "sp_download_info", "TTWebView_Json_Config_Manager", "TeenageModeSetting", "extra_group", "WebViewBytedancePrefs", "app_bundle_session_ids"};

    /* renamed from: g  reason: collision with root package name */
    private static List<Class> f68653g = Arrays.asList(h.class, p.class);

    /* renamed from: h  reason: collision with root package name */
    private static File f68654h;

    /* renamed from: i  reason: collision with root package name */
    private static HashMap<String, Boolean> f68655i = new HashMap<>();

    static {
        Covode.recordClassIndex(42251);
    }

    private static String[] a() {
        return new String[]{"default_config", "awesome_splash", "splash_ad_sp", "ttnetCookieStore", "key_language_sp_key", "applog_stats", "aweme-app", "av_settings", "av_settings.xml", "ab_test_config", "aweme_user", "com.ss.spip_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", com.bytedance.ies.ugc.appcontext.d.a().getPackageName() + "_preferences", "rhea.sp", "ttlive_tabs_cache", "ttlive_sdk_shared_pref_cache", "live_sdk_core", "WebViewChromiumPrefs"};
    }

    private static boolean a(String str) {
        if ((str.length() & 7) <= f68649c) {
            return true;
        }
        return false;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009b, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083 A[SYNTHETIC, Splitter:B:47:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0088 A[SYNTHETIC, Splitter:B:51:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bf.d.b(android.content.Context):void");
    }

    private static boolean a(File file) {
        MethodCollector.i(6670);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6670);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6670);
        return delete;
    }

    private static SharedPreferences c(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str)) == null) {
            return null;
        }
        return sharedPreferences;
    }

    private static boolean b(Context context, String str) {
        if (!f68647a || f68653g.contains(context.getClass()) || f68650d.contains(str)) {
            return true;
        }
        return false;
    }

    static void a(Context context, boolean z) {
        MethodCollector.i(6447);
        SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
        f68647a = sharedPreferences.getBoolean("keva_switch", true);
        f68650d.addAll(Arrays.asList(a()));
        f68650d.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
        f68651e.addAll(Arrays.asList(f68652f));
        if (!f68647a) {
            b(context);
        }
        f68648b = z;
        MethodCollector.o(6447);
    }

    private static boolean a(Context context, String str) {
        MethodCollector.i(6434);
        synchronized (f68655i) {
            try {
                Boolean bool = f68655i.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                if (f68654h == null) {
                    File a2 = a(context);
                    if (!a2.exists()) {
                        a2.mkdir();
                    }
                    f68654h = new File(a2.getParent(), "shared_prefs");
                }
                boolean exists = new File(f68654h, str + ".xml").exists();
                f68655i.put(str, Boolean.valueOf(exists));
                MethodCollector.o(6434);
                return exists;
            } finally {
                MethodCollector.o(6434);
            }
        }
    }

    public static SharedPreferences a(Context context, String str, int i2) {
        if (b(context, str)) {
            return b(context, str, i2);
        }
        if (!a(str) && !Keva.isRepoPorted(str) && a(context, str)) {
            return b(context, str, i2);
        }
        if (f68651e.contains(str)) {
            i2 = 4;
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i2, f68648b);
    }

    private static SharedPreferences b(Context context, String str, int i2) {
        MethodCollector.i(6537);
        if (TextUtils.equals("plugin_meta_data", str) || TextUtils.equals("bmd_monitor", str) || TextUtils.equals("multidex.version", str) || TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.a().getPackageName() + "_preferences", str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, i2);
            MethodCollector.o(6537);
            return sharedPreferences;
        }
        SharedPreferences c2 = c(context, str);
        if (c2 != null) {
            MethodCollector.o(6537);
            return c2;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, i2);
        MethodCollector.o(6537);
        return sharedPreferences2;
    }
}
