package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.a.c;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;

public abstract class Worker extends ListenableWorker {

    /* renamed from: e  reason: collision with root package name */
    c<ListenableWorker.a> f4453e;

    static {
        Covode.recordClassIndex(1739);
    }

    public abstract ListenableWorker.a d();

    @Override // androidx.work.ListenableWorker
    public final q<ListenableWorker.a> a() {
        this.f4453e = new c<>();
        this.f4448b.f4459e.execute(new Runnable() {
            /* class androidx.work.Worker.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1740);
            }

            public final void run() {
                try {
                    Worker.this.f4453e.a(Worker.this.d());
                } catch (Throwable th) {
                    Worker.this.f4453e.a(th);
                }
            }
        });
        return this.f4453e;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
