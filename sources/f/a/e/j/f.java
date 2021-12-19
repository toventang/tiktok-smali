package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.c.e;
import f.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

public final class f {
    static {
        Covode.recordClassIndex(104865);
    }

    private static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void a(Class<?> cls) {
        a.a(new e(a(cls.getName())));
    }

    public static boolean a(AtomicReference<b> atomicReference, b bVar, Class<?> cls) {
        f.a.e.b.b.a((Object) bVar, "next is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == f.a.e.a.b.DISPOSED) {
            return false;
        }
        a(cls);
        return false;
    }
}
