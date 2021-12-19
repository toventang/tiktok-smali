package com.ss.android.ugc.awemepushlib.os.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tiktok.security.a.a;
import java.lang.reflect.Field;
import java.util.Map;

public class NotificationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(95147);
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    public static Object com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(7984);
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
                    MethodCollector.o(7984);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra(StringSet.type, -1);
            if (intExtra != -1) {
                ((NotificationManager) com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "notification")).cancel(intExtra);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("contentIntentURI");
            if ("notification_clicked".equals(action)) {
                Logger.debug();
                if (intent2 != null) {
                    try {
                        intent2.getDataString();
                        com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, intent2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if ("notification_cancelled".equals(action)) {
                Logger.debug();
                Map map = null;
                if (intent2 != null) {
                    map = (Map) intent2.getSerializableExtra("log_data_extra_to_adsapp");
                }
                q.a("push_clear", map);
            }
        }
    }
}
