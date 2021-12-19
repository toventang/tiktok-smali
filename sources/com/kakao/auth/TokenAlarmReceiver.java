package com.kakao.auth;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.util.helper.log.Logger;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class TokenAlarmReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(34262);
    }

    private boolean isApplicationActive(Context context) {
        try {
            PowerManager powerManager = (PowerManager) com_kakao_auth_TokenAlarmReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "power");
            if (Build.VERSION.SDK_INT <= 19) {
                return powerManager.isScreenOn();
            }
            return powerManager.isInteractive();
        } catch (Exception unused) {
            return true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (isApplicationActive(context)) {
            try {
                Session.getCurrentSession().checkAccessTokenInfo();
            } catch (IllegalStateException e2) {
                Logger.e(e2.toString());
            }
        }
    }

    public static Object com_kakao_auth_TokenAlarmReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(8190);
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
                    MethodCollector.o(8190);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
