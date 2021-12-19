package f.a.i;

import com.bytedance.covode.number.Covode;
import f.a.e.i.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.a.c;
import org.a.d;

public final class b<T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    static final a[] f157975b = new a[0];

    /* renamed from: c  reason: collision with root package name */
    static final a[] f157976c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<a<T>[]> f157977d = new AtomicReference<>(f157976c);

    /* renamed from: e  reason: collision with root package name */
    Throwable f157978e;

    /* access modifiers changed from: package-private */
    public static final class a<T> extends AtomicLong implements d {
        private static final long serialVersionUID = 3562861878281475070L;
        final c<? super T> downstream;
        final b<T> parent;

        static {
            Covode.recordClassIndex(104890);
        }

        @Override // org.a.d
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.a((a) this);
            }
        }

        @Override // org.a.d
        public final void request(long j2) {
            long j3;
            if (f.validate(j2)) {
                do {
                    j3 = get();
                    if (j3 == Long.MIN_VALUE || j3 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j3, f.a.e.j.d.a(j3, j2)));
            }
        }

        a(c<? super T> cVar, b<T> bVar) {
            this.downstream = cVar;
            this.parent = bVar;
        }
    }

    static {
        Covode.recordClassIndex(104889);
    }

    @Override // org.a.c
    public final void onComplete() {
        a<T>[] aVarArr = this.f157977d.get();
        a<T>[] aVarArr2 = f157975b;
        if (aVarArr != aVarArr2) {
            a<T>[] andSet = this.f157977d.getAndSet(aVarArr2);
            for (a<T> aVar : andSet) {
                if (aVar.get() != Long.MIN_VALUE) {
                    aVar.downstream.onComplete();
                }
            }
        }
    }

    @Override // org.a.c, f.a.l
    public final void onSubscribe(d dVar) {
        if (this.f157977d.get() == f157975b) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.f157977d.get();
            if (!(aVarArr == f157975b || aVarArr == f157976c)) {
                int length = aVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        if (i2 < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                aVarArr2 = f157976c;
                            } else {
                                aVarArr2 = new a[(length - 1)];
                                System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                                System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f157977d.compareAndSet(aVarArr, aVarArr2));
    }

    @Override // org.a.c
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f157977d.get();
        a<T>[] aVarArr2 = f157975b;
        if (aVarArr == aVarArr2) {
            f.a.h.a.a(th);
            return;
        }
        this.f157978e = th;
        a<T>[] andSet = this.f157977d.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.downstream.onError(th);
            } else {
                f.a.h.a.a(th);
            }
        }
    }

    @Override // org.a.c
    public final void onNext(T t) {
        f.a.e.b.b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.f157977d.get();
        for (a<T> aVar : aVarArr) {
            long j2 = aVar.get();
            if (j2 != Long.MIN_VALUE) {
                if (j2 != 0) {
                    aVar.downstream.onNext(t);
                    f.a.e.j.d.a(aVar);
                } else {
                    aVar.cancel();
                    aVar.downstream.onError(new f.a.c.c("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // f.a.h
    public final void a(c<? super T> cVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        a<T> aVar = new a<>(cVar, this);
        cVar.onSubscribe(aVar);
        do {
            aVarArr = this.f157977d.get();
            if (aVarArr == f157975b) {
                Throwable th = this.f157978e;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            } else {
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            }
        } while (!this.f157977d.compareAndSet(aVarArr, aVarArr2));
        if (aVar.get() == Long.MIN_VALUE) {
            a((a) aVar);
        }
    }
}
