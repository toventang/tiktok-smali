package dagger.a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class f {
    static {
        Covode.recordClassIndex(104025);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
