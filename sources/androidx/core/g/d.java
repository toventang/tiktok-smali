package androidx.core.g;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class d {
    static {
        Covode.recordClassIndex(770);
    }

    public static int a(Object... objArr) {
        int i2 = Build.VERSION.SDK_INT;
        return Objects.hash(objArr);
    }

    public static boolean a(Object obj, Object obj2) {
        int i2 = Build.VERSION.SDK_INT;
        return Objects.equals(obj, obj2);
    }
}
