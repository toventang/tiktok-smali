package f.a.b;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class e extends d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    static {
        Covode.recordClassIndex(104375);
    }

    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    e(Runnable runnable) {
        super(runnable);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // f.a.b.d
    public final /* synthetic */ void a(Runnable runnable) {
        runnable.run();
    }
}
