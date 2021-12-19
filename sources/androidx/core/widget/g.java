package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2638a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2639b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2640c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2641d;

    static {
        Covode.recordClassIndex(905);
    }

    public static void a(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!f2639b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2638a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2639b = true;
        }
        Method method = f2638a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!f2641d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2640c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f2641d = true;
            }
            Field field = f2640c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        popupWindow.showAsDropDown(view, i2, i3, i4);
    }
}
