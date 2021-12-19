package androidx.room;

import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class o implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4363a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f4364b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f4365c;

    static {
        Covode.recordClassIndex(1682);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        Runnable poll = this.f4364b.poll();
        this.f4365c = poll;
        if (poll != null) {
            this.f4363a.execute(poll);
        }
    }

    o(Executor executor) {
        this.f4363a = executor;
    }

    public final synchronized void execute(final Runnable runnable) {
        this.f4364b.offer(new Runnable() {
            /* class androidx.room.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1683);
            }

            public final void run() {
                try {
                    runnable.run();
                } finally {
                    o.this.a();
                }
            }
        });
        if (this.f4365c == null) {
            a();
        }
    }
}
