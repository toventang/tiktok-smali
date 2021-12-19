package com.ss.android.common.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.j;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.TimeZone;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(36569);
    }

    /* renamed from: com.ss.android.common.a.a$a  reason: collision with other inner class name */
    public static class C1291a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f59143a;

        /* renamed from: b  reason: collision with root package name */
        private Context f59144b;

        /* renamed from: c  reason: collision with root package name */
        private String f59145c;

        static {
            Covode.recordClassIndex(36570);
        }

        public final void run() {
            a.a(this.f59144b, this.f59145c, this.f59143a);
        }

        public C1291a(Context context, String str, boolean z) {
            this.f59144b = context;
            this.f59145c = str;
            this.f59143a = z;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7999);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7999);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static String a(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        boolean z2;
        String str2;
        try {
            StringBuilder sb = new StringBuilder(str);
            if (!z) {
                try {
                    Pair<String, Boolean> a2 = com.ss.android.deviceregister.d.a(context);
                    if (a2 != null) {
                        if (a2.second == null || !((Boolean) a2.second).booleanValue()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        a(sb, "gaid_limited", str2, true);
                        a(sb, "google_aid", (String) a2.first, true);
                    }
                } catch (Exception unused) {
                }
            }
            float rawOffset = (((float) TimeZone.getDefault().getRawOffset()) * 1.0f) / 3600000.0f;
            if (rawOffset < -12.0f) {
                rawOffset = -12.0f;
            } else if (rawOffset > 12.0f) {
                rawOffset = 12.0f;
            }
            a(sb, "timezone", String.valueOf(rawOffset), false);
            String str3 = com.ss.android.deviceregister.a.d.o;
            if (!TextUtils.isEmpty(str3)) {
                a(sb, "package", str3, true);
                a(sb, "real_package_name", context.getPackageName(), true);
            }
            TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
            a(sb, "carrier", telephonyManager.getNetworkOperatorName(), true);
            a(sb, "mcc_mnc", telephonyManager.getNetworkOperator(), true);
            a(sb, "sim_region", telephonyManager.getSimCountryIso(), true);
            a(sb, "app_version_minor", AppLog.getAppVersionMinor(), true);
            q.a(sb, true);
            String a3 = a(sb.toString(), "req_id", DeviceRegisterManager.getRequestId());
            Logger.debug();
            String a4 = j.f26946a.a(a3, null);
            if (m.a(a4) || !"success".equals(new JSONObject(a4).optString("message"))) {
                return false;
            }
            return true;
        } catch (Exception unused2) {
        }
    }

    private static void a(StringBuilder sb, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            StringBuilder append = sb.append(str).append("=");
            if (z) {
                str2 = Uri.encode(str2);
            }
            append.append(str2);
        }
    }
}
