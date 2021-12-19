package com.bytedance.push.third;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.a.b;
import com.bytedance.push.f;
import com.bytedance.push.k.a;
import com.bytedance.push.k.c;
import com.ss.android.message.NotifyService;
import com.ss.android.message.log.LogService;
import com.ss.android.push.DefaultReceiver;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Arrays;

public class PushManager implements b {
    private static volatile PushManager sPushManager;

    static {
        Covode.recordClassIndex(25871);
    }

    public boolean requestNotificationPermission(int i2) {
        return false;
    }

    private PushManager() {
    }

    public static PushManager inst() {
        MethodCollector.i(6895);
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                try {
                    if (sPushManager == null) {
                        sPushManager = new PushManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6895);
                    throw th;
                }
            }
        }
        PushManager pushManager = sPushManager;
        MethodCollector.o(6895);
        return pushManager;
    }

    @Override // com.bytedance.push.third.b
    public void unregisterPush(Context context, int i2) {
        b a2 = f.a(context).a(i2);
        if (a2 != null) {
            try {
                a2.unregisterPush(context, i2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean isPushAvailable(Context context, int i2) {
        b a2 = f.a(context).a(i2);
        if (a2 == null) {
            return false;
        }
        try {
            return a2.isPushAvailable(context, i2);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.push.third.b
    public void registerPush(Context context, int i2) {
        b a2 = f.a(context).a(i2);
        if (a2 != null) {
            try {
                f.d().a(i2);
                a2.registerPush(context, i2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = true;
        boolean z2 = true;
        for (Integer num : f.a(context).b()) {
            b a2 = f.a(context).a(num.intValue());
            if (a2 != null) {
                try {
                    z2 &= a2.checkThirdPushConfig(str, context);
                } catch (Throwable unused) {
                    z2 = false;
                }
            }
        }
        try {
            boolean b2 = c.b(context, "Push", Arrays.asList(a.C1033a.c(NotifyService.class.getName()).a(context.getPackageName() + ":push").a(new a.b(Arrays.asList("com.ss.android.message.action.PUSH_SERVICE"))).f42224a, a.C1033a.c(LogService.class.getName()).a(context.getPackageName() + ":push").f42224a)) & c.c(context, "Push", Arrays.asList(a.C1033a.c(DefaultReceiver.class.getName()).a(context.getPackageName()).f42224a));
            a.C1033a a3 = a.C1033a.c(PushMultiProcessSharedProvider.class.getName()).a(context.getPackageName());
            a3.f42224a.f42223e = context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
            boolean d2 = b2 & c.d(context, "Push", Arrays.asList(a3.f42224a)) & z2;
            b b3 = com.bytedance.push.a.a.a(context).b();
            if (b3 != null) {
                z = b3.b();
            }
            return d2 & z;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.bytedance.push.third.b
    public void setAlias(Context context, String str, int i2) {
        b a2 = f.a(context).a(i2);
        if (a2 != null) {
            try {
                a2.setAlias(context, str, i2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.b
    public void trackPush(Context context, int i2, Object obj) {
        b a2 = f.a(context).a(i2);
        if (a2 != null) {
            try {
                a2.trackPush(context, i2, obj);
            } catch (Throwable unused) {
            }
        }
    }
}
