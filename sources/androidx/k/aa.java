package androidx.k;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class aa {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3220a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3221b;

    static {
        Covode.recordClassIndex(1166);
    }

    private static void a() {
        if (!f3221b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f3220a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3221b = true;
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        a();
        Method method = f3220a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
