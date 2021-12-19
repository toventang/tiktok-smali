package f.a.c;

import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(104382);
    }

    public static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw th;
        } else if (th instanceof ThreadDeath) {
            throw th;
        } else if (th instanceof LinkageError) {
            throw th;
        }
    }
}
