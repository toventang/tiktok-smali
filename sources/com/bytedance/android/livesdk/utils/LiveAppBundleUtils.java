package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.r.a.a.a;
import com.bytedance.r.a.a.b;
import com.bytedance.r.a.c;
import com.bytedance.r.a.d;
import com.ss.android.ugc.aweme.cw.g;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveAppBundleUtils {
    private static final a iAABMonitor = x.f22367a;
    private static final a iCoverageMonitor = w.f22366a;
    private static final a iSOMonitor = y.f22368a;
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final Set<String> sLoadedSoSet = new CopyOnWriteArraySet();
    private static final Set<b> sLoggedInstalledSet = new CopyOnWriteArraySet();
    private static final Set<b> sLoggedTotalSet = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(13108);
        Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext != null) {
            tryLoadAppBundlePluginFromColdStart(applicationContext, b.LINK_MIC);
            tryLoadAppBundlePluginFromColdStart(applicationContext, b.QUIC);
            tryLoadAppBundlePluginFromColdStart(applicationContext, b.RTS);
            tryLoadAppBundlePluginFromColdStart(applicationContext, b.CMAF);
        }
    }

    static final /* synthetic */ void lambda$null$6$LiveAppBundleUtils(b bVar) {
        if (bVar != null) {
            bVar.a();
        }
    }

    public static Context com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static boolean isPluginAvailable(b bVar) {
        if (bVar.gateClosed()) {
            return true;
        }
        return isAppBundlePluginLoaded(bVar);
    }

    /* access modifiers changed from: private */
    public static void monitorStartLoad(String str) {
        iSOMonitor.a(getBaseExtra(str, "so_start_load"));
    }

    private static boolean isAppBundlePluginLoaded(b bVar) {
        String[] strArr = bVar.soNames;
        for (String str : strArr) {
            if (!(TextUtils.isEmpty(str) || sLoadedSoSet.contains(str))) {
                return false;
            }
        }
        return true;
    }

    public static void logInstalledIfNeed(b bVar) {
        Set<b> set = sLoggedInstalledSet;
        if (!set.contains(bVar)) {
            set.add(bVar);
            iCoverageMonitor.a(getCoverageBaseExtra("coverage_installed", bVar));
        }
    }

    private static void logTotalIfNeed(b bVar) {
        Set<b> set = sLoggedTotalSet;
        if (!set.contains(bVar)) {
            set.add(bVar);
            iCoverageMonitor.a(getCoverageBaseExtra("coverage_total", bVar));
        }
    }

    public static void ensurePluginAvailable(Context context, b bVar) {
        ensurePluginAvailable(context, bVar, null);
    }

    private static void tryLoadAppBundlePluginFromColdStart(Context context, b bVar) {
        tryLoadAppBundlePlugin(context, bVar, null, false);
    }

    private static JSONObject getBaseExtra(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str2);
            jSONObject.put("so_name", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static boolean checkPluginInstalled(Context context, b bVar) {
        c makeInstallRequest = makeInstallRequest(context, bVar, null);
        if (makeInstallRequest.f42410a == null || makeInstallRequest.f42410a.isEmpty()) {
            return true;
        }
        return d.f42418a.b(context).containsAll(makeInstallRequest.f42410a);
    }

    private static JSONObject getCoverageBaseExtra(String str, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", TextUtils.join(",", bVar.appBundles));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void monitorLoadSuccess(String str, long j2) {
        JSONObject baseExtra = getBaseExtra(str, "so_load_success");
        try {
            baseExtra.put("duration", j2);
        } catch (JSONException unused) {
        }
        iSOMonitor.a(baseExtra);
    }

    private static c makeInstallRequest(Context context, final b bVar, final b bVar2) {
        c.a aVar = new c.a(Arrays.asList(bVar.appBundles));
        aVar.f42416b = iAABMonitor;
        final Context com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        aVar.f42415a = new b() {
            /* class com.bytedance.android.livesdk.utils.LiveAppBundleUtils.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13109);
            }

            @Override // com.bytedance.r.a.a.b
            public final void b() {
                b bVar = bVar2;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // com.bytedance.r.a.a.b
            public final void a() {
                LiveAppBundleUtils.tryLoadAppBundlePlugin(com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, bVar, bVar2, true);
                LiveAppBundleUtils.logInstalledIfNeed(bVar);
            }
        };
        return aVar.a();
    }

    private static void monitorLoadFailed(String str, long j2, String str2) {
        JSONObject baseExtra = getBaseExtra(str, "so_load_failed");
        try {
            baseExtra.put("duration", j2);
            baseExtra.put("error_msg", str2);
        } catch (JSONException unused) {
        }
        iSOMonitor.a(baseExtra);
    }

    public static void ensurePluginAvailable(Context context, b bVar, b bVar2) {
        logTotalIfNeed(bVar);
        if (isPluginAvailable(bVar)) {
            logInstalledIfNeed(bVar);
            if (bVar2 != null) {
                bVar2.a();
            }
        } else if (!checkPluginInstalled(context, bVar)) {
            startInstallPlugin(context, bVar, bVar2);
        } else {
            logInstalledIfNeed(bVar);
            tryLoadAppBundlePlugin(context, bVar, bVar2, true);
        }
    }

    private static void startInstallPlugin(Context context, b bVar, b bVar2) {
        c makeInstallRequest = makeInstallRequest(context, bVar, bVar2);
        com.bytedance.r.a.a aVar = d.f42418a;
        if (aVar.f42389a == null) {
            aVar.f42389a = com.google.android.play.core.e.d.a(com.bytedance.r.a.a.a(context));
        }
        if (aVar.f42393e == null) {
            aVar.f42393e = com.ss.android.ugc.aweme.bf.d.a(context, "aab_success_times", 0);
        }
        List<String> list = makeInstallRequest.f42410a;
        if (list == null || list.isEmpty()) {
            com.bytedance.r.a.a.a(makeInstallRequest.f42411b);
            return;
        }
        list.removeAll(aVar.b(context));
        if (list.isEmpty()) {
            com.bytedance.r.a.a.a(makeInstallRequest.f42411b);
        } else {
            aVar.a(makeInstallRequest, false);
        }
    }

    public static void tryLoadAppBundlePlugin(Context context, b bVar, b bVar2, boolean z) {
        g.e().submit(new r(bVar, z, com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), bVar2));
    }

    static final /* synthetic */ void lambda$tryLoadAppBundlePlugin$7$LiveAppBundleUtils(b bVar, boolean z, Context context, b bVar2) {
        String[] strArr = bVar.soNames;
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                Set<String> set = sLoadedSoSet;
                if (!set.contains(str)) {
                    if (z) {
                        mainHandler.post(new s(str));
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        com.google.android.play.core.e.b.a(context, str);
                        if (z) {
                            mainHandler.post(new t(str, uptimeMillis));
                        }
                        set.add(str);
                    } catch (Throwable th) {
                        mainHandler.post(new u(z, str, uptimeMillis, th, bVar2));
                        return;
                    }
                }
            }
        }
        mainHandler.post(new v(bVar2));
    }

    static final /* synthetic */ void lambda$null$5$LiveAppBundleUtils(boolean z, String str, long j2, Throwable th, b bVar) {
        if (z) {
            monitorLoadFailed(str, SystemClock.uptimeMillis() - j2, th.toString());
        }
        if (bVar != null) {
            bVar.b();
        }
    }
}
