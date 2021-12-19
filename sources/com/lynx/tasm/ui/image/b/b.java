package com.lynx.tasm.ui.image.b;

import android.graphics.Bitmap;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.o.c;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f56959a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f56960b;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_ui_image_helper_ByteDanceFrescoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_ui_image_helper_ByteDanceFrescoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(35435);
        try {
            f56959a = ImageDecodeOptionsBuilder.class.getDeclaredMethod("a", Integer.TYPE);
        } catch (Throwable th) {
            LLog.a(6, "Fresco", Log.getStackTraceString(th));
        }
        try {
            f56960b = com.facebook.fresco.animation.c.a.class.getDeclaredMethod("setPrivateFrameScheduler", com.facebook.fresco.animation.d.b.class);
        } catch (Throwable th2) {
            LLog.a(6, "Fresco", Log.getStackTraceString(th2));
        }
    }

    public static c a(c cVar) {
        ImageDecodeOptionsBuilder bitmapConfig = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.ARGB_8888);
        Method method = f56959a;
        if (method != null) {
            try {
                a(method, bitmapConfig, new Object[]{0});
            } catch (IllegalAccessException e2) {
                LLog.a(6, "Fresco", Log.getStackTraceString(e2));
            } catch (InvocationTargetException e3) {
                LLog.a(6, "Fresco", Log.getStackTraceString(e3));
            }
        }
        cVar.f48449f = bitmapConfig.a();
        return cVar;
    }

    public static void a(com.facebook.fresco.animation.c.a aVar) {
        if (f56960b != null) {
            com.facebook.fresco.animation.d.a aVar2 = new com.facebook.fresco.animation.d.a(aVar.f47564d);
            try {
                a(f56960b, aVar, new Object[]{aVar2});
            } catch (IllegalAccessException e2) {
                LLog.a(6, "Fresco", Log.getStackTraceString(e2));
            } catch (InvocationTargetException e3) {
                LLog.a(6, "Fresco", Log.getStackTraceString(e3));
            }
        }
    }
}
