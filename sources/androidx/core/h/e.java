package androidx.core.h;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(855);
    }

    public static int a(int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i2, i3);
    }

    public static void a(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        Gravity.apply(i2, i3, i4, rect, rect2, i5);
    }
}
