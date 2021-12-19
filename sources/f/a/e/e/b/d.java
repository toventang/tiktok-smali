package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.h;
import f.a.l;
import org.a.c;

public final class d<T> extends a<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final f<? super T> f157287c;

    /* renamed from: d  reason: collision with root package name */
    final f<? super Throwable> f157288d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.d.a f157289e;

    /* renamed from: f  reason: collision with root package name */
    final f.a.d.a f157290f;

    static {
        Covode.recordClassIndex(104496);
    }

    static final class a<T> extends f.a.e.h.a<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final f<? super T> f157291a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super Throwable> f157292b;

        /* renamed from: c  reason: collision with root package name */
        final f.a.d.a f157293c;

        /* renamed from: d  reason: collision with root package name */
        final f.a.d.a f157294d;

        static {
            Covode.recordClassIndex(104497);
        }

        @Override // org.a.c, f.a.e.h.a
        public final void onComplete() {
            if (!this.f157929h) {
                try {
                    this.f157293c.a();
                    this.f157929h = true;
                    this.f157926e.onComplete();
                    try {
                        this.f157294d.a();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        f.a.h.a.a(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // f.a.e.c.i
        public final T poll() {
            try {
                T t = (T) this.f157928g.poll();
                if (t != null) {
                    try {
                        this.f157291a.accept(t);
                        this.f157294d.a();
                    } catch (Throwable th) {
                        throw new f.a.c.a(th, th);
                    }
                } else if (this.f157930i == 1) {
                    this.f157293c.a();
                    this.f157294d.a();
                }
                return t;
            } catch (Throwable th2) {
                throw new f.a.c.a(th, th2);
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // f.a.e.c.a
        public final boolean a(T t) {
            if (this.f157929h) {
                return false;
            }
            try {
                this.f157291a.accept(t);
                return this.f157926e.a(t);
            } catch (Throwable th) {
                a(th);
                return false;
            }
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157929h) {
                if (this.f157930i != 0) {
                    this.f157926e.onNext(null);
                    return;
                }
                try {
                    this.f157291a.accept(t);
                    this.f157926e.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // org.a.c, f.a.e.h.a
        public final void onError(Throwable th) {
            if (this.f157929h) {
                f.a.h.a.a(th);
                return;
            }
            this.f157929h = true;
            try {
                this.f157292b.accept(th);
                this.f157926e.onError(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157926e.onError(new f.a.c.a(th, th2));
            }
            try {
                this.f157294d.a();
            } catch (Throwable th3) {
                f.a.c.b.a(th3);
                f.a.h.a.a(th3);
            }
        }

        a(f.a.e.c.a<? super T> aVar, f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar2, f.a.d.a aVar3) {
            super(aVar);
            this.f157291a = fVar;
            this.f157292b = fVar2;
            this.f157293c = aVar2;
            this.f157294d = aVar3;
        }
    }

    static final class b<T> extends f.a.e.h.b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final f<? super T> f157295a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super Throwable> f157296b;

        /* renamed from: c  reason: collision with root package name */
        final f.a.d.a f157297c;

        /* renamed from: d  reason: collision with root package name */
        final f.a.d.a f157298d;

        static {
            Covode.recordClassIndex(104498);
        }

        @Override // org.a.c, f.a.e.h.b
        public final void onComplete() {
            if (!this.f157934h) {
                try {
                    this.f157297c.a();
                    this.f157934h = true;
                    this.f157931e.onComplete();
                    try {
                        this.f157298d.a();
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        f.a.h.a.a(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // f.a.e.c.i
        public final T poll() {
            try {
                T t = (T) this.f157933g.poll();
                if (t != null) {
                    try {
                        this.f157295a.accept(t);
                        this.f157298d.a();
                    } catch (Throwable th) {
                        throw new f.a.c.a(th, th);
                    }
                } else if (this.f157935i == 1) {
                    this.f157297c.a();
                    this.f157298d.a();
                }
                return t;
            } catch (Throwable th2) {
                throw new f.a.c.a(th, th2);
            }
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            return a(i2);
        }

        @Override // org.a.c
        public final void onNext(T t) {
            if (!this.f157934h) {
                if (this.f157935i != 0) {
                    this.f157931e.onNext(null);
                    return;
                }
                try {
                    this.f157295a.accept(t);
                    this.f157931e.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // org.a.c, f.a.e.h.b
        public final void onError(Throwable th) {
            if (this.f157934h) {
                f.a.h.a.a(th);
                return;
            }
            this.f157934h = true;
            try {
                this.f157296b.accept(th);
                this.f157931e.onError(th);
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                this.f157931e.onError(new f.a.c.a(th, th2));
            }
            try {
                this.f157298d.a();
            } catch (Throwable th3) {
                f.a.c.b.a(th3);
                f.a.h.a.a(th3);
            }
        }

        b(c<? super T> cVar, f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2) {
            super(cVar);
            this.f157295a = fVar;
            this.f157296b = fVar2;
            this.f157297c = aVar;
            this.f157298d = aVar2;
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        if (cVar instanceof f.a.e.c.a) {
            this.f157263b.a((l) new a((f.a.e.c.a) cVar, this.f157287c, this.f157288d, this.f157289e, this.f157290f));
        } else {
            this.f157263b.a((l) new b(cVar, this.f157287c, this.f157288d, this.f157289e, this.f157290f));
        }
    }

    public d(h<T> hVar, f<? super T> fVar, f<? super Throwable> fVar2, f.a.d.a aVar, f.a.d.a aVar2) {
        super(hVar);
        this.f157287c = fVar;
        this.f157288d = fVar2;
        this.f157289e = aVar;
        this.f157290f = aVar2;
    }
}
