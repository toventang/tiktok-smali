package f.a.e.g;

import com.bytedance.covode.number.Covode;
import f.a.h.a;

public final class k extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    static {
        Covode.recordClassIndex(104836);
    }

    @Override // f.a.e.g.a
    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(f157835a);
            a.a(th);
        }
    }

    public k(Runnable runnable) {
        super(runnable);
    }
}
