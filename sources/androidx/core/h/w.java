package androidx.core.h;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2578a;

    static {
        Covode.recordClassIndex(883);
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2578a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2578a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
