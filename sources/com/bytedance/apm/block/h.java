package com.bytedance.apm.block;

import android.os.Build;
import android.util.Pair;
import android.view.View;
import com.bytedance.apm.block.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class h {
    static {
        Covode.recordClassIndex(14501);
    }

    public static void a() {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls2.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls2.getDeclaredField("mRoots");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(invoke);
            Field declaredField2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mView");
            declaredField2.setAccessible(true);
            Field declaredField3 = View.class.getDeclaredField("mRenderNode");
            declaredField3.setAccessible(true);
            if (Build.VERSION.SDK_INT > 28) {
                cls = Class.forName("android.graphics.RenderNode");
            } else {
                cls = Class.forName("android.view.RenderNode");
            }
            Method a2 = f.a((Class) cls, "output", (Class<?>[]) new Class[0]);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = declaredField3.get(declaredField2.get(arrayList.get(i2)));
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a3 = a.a(a2, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_block_GFXInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a3.first).booleanValue()) {
                    Object obj2 = a3.second;
                } else {
                    a.a(a2.invoke(obj, objArr), a2, new Object[]{obj, objArr}, "com_bytedance_apm_block_GFXInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
