package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.a;
import h.c.f;

public final class aj {
    static {
        Covode.recordClassIndex(105522);
    }

    public static final Throwable a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        a.a(runtimeException, th);
        return runtimeException;
    }

    public static final void a(f fVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.f158926c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                ai.a(fVar, th);
            }
        } catch (Throwable th2) {
            ai.a(fVar, a(th, th2));
        }
    }
}
