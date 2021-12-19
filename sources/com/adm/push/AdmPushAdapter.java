package com.adm.push;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.k.a;
import com.bytedance.push.k.c;
import com.bytedance.push.third.b;
import com.bytedance.push.third.f;
import com.ss.android.message.a;
import java.util.Arrays;
import java.util.Collections;

public class AdmPushAdapter implements b {
    private static int ADM_PUSH = -1;
    private static boolean sSupport = true;

    public boolean requestNotificationPermission(int i2) {
        return false;
    }

    static {
        Covode.recordClassIndex(2054);
        try {
            Class.forName("com.amazon.device.messaging.ADM");
        } catch (Throwable unused) {
        }
    }

    public static int getAdmPush() {
        if (ADM_PUSH == -1) {
            ADM_PUSH = f.a(a.f59817a).a(AdmPushAdapter.class.getName());
        }
        return ADM_PUSH;
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport || !a.a(context).f4956a.isSupported()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean isPushAvailable(Context context, int i2) {
        if (com.bytedance.push.f.a().a()) {
            isSupport(context);
        }
        return isSupport(context);
    }

    @Override // com.bytedance.push.third.b
    public void unregisterPush(Context context, int i2) {
        if (context != null && i2 == getAdmPush() && isSupport(context)) {
            a.a(context).f4956a.startUnregister();
        }
    }

    @Override // com.bytedance.push.third.b
    public void registerPush(Context context, int i2) {
        String str;
        if (context != null) {
            if (i2 != getAdmPush() || !isSupport(context)) {
                str = null;
                if (context != null) {
                    if (i2 != getAdmPush()) {
                        str = "register sender error";
                    } else if (!isSupport(context)) {
                        str = "this device does not support adm sender";
                    }
                    com.bytedance.push.f.d().a(i2, 101, "0", str);
                }
            } else {
                a.a(context).f4956a.startRegister();
                return;
            }
        }
        str = "context is empty";
        com.bytedance.push.f.d().a(i2, 101, "0", str);
    }

    @Override // com.bytedance.push.third.b
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = false;
        boolean a2 = b.a(context) & c.a(context, "AdmPush error", Arrays.asList(context.getPackageName() + ".permission.RECEIVE_ADM_MESSAGE", "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK"));
        boolean b2 = c.b(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(a.C1033a.c("com.adm.push.ADMMessageHandler").a(context.getPackageName()).f42224a, a.C1033a.c("com.adm.push.ADMMessageHandlerJob").a(context.getPackageName()).b("android.permission.BIND_JOB_SERVICE").f42224a));
        if (c.c(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(a.C1033a.c("com.adm.push.ADMMessageHandler$Receiver").a(context.getPackageName()).b("com.amazon.device.messaging.permission.SEND").a(new a.b(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName()))).f42224a)) && b2) {
            z = true;
        }
        return a2 & z;
    }

    @Override // com.bytedance.push.third.b
    public void setAlias(Context context, String str, int i2) {
        if (context != null && i2 == getAdmPush()) {
            isSupport(context);
        }
    }

    @Override // com.bytedance.push.third.b
    public void trackPush(Context context, int i2, Object obj) {
        if (context != null && i2 == getAdmPush()) {
            isSupport(context);
        }
    }
}
