package j.a.a;

import com.bytedance.covode.number.Covode;

final class a extends RuntimeException {
    static {
        Covode.recordClassIndex(105398);
    }

    a(Class<?> cls) {
        super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
