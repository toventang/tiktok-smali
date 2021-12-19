package dagger.hilt.a;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(104029);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(a.a(str, objArr));
        }
    }
}
