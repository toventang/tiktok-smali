package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ar {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1592a;

    static {
        Covode.recordClassIndex(480);
        int i2 = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1592a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f1592a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        if (v.e(view) == 1) {
            return true;
        }
        return false;
    }

    public static void b(View view) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1592a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }
}
