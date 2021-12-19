package dagger.hilt.android.internal.managers;

import androidx.core.app.d;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.hilt.a.b;

/* access modifiers changed from: package-private */
public final class ActivityRetainedComponentManager implements b<dagger.hilt.android.a.b> {

    /* renamed from: a  reason: collision with root package name */
    private final ad f156660a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.a.b f156661b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f156662c = new Object();

    public interface a {
        static {
            Covode.recordClassIndex(104052);
        }

        dagger.hilt.android.internal.a.b a();
    }

    static {
        Covode.recordClassIndex(104049);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public dagger.hilt.android.a.b generatedComponent() {
        MethodCollector.i(589);
        if (this.f156661b == null) {
            synchronized (this.f156662c) {
                try {
                    if (this.f156661b == null) {
                        this.f156661b = ((ActivityRetainedComponentViewModel) this.f156660a.a(ActivityRetainedComponentViewModel.class)).f156665a;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(589);
                    throw th;
                }
            }
        }
        dagger.hilt.android.a.b bVar = this.f156661b;
        MethodCollector.o(589);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class ActivityRetainedComponentViewModel extends ac {

        /* renamed from: a  reason: collision with root package name */
        public final dagger.hilt.android.a.b f156665a;

        static {
            Covode.recordClassIndex(104051);
        }

        ActivityRetainedComponentViewModel(dagger.hilt.android.a.b bVar) {
            this.f156665a = bVar;
        }
    }

    ActivityRetainedComponentManager(final d dVar) {
        this.f156660a = new ad((ag) dVar, new ad.b() {
            /* class dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104050);
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                return new ActivityRetainedComponentViewModel(((a) ((b) dVar.getApplication()).generatedComponent()).a().a());
            }
        });
    }
}
