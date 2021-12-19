package androidx.k;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ag extends af {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3238a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3239b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f3240c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3241d;

    static {
        Covode.recordClassIndex(1175);
    }

    ag() {
    }

    @Override // androidx.k.ai
    public final void a(View view, Matrix matrix) {
        if (!f3239b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f3238a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3239b = true;
        }
        Method method = f3238a;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // androidx.k.ai
    public final void b(View view, Matrix matrix) {
        if (!f3241d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f3240c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3241d = true;
        }
        Method method = f3240c;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
