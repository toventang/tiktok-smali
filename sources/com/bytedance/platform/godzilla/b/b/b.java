package com.bytedance.platform.godzilla.b.b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.b.a.a.a.c;
import com.bytedance.platform.godzilla.d.d;
import java.lang.reflect.Method;

public final class b extends c {
    private static Object a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_crash_deadsystemexception_IConnectivityManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(null, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{null, objArr}, "com_bytedance_platform_godzilla_crash_deadsystemexception_IConnectivityManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static class a extends com.bytedance.platform.godzilla.b.a.a.a.b {
        static {
            Covode.recordClassIndex(25643);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.bytedance.platform.godzilla.b.a.a.a.b
        public final Object a(Object obj, Method method, Object[] objArr) {
            return super.a(obj, method, objArr);
        }
    }

    static {
        Covode.recordClassIndex(25642);
        a("getNetworkCapabilities", new a((byte) 0));
        a("getAllNetworks", new a((byte) 0));
        a("getLinkProperties", new a((byte) 0));
        a("getActiveNetworkInfo", new a((byte) 0));
    }

    public final void a() {
        try {
            com.bytedance.platform.godzilla.b.a.b.a.a aVar = new com.bytedance.platform.godzilla.b.a.b.a.a("connectivity", this);
            aVar.a();
            a(a(d.a(Class.forName("android.net.IConnectivityManager$Stub"), "asInterface", IBinder.class), new Object[]{aVar.f41963c}));
            g.a(g.a.ERROR);
        } catch (Exception e2) {
            g.a(g.a.ERROR);
            e2.printStackTrace();
        }
    }
}
