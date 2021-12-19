package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

public final class j {
    static {
        Covode.recordClassIndex(105489);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.concurrent.CancellationException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u<?> uVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            cancellationException = cancellationException;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        uVar.a(cancellationException);
    }
}
