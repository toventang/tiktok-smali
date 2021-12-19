package android.view;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class a extends View {
    static {
        Covode.recordClassIndex(198);
    }

    public static void a(View view) {
        view.onFinishInflate();
    }

    public static void a(View view, int i2) {
        ((TextView) view).setMinWidth(i2);
    }

    public static void b(View view, int i2) {
        ((TextView) view).setMinHeight(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    public static Method a(Class cls, String str, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, cls2);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new IllegalStateException("getMethod failed ".concat(String.valueOf(str)));
        }
    }

    public static ViewGroup.MarginLayoutParams a(ViewGroup viewGroup, int i2, int i3) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i2, i3);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i2, i3);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i2, i3);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.a(i2, i3);
        }
        return new ViewGroup.MarginLayoutParams(i2, i3);
    }
}
