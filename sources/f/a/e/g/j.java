package f.a.e.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class j extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    static {
        Covode.recordClassIndex(104834);
    }

    public final String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public j(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        MethodCollector.i(11587);
        String str = this.prefix + '-' + incrementAndGet();
        if (this.nonBlocking) {
            thread = new a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        MethodCollector.o(11587);
        return thread;
    }

    static final class a extends Thread implements i {
        static {
            Covode.recordClassIndex(104835);
        }

        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public j(String str, int i2) {
        this(str, i2, false);
    }

    public j(String str, int i2, boolean z) {
        this.prefix = str;
        this.priority = i2;
        this.nonBlocking = z;
    }
}
