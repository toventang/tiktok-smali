package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class fl {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f50861a = b();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f50862c = c();

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f50863b;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_gms_internal_measurement_zzh_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_google_android_gms_internal_measurement_zzh_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(31789);
    }

    public static int a() {
        Method method = f50862c;
        if (method != null) {
            try {
                return ((Integer) a(method, null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return 0;
    }

    private static Method c() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    private static Method b() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public fl(JobScheduler jobScheduler) {
        this.f50863b = jobScheduler;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2093);
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
                    MethodCollector.o(2093);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final int a(JobInfo jobInfo, String str, int i2, String str2) {
        Method method = f50861a;
        if (method != null) {
            try {
                return ((Integer) a(method, this.f50863b, new Object[]{jobInfo, str, Integer.valueOf(i2), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f50863b.schedule(jobInfo);
    }
}
