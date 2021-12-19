package dagger.hilt;

import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;

public final class a {
    static {
        Covode.recordClassIndex(104026);
    }

    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof dagger.hilt.a.a) {
            return cls.cast(obj);
        }
        if (obj instanceof b) {
            return cls.cast(((b) obj).generatedComponent());
        }
        throw new IllegalStateException(com.a.a("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), dagger.hilt.a.a.class, b.class}));
    }
}
