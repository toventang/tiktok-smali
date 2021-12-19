package com.ss.android.ugc.aweme.base.a;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class i {

    public interface b {
        static {
            Covode.recordClassIndex(41849);
        }
    }

    static {
        Covode.recordClassIndex(41847);
    }

    /* access modifiers changed from: package-private */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f67978a;

        static {
            Covode.recordClassIndex(41848);
        }

        a(WeakReference<b> weakReference) {
            this.f67978a = weakReference;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if (!((Boolean) objArr[0]).booleanValue() || this.f67978a.get() == null) {
                    return null;
                }
                this.f67978a.get();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static void a(Activity activity) {
        b bVar = j.f67979a;
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?>[] declaredClasses = Activity.class.getDeclaredClasses();
                for (Class<?> cls : declaredClasses) {
                    if (cls.getSimpleName().equals("TranslucentConversionListener")) {
                        Method declaredMethod = Activity.class.getDeclaredMethod("convertToTranslucent", cls);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(activity, null);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            try {
                Method declaredMethod2 = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                declaredMethod2.setAccessible(true);
                Object invoke = declaredMethod2.invoke(activity, new Object[0]);
                Class<?>[] declaredClasses2 = Activity.class.getDeclaredClasses();
                for (Class<?> cls2 : declaredClasses2) {
                    if (cls2.getSimpleName().equals("TranslucentConversionListener")) {
                        Object newProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls2}, new a(new WeakReference(bVar)));
                        Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", cls2, ActivityOptions.class);
                        declaredMethod3.setAccessible(true);
                        declaredMethod3.invoke(activity, newProxyInstance, invoke);
                        return;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
