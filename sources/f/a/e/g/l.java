package f.a.e.g;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final class l extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    static {
        Covode.recordClassIndex(104837);
    }

    @Override // f.a.e.g.a
    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(f157835a);
            this.runner = null;
        }
    }

    public l(Runnable runnable) {
        super(runnable);
    }
}
