package b;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class f implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4818a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final List<e> f4819b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture<?> f4820c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f4821d = g.d();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4822e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4823f;

    static {
        Covode.recordClassIndex(1897);
    }

    private void e() {
        ScheduledFuture<?> scheduledFuture = this.f4820c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f4820c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.f4823f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public final boolean a() {
        boolean z;
        MethodCollector.i(532);
        synchronized (this.f4818a) {
            try {
                d();
                z = this.f4822e;
            } finally {
                MethodCollector.o(532);
            }
        }
        return z;
    }

    public final d b() {
        d dVar;
        MethodCollector.i(540);
        synchronized (this.f4818a) {
            try {
                d();
                dVar = new d(this);
            } finally {
                MethodCollector.o(540);
            }
        }
        return dVar;
    }

    public final void c() {
        MethodCollector.i(565);
        synchronized (this.f4818a) {
            try {
                d();
                if (!this.f4822e) {
                    e();
                    this.f4822e = true;
                    a(new ArrayList(this.f4819b));
                    MethodCollector.o(565);
                }
            } finally {
                MethodCollector.o(565);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.i(570);
        synchronized (this.f4818a) {
            try {
                if (!this.f4823f) {
                    e();
                    for (e eVar : this.f4819b) {
                        eVar.close();
                    }
                    this.f4819b.clear();
                    this.f4823f = true;
                    MethodCollector.o(570);
                }
            } finally {
                MethodCollector.o(570);
            }
        }
    }

    public final String toString() {
        return a.a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(a())});
    }

    private static void a(List<e> list) {
        MethodCollector.i(581);
        for (e eVar : list) {
            synchronized (eVar.f4814a) {
                try {
                    if (!eVar.f4816c) {
                        eVar.f4815b.run();
                        eVar.close();
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Object already closed");
                        MethodCollector.o(581);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(581);
                    throw th;
                }
            }
        }
        MethodCollector.o(581);
    }
}
