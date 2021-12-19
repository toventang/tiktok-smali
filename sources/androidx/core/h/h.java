package androidx.core.h;

import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(859);
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginStart();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i2 = Build.VERSION.SDK_INT;
        return marginLayoutParams.getMarginEnd();
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(i2);
    }

    public static void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd(i2);
    }
}
