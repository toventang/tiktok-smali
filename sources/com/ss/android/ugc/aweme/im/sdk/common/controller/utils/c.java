package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.h;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(65547);
    }

    public static long e() {
        return Long.parseLong(b().toString());
    }

    public static boolean a() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null || !e2.isLogin()) {
            return false;
        }
        return true;
    }

    public static CharSequence b() {
        String uid;
        User d2 = d();
        if (d2 == null || (uid = d2.getUid()) == null) {
            return "-1";
        }
        return uid;
    }

    public static String c() {
        User d2 = d();
        if (d2 == null) {
            return "";
        }
        if (d2.getSecUid() != null) {
            return d2.getSecUid();
        }
        h.a(d2.getUid(), d2.getSecUid());
        return "";
    }

    public static User d() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null) {
            return null;
        }
        return e2.getCurUser();
    }

    public static String f() {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a(d.a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            str = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
    }

    public static String g() {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a(d.a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            str = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
    }

    public static boolean a(IMUser iMUser) {
        if (iMUser == null || !b().equals(iMUser.getUid())) {
            return false;
        }
        return true;
    }

    public static void b(String str, Map<String, Object> map) {
        a(str, null, map, "im_error_event");
    }

    public static void a(String str, Map<String, Object> map) {
        a(str, null, map);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5463);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5463);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        a(str, str2, map, "im_event");
    }

    private static void a(String str, String str2, Map<String, Object> map, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str);
                } else {
                    jSONObject.put("service", str + "_" + str2);
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                com.bytedance.apm.b.a(str3, jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
