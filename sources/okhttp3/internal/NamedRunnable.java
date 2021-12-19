package okhttp3.internal;

import com.bytedance.covode.number.Covode;

public abstract class NamedRunnable implements Runnable {
    protected final String name;

    static {
        Covode.recordClassIndex(106191);
    }

    /* access modifiers changed from: protected */
    public abstract void execute();

    public final void run() {
        String name2 = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name2);
        }
    }

    public NamedRunnable(String str, Object... objArr) {
        this.name = Util.format(str, objArr);
    }
}
