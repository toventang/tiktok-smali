package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.e.i.f;
import f.a.h;
import f.a.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class u<T> extends a<T, T> {
    static {
        Covode.recordClassIndex(104531);
    }

    static final class a<T> extends AtomicInteger implements l<T>, d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final c<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        static {
            Covode.recordClassIndex(104532);
        }

        @Override // org.a.c
        public final void onComplete() {
            this.done = true;
            a();
        }

        @Override // org.a.d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet(null);
                }
            }
        }

        private void a() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                c<? super T> cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i2 = 1;
                do {
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!a(z3, z2, cVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (a(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        f.a.e.j.d.b(atomicLong, j2);
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            a();
        }

        @Override // org.a.c
        public final void onNext(T t) {
            this.current.lazySet(t);
            a();
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (f.validate(j2)) {
                f.a.e.j.d.a(this.requested, j2);
                a();
            }
        }

        a(c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        private boolean a(boolean z, boolean z2, c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    cVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            }
        }
    }

    public u(h<T> hVar) {
        super(hVar);
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar));
    }
}
