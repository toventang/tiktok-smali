package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    final Executor f3513a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<T> f3514b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f3515c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f3516d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    final Runnable f3517e = new Runnable() {
        /* class androidx.lifecycle.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1311);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: androidx.lifecycle.LiveData<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x000c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3516d
                r3 = 0
                r4 = 1
                boolean r0 = r0.compareAndSet(r3, r4)
                if (r0 == 0) goto L_0x003c
                r2 = 0
                r1 = 0
            L_0x000e:
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this     // Catch:{ all -> 0x003d }
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3515c     // Catch:{ all -> 0x003d }
                boolean r0 = r0.compareAndSet(r4, r3)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0020
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this     // Catch:{ all -> 0x003d }
                java.lang.Object r2 = r0.a()     // Catch:{ all -> 0x003d }
                r1 = 1
                goto L_0x000e
            L_0x0020:
                if (r1 == 0) goto L_0x0029
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this     // Catch:{ all -> 0x003d }
                androidx.lifecycle.LiveData<T> r0 = r0.f3514b     // Catch:{ all -> 0x003d }
                r0.postValue(r2)     // Catch:{ all -> 0x003d }
            L_0x0029:
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3516d
                r0.set(r3)
                if (r1 == 0) goto L_0x003c
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3515c
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0000
            L_0x003c:
                return
            L_0x003d:
                r1 = move-exception
                androidx.lifecycle.b r0 = androidx.lifecycle.b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3516d
                r0.set(r3)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b.AnonymousClass2.run():void");
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f3518f = new Runnable() {
        /* class androidx.lifecycle.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1312);
        }

        public final void run() {
            boolean hasActiveObservers = b.this.f3514b.hasActiveObservers();
            if (b.this.f3515c.compareAndSet(false, true) && hasActiveObservers) {
                b.this.f3513a.execute(b.this.f3517e);
            }
        }
    };

    static {
        Covode.recordClassIndex(1309);
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public b(Executor executor) {
        this.f3513a = executor;
        this.f3514b = new LiveData<T>() {
            /* class androidx.lifecycle.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1310);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.lifecycle.LiveData
            public final void onActive() {
                b.this.f3513a.execute(b.this.f3517e);
            }
        };
    }
}
