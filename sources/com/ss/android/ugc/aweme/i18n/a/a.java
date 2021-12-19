package com.ss.android.ugc.aweme.i18n.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class a extends b<String> {
    static {
        Covode.recordClassIndex(63607);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.i18n.a.b
    public final /* synthetic */ String a() {
        return c();
    }

    private static String c() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a(d.a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6918);
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
                    MethodCollector.o(6918);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
