package ms.bd.o;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class h1 extends b.a {
    static {
        Covode.recordClassIndex(105910);
    }

    h1() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        double d2;
        Object invoke;
        MethodCollector.i(8819);
        Context context = a.f159493a.f159494b;
        try {
            Class<?> cls = Class.forName(new String(c0.a((String) h.a(16777217, 0, 0, "e79380", new byte[]{34, 102, 28, 65, 81, 35, 52, 19, 62, 50, 34, 48, 28, 19, 80, 117, 48, 16, 62, 58, 34, 97, 24, 66, 81, 126, 48, 19, 63, 55, 34, 96, 29, 21, 81, 34, 48, 71, 62, 96, 38, 48, 28, 65, 80, 116, 52, 19, 61, 51, 34, 51, 29, 16, 81, 114, 49, 68, 61, 51, 35, 103, 28, 65, 81, 113, 48, 79, 62, 96, 34, 96}))));
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(c0.a((String) h.a(16777217, 0, 0, "39cd03", new byte[]{116, 108, 70, 69, 88, 112, 100, 73, 101, 98, 116, 110, 71, 66, 89, 117, 102, 79, 100, 97, 119, 107, 70, 22, 88, 115, 102, 77, 101, 102}))), String.class);
            declaredMethod.setAccessible(true);
            Object[] objArr = {new String(c0.a((String) h.a(16777217, 0, 0, "7963a5", new byte[]{112, 105, 19, 22, 9, 118, 99, 76, 49, 54, 113, 105, 18, 30, 12, 39, 98, 75, 49, 50, 113, 107, 19, 22, 8, 113, 98, 65, 48, 55, 113, 98})))};
            Pair<Boolean, Object> a2 = a.a(declaredMethod, new Object[]{newInstance, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_h1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = declaredMethod.invoke(newInstance, objArr);
                a.a(invoke, declaredMethod, new Object[]{newInstance, objArr}, "ms_bd_o_h1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            d2 = ((Double) invoke).doubleValue();
        } catch (Throwable unused) {
            d2 = 0.0d;
        }
        String num = Integer.toString((int) d2);
        MethodCollector.o(8819);
        return num;
    }
}
