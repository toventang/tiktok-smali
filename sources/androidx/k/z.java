package androidx.k;

import android.animation.LayoutTransition;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class z {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f3372a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f3373b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3374c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f3375d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3376e;

    static {
        Covode.recordClassIndex(1247);
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!f3376e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f3375d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f3376e = true;
        }
        Method method = f3375d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r4 == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.view.ViewGroup r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.k.z.a(android.view.ViewGroup, boolean):void");
    }
}
