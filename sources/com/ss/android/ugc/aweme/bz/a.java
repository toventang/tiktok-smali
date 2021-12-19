package com.ss.android.ugc.aweme.bz;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f69574a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static Application f69575b;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_nougat_NougatApplicationPatch_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_nougat_NougatApplicationPatch_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(42921);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static void c(Context context) {
        try {
            f69575b = (Application) Class.forName(context.getApplicationInfo().className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void d(Context context) {
        Application application = f69575b;
        if (application != null) {
            try {
                a(Application.class, application, "attach", new Class[]{Context.class}, new Object[]{context});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f69575b.onCreate();
        }
    }

    public static void a(Context context) {
        if (g.a() == null && context != null && b(context) != null && context.getApplicationInfo() != null && TextUtils.equals(Application.class.getName(), context.getApplicationInfo().className)) {
            Application application = (Application) b(context);
            try {
                c(context);
                a(application, application, f69575b);
                d(application.getBaseContext());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static Object a(Context context, Class<?> cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private static void a(Context context, Application application, Application application2) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object a2 = a(context, cls);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Application application3 = (Application) declaredField.get(a2);
            if (application2 != null) {
                if (application3 == application) {
                    declaredField.set(a2, application2);
                }
                Field declaredField2 = cls.getDeclaredField("mAllApplications");
                declaredField2.setAccessible(true);
                List list = (List) declaredField2.get(a2);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (list.get(i2) == application) {
                        list.set(i2, application2);
                    }
                }
            }
            a(application, application2, cls, a2);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    private static void a(Application application, Application application2, Class<?> cls, Object obj) {
        Class<?> cls2;
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls2.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        cls2.getDeclaredField("mResDir").setAccessible(true);
        Field field = null;
        try {
            field = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException unused2) {
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        int i2 = 0;
        do {
            Field declaredField2 = cls.getDeclaredField(strArr[i2]);
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(obj)).entrySet()) {
                Object obj2 = ((WeakReference) entry.getValue()).get();
                if (!(obj2 == null || declaredField.get(obj2) != application || application2 == null)) {
                    declaredField.set(obj2, application2);
                    if (field != null) {
                        field.set(application2, obj2);
                    }
                }
            }
            i2++;
        } while (i2 < 2);
    }

    private static Object a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return a(declaredMethod, obj, objArr);
    }
}
