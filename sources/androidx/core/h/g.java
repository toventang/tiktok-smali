package androidx.core.h;

import android.os.Build;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static Field f2546a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2547b;

    static {
        Covode.recordClassIndex(858);
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                b(layoutInflater, factory2);
            }
        }
    }

    private static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2547b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2546a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2547b = true;
        }
        Field field = f2546a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
