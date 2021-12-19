package com.bytedance.mira.plugin.hook.flipped.compat;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.lang.reflect.Method;

public class FlippedV2Impl implements c {
    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV2Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_mira_plugin_hook_flipped_compat_FlippedV2Impl_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        Covode.recordClassIndex(25328);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("flipped", false, (Context) null);
        m.a(uptimeMillis, "flipped");
    }

    @Override // com.bytedance.mira.plugin.hook.flipped.compat.c
    public final void a() {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = getDeclaredMethod(cls, "getRuntime", new Class[0]);
            declaredMethod.setAccessible(true);
            Object a2 = a(declaredMethod, null, new Object[0]);
            Method declaredMethod2 = getDeclaredMethod(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            declaredMethod2.setAccessible(true);
            a(declaredMethod2, a2, new Object[]{new String[]{"L"}});
        } catch (Exception e2) {
            Log.getStackTraceString(e2);
        }
    }
}
