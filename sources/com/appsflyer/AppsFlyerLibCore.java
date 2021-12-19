package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.WindowManager;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.internal.ActivityCompat;
import com.appsflyer.internal.aa;
import com.appsflyer.internal.ab;
import com.appsflyer.internal.ac;
import com.appsflyer.internal.ad;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.af;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.j;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.Attr;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.Stats;
import com.appsflyer.internal.model.event.UninstallTokenEvent;
import com.appsflyer.internal.referrer.GoogleReferrer;
import com.appsflyer.internal.referrer.HuaweiReferrer;
import com.appsflyer.internal.s;
import com.appsflyer.internal.t;
import com.appsflyer.internal.v;
import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import com.appsflyer.internal.y;
import com.appsflyer.internal.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static String FIRST_LAUNCHES_URL;
    public static String REFERRER_TRACKING_URL;
    public static String REGISTER_URL;
    public static AppsFlyerLibCore instance = new AppsFlyerLibCore();

    /* renamed from: ı  reason: contains not printable characters */
    public static final String f58 = "5.4";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final String f59;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static AppsFlyerInAppPurchaseValidatorListener f60 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final String f61 = "44";

    /* renamed from: ɪ  reason: contains not printable characters */
    private static AppsFlyerConversionListener f62 = null;

    /* renamed from: ɹ  reason: contains not printable characters */
    private static String f63;

    /* renamed from: ɾ  reason: contains not printable characters */
    private static String f64;

    /* renamed from: І  reason: contains not printable characters */
    private static String f65 = new StringBuilder("https://%sadrevenue.%s/api/v").append("5.4").append("/android?buildnumber=5.4.1&app_id=").toString();

    /* renamed from: і  reason: contains not printable characters */
    private static final String f66;

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final List<String> f67 = Arrays.asList("is_cache");
    protected Uri latestDeepLink;

    /* renamed from: ŀ  reason: contains not printable characters */
    private long f68 = -1;

    /* renamed from: ł  reason: contains not printable characters */
    private ScheduledExecutorService f69 = null;

    /* renamed from: ſ  reason: contains not printable characters */
    private long f70;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private String f71;

    /* renamed from: ƚ  reason: contains not printable characters */
    private Map<Long, String> f72;

    /* renamed from: ǀ  reason: contains not printable characters */
    private boolean f73;

    /* renamed from: ȷ  reason: contains not printable characters */
    private long f74 = -1;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f75 = false;

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean f76 = false;

    /* renamed from: ɟ  reason: contains not printable characters */
    private ag f77 = new ag();

    /* renamed from: ɨ  reason: contains not printable characters */
    private String f78;

    /* renamed from: ɺ  reason: contains not printable characters */
    private boolean f79;

    /* renamed from: ɼ  reason: contains not printable characters */
    private boolean f80 = false;

    /* renamed from: ɿ  reason: contains not printable characters */
    private long f81 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: ʅ  reason: contains not printable characters */
    private long f82;

    /* renamed from: ʟ  reason: contains not printable characters */
    private GoogleReferrer f83;

    /* renamed from: ͻ  reason: contains not printable characters */
    private Map<String, Object> f84;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f85;

    /* renamed from: ι  reason: contains not printable characters */
    public String f86;

    /* renamed from: ϲ  reason: contains not printable characters */
    private Map<String, Object> f87;

    /* renamed from: ϳ  reason: contains not printable characters */
    private Application f88;

    /* renamed from: Ј  reason: contains not printable characters */
    private boolean f89 = false;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f90 = false;

    /* renamed from: с  reason: contains not printable characters */
    private boolean f91 = false;

    /* renamed from: т  reason: contains not printable characters */
    private HuaweiReferrer f92;

    /* renamed from: х  reason: contains not printable characters */
    private String f93;

    /* renamed from: ґ  reason: contains not printable characters */
    private String[] f94;

    /* renamed from: Ӏ  reason: contains not printable characters */
    long f95;

    public static int com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    private static Object com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static AppsFlyerLibCore getInstance() {
        return instance;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isTrackingStopped() {
        return this.f80;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m100(Context context, Intent intent) {
        if (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appsflyer_preinstall") != null) {
            getInstance();
            String com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appsflyer_preinstall");
            try {
                if (new JSONObject(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e2) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e2);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)));
        if (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null) {
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("referrer", com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            edit.apply();
            AppsFlyerProperties.getInstance().setReferrer(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFEvent weakContext = new BackgroundReferrerLaunch().context(context).m3().weakContext();
                weakContext.f8 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
                weakContext.f9 = intent;
                if (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.length() > 5 && m79(weakContext, getSharedPreferences(context))) {
                    m60(AFExecutor.getInstance().m7(), new e(this, weakContext, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m104(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = getSharedPreferences(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j2 = this.f70 - this.f82;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            w r9 = v.m203(weakReference.get().getContentResolver());
            if (r9 != null) {
                hashMap.put("amazon_aid", r9.f305);
                hashMap.put("amazon_aid_limit", String.valueOf(r9.m205()));
            }
            String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string3 != null) {
                hashMap.put("advertiserId", string3);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", ae.m127(weakReference));
            hashMap.put("time_in_app", String.valueOf(j2 / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(getLaunchCounter(sharedPreferences, false)));
            hashMap.put("channel", getConfiguredChannel(weakReference.get()));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("originalAppsflyerId", string2);
            if (this.f76) {
                try {
                    AFLogger.afDebugLog("Running callStats task");
                    new Thread(new ad((BackgroundEvent) new Stats().trackingStopped(isTrackingStopped()).params(hashMap).urlString(ServerConfigHandler.getUrl("https://%sstats.%s/stats")))).start();
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m101(AFEvent aFEvent) {
        Intent intent;
        String str;
        Context context = aFEvent.context();
        String str2 = "";
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            intent = activity.getIntent();
            Uri referrer = ActivityCompat.getReferrer(activity);
            if (referrer != null) {
                str = referrer.toString();
            }
            str = str2;
        } else {
            intent = null;
            str = str2;
        }
        if (AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String referrer2 = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer2 != null) {
            str2 = referrer2;
        }
        aFEvent.f8 = str2;
        aFEvent.f9 = intent;
        aFEvent.f19 = str;
        m40(aFEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x059f, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05a3, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a9, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05bc, code lost:
        if (r1 != null) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05bf, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05c1, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ce, code lost:
        com.appsflyer.AFLogger.afWarnLog("WARNING: READ_PHONE_STATE is missing.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05d6, code lost:
        if (r0 != null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0654, code lost:
        if (r1 != null) goto L_0x0658;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d2 A[Catch:{ Exception -> 0x02d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[ExcHandler: InvocationTargetException (unused java.lang.reflect.InvocationTargetException), SYNTHETIC, Splitter:B:238:0x0572] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x085d A[SYNTHETIC, Splitter:B:379:0x085d] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08c2  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0920  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x096a  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x096e  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0ad8  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0af0  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0b58  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> m102(com.appsflyer.AFEvent r32) {
        /*
        // Method dump skipped, instructions count: 2946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m102(com.appsflyer.AFEvent):java.util.Map");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m46(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m60(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j2, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j2, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e2) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e2);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[SYNTHETIC, Splitter:B:20:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x005e }] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m99(java.net.HttpURLConnection r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m99(java.net.HttpURLConnection):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean m96() {
        Map<String, Object> map = this.f87;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        if (string != null) {
            return string;
        }
        return "appsflyer.com";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if (string != null) {
            return string;
        }
        return "";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setSharingFilterForAllPartners() {
        this.f94 = new String[]{"all"};
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {

        /* renamed from: ɩ  reason: contains not printable characters */
        private static final List<String> f114 = Arrays.asList("googleplay", "playstore", "googleplaystore");

        /* renamed from: ι  reason: contains not printable characters */
        private static String f115 = "https://%sgcdsdk.%s/install_data/v4.0/";

        /* renamed from: ı  reason: contains not printable characters */
        private final String f116;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private AppsFlyerLibCore f117;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Application f118;

        /* renamed from: Ι  reason: contains not printable characters */
        final ScheduledExecutorService f119;

        /* renamed from: І  reason: contains not printable characters */
        private final int f120;

        /* renamed from: і  reason: contains not printable characters */
        private final AtomicInteger f121;

        static {
            Covode.recordClassIndex(2675);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9 A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0118 A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x016b A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0289 A[Catch:{ all -> 0x02a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x029e A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 691
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.b.run():void");
        }

        private b(b bVar) {
            this.f119 = AFExecutor.getInstance().m7();
            this.f121 = new AtomicInteger(0);
            this.f117 = bVar.f117;
            this.f118 = bVar.f118;
            this.f116 = bVar.f116;
            this.f120 = bVar.f120 + 1;
        }

        public static URLConnection com_appsflyer_AppsFlyerLibCore$b_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> m2 = n.f112474e.m(new com.ss.android.ugc.aweme.net.model.e<>(url, null, null, d.CONTINUE));
            if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                R r = m2.f112459b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new com.ss.android.ugc.aweme.net.l.b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
                }
                return aVar2;
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new com.ss.android.ugc.aweme.net.l.b((HttpsURLConnection) openConnection);
                } else if (!(openConnection instanceof HttpURLConnection)) {
                    return openConnection;
                } else {
                    aVar = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) openConnection);
                }
                return aVar;
            } else {
                throw m2.f112462e;
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: Ι  reason: contains not printable characters */
        private void m110(java.lang.String r4, int r5) {
            /*
                r3 = this;
                java.lang.String r2 = "Calling onConversionFailure with:\n"
                r0 = 500(0x1f4, float:7.0E-43)
                if (r0 > r5) goto L_0x002f
                r0 = 600(0x258, float:8.41E-43)
                if (r5 >= r0) goto L_0x002f
                int r1 = r3.f120
                r0 = 2
                if (r1 != r0) goto L_0x0022
                java.lang.String r0 = java.lang.String.valueOf(r4)
                java.lang.String r0 = r2.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r0)
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.m50()
                r0.onConversionDataFail(r4)
                return
            L_0x0022:
                com.appsflyer.AppsFlyerLibCore$b r2 = new com.appsflyer.AppsFlyerLibCore$b
                r2.<init>(r3)
                java.util.concurrent.ScheduledExecutorService r1 = r2.f119
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                com.appsflyer.AppsFlyerLibCore.m42(r1, r2, r0)
                return
            L_0x002f:
                java.lang.String r0 = java.lang.String.valueOf(r4)
                java.lang.String r0 = r2.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r0)
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.m50()
                r0.onConversionDataFail(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.b.m110(java.lang.String, int):void");
        }

        private b(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.f119 = AFExecutor.getInstance().m7();
            this.f121 = new AtomicInteger(0);
            this.f117 = appsFlyerLibCore;
            this.f118 = application;
            this.f116 = str;
            this.f120 = 0;
        }

        /* synthetic */ b(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b2) {
            this(appsFlyerLibCore, application, str);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {

        /* renamed from: ɩ  reason: contains not printable characters */
        private AFEvent f125;

        static {
            Covode.recordClassIndex(2677);
        }

        public final void run() {
            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
            AFEvent aFEvent = this.f125;
            aFEvent.f18 = aFEvent.f7.get();
            appsFlyerLibCore.m76((AppsFlyerLibCore) aFEvent);
        }

        private e(AFEvent aFEvent) {
            this.f125 = aFEvent;
        }

        /* synthetic */ e(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b2) {
            this(aFEvent);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m44() {
        if (!m69("waitForCustomerId") || AppsFlyerProperties.getInstance().getString("AppUserId") != null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m68() {
        GoogleReferrer googleReferrer = this.f83;
        if (googleReferrer == null || googleReferrer.oldMap.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m78() {
        Map<String, Object> map = this.f84;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void unregisterConversionListener() {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "unregisterConversionListener", new String[0]);
        f62 = null;
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f98;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2666(0xa6a, float:3.736E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.appsflyer.AppsFlyerLibCore.AnonymousClass10.f98 = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.appsflyer.AppsFlyerLibCore.AnonymousClass10.f98     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.AnonymousClass10.<clinit>():void");
        }
    }

    public AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getSdkVersion() {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "getSdkVersion", new String[0]);
        return new StringBuilder("version: 5.4.1 (build ").append(f61).append(")").toString();
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: ι  reason: contains not printable characters */
        private WeakReference<Context> f123;

        static {
            Covode.recordClassIndex(2676);
        }

        public final void run() {
            MethodCollector.i(2329);
            if (AppsFlyerLibCore.this.f90) {
                MethodCollector.o(2329);
                return;
            }
            AppsFlyerLibCore.this.f95 = System.currentTimeMillis();
            if (this.f123 == null) {
                MethodCollector.o(2329);
                return;
            }
            AppsFlyerLibCore.this.f90 = true;
            try {
                String r4 = AppsFlyerLibCore.m51("AppsFlyerKey");
                synchronized (this.f123) {
                    try {
                        aa.m116();
                        for (j jVar : aa.m117(this.f123.get())) {
                            AFLogger.afInfoLog(new StringBuilder("resending request: ").append(jVar.f265).toString());
                            try {
                                long currentTimeMillis = System.currentTimeMillis();
                                long parseLong = Long.parseLong(jVar.f266, 10);
                                AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                                AFEvent key = new CachedEvent().urlString(new StringBuilder().append(jVar.f265).append("&isCachedRequest=true&timeincache=").append((currentTimeMillis - parseLong) / 1000).toString()).post(jVar.m184()).key(r4);
                                key.f7 = this.f123;
                                key.f14 = jVar.f266;
                                key.f10 = false;
                                AppsFlyerLibCore.m41(appsFlyerLibCore, key);
                            } catch (Exception e2) {
                                AFLogger.afErrorLog("Failed to resend cached request", e2);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2329);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                AFLogger.afErrorLog("failed to check cache. ", e3);
            } catch (Throwable th2) {
                AppsFlyerLibCore.this.f90 = false;
                MethodCollector.o(2329);
                throw th2;
            }
            AppsFlyerLibCore.this.f90 = false;
            AppsFlyerLibCore.this.f69.shutdown();
            AppsFlyerLibCore.this.f69 = null;
            MethodCollector.o(2329);
        }

        public c(Context context) {
            this.f123 = new WeakReference<>(context);
        }
    }

    static {
        Covode.recordClassIndex(2664);
        String obj = new StringBuilder().append("5.4").append("/androidevent?buildnumber=5.4.1&app_id=").toString();
        f59 = obj;
        REGISTER_URL = new StringBuilder("https://%sregister.%s/api/v").append(obj).toString();
        String obj2 = new StringBuilder().append("5.4").append("/androidevent?app_id=").toString();
        f66 = obj2;
        FIRST_LAUNCHES_URL = new StringBuilder("https://%sconversions.%s/api/v").append(obj2).toString();
        f63 = new StringBuilder("https://%slaunches.%s/api/v").append(obj2).toString();
        f64 = new StringBuilder("https://%sinapps.%s/api/v").append(obj2).toString();
        REFERRER_TRACKING_URL = new StringBuilder("https://%sattr.%s/api/v").append(obj2).toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m89() {
        if (this.f74 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f74;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j2 = this.f74;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j2));
            long j3 = this.f68;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j3));
            if (currentTimeMillis < this.f81 && !isTrackingStopped()) {
                AFLogger.afInfoLog(com.a.a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f81)}));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(com.a.a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final AFEvent f112;

        static {
            Covode.recordClassIndex(2674);
        }

        public static int com_appsflyer_AppsFlyerLibCore$a_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0231, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0236, code lost:
            if (r7 == null) goto L_0x023b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x023b, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(1104);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017c, code lost:
            com.appsflyer.AFLogger.afErrorLog(r1.getMessage(), r1);
            com.bytedance.frameworks.apm.trace.MethodCollector.o(1104);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
            r3 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ad, code lost:
            r1.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
            r0 = r1.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
            if (r0 == null) goto L_0x01c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bd, code lost:
            com_appsflyer_AppsFlyerLibCore$a_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", "reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
            com_appsflyer_AppsFlyerLibCore$a_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", "caching request...");
            r6 = new java.io.File(com.appsflyer.internal.aa.m119(r2), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r6.createNewFile();
            r2 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r6.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            r2.write("version=");
            r2.write(r5.f267);
            r2.write(10);
            r2.write("url=");
            r2.write(r5.f265);
            r2.write(10);
            r2.write("data=");
            r2.write(android.util.Base64.encodeToString(r5.m184(), 2));
            r2.write(10);
            r2.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0227, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x017b A[ExcHandler: all (r1v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:35:0x0110] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01ad A[Catch:{ Exception -> 0x0228 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01b2 A[Catch:{ Exception -> 0x0228 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 586
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.a.run():void");
        }

        private a(AFEvent aFEvent) {
            this.f112 = aFEvent.weakContext();
        }

        /* synthetic */ a(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b2) {
            this(aFEvent);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void enableFacebookDeferredApplinks(boolean z) {
        this.f89 = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f75 = z;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    public static Bundle com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPhoneNumber(String str) {
        this.f93 = z.m213(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void startTracking(Context context) {
        startTracking(context, null);
    }

    public static Context com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return com.ss.android.ugc.aweme.bf.d.a(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), "appsflyer-data", 0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static /* synthetic */ String m51(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    /* renamed from: і  reason: contains not printable characters */
    private static boolean m94(Context context) {
        if (!getSharedPreferences(context).contains("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void onPause(Context context) {
        if (Foreground.listener != null) {
            Foreground.listener.onBecameBackground(context);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setMinTimeBetweenSessions(int i2) {
        this.f81 = TimeUnit.SECONDS.toMillis((long) i2);
    }

    public static ScheduledExecutorService com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return (ScheduledExecutorService) g.a(a2.a());
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static File m47(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public static Map<String, Object> m86(Context context) {
        String string = getSharedPreferences(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m38(string);
        }
        throw new y();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAttributionId(Context context) {
        try {
            return new ac(context).m124();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isPreInstalledApp(Context context) {
        try {
            if ((com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e2);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAndroidIdData(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setAndroidIdData", str);
        this.f86 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setImeiData(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setImeiData", str);
        this.f85 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOaidData(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setOaidData", str);
        this.f78 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(com.a.a("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f0 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(com.a.a("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f1 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setUserEmails(String... strArr) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static Map<String, Object> m38(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f67.contains(next)) {
                    if (jSONObject.isNull(next)) {
                        obj = null;
                    } else {
                        obj = jSONObject.get(next);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        } catch (JSONException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            return null;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static boolean m48(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) || !m71(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m62(Context context) {
        Intent intent;
        String str = null;
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
            try {
                Bundle com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
                if (!(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (str = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("af")) == null)) {
                    AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                    com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("af");
                    ((Activity) context).setIntent(intent.putExtras(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return str;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private static boolean m71(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e2);
            return false;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static float m95(Context context) {
        try {
            Intent com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
            int intExtra2 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAppsFlyerUID(Context context) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "getAppsFlyerUID", new String[0]);
        return ae.m127(new WeakReference(context));
    }

    public String getConfiguredChannel(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            if (context == null) {
                return null;
            }
            string = m63("CHANNEL", context.getPackageManager(), context.getPackageName());
            if (string == null) {
                return string;
            }
        }
        if (string.equals("")) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getOutOfStore(Context context) {
        String r0;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        if (context != null && (r0 = m63("AF_STORE", context.getPackageManager(), context.getPackageName())) != null) {
            return r0;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void reportTrackSession(Context context) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "reportTrackSession", new String[0]);
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.f189 = false;
        AFEvent context2 = new InAppEvent().context(context);
        context2.f21 = null;
        context2.f17 = null;
        m101(context2);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppId(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set("appid", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectAndroidID(boolean z) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectAndroidId", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectAndroidIdForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectIMEI(boolean z) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectIMEI", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectOaid(boolean z) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectOAID", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCurrencyCode(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set("currencyCode", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCustomerUserId(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set("AppUserId", str);
    }

    /* access modifiers changed from: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    AFLogger.afDebugLog(new StringBuilder("Unity setDeepLinkData = ").append(this.latestDeepLink).toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDeviceTrackingDisabled(boolean z) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setExtension(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set("sdkExtension", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setIsUpdate(boolean z) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("IS_UPDATE", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m21("Cannot set setOutOfStore with null");
    }

    public static URLConnection com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        com.ss.android.ugc.aweme.net.model.e<URL, URLConnection> m2 = n.f112474e.m(new com.ss.android.ugc.aweme.net.model.e<>(url, null, null, d.CONTINUE));
        if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
            R r = m2.f112459b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new com.ss.android.ugc.aweme.net.l.b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
            }
            return aVar2;
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new com.ss.android.ugc.aweme.net.l.b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m2.f112462e;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m40(AFEvent aFEvent) {
        boolean z;
        aFEvent.m3();
        if (aFEvent.f21 == null) {
            z = true;
        } else {
            z = false;
        }
        if (m44()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m89()) {
                return;
            }
            this.f74 = System.currentTimeMillis();
        }
        m60(AFExecutor.getInstance().m7(), new e(this, aFEvent.weakContext(), (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m77(AppsFlyerLibCore appsFlyerLibCore) {
        AFEvent context = new Attr().context(appsFlyerLibCore.f88);
        if (appsFlyerLibCore.m68() && appsFlyerLibCore.m79(context, getSharedPreferences(appsFlyerLibCore.f88))) {
            appsFlyerLibCore.m76(context);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private static boolean m91(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e3) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e3);
                }
            }
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppInviteOneLink(String str) {
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
        }
        AppsFlyerProperties.getInstance().set("oneLinkSlug", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            z = false;
        }
        if (ai.f184 == null) {
            ai.f184 = new ai();
        }
        ai.f184.m144("public_api_call", "log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setSharingFilter(String... strArr) {
        if (strArr != null && !Arrays.equals(this.f94, new String[]{"all"})) {
            Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !compile.matcher(str).matches()) {
                    AFLogger.afWarnLog("Invalid partner name :".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f94 = (String[]) arrayList.toArray(new String[0]);
            } else {
                this.f94 = null;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m75(Context context) {
        int i2;
        MethodCollector.i(510);
        if (AndroidUtils.m32()) {
            i2 = 23;
            AFLogger.afRDLog("OPPO device found");
        } else {
            i2 = 18;
        }
        if (Build.VERSION.SDK_INT < i2 || m69("keyPropDisableAFKeystore")) {
            AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; no KeyStore usage").toString());
            MethodCollector.o(510);
            return;
        }
        AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; use KeyStore").toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (!aFKeystoreWrapper.m12()) {
            aFKeystoreWrapper.f35 = ae.m127(new WeakReference(context));
            aFKeystoreWrapper.f33 = 0;
            aFKeystoreWrapper.m14(aFKeystoreWrapper.m13());
        } else {
            String r2 = aFKeystoreWrapper.m13();
            synchronized (aFKeystoreWrapper.f31) {
                try {
                    aFKeystoreWrapper.f33++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(r2)));
                    try {
                        synchronized (aFKeystoreWrapper.f31) {
                            try {
                                aFKeystoreWrapper.f34.deleteEntry(r2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (KeyStoreException e2) {
                        AFLogger.afErrorLog(new StringBuilder("Exception ").append(e2.getMessage()).append(" occurred").toString(), e2);
                    }
                } finally {
                    MethodCollector.o(510);
                }
            }
            aFKeystoreWrapper.m14(aFKeystoreWrapper.m13());
        }
        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.m11());
        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.m15()));
        MethodCollector.o(510);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m85(String str) {
        String str2 = null;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return str2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void sendDeepLinkData(Activity activity) {
        if (activity == null) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144("public_api_call", "sendDeepLinkData", "activity_null");
        } else if (activity.getIntent() != null) {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else {
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), "activity_intent_null");
        }
        try {
            startTracking(activity);
            AFLogger.afInfoLog(new StringBuilder("getDeepLinkData with activity ").append(activity.getIntent().getDataString()).toString());
        } catch (Exception e2) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e2)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m67(Map<String, String> map) {
        if (f62 != null) {
            try {
                AFLogger.afDebugLog(new StringBuilder("Calling onAppOpenAttribution with:\n").append(map.toString()).toString());
                f62.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Ι  reason: contains not printable characters */
    private void m76(AFEvent aFEvent) {
        boolean z;
        String str;
        ScheduledExecutorService r3;
        long j2;
        Context context = aFEvent.context();
        String str2 = aFEvent.f21;
        if (context == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!isTrackingStopped()) {
            AFLogger.afInfoLog(new StringBuilder("sendTrackingWithEvent from activity: ").append(context.getClass().getName()).toString());
        }
        boolean z2 = true;
        boolean z3 = false;
        if (str2 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = aFEvent instanceof BackgroundReferrerLaunch;
        boolean z5 = aFEvent instanceof Attr;
        aFEvent.f10 = z;
        Map<String, ?> r32 = m102(aFEvent);
        String str3 = (String) r32.get("appsflyerKey");
        if (str3 == null || str3.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            return;
        }
        if (!isTrackingStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
        }
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        if (z5 || z4) {
            str = ServerConfigHandler.getUrl(REFERRER_TRACKING_URL);
        } else if (!z) {
            str = ServerConfigHandler.getUrl(f64);
        } else if (launchCounter < 2) {
            str = ServerConfigHandler.getUrl(FIRST_LAUNCHES_URL);
        } else {
            str = ServerConfigHandler.getUrl(f63);
        }
        String obj = new StringBuilder().append(new StringBuilder().append(str).append(context.getPackageName()).toString()).append("&buildnumber=5.4.1").toString();
        String configuredChannel = getConfiguredChannel(context);
        if (configuredChannel != null) {
            obj = new StringBuilder().append(obj).append("&channel=").append(configuredChannel).toString();
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) && r32.get("advertiserId") != null) {
            try {
                if (TextUtils.isEmpty(this.f86) && r32.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(this.f85) && r32.remove("imei") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e2);
            }
        }
        AFEvent r0 = aFEvent.urlString(obj).params(r32).m3();
        r0.f11 = launchCounter;
        a aVar = new a(this, r0, (byte) 0);
        if (z) {
            if (GoogleReferrer.allow(this, context) && !m68()) {
                AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                z3 = true;
            }
            HuaweiReferrer huaweiReferrer = this.f92;
            if (huaweiReferrer != null && huaweiReferrer.valid()) {
                z3 = true;
            }
            if (this.f89 && !m78()) {
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                z3 = true;
            }
            if (!this.f91 || m96()) {
                z2 = z3;
            }
        } else {
            z2 = false;
        }
        if (AFDeepLinkManager.f2) {
            AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f25 == null) {
                instance2.f25 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(instance2.f24);
            }
            r3 = instance2.f25;
        } else {
            r3 = AFExecutor.getInstance().m7();
        }
        if (z2) {
            j2 = 500;
        } else {
            j2 = 0;
        }
        m60(r3, aVar, j2, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    @Override // com.appsflyer.AppsFlyerLib
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r19) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m43(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (true) {
                if (keys2.hasNext()) {
                    if (str != null) {
                        break loop2;
                    }
                    String next = keys2.next();
                    try {
                        JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                        int i3 = 0;
                        while (i3 < jSONArray2.length()) {
                            if (jSONArray2.getLong(i3) == ((Number) arrayList.get(0)).longValue() || jSONArray2.getLong(i3) == ((Number) arrayList.get(1)).longValue()) {
                                break;
                            } else if (jSONArray2.getLong(i3) == ((Number) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            } else {
                                i3++;
                                str = next;
                            }
                        }
                        continue;
                    } catch (JSONException unused2) {
                    }
                } else if (str == null) {
                    return;
                }
            }
        }
        jSONObject.remove(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m69(String str) {
        return AppsFlyerProperties.getInstance().getBoolean(str, false);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m87(AFEvent aFEvent) {
        boolean z;
        Throwable th;
        String str;
        Throwable th2;
        MethodCollector.i(1310);
        URL url = new URL(aFEvent.f20);
        byte[] r11 = aFEvent.m5();
        String key = aFEvent.key();
        String str2 = aFEvent.f14;
        boolean r17 = aFEvent.m4();
        Context context = aFEvent.context();
        AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener = aFEvent.f12;
        if (!r17 || f62 == null) {
            z = false;
        } else {
            z = true;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(url);
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(r11.length));
                if (aFEvent.isEncrypt()) {
                    str = "application/octet-stream";
                } else {
                    str = "application/json";
                }
                httpURLConnection.setRequestProperty("Content-Type", str);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream.write(r11);
                        dataOutputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        String r15 = m99(httpURLConnection);
                        if (ai.f184 == null) {
                            ai.f184 = new ai();
                        }
                        ai.f184.m144("server_response", url.toString(), String.valueOf(responseCode), r15);
                        AFLogger.afInfoLog("response code: ".concat(String.valueOf(responseCode)));
                        SharedPreferences sharedPreferences = getSharedPreferences(context);
                        if (responseCode == 200) {
                            if (context != null && r17) {
                                this.f68 = System.currentTimeMillis();
                            }
                            if (appsFlyerTrackingRequestListener != null) {
                                appsFlyerTrackingRequestListener.onTrackingRequestSuccess();
                            }
                            if (str2 != null) {
                                aa.m116();
                                aa.m118(str2, context);
                            } else {
                                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                                edit.putString("sentSuccessfully", "true");
                                edit.apply();
                                if (!this.f90 && System.currentTimeMillis() - this.f95 >= 15000 && this.f69 == null) {
                                    this.f69 = AFExecutor.getInstance().m7();
                                    m60(this.f69, new c(context), 1, TimeUnit.SECONDS);
                                }
                            }
                            String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                            if (string != null) {
                                AFLogger.afDebugLog("Uninstall Token exists: ".concat(String.valueOf(string)));
                                if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false)) {
                                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(string)));
                                    af.m128(context, string);
                                }
                            }
                            if (this.latestDeepLink != null) {
                                this.latestDeepLink = null;
                            }
                            this.f76 = ServerConfigHandler.m114(r15).optBoolean("send_background", false);
                        } else if (appsFlyerTrackingRequestListener != null) {
                            appsFlyerTrackingRequestListener.onTrackingRequestFailure("Failure: ".concat(String.valueOf(responseCode)));
                        }
                        long j2 = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0);
                        if (j2 != 0 && System.currentTimeMillis() - j2 > 5184000000L) {
                            SharedPreferences.Editor edit2 = getSharedPreferences(context).edit();
                            edit2.putBoolean("sixtyDayConversionData", true);
                            edit2.apply();
                            SharedPreferences.Editor edit3 = getSharedPreferences(context).edit();
                            edit3.putString("attributionId", null);
                            edit3.apply();
                            m65(context, "appsflyerConversionDataCacheExpiration", 0);
                        }
                        if (sharedPreferences.getString("attributionId", null) == null) {
                            if (key != null) {
                                if (z) {
                                    b bVar = new b(this, (Application) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), key, (byte) 0);
                                    m60(bVar.f119, bVar, 10, TimeUnit.MILLISECONDS);
                                }
                                httpURLConnection.disconnect();
                                MethodCollector.o(1310);
                            }
                        } else if (key != null) {
                            if (z && sharedPreferences.getString("attributionId", null) != null && getLaunchCounter(sharedPreferences, false) > 1) {
                                try {
                                    Map<String, Object> r3 = m86(context);
                                    if (r3 != null) {
                                        try {
                                            if (!r3.containsKey("is_first_launch")) {
                                                r3.put("is_first_launch", Boolean.FALSE);
                                            }
                                            AFLogger.afDebugLog(new StringBuilder("Calling onConversionDataSuccess with:\n").append(r3.toString()).toString());
                                            f62.onConversionDataSuccess(r3);
                                        } catch (Throwable th3) {
                                            AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
                                        }
                                    }
                                } catch (y e2) {
                                    AFLogger.afErrorLog(e2.getMessage(), e2);
                                }
                            }
                            httpURLConnection.disconnect();
                            MethodCollector.o(1310);
                        }
                        AFLogger.afWarnLog("AppsFlyer dev key is missing.");
                        httpURLConnection.disconnect();
                        MethodCollector.o(1310);
                    } catch (Throwable th4) {
                        th2 = th4;
                        dataOutputStream.close();
                        MethodCollector.o(1310);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (appsFlyerTrackingRequestListener != null) {
                        appsFlyerTrackingRequestListener.onTrackingRequestFailure("No Connectivity");
                    }
                    MethodCollector.o(1310);
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                MethodCollector.o(1310);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            MethodCollector.o(1310);
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m45(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.f87 = new ConcurrentHashMap();
            AnonymousClass4 r3 = new t.d() {
                /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(2669);
                }

                @Override // com.appsflyer.internal.t.d
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m106(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.f87.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }

                @Override // com.appsflyer.internal.t.d
                /* renamed from: ı  reason: contains not printable characters */
                public final void m105(String str, String str2) {
                    AppsFlyerLibCore.this.f87.put("signedData", str);
                    AppsFlyerLibCore.this.f87.put("signature", str2);
                    AppsFlyerLibCore.this.f87.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2);
                t.AnonymousClass3 r6 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0037: CONSTRUCTOR  (r6v1 'r6' com.appsflyer.internal.t$3) = (r3v0 'r3' com.appsflyer.AppsFlyerLibCore$4) call: com.appsflyer.internal.t.3.<init>(com.appsflyer.internal.t$d):void type: CONSTRUCTOR in method: com.appsflyer.AppsFlyerLibCore.ￄﾱ(android.content.Context):boolean, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.appsflyer.internal.t, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 140
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m45(android.content.Context):boolean");
            }

            /* renamed from: ι  reason: contains not printable characters */
            private static boolean m90(File file) {
                if (file == null || !file.exists()) {
                    return true;
                }
                return false;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void updateServerUninstallToken(Context context, String str) {
                af.m128(context, str);
            }

            public static Object com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }

            public static String com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
                f62 = new AppsFlyerConversionListener() {
                    /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(2671);
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onAppOpenAttribution(Map<String, String> map) {
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onAttributionFailure(String str) {
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onConversionDataFail(String str) {
                        AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                        ConversionDataListener.this.onConversionFailure(str);
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onConversionDataSuccess(Map<String, Object> map) {
                        AFLogger.afDebugLog(new StringBuilder("Calling onConversionDataLoaded with:\n").append(map.toString()).toString());
                        ConversionDataListener.this.onConversionDataLoaded(map);
                    }
                };
            }

            public final int getLaunchCounter(SharedPreferences sharedPreferences, boolean z) {
                return m72(sharedPreferences, "appsFlyerCount", z);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void startTracking(Context context, String str) {
                startTracking(context, str, null);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("public_api_call", "registerConversionListener", new String[0]);
                if (appsFlyerConversionListener != null) {
                    f62 = appsFlyerConversionListener;
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            private static String m52(SimpleDateFormat simpleDateFormat, Context context) {
                String string = getSharedPreferences(context).getString("appsFlyerFirstInstall", null);
                if (string == null) {
                    if (m94(context)) {
                        AFLogger.afDebugLog("AppsFlyer: first launch detected");
                        string = simpleDateFormat.format(new Date());
                    } else {
                        string = "";
                    }
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putString("appsFlyerFirstInstall", string);
                    edit.apply();
                }
                AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
                return string;
            }

            /* access modifiers changed from: private */
            /* renamed from: ι  reason: contains not printable characters */
            public static String m83(Context context, String str) {
                SharedPreferences sharedPreferences = getSharedPreferences(context);
                if (sharedPreferences.contains("CACHED_CHANNEL")) {
                    return sharedPreferences.getString("CACHED_CHANNEL", null);
                }
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putString("CACHED_CHANNEL", str);
                edit.apply();
                return str;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("public_api_call", "registerValidatorListener", new String[0]);
                AFLogger.afDebugLog("registerValidatorListener called");
                if (appsFlyerInAppPurchaseValidatorListener == null) {
                    AFLogger.afDebugLog("registerValidatorListener null listener");
                } else {
                    f60 = appsFlyerInAppPurchaseValidatorListener;
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setHost(String str, String str2) {
                if (str != null) {
                    AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
                }
                if (str2 == null || str2.isEmpty()) {
                    AFLogger.afWarnLog("hostName cannot be null or empty");
                } else {
                    AppsFlyerProperties.getInstance().set("custom_host", str2);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackAppLaunch(Context context, String str) {
                if (GoogleReferrer.allow(this, context)) {
                    if (this.f83 == null) {
                        this.f83 = new GoogleReferrer();
                        AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                        this.f83.start(context, new Runnable() {
                            /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass9 */

                            static {
                                Covode.recordClassIndex(2673);
                            }

                            public final void run() {
                                try {
                                    AFLogger.afDebugLog("Install Referrer collected locally");
                                    AppsFlyerLibCore.m77(AppsFlyerLibCore.this);
                                } catch (Throwable th) {
                                    AFLogger.afErrorLog(th.getMessage(), th);
                                }
                            }
                        });
                    } else {
                        AFLogger.afWarnLog("GoogleReferrer instance already created");
                    }
                }
                m57(context, str, "", (Intent) null);
            }

            public static Object com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
                Object obj;
                MethodCollector.i(308);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!i.f107220b && "connectivity".equals(str)) {
                        try {
                            new com.bytedance.platform.godzilla.b.b.b().a();
                            i.f107220b = true;
                            obj = context.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = context.getSystemService(str);
                } else if (i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = context.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                } catch (Exception e2) {
                                    com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            i.f107219a = false;
                        } finally {
                            MethodCollector.o(308);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
            /* renamed from: ι  reason: contains not printable characters */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m84(java.io.File r4, java.lang.String r5) {
                /*
                // Method dump skipped, instructions count: 107
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m84(java.io.File, java.lang.String):java.lang.String");
            }

            @Override // com.appsflyer.AppsFlyerLib
            public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
                String str2;
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai aiVar = ai.f184;
                String[] strArr = new String[2];
                strArr[0] = str;
                if (appsFlyerConversionListener == null) {
                    str2 = "null";
                } else {
                    str2 = "conversionDataListener";
                }
                strArr[1] = str2;
                aiVar.m144("public_api_call", "init", strArr);
                AFLogger.m18(com.a.a("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, f61}));
                this.f79 = true;
                AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
                ah.m136(str);
                f62 = appsFlyerConversionListener;
                return this;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void performOnAppAttribution(Context context, URI uri) {
                if (uri == null || uri.toString().isEmpty()) {
                    AppsFlyerConversionListener appsFlyerConversionListener = f62;
                    if (appsFlyerConversionListener != null) {
                        appsFlyerConversionListener.onAttributionFailure(new StringBuilder("Link is \"").append(uri).append("\"").toString());
                    }
                } else if (context == null) {
                    AppsFlyerConversionListener appsFlyerConversionListener2 = f62;
                    if (appsFlyerConversionListener2 != null) {
                        appsFlyerConversionListener2.onAttributionFailure(new StringBuilder("Context is \"").append(context).append("\"").toString());
                    }
                } else {
                    AFDeepLinkManager.getInstance();
                    AFDeepLinkManager.m2(context, new HashMap(), Uri.parse(uri.toString()));
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setCustomerIdAndTrack(String str, Context context) {
                Intent intent;
                if (context == null) {
                    return;
                }
                if (m44()) {
                    setCustomerUserId(str);
                    AppsFlyerProperties.getInstance().set("waitForCustomerId", false);
                    AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                    String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                    String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                    if (referrer == null) {
                        referrer = "";
                    }
                    if (context instanceof Activity) {
                        intent = ((Activity) context).getIntent();
                    } else {
                        intent = null;
                    }
                    m57(context, string, referrer, intent);
                    if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                        m103(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                        return;
                    }
                    return;
                }
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void stopTracking(boolean z, Context context) {
                this.f80 = z;
                aa.m116();
                try {
                    File r1 = aa.m119(context);
                    if (!r1.exists()) {
                        r1.mkdir();
                    } else {
                        File[] listFiles = r1.listFiles();
                        for (File file : listFiles) {
                            com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", new StringBuilder("Found cached request").append(file.getName()).toString());
                            aa.m118(aa.m115(file).f266, context);
                        }
                    }
                } catch (Exception unused) {
                    com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppsFlyer_5.4.1", "Could not cache request");
                }
                if (this.f80) {
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putBoolean("is_stop_tracking_used", true);
                    edit.apply();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            static void m39(Context context, String str) {
                JSONObject jSONObject;
                JSONArray jSONArray;
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String string = getSharedPreferences(context).getString("extraReferrers", null);
                    if (string == null) {
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    } else {
                        jSONObject = new JSONObject(string);
                        if (jSONObject.has(str)) {
                            jSONArray = new JSONArray((String) jSONObject.get(str));
                        } else {
                            jSONArray = new JSONArray();
                        }
                    }
                    if (((long) jSONArray.length()) < 5) {
                        jSONArray.put(currentTimeMillis);
                    }
                    if (((long) jSONObject.length()) >= 4) {
                        m43(jSONObject);
                    }
                    jSONObject.put(str, jSONArray.toString());
                    String jSONObject2 = jSONObject.toString();
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putString("extraReferrers", jSONObject2);
                    edit.apply();
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            private static void m66(Context context, Map<String, ? super String> map) {
                s.a r2 = s.m195(context);
                map.put("network", r2.f294);
                if (r2.f296 != null) {
                    map.put("operator", r2.f296);
                }
                if (r2.f295 != null) {
                    map.put("carrier", r2.f295);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
                ArrayList arrayList = new ArrayList(strArr.length + 1);
                arrayList.add(emailsCryptType.toString());
                arrayList.addAll(Arrays.asList(strArr));
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
                AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
                HashMap hashMap = new HashMap();
                String str = null;
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : strArr) {
                    if (AnonymousClass10.f98[emailsCryptType.ordinal()] != 2) {
                        arrayList2.add(z.m213(str2));
                        str = "sha256_el_arr";
                    } else {
                        arrayList2.add(str2);
                        str = "plain_el_arr";
                    }
                }
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
            }

            /* renamed from: ı  reason: contains not printable characters */
            static /* synthetic */ void m41(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) {
                String jSONObject;
                AFLogger.afInfoLog(new StringBuilder("url: ").append(aFEvent.urlString()).toString());
                if (aFEvent.f14 != null) {
                    jSONObject = Base64.encodeToString(aFEvent.m5(), 2);
                    AFLogger.afInfoLog("cached data: ".concat(String.valueOf(jSONObject)));
                } else {
                    jSONObject = new JSONObject(aFEvent.params()).toString();
                    ah.m137("data: ".concat(String.valueOf(jSONObject)));
                }
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("server_request", aFEvent.urlString(), jSONObject);
                try {
                    appsFlyerLibCore.m87(aFEvent);
                } catch (IOException e2) {
                    AFLogger.afErrorLog("Exception in sendRequestToServer. ", e2);
                    if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                        appsFlyerLibCore.m87(aFEvent.urlString(aFEvent.urlString().replace("https:", "http:")));
                    } else {
                        AFLogger.afInfoLog(new StringBuilder("failed to send requeset to server. ").append(e2.getLocalizedMessage()).toString());
                        throw e2;
                    }
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void sendAdRevenue(Context context, Map<String, Object> map) {
                AFEvent context2 = new AdRevenue().context(context);
                context2.f17 = map;
                Context context3 = context2.context();
                String obj = new StringBuilder().append(ServerConfigHandler.getUrl(f65)).append(context3.getPackageName()).toString();
                SharedPreferences sharedPreferences = getSharedPreferences(context3);
                int launchCounter = getLaunchCounter(sharedPreferences, false);
                int r2 = m72(sharedPreferences, "appsFlyerAdRevenueCount", true);
                HashMap hashMap = new HashMap();
                hashMap.put("ad_network", context2.f17);
                hashMap.put("adrevenue_counter", Integer.valueOf(r2));
                String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                hashMap.put("af_key", string);
                hashMap.put("launch_counter", Integer.valueOf(launchCounter));
                hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
                hashMap.put("uid", ae.m127(new WeakReference(context3)));
                String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                hashMap.put("advertiserIdEnabled", AppsFlyerProperties.getInstance().getString("advertiserIdEnabled"));
                if (string2 != null) {
                    hashMap.put("advertiserId", string2);
                }
                hashMap.put("device", Build.DEVICE);
                m58(context3, hashMap);
                try {
                    PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                    hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    long j2 = packageInfo.firstInstallTime;
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("install_date", simpleDateFormat.format(new Date(j2)));
                    String string3 = sharedPreferences.getString("appsFlyerFirstInstall", null);
                    if (string3 == null) {
                        string3 = m52(simpleDateFormat, context3);
                    }
                    hashMap.put("first_launch_date", string3);
                } catch (Throwable th) {
                    AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
                }
                AFEvent r0 = context2.urlString(obj).params(hashMap).m3();
                r0.f11 = launchCounter;
                m60(AFExecutor.getInstance().m7(), new a(this, r0.key(string), (byte) 0), 1, TimeUnit.MILLISECONDS);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            private static void m58(Context context, Map<String, Object> map) {
                String str;
                WindowManager windowManager = (WindowManager) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window");
                if (windowManager != null) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    if (rotation == 0) {
                        str = "p";
                    } else if (rotation == 1) {
                        str = "l";
                    } else if (rotation == 2) {
                        str = "pr";
                    } else if (rotation != 3) {
                        str = "";
                    } else {
                        str = "lr";
                    }
                    map.put("sc_o", str);
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            private boolean m79(AFEvent aFEvent, SharedPreferences sharedPreferences) {
                boolean z;
                int launchCounter = getLaunchCounter(sharedPreferences, false);
                if (launchCounter != 1 || (aFEvent instanceof Attr)) {
                    z = false;
                } else {
                    z = true;
                }
                if ((sharedPreferences.getBoolean("newGPReferrerSent", false) || launchCounter != 1) && !z) {
                    return false;
                }
                return true;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m103(Context context, String str) {
                if (m44()) {
                    AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
                    return;
                }
                HashMap hashMap = new HashMap();
                String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                if (string == null) {
                    AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
                    return;
                }
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    hashMap.put("app_version_name", packageInfo.versionName);
                    hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                    long j2 = packageInfo.firstInstallTime;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("installDate", simpleDateFormat.format(new Date(j2)));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th);
                }
                m66(context, hashMap);
                String string2 = AppsFlyerProperties.getInstance().getString("AppUserId");
                if (string2 != null) {
                    hashMap.put("appUserId", string2);
                }
                try {
                    hashMap.put("model", Build.MODEL);
                    hashMap.put("brand", Build.BRAND);
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
                }
                if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                    hashMap.put("deviceTrackingDisabled", "true");
                }
                w r6 = v.m203(context.getContentResolver());
                if (r6 != null) {
                    hashMap.put("amazon_aid", r6.f305);
                    hashMap.put("amazon_aid_limit", String.valueOf(r6.m205()));
                }
                String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (string3 != null) {
                    hashMap.put("advertiserId", string3);
                }
                hashMap.put("devkey", string);
                hashMap.put("uid", ae.m127(new WeakReference(context)));
                hashMap.put("af_gcm_token", str);
                hashMap.put("launch_counter", Integer.toString(getLaunchCounter(getSharedPreferences(context), false)));
                hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String configuredChannel = getConfiguredChannel(context);
                if (configuredChannel != null) {
                    hashMap.put("channel", configuredChannel);
                }
                try {
                    new Thread(new ad((BackgroundEvent) new UninstallTokenEvent().trackingStopped(isTrackingStopped()).params(hashMap).context(context).urlString(new StringBuilder().append(ServerConfigHandler.getUrl(REGISTER_URL)).append(packageName).toString()))).start();
                } catch (Throwable th3) {
                    AFLogger.afErrorLog(th3.getMessage(), th3);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackEvent(Context context, String str, Map<String, Object> map) {
                trackEvent(context, str, map, null);
            }

            /* access modifiers changed from: private */
            /* renamed from: ɩ  reason: contains not printable characters */
            public static void m65(Context context, String str, long j2) {
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putLong(str, j2);
                edit.apply();
            }

            public static Intent com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e2) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e2;
                }
            }

            public static ApplicationInfo com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(PackageManager packageManager, String str, int i2) {
                if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName()) || i2 != 128) {
                    return packageManager.getApplicationInfo(str, i2);
                }
                if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                    com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, i2);
                }
                return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
                r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
                if (r0 != false) goto L_0x0025;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
                r2 = move-exception;
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
                com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
                return null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
                r0 = r2.getMessage();
                r2 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                if (r0 != null) goto L_0x0018;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static android.content.Intent com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                /*
                    android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                    com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                    android.content.Intent r0 = com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                    return r0
                L_0x000c:
                    android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                    return r0
                L_0x0011:
                    r2 = move-exception
                    java.lang.String r0 = r2.getMessage()
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "regist too many Broadcast Receivers"
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto L_0x0025
                    goto L_0x0027
                L_0x0025:
                    throw r2
                L_0x0026:
                    r2 = move-exception
                L_0x0027:
                    java.lang.String r0 = "Register Receiver Exception"
                    com.bytedance.c.a.a.a.b.a(r2, r0)
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
            }

            /* renamed from: Ι  reason: contains not printable characters */
            private static int m72(SharedPreferences sharedPreferences, String str, boolean z) {
                int i2 = sharedPreferences.getInt(str, 0);
                if (z) {
                    i2++;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putInt(str, i2);
                    edit.apply();
                }
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                if (ai.f184.m151()) {
                    if (ai.f184 == null) {
                        ai.f184 = new ai();
                    }
                    ai.f184.m147(String.valueOf(i2));
                }
                return i2;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            private static String m63(String str, PackageManager packageManager, String str2) {
                Object com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
                try {
                    Bundle bundle = ((PackageItemInfo) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(packageManager, str2, 128)).metaData;
                    if (bundle == null || (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
                        return null;
                    }
                    String obj = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString();
                    if (!obj.replaceAll("\\p{C}", "").equals(obj)) {
                        AFLogger.afWarnLog(new StringBuilder("Manifest meta-data ").append(str).append(": ").append(obj).append(" contains non-printing characters").toString());
                    }
                    return obj;
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Could not find ").append(str).append(" value in the manifest").toString(), th);
                    return null;
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setPreinstallAttribution(String str, String str2, String str3) {
                AFLogger.afDebugLog("setPreinstallAttribution API called");
                JSONObject jSONObject = new JSONObject();
                if (str != null) {
                    try {
                        jSONObject.put("pid", str);
                    } catch (JSONException e2) {
                        AFLogger.afErrorLog(e2.getMessage(), e2);
                    }
                }
                if (str2 != null) {
                    jSONObject.put("c", str2);
                }
                if (str3 != null) {
                    jSONObject.put("af_siteid", str3);
                }
                if (jSONObject.has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
                    return;
                }
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackLocation(Context context, double d2, double d3) {
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("public_api_call", "trackLocation", String.valueOf(d2), String.valueOf(d3));
                HashMap hashMap = new HashMap();
                hashMap.put("af_long", Double.toString(d3));
                hashMap.put("af_lat", Double.toString(d2));
                AFEvent context2 = new InAppEvent().context(context);
                context2.f21 = "af_location_coordinates";
                context2.f17 = hashMap;
                m101(context2);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            static /* synthetic */ void m56(Context context, String str, String str2) {
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putString(str, str2);
                edit.apply();
            }

            /* access modifiers changed from: protected */
            public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
                String substring;
                String obj = uri.toString();
                if (obj == null) {
                    obj = null;
                } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                    int indexOf = obj.indexOf(63);
                    if (indexOf == -1) {
                        substring = "";
                    } else {
                        substring = obj.substring(indexOf);
                    }
                    if (substring.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        if (substring.contains("&")) {
                            arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                        } else {
                            arrayList.add(substring);
                        }
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.contains("access_token")) {
                                it.remove();
                            } else {
                                if (sb.length() != 0) {
                                    sb.append("&");
                                } else if (!str.startsWith("?")) {
                                    sb.append("?");
                                }
                                sb.append(str);
                            }
                        }
                        obj = obj.replace(substring, sb.toString());
                    }
                }
                if (!map.containsKey("af_deeplink")) {
                    map.put("af_deeplink", obj);
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("link", uri.toString());
                final WeakReference weakReference = new WeakReference(context);
                ab abVar = new ab(uri, this);
                abVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
                if (abVar.m120()) {
                    abVar.f167 = new ab.b() {
                        /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(2672);
                        }

                        /* renamed from: ı  reason: contains not printable characters */
                        private void m107(Map<String, String> map) {
                            if (weakReference.get() != null) {
                                AppsFlyerLibCore.m56((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                            }
                        }

                        @Override // com.appsflyer.internal.ab.b
                        /* renamed from: ı  reason: contains not printable characters */
                        public final void m108(String str) {
                            if (AppsFlyerLibCore.f62 != null) {
                                m107(hashMap);
                                AFLogger.afDebugLog("Calling onAttributionFailure with:\n".concat(String.valueOf(str)));
                                AppsFlyerLibCore.f62.onAttributionFailure(str);
                            }
                        }

                        @Override // com.appsflyer.internal.ab.b
                        /* renamed from: ɩ  reason: contains not printable characters */
                        public final void m109(Map<String, String> map) {
                            for (String str : map.keySet()) {
                                hashMap.put(str, map.get(str));
                            }
                            m107(hashMap);
                            AppsFlyerLibCore.m67(hashMap);
                        }
                    };
                    AFExecutor.getInstance().getThreadPoolExecutor().execute(abVar);
                    return;
                }
                m67(AndroidUtils.m34(context, hashMap, uri));
            }

            @Override // com.appsflyer.AppsFlyerLib
            public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, final Context context) {
                if (context != null) {
                    this.f88 = (Application) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                    if (GoogleReferrer.allow(this, context)) {
                        if (this.f83 == null) {
                            this.f83 = new GoogleReferrer();
                            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                            this.f83.start(context, new Runnable() {
                                /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(2668);
                                }

                                public final void run() {
                                    try {
                                        AFLogger.afDebugLog("Install Referrer collected locally");
                                        AppsFlyerLibCore.m77(AppsFlyerLibCore.this);
                                    } catch (Throwable th) {
                                        AFLogger.afErrorLog(th.getMessage(), th);
                                    }
                                }
                            });
                        } else {
                            AFLogger.afWarnLog("GoogleReferrer instance already created");
                        }
                    }
                    final SharedPreferences sharedPreferences = getSharedPreferences(context);
                    if (getLaunchCounter(sharedPreferences, false) < 2) {
                        HuaweiReferrer huaweiReferrer = new HuaweiReferrer(new Runnable() {
                            /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(2670);
                            }

                            public final void run() {
                                if (AppsFlyerLibCore.this.getLaunchCounter(sharedPreferences, false) != 1) {
                                    return;
                                }
                                if (!GoogleReferrer.allow(AppsFlyerLibCore.this, context) || sharedPreferences.getBoolean("newGPReferrerSent", false)) {
                                    AppsFlyerLibCore.this.m76((AppsFlyerLibCore) new Attr().context(context));
                                }
                            }
                        }, context);
                        this.f92 = huaweiReferrer;
                        huaweiReferrer.start();
                    }
                    this.f91 = m45(context);
                } else {
                    AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
                }
                return init(str, appsFlyerConversionListener);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void startTracking(Context context, final String str, final AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
                if (!this.f79) {
                    AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                    if (str == null) {
                        return;
                    }
                }
                if (Foreground.listener == null) {
                    this.f88 = (Application) com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                    if (ai.f184 == null) {
                        ai.f184 = new ai();
                    }
                    ai.f184.m144("public_api_call", "startTracking", str);
                    String str2 = f61;
                    AFLogger.afInfoLog(com.a.a("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, str2}));
                    AFLogger.afInfoLog(new StringBuilder("Build Number: ").append(str2).toString());
                    AppsFlyerProperties.getInstance().loadProperties(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this.f88));
                    if (!TextUtils.isEmpty(str)) {
                        AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
                        ah.m136(str);
                    } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
                        AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
                        return;
                    }
                    Context baseContext = this.f88.getBaseContext();
                    try {
                        if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                            if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                                AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                            } else {
                                AFLogger.m21("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                            }
                        }
                    } catch (Exception e2) {
                        AFLogger.afRDLog(new StringBuilder("checkBackupRules Exception: ").append(e2.toString()).toString());
                    }
                    if (this.f89) {
                        Context com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this.f88);
                        this.f84 = new HashMap();
                        final long currentTimeMillis = System.currentTimeMillis();
                        AnonymousClass1 r2 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                            /* class com.appsflyer.AppsFlyerLibCore.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(2665);
                            }

                            @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                            public final void onAppLinkFetchFailed(String str) {
                                AppsFlyerLibCore.this.f84.put("error", str);
                            }

                            @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                            public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                                if (str != null) {
                                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                                    AppsFlyerLibCore.this.f84.put("link", str);
                                    if (str2 != null) {
                                        AppsFlyerLibCore.this.f84.put("target_url", str2);
                                    }
                                    if (str3 != null) {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("promo_code", str3);
                                        hashMap.put("deeplink_context", hashMap2);
                                        AppsFlyerLibCore.this.f84.put("extras", hashMap);
                                    }
                                } else {
                                    AppsFlyerLibCore.this.f84.put("link", "");
                                }
                                AppsFlyerLibCore.this.f84.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            }
                        };
                        try {
                            Class.forName("com.facebook.m").getMethod("a", Context.class).invoke(null, com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                            Class<?> cls = Class.forName("com.facebook.applinks.a");
                            Class<?> cls2 = Class.forName("com.facebook.applinks.a$a");
                            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                            AFFacebookDeferredDeeplink.AnonymousClass5 r10 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: CONSTRUCTOR  (r10v0 'r10' com.appsflyer.AFFacebookDeferredDeeplink$5) = (r11v0 'cls' java.lang.Class<?>), (r2v1 'r2' com.appsflyer.AppsFlyerLibCore$1) call: com.appsflyer.AFFacebookDeferredDeeplink.5.<init>(java.lang.Class, com.appsflyer.AFFacebookDeferredDeeplink$AppLinkFetchEvents):void type: CONSTRUCTOR in method: com.appsflyer.AppsFlyerLibCore.startTracking(android.content.Context, java.lang.String, com.appsflyer.AppsFlyerTrackingRequestListener):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.appsflyer.AFFacebookDeferredDeeplink, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 31 more
                                */
                            /*
                            // Method dump skipped, instructions count: 413
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.startTracking(android.content.Context, java.lang.String, com.appsflyer.AppsFlyerTrackingRequestListener):void");
                        }

                        @Override // com.appsflyer.AppsFlyerLib
                        public void trackEvent(Context context, String str, Map<String, Object> map, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
                            HashMap hashMap;
                            Map map2;
                            AFEvent context2 = new InAppEvent().context(context);
                            context2.f21 = str;
                            if (map == null) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap(map);
                            }
                            context2.f17 = hashMap;
                            context2.f12 = appsFlyerTrackingRequestListener;
                            if (ai.f184 == null) {
                                ai.f184 = new ai();
                            }
                            ai aiVar = ai.f184;
                            String[] strArr = new String[2];
                            strArr[0] = str;
                            if (context2.f17 == null) {
                                map2 = new HashMap();
                            } else {
                                map2 = context2.f17;
                            }
                            strArr[1] = new JSONObject(map2).toString();
                            aiVar.m144("public_api_call", "trackEvent", strArr);
                            if (str != null) {
                                AFSensorManager r7 = AFSensorManager.m26(context);
                                long currentTimeMillis = System.currentTimeMillis();
                                if (r7.f47 != 0) {
                                    r7.f42++;
                                    if (r7.f47 - currentTimeMillis < 500) {
                                        r7.f41.removeCallbacks(r7.f51);
                                        r7.f41.post(r7.f46);
                                    }
                                } else {
                                    r7.f41.post(r7.f50);
                                    r7.f41.post(r7.f46);
                                }
                                r7.f47 = currentTimeMillis;
                            }
                            m101(context2);
                        }

                        /* renamed from: ǃ  reason: contains not printable characters */
                        private void m57(Context context, String str, String str2, Intent intent) {
                            AFEvent context2 = new Launch().context(context);
                            context2.f21 = null;
                            AFEvent key = context2.key(str);
                            key.f17 = null;
                            key.f8 = str2;
                            key.f9 = intent;
                            key.f19 = null;
                            m40(key);
                        }

                        @Override // com.appsflyer.AppsFlyerLib
                        public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
                            String obj;
                            Intent intent;
                            if (ai.f184 == null) {
                                ai.f184 = new ai();
                            }
                            ai aiVar = ai.f184;
                            String[] strArr = new String[6];
                            strArr[0] = str;
                            strArr[1] = str2;
                            strArr[2] = str3;
                            strArr[3] = str4;
                            strArr[4] = str5;
                            if (map == null) {
                                obj = "";
                            } else {
                                obj = map.toString();
                            }
                            strArr[5] = obj;
                            aiVar.m144("public_api_call", "validateAndTrackInAppPurchase", strArr);
                            if (!isTrackingStopped()) {
                                AFLogger.afInfoLog(new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
                            }
                            if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
                                AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f60;
                                if (appsFlyerInAppPurchaseValidatorListener != null) {
                                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                                    return;
                                }
                                return;
                            }
                            Context com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                            if (context instanceof Activity) {
                                intent = ((Activity) context).getIntent();
                            } else {
                                intent = null;
                            }
                            new Thread(new x(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, string, str, str2, str3, str4, str5, map, intent)).start();
                        }
                    }
