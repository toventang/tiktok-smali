package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.q;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

public class AFDeepLinkManager {
    public static AFDeepLinkManager instance;
    public static Uri trampolineUri;

    /* renamed from: ı  reason: contains not printable characters */
    public static String[] f0;

    /* renamed from: ǃ  reason: contains not printable characters */
    static String[] f1;

    /* renamed from: ɩ  reason: contains not printable characters */
    static volatile boolean f2;

    /* renamed from: Ι  reason: contains not printable characters */
    static final int f3 = ((int) TimeUnit.SECONDS.toMillis(2));

    private AFDeepLinkManager() {
    }

    public static AFDeepLinkManager getInstance() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    static {
        Covode.recordClassIndex(2638);
    }

    public static ScheduledExecutorService com_appsflyer_AFDeepLinkManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return (ScheduledExecutorService) g.a(a2.a());
    }

    /* access modifiers changed from: protected */
    public void collectIntentsFromActivities(Intent intent) {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && intent.getData() != trampolineUri) {
            trampolineUri = intent.getData();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m0(String str) {
        if (f1 == null || str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate ESP URLs :").append(Arrays.asList(f1)).toString());
        String[] strArr = f1;
        for (String str2 : strArr) {
            if (str.contains("://".concat(String.valueOf(str2)))) {
                AFLogger.afRDLog("Deeplink matches ESP domain: ".concat(String.valueOf(str2)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m2(final Context context, final Map<String, Object> map, final Uri uri) {
        if (m0(uri.toString())) {
            f2 = true;
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f25 == null) {
                instance2.f25 = com_appsflyer_AFDeepLinkManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(instance2.f24);
            }
            instance2.f25.execute(new Runnable() {
                /* class com.appsflyer.AFDeepLinkManager.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(2639);
                }

                public final void run() {
                    long j2;
                    MethodCollector.i(19);
                    HashMap hashMap = new HashMap();
                    long currentTimeMillis = System.currentTimeMillis();
                    Uri uri = null;
                    try {
                        AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) com_appsflyer_AFDeepLinkManager$5_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(uri.toString()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(AFDeepLinkManager.f3);
                        httpURLConnection.setConnectTimeout(AFDeepLinkManager.f3);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.connect();
                        AFLogger.afDebugLog("ESP deeplink resolving is finished");
                        hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                        if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                            uri = Uri.parse(httpURLConnection.getHeaderField(q.f30918b));
                        }
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                        httpURLConnection.disconnect();
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        hashMap.put("status", "-1");
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    hashMap.put("latency", Long.toString(j2));
                    if (uri != null) {
                        hashMap.put("res", uri.toString());
                    } else {
                        hashMap.put("res", "");
                    }
                    synchronized (map) {
                        try {
                            map.put("af_deeplink_r", hashMap);
                            map.put("af_deeplink", uri.toString());
                        } catch (Throwable th2) {
                            MethodCollector.o(19);
                            throw th2;
                        }
                    }
                    AFDeepLinkManager.f2 = false;
                    if (uri == null) {
                        uri = uri;
                    }
                    AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
                    MethodCollector.o(19);
                }

                public static URLConnection com_appsflyer_AFDeepLinkManager$5_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
                    URLConnection aVar;
                    URLConnection aVar2;
                    e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
                    if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                        R r = m2.f112459b;
                        if (r instanceof HttpsURLConnection) {
                            aVar2 = new b(r);
                        } else if (!(r instanceof HttpURLConnection)) {
                            return r;
                        } else {
                            aVar2 = new a(r);
                        }
                        return aVar2;
                    } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                        URLConnection openConnection = url.openConnection();
                        if (openConnection instanceof HttpsURLConnection) {
                            aVar = new b((HttpsURLConnection) openConnection);
                        } else if (!(openConnection instanceof HttpURLConnection)) {
                            return openConnection;
                        } else {
                            aVar = new a((HttpURLConnection) openConnection);
                        }
                        return aVar;
                    } else {
                        throw m2.f112462e;
                    }
                }
            });
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineUri = null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m1(Intent intent, Context context, Map<String, Object> map) {
        Uri data;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null) {
            if (trampolineUri != null) {
                AFLogger.afInfoLog(new StringBuilder("using trampoline Intent fallback with URI: ").append(trampolineUri).toString());
                m2(context, map, trampolineUri);
            } else if (AppsFlyerLibCore.getInstance().latestDeepLink != null) {
                AFLogger.afInfoLog(new StringBuilder("using Unity/plugin Intent fallback with URI: ").append(AppsFlyerLibCore.getInstance().latestDeepLink.toString()).toString());
                m2(context, map, AppsFlyerLibCore.getInstance().latestDeepLink);
            } else {
                AFLogger.afDebugLog("No deep link detected");
            }
        } else if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            m2(context, map, data);
        } else {
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link: ").append(data.toString()).append(" w/af_consumed").toString());
        }
    }
}
