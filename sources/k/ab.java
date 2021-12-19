package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class ab {
    public static final a Companion = new a((byte) 0);
    public static final ab NONE = new b();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public ab clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105414);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends ab {
        static {
            Covode.recordClassIndex(105415);
        }

        @Override // k.ab
        public final void throwIfReached() {
        }

        b() {
        }

        @Override // k.ab
        public final ab deadlineNanoTime(long j2) {
            return this;
        }

        @Override // k.ab
        public final ab timeout(long j2, TimeUnit timeUnit) {
            l.c(timeUnit, "");
            return this;
        }
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public ab clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    static {
        Covode.recordClassIndex(105413);
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public void throwIfReached() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ab deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }

    public final void waitUntilNotified(Object obj) {
        MethodCollector.i(3897);
        l.c(obj, "");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j2 = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2) {
                    if (timeoutNanos2 != 0) {
                        timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                    } else {
                        timeoutNanos2 = deadlineNanoTime() - nanoTime;
                    }
                }
                if (timeoutNanos2 > 0) {
                    long j3 = timeoutNanos2 / 1000000;
                    Long.signum(j3);
                    obj.wait(j3, (int) (timeoutNanos2 - (1000000 * j3)));
                    j2 = System.nanoTime() - nanoTime;
                }
                if (j2 < timeoutNanos2) {
                    MethodCollector.o(3897);
                    return;
                }
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                MethodCollector.o(3897);
                throw interruptedIOException;
            }
            obj.wait();
            MethodCollector.o(3897);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException2 = new InterruptedIOException("interrupted");
            MethodCollector.o(3897);
            throw interruptedIOException2;
        }
    }

    public final ab deadline(long j2, TimeUnit timeUnit) {
        l.c(timeUnit, "");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
        }
        throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j2)).toString());
    }

    public ab timeout(long j2, TimeUnit timeUnit) {
        l.c(timeUnit, "");
        if (j2 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j2)).toString());
    }
}
