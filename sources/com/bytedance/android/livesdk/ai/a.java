package com.bytedance.android.livesdk.ai;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.f.c.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PipModeBrandListSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PipModeHandnaviEnableSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.a.i;
import h.f.b.l;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13742a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f13743b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f13744c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(7648);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 26 || !d() || !c() || !MtPipWatchLiveEnableSetting.INSTANCE.getValue() || f13743b) {
            return false;
        }
        return true;
    }

    private static boolean c() {
        if (f13742a) {
            return true;
        }
        if (!PipModeHandnaviEnableSetting.INSTANCE.getValue() || i.a(PipModeBrandListSetting.INSTANCE.getValue(), b.a())) {
            return false;
        }
        return true;
    }

    private static boolean d() {
        if (y.e() == null) {
            return false;
        }
        Context e2 = y.e();
        l.b(e2, "");
        if (e2.getPackageManager() == null) {
            return false;
        }
        Context e3 = y.e();
        l.b(e3, "");
        return e3.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    public static boolean a() {
        StringBuilder append = new StringBuilder("isPipModeEnable(): ").append(b()).append(", hasPipPermission(ResUtil.getContext()):");
        Context e2 = y.e();
        l.b(e2, "");
        StringBuilder append2 = append.append(a(e2)).append("\n           LivePluginProperties.LIVE_PIP_SWITCHER_OPEN.value:");
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cr;
        l.b(bVar, "");
        com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", append2.append(bVar.a()).append("\n        ").toString());
        if (!b()) {
            return false;
        }
        Context e3 = y.e();
        l.b(e3, "");
        if (!a(e3)) {
            return false;
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cr;
        l.b(bVar2, "");
        Boolean a2 = bVar2.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (!a(context)) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cr;
            l.b(bVar, "");
            c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", " syncPipPermissionValue LIVE_PIP_SWITCHER_OPEN -> false");
        }
        StringBuilder sb = new StringBuilder("syncPipPermissionValue return ");
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cr;
        l.b(bVar2, "");
        com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", sb.append(bVar2.a()).toString());
        com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.cr;
        l.b(bVar3, "");
        Boolean a2 = bVar3.a();
        l.b(a2, "");
        return a2.booleanValue();
    }

    public static boolean a(Context context) {
        l.d(context, "");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            Object a2 = a(context, "appops");
            if (a2 != null) {
                AppOpsManager appOpsManager = (AppOpsManager) a2;
                int callingUid = Binder.getCallingUid();
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                l.b(applicationContext, "");
                if (appOpsManager.checkOpNoThrow("android:picture_in_picture", callingUid, applicationContext.getPackageName()) == 0) {
                    return true;
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
        } catch (Exception unused) {
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9806);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(9806);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
