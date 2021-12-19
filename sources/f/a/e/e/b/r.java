package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.c.b;
import f.a.e.c.h;
import f.a.e.i.f;
import f.a.l;
import java.util.concurrent.atomic.AtomicLong;
import org.a.c;
import org.a.d;

public final class r<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final int f157335c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f157336d = true;

    /* renamed from: e  reason: collision with root package name */
    final boolean f157337e = false;

    /* renamed from: f  reason: collision with root package name */
    final f.a.d.a f157338f;

    static {
        Covode.recordClassIndex(104525);
    }

    static final class a<T> extends f.a.e.i.a<T> implements l<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final c<? super T> downstream;
        Throwable error;
        final f.a.d.a onOverflow;
        boolean outputFused;
        final h<T> queue;
        final AtomicLong requested = new AtomicLong();
        d upstream;

        static {
            Covode.recordClassIndex(104526);
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.queue.clear();
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // f.a.e.c.i
        public final T poll() {
            return this.queue.poll();
        }

        @Override // org.a.d
        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // org.a.c
        public final void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                a();
            }
        }

        private void a() {
            boolean z;
            if (getAndIncrement() == 0) {
                h<T> hVar = this.queue;
                c<? super T> cVar = this.downstream;
                int i2 = 1;
                while (!a(this.done, hVar.isEmpty(), cVar)) {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z2 = this.done;
                        T poll = hVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (j3 != j2 || !a(this.done, hVar.isEmpty(), cVar)) {
                        if (!(j3 == 0 || j2 == Long.MAX_VALUE)) {
                            this.requested.addAndGet(-j3);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                a();
            }
        }

        @Override // org.a.c, f.a.l
        public final void onSubscribe(d dVar) {
            if (f.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            if (!this.outputFused && f.validate(j2)) {
                f.a.e.j.d.a(this.requested, j2);
                a();
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                f.a.c.c cVar = new f.a.c.c("Buffer is full");
                try {
                    this.onOverflow.a();
                } catch (Throwable th) {
                    b.a(th);
                    cVar.initCause(th);
                }
                onError(cVar);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                a();
            }
        }

        private boolean a(boolean z, boolean z2, c<? super T> cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }

        a(c<? super T> cVar, int i2, boolean z, boolean z2, f.a.d.a aVar) {
            h<T> bVar;
            this.downstream = cVar;
            this.onOverflow = aVar;
            this.delayError = z2;
            if (z) {
                bVar = new f.a.e.f.c<>(i2);
            } else {
                bVar = new f.a.e.f.b<>(i2);
            }
            this.queue = bVar;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        this.f157263b.a((l) new a(cVar, this.f157335c, this.f157336d, this.f157337e, this.f157338f));
    }

    public r(f.a.h<T> hVar, int i2, f.a.d.a aVar) {
        super(hVar);
        this.f157335c = i2;
        this.f157338f = aVar;
    }
}
