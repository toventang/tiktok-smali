package dagger.hilt.android.internal.managers;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.a.b;

public final class c implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f156673a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f156674b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.assem.arch.core.a f156675c;

    public interface a {
        static {
            Covode.recordClassIndex(104057);
        }

        dagger.hilt.android.internal.a.c j();
    }

    static {
        Covode.recordClassIndex(104056);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        MethodCollector.i(474);
        if (this.f156673a == null) {
            synchronized (this.f156674b) {
                try {
                    if (this.f156673a == null) {
                        Context ar_ = this.f156675c.ar_();
                        dagger.hilt.a.c.a(ar_ instanceof b, "Hilt Assems must be attached to an @AndroidEntryPoint Activity. Found: %s", ar_.getClass());
                        this.f156673a = ((a) ((b) this.f156675c.ar_()).generatedComponent()).j().a(this.f156675c).a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(474);
                    throw th;
                }
            }
        }
        Object obj = this.f156673a;
        MethodCollector.o(474);
        return obj;
    }

    public c(com.bytedance.assem.arch.core.a aVar) {
        this.f156675c = aVar;
    }
}
