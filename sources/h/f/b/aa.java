package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.c;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    static final ab f158711a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f158712b = new c[0];

    static {
        Covode.recordClassIndex(105207);
        ab abVar = null;
        try {
            abVar = (ab) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (abVar == null) {
            abVar = new ab();
        }
        f158711a = abVar;
    }

    public static c a(Class cls) {
        return ab.a(cls);
    }
}
