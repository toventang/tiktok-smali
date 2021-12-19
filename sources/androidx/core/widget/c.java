package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Field f2634a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2635b;

    static {
        Covode.recordClassIndex(901);
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f2635b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2634a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2635b = true;
        }
        Field field = f2634a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f2634a = null;
            }
        }
        return null;
    }

    public static void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof i) {
            ((i) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof i) {
            ((i) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
