package androidx.k;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class af extends ai {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3234a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3235b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f3236c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3237d;

    static {
        Covode.recordClassIndex(1174);
    }

    @Override // androidx.k.ai
    public final void b(View view) {
    }

    @Override // androidx.k.ai
    public final void c(View view) {
    }

    af() {
    }

    @Override // androidx.k.ai
    public final float a(View view) {
        if (!f3237d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f3236c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3237d = true;
        }
        Method method = f3236c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.a(view);
    }

    @Override // androidx.k.ai
    public final void a(View view, float f2) {
        if (!f3235b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f3234a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3235b = true;
        }
        Method method = f3234a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f2));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(f2);
        }
    }
}
