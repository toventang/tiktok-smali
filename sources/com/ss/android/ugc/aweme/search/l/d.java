package com.ss.android.ugc.aweme.search.l;

import android.util.Pair;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f121384a;

    static {
        Covode.recordClassIndex(79087);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_search_performance_SearchMixApiPreparation_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_search_performance_SearchMixApiPreparation_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static void a() {
        MethodCollector.i(622);
        if (!f121384a) {
            synchronized (d.class) {
                try {
                    if (!f121384a) {
                        i.b(e.f121385a, i.f4824a).a(f.f121386a);
                        f121384a = true;
                    }
                } finally {
                    MethodCollector.o(622);
                }
            }
            return;
        }
        MethodCollector.o(622);
    }

    static final /* synthetic */ Object b() {
        try {
            f fVar = SearchApiNew.f80776b;
            Object obj = b(fVar.getClass(), "retrofit").get(fVar);
            Object a2 = a(a(obj.getClass(), "getRetrofit"), obj, new Object[0]);
            Method a3 = a(SearchApiNew.RealApi.class, "searchMTMixFeedList");
            a(a(a2.getClass(), "loadServiceMethod"), a2, new Object[]{a3});
            return null;
        } catch (Exception e2) {
            if (!"local_test".equals(com.bytedance.ies.ugc.appcontext.d.s)) {
                return null;
            }
            throw e2;
        }
    }

    private static Field b(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Method a(Class cls, String str) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (str.equals(method.getName())) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
