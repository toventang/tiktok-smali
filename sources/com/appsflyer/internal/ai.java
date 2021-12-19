package com.appsflyer.internal;

import com.a;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ai f184;

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f185 = true;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f186 = "-1";

    /* renamed from: ǃ  reason: contains not printable characters */
    private JSONObject f187;

    /* renamed from: Ι  reason: contains not printable characters */
    private JSONArray f188;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f189;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f190;

    /* renamed from: і  reason: contains not printable characters */
    private int f191;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f192;

    static {
        Covode.recordClassIndex(2719);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m151() {
        return this.f190;
    }

    /* renamed from: і  reason: contains not printable characters */
    private boolean m141() {
        if (!this.f189) {
            return false;
        }
        if (this.f185 || this.f190) {
            return true;
        }
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private synchronized void m142() {
        MethodCollector.i(1159);
        this.f188 = null;
        this.f188 = new JSONArray();
        this.f191 = 0;
        MethodCollector.o(1159);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m143() {
        MethodCollector.i(1179);
        this.f185 = false;
        m142();
        MethodCollector.o(1179);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m146() {
        MethodCollector.i(3524);
        this.f187 = null;
        this.f188 = null;
        f184 = null;
        MethodCollector.o(3524);
    }

    public ai() {
        boolean z = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.f192 = z;
        this.f189 = true ^ z;
        this.f188 = new JSONArray();
        this.f191 = 0;
        this.f190 = false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m145() {
        MethodCollector.i(3018);
        this.f190 = true;
        m144("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        MethodCollector.o(3018);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized String m148() {
        String jSONObject;
        MethodCollector.i(436);
        try {
            this.f187.put("data", this.f188);
            jSONObject = this.f187.toString();
            m142();
        } catch (JSONException unused) {
        }
        MethodCollector.o(436);
        return jSONObject;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized void m150() {
        MethodCollector.i(3032);
        m144("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f190 = false;
        this.f185 = false;
        MethodCollector.o(3032);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m147(String str) {
        MethodCollector.i(3004);
        this.f186 = str;
        MethodCollector.o(3004);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0084 */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m149(java.lang.String r14, android.content.pm.PackageManager r15) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ai.m149(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m144(String str, String str2, String... strArr) {
        String a2;
        MethodCollector.i(359);
        if (!m141() || this.f191 >= 98304) {
            MethodCollector.o(359);
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "";
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (int length = strArr.length - 1; length > 0; length--) {
                    sb.append(strArr[length]).append(", ");
                }
                sb.append(strArr[0]);
                str3 = sb.toString();
            }
            String format = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
            if (str != null) {
                a2 = a.a("%18s %5s _/%s [%s] %s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), "AppsFlyer_5.4.1", str, str2, str3});
            } else {
                a2 = a.a("%18s %5s %s/%s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), str2, "AppsFlyer_5.4.1", str3});
            }
            this.f188.put(a2);
            this.f191 += a2.getBytes().length;
            MethodCollector.o(359);
        } catch (Throwable unused) {
            MethodCollector.o(359);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private synchronized void m139(String str, String str2, String str3, String str4) {
        MethodCollector.i(5093);
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f187.put("app_id", str);
                }
            } catch (Throwable unused) {
                MethodCollector.o(5093);
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f187.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f187.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f187.put("preInstall", str4);
        }
        MethodCollector.o(5093);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private synchronized void m140(String str, String str2, String str3, String str4) {
        MethodCollector.i(4683);
        try {
            this.f187.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f187.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f187.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f187.put("uid", str4);
            }
            MethodCollector.o(4683);
        } catch (Throwable unused) {
            MethodCollector.o(4683);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private synchronized void m138(String str, String str2, String str3, String str4, String str5, String str6) {
        MethodCollector.i(4012);
        try {
            this.f187.put("brand", str);
            this.f187.put("model", str2);
            this.f187.put("platform", "Android");
            this.f187.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f187.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f187.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f187.put("android_id", str6);
            }
            MethodCollector.o(4012);
        } catch (Throwable unused) {
            MethodCollector.o(4012);
        }
    }
}
