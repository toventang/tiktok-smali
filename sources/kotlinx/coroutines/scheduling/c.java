package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import h.c.f;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.at;
import kotlinx.coroutines.bp;

public class c extends bp {

    /* renamed from: a  reason: collision with root package name */
    private CoroutineScheduler f159189a;

    /* renamed from: d  reason: collision with root package name */
    private final int f159190d;

    /* renamed from: e  reason: collision with root package name */
    private final int f159191e;

    /* renamed from: f  reason: collision with root package name */
    private final long f159192f;

    /* renamed from: g  reason: collision with root package name */
    private final String f159193g;

    static {
        Covode.recordClassIndex(105699);
    }

    @Override // kotlinx.coroutines.bp
    public final Executor a() {
        return this.f159189a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f159189a.close();
    }

    public /* synthetic */ c() {
        this(k.f159207c, k.f159208d, "DefaultDispatcher");
    }

    @Override // kotlinx.coroutines.ah
    public String toString() {
        return super.toString() + "[scheduler = " + this.f159189a + ']';
    }

    @Override // kotlinx.coroutines.ah
    public void dispatch(f fVar, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.f159189a, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            at.f159025a.dispatch(fVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.ah
    public void dispatchYield(f fVar, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.f159189a, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            at.f159025a.dispatchYield(fVar, runnable);
        }
    }

    public final void a(Runnable runnable, i iVar, boolean z) {
        try {
            this.f159189a.dispatch(runnable, iVar, z);
        } catch (RejectedExecutionException unused) {
            at.f159025a.enqueue(this.f159189a.createTask$kotlinx_coroutines_core(runnable, iVar));
        }
    }

    private c(int i2, int i3, String str) {
        this(i2, i3, k.f159209e, str);
    }

    private c(int i2, int i3, long j2, String str) {
        this.f159190d = i2;
        this.f159191e = i3;
        this.f159192f = j2;
        this.f159193g = str;
        this.f159189a = new CoroutineScheduler(i2, i3, j2, str);
    }
}
