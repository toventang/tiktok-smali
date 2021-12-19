package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.google.android.gms.common.c.b;
import com.google.android.gms.common.c.c;
import java.lang.reflect.Method;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int f50516a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f50517b = a();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f50518c = b();

    /* renamed from: d  reason: collision with root package name */
    private static final Method f50519d = c();

    /* renamed from: e  reason: collision with root package name */
    private static final Method f50520e = d();

    /* renamed from: f  reason: collision with root package name */
    private static final Method f50521f = e();

    /* renamed from: g  reason: collision with root package name */
    private static final Method f50522g = f();

    /* renamed from: h  reason: collision with root package name */
    private static final Method f50523h = g();

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_gms_common_util_WorkSourceUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_google_android_gms_common_util_WorkSourceUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Method c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method b() {
        if (k.a()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method e() {
        if (k.a()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method f() {
        if (k.f()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static {
        Covode.recordClassIndex(31477);
    }

    private static final Method g() {
        if (k.f()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method a() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int a(WorkSource workSource) {
        Method method = f50519d;
        if (method != null) {
            try {
                return ((Integer) a(method, workSource, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    public static boolean a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        b a2 = c.f50295a.a(context);
        if (a2.f50294a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    private static WorkSource a(int i2, String str) {
        WorkSource workSource = new WorkSource();
        Method method = f50518c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                a(method, workSource, new Object[]{Integer.valueOf(i2), str});
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        } else {
            Method method2 = f50517b;
            if (method2 != null) {
                try {
                    a(method2, workSource, new Object[]{Integer.valueOf(i2)});
                } catch (Exception e3) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                }
            }
        }
        return workSource;
    }

    public static WorkSource a(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo a2 = c.f50295a.a(context).a(str, 0);
                if (a2 != null) {
                    return a(a2.uid, str);
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(valueOf);
                } else {
                    new String("Could not get applicationInfo from package: ");
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Could not find package: ".concat(valueOf2);
                } else {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    public static String a(WorkSource workSource, int i2) {
        Method method = f50521f;
        if (method == null) {
            return null;
        }
        try {
            return (String) a(method, workSource, new Object[]{Integer.valueOf(i2)});
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }
}
