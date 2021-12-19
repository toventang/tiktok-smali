package f.a.l;

import com.bytedance.covode.number.Covode;
import f.a.e.j.j;
import f.a.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class d<T> extends g<T> {

    /* renamed from: c  reason: collision with root package name */
    static final b[] f158040c = new b[0];

    /* renamed from: d  reason: collision with root package name */
    static final b[] f158041d = new b[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f158042f = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    final a<T> f158043a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<b<T>[]> f158044b = new AtomicReference<>(f158040c);

    /* renamed from: e  reason: collision with root package name */
    boolean f158045e;

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(104924);
        }

        void a(b<T> bVar);

        void a(T t);

        void b(Object obj);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> extends AtomicInteger implements f.a.b.b {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final z<? super T> downstream;
        Object index;
        final d<T> state;

        static {
            Covode.recordClassIndex(104925);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.a((b) this);
            }
        }

        b(z<? super T> zVar, d<T> dVar) {
            this.downstream = zVar;
            this.state = dVar;
        }
    }

    public static <T> d<T> i() {
        return new d<>(new c());
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer = new ArrayList(f.a.e.b.b.a(16, "capacityHint"));
        volatile boolean done;
        volatile int size;

        static {
            Covode.recordClassIndex(104926);
        }

        c() {
        }

        @Override // f.a.l.d.a
        public final void a(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // f.a.l.d.a
        public final void b(Object obj) {
            this.buffer.add(obj);
            this.size++;
            this.done = true;
        }

        @Override // f.a.l.d.a
        public final void a(b<T> bVar) {
            int i2;
            if (bVar.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                z<? super T> zVar = bVar.downstream;
                Integer num = (Integer) bVar.index;
                int i3 = 0;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    bVar.index = 0;
                }
                int i4 = 1;
                while (!bVar.cancelled) {
                    int i5 = this.size;
                    while (i5 != i3) {
                        if (bVar.cancelled) {
                            bVar.index = null;
                            return;
                        }
                        Object obj = list.get(i3);
                        if (this.done && (i2 = i3 + 1) == i5 && i2 == (i5 = this.size)) {
                            if (j.isComplete(obj)) {
                                zVar.onComplete();
                            } else {
                                zVar.onError(j.getError(obj));
                            }
                            bVar.index = null;
                            bVar.cancelled = true;
                            return;
                        }
                        zVar.onNext(obj);
                        i3++;
                    }
                    if (i3 == this.size) {
                        bVar.index = Integer.valueOf(i3);
                        i4 = bVar.addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    }
                }
                bVar.index = null;
            }
        }
    }

    static {
        Covode.recordClassIndex(104923);
    }

    @Override // f.a.z
    public final void onComplete() {
        if (!this.f158045e) {
            this.f158045e = true;
            Object complete = j.complete();
            a<T> aVar = this.f158043a;
            aVar.b(complete);
            for (b<T> bVar : a(complete)) {
                aVar.a((b) bVar);
            }
        }
    }

    @Override // f.a.z
    public final void onSubscribe(f.a.b.b bVar) {
        if (this.f158045e) {
            bVar.dispose();
        }
    }

    private d(a<T> aVar) {
        this.f158043a = aVar;
    }

    private b<T>[] a(Object obj) {
        if (this.f158043a.compareAndSet(null, obj)) {
            return this.f158044b.getAndSet(f158041d);
        }
        return f158041d;
    }

    /* access modifiers changed from: package-private */
    public final void a(b<T> bVar) {
        b<T>[] bVarArr;
        b<T>[] bVarArr2;
        do {
            bVarArr = this.f158044b.get();
            if (!(bVarArr == f158041d || bVarArr == f158040c)) {
                int length = bVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (bVarArr[i2] == bVar) {
                        if (i2 < 0) {
                            return;
                        } else {
                            if (length == 1) {
                                bVarArr2 = f158040c;
                            } else {
                                bVarArr2 = new b[(length - 1)];
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, i2);
                                System.arraycopy(bVarArr, i2 + 1, bVarArr2, i2, (length - i2) - 1);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } while (!this.f158044b.compareAndSet(bVarArr, bVarArr2));
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        f.a.e.b.b.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f158045e) {
            f.a.h.a.a(th);
            return;
        }
        this.f158045e = true;
        Object error = j.error(th);
        a<T> aVar = this.f158043a;
        aVar.b(error);
        for (b<T> bVar : a(error)) {
            aVar.a((b) bVar);
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        f.a.e.b.b.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f158045e) {
            a<T> aVar = this.f158043a;
            aVar.a((Object) t);
            for (b<T> bVar : this.f158044b.get()) {
                aVar.a((b) bVar);
            }
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        b<T> bVar = new b<>(zVar, this);
        zVar.onSubscribe(bVar);
        if (!bVar.cancelled) {
            while (true) {
                b<T>[] bVarArr = this.f158044b.get();
                if (bVarArr == f158041d) {
                    break;
                }
                int length = bVarArr.length;
                b<T>[] bVarArr2 = new b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
                if (this.f158044b.compareAndSet(bVarArr, bVarArr2)) {
                    if (bVar.cancelled) {
                        a((b) bVar);
                        return;
                    }
                }
            }
            this.f158043a.a((b) bVar);
        }
    }
}
