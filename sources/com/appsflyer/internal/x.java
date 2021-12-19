package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.model.event.Purchase;
import com.appsflyer.internal.model.event.SdkServices;
import com.appsflyer.internal.model.event.Validate;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class x implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String f310 = new StringBuilder("https://%svalidate.%s/api/v").append(AppsFlyerLibCore.f58).append("/androidevent?buildnumber=5.4.1&app_id=").toString();

    /* renamed from: ι  reason: contains not printable characters */
    private static String f311 = "https://%ssdk-services.%s/validate-android-signature";

    /* renamed from: ı  reason: contains not printable characters */
    private WeakReference<Context> f312;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f313;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Map<String, String> f314;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f315;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f316;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Intent f317;

    /* renamed from: І  reason: contains not printable characters */
    private String f318;

    /* renamed from: і  reason: contains not printable characters */
    private String f319;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f320;

    static {
        Covode.recordClassIndex(2776);
    }

    public final void run() {
        String str = this.f315;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.f312.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f318);
                    hashMap.put("sig-data", this.f320);
                    hashMap.put("signature", this.f319);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        /* class com.appsflyer.internal.x.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(2777);
                        }

                        public final void run() {
                            x xVar = x.this;
                            x.m208(xVar, hashMap2, xVar.f314, x.this.f312);
                        }
                    }).start();
                    hashMap.put("dev_key", this.f315);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put("advertiserId", AppsFlyerProperties.getInstance().getString("advertiserId"));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl(f311);
                    if (ai.f184 == null) {
                        ai.f184 = new ai();
                    }
                    ai.f184.m144("server_request", url, jSONObject);
                    HttpURLConnection r5 = m207((Purchase) new SdkServices().params(hashMap).urlString(url));
                    int i2 = -1;
                    if (r5 != null) {
                        i2 = r5.getResponseCode();
                    }
                    String r4 = AppsFlyerLibCore.getInstance().m99(r5);
                    if (ai.f184 == null) {
                        ai.f184 = new ai();
                    }
                    ai.f184.m144("server_response", url, String.valueOf(i2), r4);
                    JSONObject jSONObject2 = new JSONObject(r4);
                    jSONObject2.put("code", i2);
                    if (i2 == 200) {
                        AFLogger.afInfoLog(new StringBuilder("Validate response 200 ok: ").append(jSONObject2.toString()).toString());
                        m210(jSONObject2.optBoolean("result"), this.f320, this.f313, this.f316, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m210(false, this.f320, this.f313, this.f316, jSONObject2.toString());
                    }
                    if (r5 != null) {
                        r5.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static HttpURLConnection m207(Purchase purchase) {
        AFLogger.afDebugLog(new StringBuilder("Calling ").append(purchase.urlString()).toString());
        return new ad(purchase.trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped())).m125();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m208(x xVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            String obj = new StringBuilder().append(ServerConfigHandler.getUrl(f310)).append(((Context) weakReference.get()).getPackageName()).toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString("referrer", "");
            AFEvent key = new Validate((Context) weakReference.get()).key(xVar.f315);
            key.f8 = string;
            key.f9 = xVar.f317;
            Map<String, Object> r4 = AppsFlyerLibCore.getInstance().m102(key);
            r4.put("price", xVar.f313);
            r4.put("currency", xVar.f316);
            r4.put("receipt_data", map);
            if (map2 != null) {
                r4.put("extra_prms", map2);
            }
            String jSONObject = new JSONObject(r4).toString();
            if (ai.f184 == null) {
                ai.f184 = new ai();
            }
            ai.f184.m144("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection r2 = m207((Purchase) key.params(r4).urlString(obj));
                int i2 = -1;
                if (r2 != null) {
                    i2 = r2.getResponseCode();
                }
                String r5 = AppsFlyerLibCore.getInstance().m99(r2);
                if (ai.f184 == null) {
                    ai.f184 = new ai();
                }
                ai.f184.m144("server_response", obj, String.valueOf(i2), r5);
                AFLogger.afInfoLog(new StringBuilder("Validate-WH response - ").append(i2).append(": ").append(new JSONObject(r5).toString()).toString());
                if (r2 != null) {
                    r2.disconnect();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m210(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f60 != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f60.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f60;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public x(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.f312 = new WeakReference<>(context);
        this.f315 = str;
        this.f318 = str2;
        this.f320 = str4;
        this.f313 = str5;
        this.f316 = str6;
        this.f314 = map;
        this.f319 = str3;
        this.f317 = intent;
    }
}
