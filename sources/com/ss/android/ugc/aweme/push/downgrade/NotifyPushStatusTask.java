package com.ss.android.ugc.aweme.push.downgrade;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f.a;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.reflect.Field;
import java.util.List;

public class NotifyPushStatusTask implements w {
    static {
        Covode.recordClassIndex(77223);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 34;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private static boolean b(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) a(context, "activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (!(runningAppProcessInfo == null || TextUtils.isEmpty(runningAppProcessInfo.processName) || !TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        MethodCollector.i(7396);
        String b2 = a.b(context);
        if (!TextUtils.isEmpty(b2) && ((b2.endsWith(":push") || b2.endsWith(":pushservice")) && b(context))) {
            try {
                context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".push.status"), "", b2, new Bundle());
                MethodCollector.o(7396);
                return;
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
        }
        MethodCollector.o(7396);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7317);
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
                    MethodCollector.o(7317);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
