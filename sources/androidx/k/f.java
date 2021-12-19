package androidx.k;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;

final class f {
    static {
        Covode.recordClassIndex(1207);
    }

    static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new h(property, path), 0.0f, 1.0f);
    }
}
