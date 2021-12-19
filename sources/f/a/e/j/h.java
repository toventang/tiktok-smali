package f.a.e.j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f157944a = new a();

    static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        static {
            Covode.recordClassIndex(104868);
        }

        public final Throwable fillInStackTrace() {
            return this;
        }

        a() {
            super("No further exceptions");
        }
    }

    static {
        Covode.recordClassIndex(104867);
    }

    public static <E extends Throwable> Exception b(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw th;
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static String a(long j2, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j2 + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }
}
