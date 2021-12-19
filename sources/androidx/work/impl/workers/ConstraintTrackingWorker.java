package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.impl.a.c;
import androidx.work.impl.a.d;
import androidx.work.impl.f;
import androidx.work.k;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4792j = g.a("ConstraintTrkngWrkr");

    /* renamed from: e  reason: collision with root package name */
    WorkerParameters f4793e;

    /* renamed from: f  reason: collision with root package name */
    final Object f4794f = new Object();

    /* renamed from: g  reason: collision with root package name */
    volatile boolean f4795g = false;

    /* renamed from: h  reason: collision with root package name */
    androidx.work.impl.utils.a.c<ListenableWorker.a> f4796h = new androidx.work.impl.utils.a.c<>();

    /* renamed from: i  reason: collision with root package name */
    public ListenableWorker f4797i;

    @Override // androidx.work.impl.a.c
    public final void a(List<String> list) {
    }

    static {
        Covode.recordClassIndex(1883);
    }

    @Override // androidx.work.ListenableWorker
    public final q<ListenableWorker.a> a() {
        this.f4448b.f4459e.execute(new Runnable() {
            /* class androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1884);
            }

            public final void run() {
                String str;
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.f4448b.f4456b.f4501b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    g.a();
                    constraintTrackingWorker.d();
                    return;
                }
                constraintTrackingWorker.f4797i = k.a(constraintTrackingWorker.f4447a, str, constraintTrackingWorker.f4793e);
                if (constraintTrackingWorker.f4797i == null) {
                    g.a();
                    constraintTrackingWorker.d();
                    return;
                }
                androidx.work.impl.b.g a2 = f.b().f4701c.i().a(constraintTrackingWorker.f4448b.f4455a.toString());
                if (a2 == null) {
                    constraintTrackingWorker.d();
                    return;
                }
                d dVar = new d(constraintTrackingWorker.f4447a, constraintTrackingWorker);
                dVar.a(Collections.singletonList(a2));
                if (dVar.a(constraintTrackingWorker.f4448b.f4455a.toString())) {
                    g.a();
                    a.a("Constraints met for delegate %s", new Object[]{str});
                    try {
                        q<ListenableWorker.a> a3 = constraintTrackingWorker.f4797i.a();
                        a3.a(new Runnable(a3) {
                            /* class androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ q f4799a;

                            static {
                                Covode.recordClassIndex(1885);
                            }

                            public final void run() {
                                synchronized (ConstraintTrackingWorker.this.f4794f) {
                                    if (ConstraintTrackingWorker.this.f4795g) {
                                        ConstraintTrackingWorker.this.e();
                                    } else {
                                        ConstraintTrackingWorker.this.f4796h.a(this.f4799a);
                                    }
                                }
                            }

                            {
                                this.f4799a = r2;
                            }
                        }, constraintTrackingWorker.f4448b.f4459e);
                    } catch (Throwable unused) {
                        g.a();
                        a.a("Delegated worker %s threw exception in startWork.", new Object[]{str});
                        Throwable[] thArr = new Throwable[1];
                        synchronized (constraintTrackingWorker.f4794f) {
                            if (constraintTrackingWorker.f4795g) {
                                g.a();
                                constraintTrackingWorker.e();
                            } else {
                                constraintTrackingWorker.d();
                            }
                        }
                    }
                } else {
                    g.a();
                    a.a("Constraints not met for delegate %s. Requesting retry.", new Object[]{str});
                    constraintTrackingWorker.e();
                }
            }
        });
        return this.f4796h;
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        super.c();
        ListenableWorker listenableWorker = this.f4797i;
        if (listenableWorker != null) {
            listenableWorker.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f4796h.a(new ListenableWorker.a.C0066a());
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.f4796h.a(new ListenableWorker.a.b());
    }

    @Override // androidx.work.impl.a.c
    public final void b(List<String> list) {
        g.a();
        a.a("Constraints changed for %s", new Object[]{list});
        synchronized (this.f4794f) {
            this.f4795g = true;
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4793e = workerParameters;
    }
}
