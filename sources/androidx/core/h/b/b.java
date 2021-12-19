package androidx.core.h.b;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(848);
    }

    public static Interpolator a(float f2, float f3, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f2, f3, f4, f5);
        }
        return new a(f2, f3, f4, f5);
    }
}
