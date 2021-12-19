package h.f;

import com.bytedance.covode.number.Covode;

public final class b extends Error {
    static {
        Covode.recordClassIndex(105198);
    }

    public b() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public b(String str) {
        super(str);
    }

    public b(Throwable th) {
        super(th);
    }

    public b(String str, Throwable th) {
        super(str, th);
    }
}
