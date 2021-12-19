package androidx.k;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ah extends ag {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3242a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3243b;

    static {
        Covode.recordClassIndex(1176);
    }

    ah() {
    }

    @Override // androidx.k.ai
    public final void a(View view, int i2, int i3, int i4, int i5) {
        if (!f3243b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f3242a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3243b = true;
        }
        Method method = f3242a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
