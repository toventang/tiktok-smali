package com.ss.android.ugc.aweme.compliance.api.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.f.b.l;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76638a = "new_kids_mode";

    /* renamed from: b  reason: collision with root package name */
    public static final String f76639b = "key_is_new_kids_mode";

    /* renamed from: c  reason: collision with root package name */
    public static final a f76640c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final int f76641d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static final int f76642e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final int f76643f = 2;

    /* renamed from: g  reason: collision with root package name */
    private static String f76644g;

    /* renamed from: h  reason: collision with root package name */
    private static int f76645h = f76641d;

    private a() {
    }

    static {
        Covode.recordClassIndex(47322);
    }

    public static boolean a() {
        if (f76644g == null) {
            f76644g = d();
        }
        if (f76644g == null) {
            return false;
        }
        File file = new File(f76644g, "child");
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        if (f76644g == null) {
            f76644g = d();
        }
        if (f76644g == null) {
            return false;
        }
        File file = new File(f76644g, "child");
        if (!file.exists()) {
            return true;
        }
        try {
            return a(file);
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c() {
        if (f76645h == f76641d) {
            if (f76644g == null) {
                f76644g = d();
            }
            if (f76644g != null) {
                if (new File(f76644g, "child").exists()) {
                    f76645h = f76642e;
                } else {
                    f76645h = f76643f;
                }
            }
        }
        if (f76645h == f76642e) {
            return true;
        }
        return false;
    }

    private static String d() {
        String e2 = e();
        if (e2 != null) {
            return e2 + "/files";
        }
        String f2 = f();
        if (f2 != null) {
            return f2 + "/files";
        }
        String g2 = g();
        if (g2 != null) {
            return g2 + "/files";
        }
        return null;
    }

    private static String e() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("info");
            l.b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mDataDir");
            l.b(declaredField3, "");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            if (obj3 != null) {
                return (String) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String f() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("appInfo");
            l.b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("dataDir");
            l.b(declaredField3, "");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            if (obj3 != null) {
                return (String) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String g() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mPackages");
            l.b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            if (obj != null) {
                Iterator it = ((Map) obj).entrySet().iterator();
                if (!it.hasNext()) {
                    return null;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                WeakReference weakReference = (WeakReference) entry.getValue();
                if (weakReference == null) {
                    l.b();
                }
                Object obj2 = weakReference.get();
                if (obj2 == null) {
                    l.b();
                }
                Field declaredField2 = obj2.getClass().getDeclaredField("mDataDir");
                l.b(declaredField2, "");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(obj2);
                if (obj3 != null) {
                    return (String) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(1539);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1539);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1539);
        return delete;
    }
}
