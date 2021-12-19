package com.ss.android.ugc.trill.abtest.impl;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tiktok.security.a.a;
import java.lang.reflect.Field;

public class NotificationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(98949);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5993);
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
                    MethodCollector.o(5993);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            int intExtra = intent.getIntExtra(StringSet.type, -1);
            if (intExtra != -1) {
                ((NotificationManager) a(context, "notification")).cancel(intExtra);
            }
            if (action.equals("notification_clicked")) {
                Intent intent2 = new Intent();
                intent2.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent2.setFlags(335544320);
                a.a(intent2, context);
                context.startActivity(intent2);
                r.onEvent(MobClick.obtain().setLabelName("click").setEventName("recall_push"));
            }
        }
    }
}
