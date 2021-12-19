package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2425a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2426b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2427c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2428d;

    static {
        Covode.recordClassIndex(786);
    }

    public static int b(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    public static boolean c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static Drawable e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof e)) {
                return new h(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof e)) {
            return new g(drawable);
        } else {
            return drawable;
        }
    }

    public static int f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!f2428d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2427c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2428d = true;
        }
        Method method = f2427c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f2427c = null;
            }
        }
        return 0;
    }

    public static void d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof f) {
                drawable = ((f) drawable).a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        d(child);
                    }
                }
                return;
            } else {
                return;
            }
        }
        drawable.clearColorFilter();
    }

    public static boolean a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    public static void a(Drawable drawable, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(z);
    }

    public static void a(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i2);
        } else if (drawable instanceof e) {
            ((e) drawable).setTint(i2);
        }
    }

    public static boolean b(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!f2426b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2425a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2426b = true;
        }
        Method method = f2425a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception unused2) {
                f2425a = null;
            }
        }
        return false;
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof e) {
            ((e) drawable).setTintMode(mode);
        }
    }

    public static void a(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    public static void a(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }
}
