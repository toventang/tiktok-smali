package com.bytedance.sdk.b.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f43608a;

    /* renamed from: b  reason: collision with root package name */
    private static String f43609b;

    /* renamed from: c  reason: collision with root package name */
    private static int f43610c;

    static {
        Covode.recordClassIndex(26696);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static String a(Context context) {
        SubscriptionManager subscriptionManager;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        String str;
        String str2 = "";
        try {
            if (a.a(context, "android.permission.READ_PHONE_STATE") && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) a(b(context), "telephony_subscription_service")) != null && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null) {
                for (int i2 = 0; i2 < activeSubscriptionInfoList.size(); i2++) {
                    int mcc = activeSubscriptionInfoList.get(i2).getMcc();
                    com.bytedance.sdk.b.c.a.a("mcc is ".concat(String.valueOf(mcc)));
                    int mnc = activeSubscriptionInfoList.get(i2).getMnc();
                    com.bytedance.sdk.b.c.a.a("mnc is ".concat(String.valueOf(mnc)));
                    if (mnc < 10) {
                        str = "0".concat(String.valueOf(mnc));
                    } else {
                        str = String.valueOf(mnc);
                    }
                    str2 = str2 + (String.valueOf(mcc) + str);
                    if (i2 != activeSubscriptionInfoList.size() - 1) {
                        str2 = str2 + ",";
                    }
                }
            }
        } catch (Exception e2) {
            com.bytedance.sdk.b.c.a.d(e2.getMessage());
        }
        if (str2.isEmpty()) {
            str2 = a(context, false);
        }
        com.bytedance.sdk.b.c.a.a("getAllMccMnc is ".concat(String.valueOf(str2)));
        return str2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2491);
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
                    MethodCollector.o(2491);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String b(Context context, boolean z) {
        if (context == null) {
            com.bytedance.sdk.b.c.a.d("getSimOperatorName(Context context):context == null");
            return "";
        } else if (!z && !TextUtils.isEmpty(f43609b)) {
            return f43609b;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                if (telephonyManager != null) {
                    com.bytedance.sdk.b.c.a.a("getSimOperator   " + telephonyManager.getSimOperator());
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    f43609b = simOperatorName;
                    return simOperatorName;
                }
            } catch (Exception e2) {
                com.bytedance.sdk.b.c.a.d(e2.getMessage());
            }
            return "";
        }
    }

    public static int c(Context context, boolean z) {
        Method method;
        int i2;
        if (context == null) {
            com.bytedance.sdk.b.c.a.d("getSimSubscriptionId(Context context):context == null");
            return -1;
        } else if (!z && (i2 = f43610c) != -1) {
            return i2;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a(b(context), "phone");
                if (telephonyManager == null || telephonyManager.getSimState() == 0 || telephonyManager.getSimState() == 1) {
                    com.bytedance.sdk.b.c.a.d("getSimSubscriptionId no sim card -1");
                    return -1;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    f43610c = SubscriptionManager.getDefaultDataSubscriptionId();
                    com.bytedance.sdk.b.c.a.d("getSimSubscriptionId version >= 24, it is " + f43610c);
                    return f43610c;
                } else if (Build.VERSION.SDK_INT >= 22) {
                    SubscriptionManager subscriptionManager = (SubscriptionManager) a(b(context), "telephony_subscription_service");
                    if (!(subscriptionManager == null || (method = subscriptionManager.getClass().getMethod("getDefaultSubId", new Class[0])) == null)) {
                        f43610c = ((Integer) method.invoke(subscriptionManager, new Object[0])).intValue();
                        com.bytedance.sdk.b.c.a.d("getSimSubscriptionId version >= 22, it is " + f43610c);
                        return f43610c;
                    }
                    com.bytedance.sdk.b.c.a.d("getSimSubscriptionId return default error -1");
                    return -1;
                } else {
                    com.bytedance.sdk.b.c.a.d("getSimSubscriptionId version < 22, no multi sim card");
                    f43610c = -2;
                    return -2;
                }
            } catch (Exception e2) {
                com.bytedance.sdk.b.c.a.d(e2.getMessage());
            }
        }
    }

    public static String a(Context context, boolean z) {
        if (context == null) {
            com.bytedance.sdk.b.c.a.d("getSimOperator(Context context):context == null");
            return "";
        } else if (!z && !TextUtils.isEmpty(f43608a)) {
            return f43608a;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                if (telephonyManager != null) {
                    com.bytedance.sdk.b.c.a.a("getSimOperator   " + telephonyManager.getSimOperator());
                    String simOperator = telephonyManager.getSimOperator();
                    f43608a = simOperator;
                    return simOperator;
                }
            } catch (Exception e2) {
                com.bytedance.sdk.b.c.a.d(e2.getMessage());
            }
            return "";
        }
    }
}
