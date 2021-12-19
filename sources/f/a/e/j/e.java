package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.e.g.i;
import f.a.h.a;

public final class e {
    static {
        Covode.recordClassIndex(104864);
    }

    public static void a() {
        if (!a.x) {
            return;
        }
        if ((Thread.currentThread() instanceof i) || a.a()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }
}
