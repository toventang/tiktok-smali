package f.a.e.f;

import com.bytedance.covode.number.Covode;
import f.a.e.c.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<C4172a<T>> f157822a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C4172a<T>> f157823b = new AtomicReference<>();

    static {
        Covode.recordClassIndex(104809);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.f.a$a  reason: collision with other inner class name */
    public static final class C4172a<E> extends AtomicReference<C4172a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        static {
            Covode.recordClassIndex(104810);
        }

        C4172a() {
        }

        public final E a() {
            E e2 = this.value;
            this.value = null;
            return e2;
        }

        C4172a(E e2) {
            this.value = e2;
        }
    }

    private C4172a<T> a() {
        return this.f157822a.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // f.a.e.c.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.e.f.a.clear():void");
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        if (this.f157823b.get() == a()) {
            return true;
        }
        return false;
    }

    public a() {
        C4172a<T> aVar = new C4172a<>();
        b(aVar);
        a(aVar);
    }

    @Override // f.a.e.c.h, f.a.e.c.i
    public final T poll() {
        C4172a<T> aVar;
        C4172a<T> aVar2 = this.f157823b.get();
        C4172a<T> aVar3 = (C4172a) aVar2.get();
        if (aVar3 != null) {
            T a2 = aVar3.a();
            b(aVar3);
            return a2;
        } else if (aVar2 == a()) {
            return null;
        } else {
            do {
                aVar = (C4172a) aVar2.get();
            } while (aVar == null);
            T a3 = aVar.a();
            b(aVar);
            return a3;
        }
    }

    private void b(C4172a<T> aVar) {
        this.f157823b.lazySet(aVar);
    }

    private C4172a<T> a(C4172a<T> aVar) {
        return this.f157822a.getAndSet(aVar);
    }

    @Override // f.a.e.c.i
    public final boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        C4172a<T> aVar = new C4172a<>(t);
        a(aVar).lazySet(aVar);
        return true;
    }
}
