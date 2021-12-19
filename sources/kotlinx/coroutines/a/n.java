package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.ad;
import h.f.b.l;
import h.w;
import h.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;

public final class n<E> implements f<E> {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f158980a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f158981b = AtomicIntegerFieldUpdater.newUpdater(n.class, "_updating");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f158982c = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "onCloseHandler");

    /* renamed from: d  reason: collision with root package name */
    private static final a f158983d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final v f158984e;

    /* renamed from: f  reason: collision with root package name */
    private static final c<Object> f158985f;

    /* renamed from: g  reason: collision with root package name */
    private static final b f158986g = new b((byte) 0);
    volatile Object _state = f158985f;
    private volatile int _updating;
    private volatile Object onCloseHandler;

    static final class b {
        static {
            Covode.recordClassIndex(105495);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(105493);
        v vVar = new v("UNDEFINED");
        f158984e = vVar;
        f158985f = new c<>(vVar, null);
    }

    @Override // kotlinx.coroutines.a.f
    public final void a(CancellationException cancellationException) {
        b_(cancellationException);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f158987a;

        static {
            Covode.recordClassIndex(105494);
        }

        public a(Throwable th) {
            this.f158987a = th;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<E> extends o<E> {

        /* renamed from: b  reason: collision with root package name */
        private final n<E> f158990b;

        static {
            Covode.recordClassIndex(105497);
        }

        @Override // kotlinx.coroutines.a.c, kotlinx.coroutines.a.o
        public final Object a(E e2) {
            return super.a((Object) e2);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.a, kotlinx.coroutines.a.o
        public final void a(boolean z) {
            Object obj;
            Object obj2;
            d[] dVarArr;
            if (z) {
                n<E> nVar = this.f158990b;
                do {
                    obj = nVar._state;
                    if (obj instanceof a) {
                        return;
                    }
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        obj2 = cVar.f158988a;
                        if (obj != null) {
                            d<E>[] dVarArr2 = cVar.f158989b;
                            if (dVarArr2 == null) {
                                l.a();
                            }
                            int length = dVarArr2.length;
                            int b2 = i.b(dVarArr2, this);
                            if (!ar.f159021a || b2 >= 0) {
                                if (length == 1) {
                                    dVarArr = null;
                                } else {
                                    dVarArr = new d[(length - 1)];
                                    i.a(dVarArr2, dVarArr, 0, 0, b2, 6);
                                    i.a(dVarArr2, dVarArr, b2, b2 + 1, 0, 8);
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
                    }
                } while (!n.f158980a.compareAndSet(nVar, obj, new c(obj2, dVarArr)));
            }
        }
    }

    private final a a(E e2) {
        Object obj;
        if (!f158981b.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (!(obj instanceof c)) {
                    throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
                } else if (obj == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } finally {
                this._updating = 0;
            }
        } while (!f158980a.compareAndSet(this, obj, new c(e2, ((c) obj).f158989b)));
        d<E>[] dVarArr = ((c) obj).f158989b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.a((Object) e2);
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.a.y
    public final boolean b_(Throwable th) {
        Object obj;
        int i2;
        a aVar;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException("Invalid state ".concat(String.valueOf(obj)).toString());
            } else if (th == null) {
                aVar = f158983d;
            } else {
                aVar = new a(th);
            }
        } while (!f158980a.compareAndSet(this, obj, aVar));
        if (obj != null) {
            d<E>[] dVarArr = ((c) obj).f158989b;
            if (dVarArr != null) {
                for (d<E> dVar : dVarArr) {
                    dVar.b_(th);
                }
            }
            Object obj2 = this.onCloseHandler;
            if (!(obj2 == null || obj2 == b.f158959e || !f158982c.compareAndSet(this, obj2, b.f158959e))) {
                ((h.f.a.b) ad.b(obj2, 1)).invoke(th);
            }
            return true;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: package-private */
    public static final class c<E> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f158988a;

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f158989b;

        static {
            Covode.recordClassIndex(105496);
        }

        public c(Object obj, d<E>[] dVarArr) {
            this.f158988a = obj;
            this.f158989b = dVarArr;
        }
    }

    @Override // kotlinx.coroutines.a.y
    public final Object a(E e2, h.c.d<? super z> dVar) {
        a a2 = a((Object) e2);
        if (a2 != null) {
            Throwable th = a2.f158987a;
            if (th == null) {
                throw new m("Channel was closed");
            }
            throw th;
        } else if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
            return a2;
        } else {
            return z.f158842a;
        }
    }
}
