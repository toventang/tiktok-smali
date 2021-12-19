package dagger.hilt.android.internal.managers;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f156670a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f156671b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final d f156672c;

    static {
        Covode.recordClassIndex(104055);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        MethodCollector.i(462);
        if (this.f156670a == null) {
            synchronized (this.f156671b) {
                try {
                    if (this.f156670a == null) {
                        this.f156670a = this.f156672c.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(462);
                    throw th;
                }
            }
        }
        Object obj = this.f156670a;
        MethodCollector.o(462);
        return obj;
    }

    public b(d dVar) {
        this.f156672c = dVar;
    }
}
