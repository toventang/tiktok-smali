package com.lynx.component.svg.a;

import android.graphics.Canvas;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

final class b {

    /* renamed from: a  reason: collision with root package name */
    static final int f55211a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f55212b = Canvas.class.getMethod("save", Integer.TYPE);

    static {
        Covode.recordClassIndex(34634);
    }

    static void a(Canvas canvas, int i2) {
        Method method = f55212b;
        Object[] objArr = {Integer.valueOf(i2)};
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{canvas, objArr}, 110000, "java.lang.Object", true, "com_lynx_component_svg_parser_CanvasLegacy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            Object obj = a2.second;
            return;
        }
        a.a(method.invoke(canvas, objArr), method, new Object[]{canvas, objArr}, "com_lynx_component_svg_parser_CanvasLegacy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
    }
}
