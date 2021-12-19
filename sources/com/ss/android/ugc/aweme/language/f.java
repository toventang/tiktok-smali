package com.ss.android.ugc.aweme.language;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class f {
    static {
        Covode.recordClassIndex(68636);
    }

    public static final String a() {
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            b2 = SettingServiceImpl.v().l();
            if (TextUtils.isEmpty(b2)) {
                b2 = SettingServiceImpl.v().m();
            }
        }
        if (TextUtils.isEmpty(b2)) {
            b2 = "";
        }
        return b2.toUpperCase();
    }

    public static final String b() {
        String str;
        if (c.a()) {
            String string = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        try {
            str = ((TelephonyManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "phone")).getSimCountryIso();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return str;
    }

    public static final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase());
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3381);
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
                    MethodCollector.o(3381);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
