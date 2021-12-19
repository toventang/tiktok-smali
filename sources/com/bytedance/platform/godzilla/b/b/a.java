package com.bytedance.platform.godzilla.b.b;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.b.a.a.a.b;
import com.bytedance.platform.godzilla.b.a.a.a.c;
import com.bytedance.platform.godzilla.d.d;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class a extends c {
    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_crash_deadsystemexception_IActivityTaskManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_platform_godzilla_crash_deadsystemexception_IActivityTaskManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: com.bytedance.platform.godzilla.b.b.a$a  reason: collision with other inner class name */
    static class C1030a extends b {
        static {
            Covode.recordClassIndex(25641);
        }

        private C1030a() {
        }

        /* synthetic */ C1030a(byte b2) {
            this();
        }

        @Override // com.bytedance.platform.godzilla.b.a.a.a.b
        public final Object a(Object obj, Method method, Object[] objArr) {
            method.getName();
            g.a(g.a.ERROR);
            return super.a(obj, method, objArr);
        }
    }

    static {
        Covode.recordClassIndex(25640);
        a("activityDestroyed", new C1030a((byte) 0));
        a("activitySlept", new C1030a((byte) 0));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 29) {
            g.a(g.a.ERROR);
            return;
        }
        try {
            Object b2 = com.bytedance.platform.godzilla.d.a.b(Class.forName("android.app.ActivityTaskManager"), "IActivityTaskManagerSingleton");
            if (Class.forName("android.util.Singleton").isInstance(b2)) {
                Object a2 = com.bytedance.platform.godzilla.d.a.a(b2, "mInstance");
                if (!(a2 == null && (a2 = a(d.a(b2.getClass(), "get", new Class[0]), b2, new Object[0])) == null) && !Proxy.isProxyClass(a2.getClass())) {
                    a(a2);
                    com.bytedance.platform.godzilla.d.a.a(b2, "mInstance", com.bytedance.platform.godzilla.d.g.a(a2, this));
                    g.a(g.a.ERROR);
                }
            }
        } catch (Throwable unused) {
            g.a(g.a.ERROR);
        }
    }
}
