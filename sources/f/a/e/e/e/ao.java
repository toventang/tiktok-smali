package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.c.d;
import f.a.e.c.i;
import f.a.e.d.b;
import f.a.e.f.c;
import f.a.e.g.p;
import f.a.x;
import f.a.z;

public final class ao<T> extends a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final aa f157458b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f157459c = false;

    /* renamed from: d  reason: collision with root package name */
    final int f157460d;

    static {
        Covode.recordClassIndex(104623);
    }

    static final class a<T> extends b<T> implements z<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final z<? super T> downstream;
        Throwable error;
        boolean outputFused;
        i<T> queue;
        int sourceMode;
        f.a.b.b upstream;
        final aa.c worker;

        static {
            Covode.recordClassIndex(104624);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.disposed;
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

        private void a() {
            if (getAndIncrement() == 0) {
                this.worker.a(this);
            }
        }

        @Override // f.a.z
        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                a();
            }
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void run() {
            boolean z;
            if (this.outputFused) {
                int i2 = 1;
                while (!this.disposed) {
                    boolean z2 = this.done;
                    Throwable th = this.error;
                    if (this.delayError || !z2 || th == null) {
                        this.downstream.onNext(null);
                        if (z2) {
                            this.disposed = true;
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                this.downstream.onError(th2);
                            } else {
                                this.downstream.onComplete();
                            }
                            this.worker.dispose();
                            return;
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        this.disposed = true;
                        this.downstream.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                return;
            }
            i<T> iVar = this.queue;
            z<? super T> zVar = this.downstream;
            int i3 = 1;
            while (!a(this.done, iVar.isEmpty(), zVar)) {
                while (true) {
                    boolean z3 = this.done;
                    try {
                        T poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a(z3, z, zVar)) {
                            return;
                        }
                        if (!z) {
                            zVar.onNext(poll);
                        } else {
                            i3 = addAndGet(-i3);
                            if (i3 == 0) {
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        f.a.c.b.a(th3);
                        this.disposed = true;
                        this.upstream.dispose();
                        iVar.clear();
                        zVar.onError(th3);
                        this.worker.dispose();
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

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (this.done) {
                f.a.h.a.a(th);
                return;
            }
            this.error = th;
            this.done = true;
            a();
        }

        @Override // f.a.z
        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                a();
            }
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    int requestFusion = dVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = dVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        a();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = dVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new c(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        private boolean a(boolean z, boolean z2, z<? super T> zVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        zVar.onError(th);
                    } else {
                        zVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    zVar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    zVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        a(z<? super T> zVar, aa.c cVar, boolean z, int i2) {
            this.downstream = zVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i2;
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        aa aaVar = this.f157458b;
        if (aaVar instanceof p) {
            this.f157412a.b(zVar);
            return;
        }
        this.f157412a.b(new a(zVar, aaVar.a(), this.f157459c, this.f157460d));
    }

    public ao(x<T> xVar, aa aaVar, int i2) {
        super(xVar);
        this.f157458b = aaVar;
        this.f157460d = i2;
    }
}
