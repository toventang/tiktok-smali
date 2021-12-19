package androidx.h;

import androidx.h.h;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class d<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    AtomicBoolean f3088a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<b> f3089b = new CopyOnWriteArrayList<>();

    public static abstract class a<Key, Value> {
        static {
            Covode.recordClassIndex(1102);
        }

        public abstract d<Key, Value> a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(1103);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(1101);
    }

    static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f3090a;

        /* renamed from: b  reason: collision with root package name */
        public final h.a<T> f3091b;

        /* renamed from: c  reason: collision with root package name */
        private final d f3092c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f3093d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Executor f3094e = null;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3095f = false;

        static {
            Covode.recordClassIndex(1104);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (!this.f3092c.f3088a.get()) {
                return false;
            }
            a(h.f3132b);
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a(Executor executor) {
            synchronized (this.f3093d) {
                this.f3094e = executor;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(final h<T> hVar) {
            Executor executor;
            synchronized (this.f3093d) {
                if (!this.f3095f) {
                    this.f3095f = true;
                    executor = this.f3094e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new Runnable() {
                    /* class androidx.h.d.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(1105);
                    }

                    public final void run() {
                        c.this.f3091b.a(c.this.f3090a, hVar);
                    }
                });
            } else {
                this.f3091b.a(this.f3090a, hVar);
            }
        }

        c(d dVar, int i2, Executor executor, h.a<T> aVar) {
            this.f3092c = dVar;
            this.f3090a = i2;
            this.f3094e = executor;
            this.f3091b = aVar;
        }
    }

    d() {
    }

    public final void f_() {
        if (this.f3088a.compareAndSet(false, true)) {
            Iterator<b> it = this.f3089b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void a(b bVar) {
        this.f3089b.add(bVar);
    }

    public final void b(b bVar) {
        this.f3089b.remove(bVar);
    }
}
