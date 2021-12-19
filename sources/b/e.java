package b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;

public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final Object f4814a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f4815b;

    /* renamed from: c  reason: collision with root package name */
    boolean f4816c;

    /* renamed from: d  reason: collision with root package name */
    private f f4817d;

    static {
        Covode.recordClassIndex(1896);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.i(528);
        synchronized (this.f4814a) {
            try {
                if (!this.f4816c) {
                    this.f4816c = true;
                    f fVar = this.f4817d;
                    synchronized (fVar.f4818a) {
                        try {
                            fVar.d();
                            fVar.f4819b.remove(this);
                        } finally {
                            MethodCollector.o(528);
                        }
                    }
                    this.f4817d = null;
                    this.f4815b = null;
                }
            } finally {
                MethodCollector.o(528);
            }
        }
    }
}
