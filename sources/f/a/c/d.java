package f.a.c;

import com.bytedance.covode.number.Covode;

public final class d extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    static {
        Covode.recordClassIndex(104384);
    }

    public d(Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(th)), th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
