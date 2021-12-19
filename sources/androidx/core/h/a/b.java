package androidx.core.h.a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(810);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        accessibilityEvent.setContentChangeTypes(i2);
    }
}
