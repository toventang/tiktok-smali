package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.am;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class CrossPromotionHelper {

    /* renamed from: ι  reason: contains not printable characters */
    private static String f324 = "https://%simpression.%s";

    static {
        Covode.recordClassIndex(2781);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final am f325;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final WeakReference<Context> f326;

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f327;

        /* renamed from: ι  reason: contains not printable characters */
        private final boolean f328;

        static {
            Covode.recordClassIndex(2782);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.a.run():void");
        }

        public static URLConnection com_appsflyer_share_CrossPromotionHelper$a_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
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
                    aVar2 = new com.ss.android.ugc.aweme.net.l.a(r);
                }
                return aVar2;
            } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new b((HttpsURLConnection) openConnection);
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

        public static void com_appsflyer_share_CrossPromotionHelper$a_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        a(String str, am amVar, Context context, boolean z) {
            this.f327 = str;
            this.f325 = amVar;
            this.f326 = new WeakReference<>(context);
            this.f328 = z;
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        trackCrossPromoteImpression(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new a(m216(context, str, str2, map, ServerConfigHandler.getUrl(f324)).generateLink(), null, null, AppsFlyerLib.getInstance().isTrackingStopped())).start();
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator r4 = m216(context, str, str2, map, ServerConfigHandler.getUrl(Constants.f323));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", map);
        new Thread(new a(r4.generateLink(), new am(), context, AppsFlyerLib.getInstance().isTrackingStopped())).start();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static LinkGenerator m216(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.f333 = str3;
        linkGenerator.f338 = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
