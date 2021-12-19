package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.appcompat.b.a.c;
import androidx.core.graphics.drawable.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.reflect.Field;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f1712a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f1713b;

    static {
        Covode.recordClassIndex(520);
        int i2 = Build.VERSION.SDK_INT;
        try {
            f1713b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            d(drawable);
        }
    }

    private static void d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(ah.f1534e);
        } else {
            drawable.setState(ah.f1537h);
        }
        drawable.setState(state);
    }

    public static boolean c(Drawable drawable) {
        while (true) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                for (Drawable drawable2 : children) {
                    if (!c(drawable2)) {
                        return false;
                    }
                }
                return true;
            } else if (drawable instanceof f) {
                drawable = ((f) drawable).a();
            } else if (drawable instanceof c) {
                drawable = ((c) drawable).f1046a;
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable = ((ScaleDrawable) drawable).getDrawable();
            }
        }
    }

    public static Rect a(Drawable drawable) {
        if (f1713b != null) {
            try {
                if (drawable instanceof f) {
                    drawable = ((f) drawable).a();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    Field[] fields = f1713b.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
            }
        }
        return f1712a;
    }

    public static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
