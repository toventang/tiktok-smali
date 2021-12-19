package f.a.e.i;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.d;

public class e extends AtomicInteger implements d {
    private static final long serialVersionUID = -2189523197179400958L;
    d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    final AtomicLong missedProduced = new AtomicLong();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicReference<d> missedSubscription = new AtomicReference<>();
    long requested;
    protected boolean unbounded;

    static {
        Covode.recordClassIndex(104857);
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    private void a() {
        if (getAndIncrement() == 0) {
            b();
        }
    }

    @Override // org.a.d
    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            a();
        }
    }

    private void b() {
        int i2 = 1;
        d dVar = null;
        long j2 = 0;
        do {
            d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet(null);
            }
            long j3 = this.missedRequested.get();
            if (j3 != 0) {
                j3 = this.missedRequested.getAndSet(0);
            }
            long j4 = this.missedProduced.get();
            if (j4 != 0) {
                j4 = this.missedProduced.getAndSet(0);
            }
            d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j5 = this.requested;
                if (j5 != Long.MAX_VALUE) {
                    j5 = f.a.e.j.d.a(j5, j3);
                    if (j5 != Long.MAX_VALUE) {
                        j5 -= j4;
                        if (j5 < 0) {
                            f.reportMoreProduced(j5);
                            j5 = 0;
                        }
                    }
                    this.requested = j5;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j5 != 0) {
                        j2 = f.a.e.j.d.a(j2, j5);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j3 == 0)) {
                    j2 = f.a.e.j.d.a(j2, j3);
                    dVar = dVar3;
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
        if (j2 != 0) {
            dVar.request(j2);
        }
    }

    public e(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void produced(long j2) {
        if (!this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                f.a.e.j.d.a(this.missedProduced, j2);
                a();
                return;
            }
            long j3 = this.requested;
            if (j3 != Long.MAX_VALUE) {
                long j4 = j3 - j2;
                if (j4 < 0) {
                    f.reportMoreProduced(j4);
                    j4 = 0;
                }
                this.requested = j4;
            }
            if (decrementAndGet() != 0) {
                b();
            }
        }
    }

    @Override // org.a.d
    public final void request(long j2) {
        if (f.validate(j2) && !this.unbounded) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                f.a.e.j.d.a(this.missedRequested, j2);
                a();
                return;
            }
            long j3 = this.requested;
            if (j3 != Long.MAX_VALUE) {
                long a2 = f.a.e.j.d.a(j3, j2);
                this.requested = a2;
                if (a2 == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            d dVar = this.actual;
            if (decrementAndGet() != 0) {
                b();
            }
            if (dVar != null) {
                dVar.request(j2);
            }
        }
    }

    public final void setSubscription(d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        b.a((Object) dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d andSet = this.missedSubscription.getAndSet(dVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            a();
            return;
        }
        d dVar2 = this.actual;
        if (dVar2 != null && this.cancelOnReplace) {
            dVar2.cancel();
        }
        this.actual = dVar;
        long j2 = this.requested;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j2 != 0) {
            dVar.request(j2);
        }
    }
}
