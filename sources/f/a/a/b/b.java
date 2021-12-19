package f.a.a.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

final class b extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f157158a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f157159c = false;

    static {
        Covode.recordClassIndex(104355);
    }

    static final class a extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f157160a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f157161b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f157162c;

        static {
            Covode.recordClassIndex(104356);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157162c;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157162c = true;
            this.f157160a.removeCallbacksAndMessages(this);
        }

        a(Handler handler, boolean z) {
            this.f157160a = handler;
            this.f157161b = z;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f157162c) {
                return c.INSTANCE;
            }
            RunnableC4154b bVar = new RunnableC4154b(this.f157160a, f.a.h.a.a(runnable));
            Message obtain = Message.obtain(this.f157160a, bVar);
            obtain.obj = this;
            if (this.f157161b) {
                obtain.setAsynchronous(true);
            }
            this.f157160a.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f157162c) {
                return bVar;
            }
            this.f157160a.removeCallbacks(bVar);
            return c.INSTANCE;
        }
    }

    /* renamed from: f.a.a.b.b$b  reason: collision with other inner class name */
    static final class RunnableC4154b implements f.a.b.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f157163a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f157164b;

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f157165c;

        static {
            Covode.recordClassIndex(104357);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157165c;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157163a.removeCallbacks(this);
            this.f157165c = true;
        }

        public final void run() {
            try {
                this.f157164b.run();
            } catch (Throwable th) {
                f.a.h.a.a(th);
            }
        }

        RunnableC4154b(Handler handler, Runnable runnable) {
            this.f157163a = handler;
            this.f157164b = runnable;
        }
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new a(this.f157158a, this.f157159c);
    }

    b(Handler handler) {
        this.f157158a = handler;
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        RunnableC4154b bVar = new RunnableC4154b(this.f157158a, f.a.h.a.a(runnable));
        Message obtain = Message.obtain(this.f157158a, bVar);
        if (this.f157159c) {
            obtain.setAsynchronous(true);
        }
        this.f157158a.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
        return bVar;
    }
}
