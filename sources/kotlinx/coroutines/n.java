package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.a;
import h.c.b.a.e;
import h.c.d;
import h.c.f;
import h.f.a.b;
import h.q;
import h.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.u;

public class n<T> extends bc<T> implements e, m<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f159170c = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decision");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159171d = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    public volatile Object _state = b.f159034a;

    /* renamed from: a  reason: collision with root package name */
    final d<T> f159172a;

    /* renamed from: b  reason: collision with root package name */
    private final f f159173b;

    static {
        Covode.recordClassIndex(105687);
    }

    @Override // h.c.b.a.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.bc
    public final Object d() {
        return this._state;
    }

    @Override // h.c.d
    public f getContext() {
        return this.f159173b;
    }

    @Override // kotlinx.coroutines.bc
    public final d<T> i() {
        return this.f159172a;
    }

    @Override // kotlinx.coroutines.m
    public final boolean a() {
        return this._state instanceof cl;
    }

    @Override // kotlinx.coroutines.m
    public final boolean c() {
        return this._state instanceof q;
    }

    private final boolean j() {
        d<T> dVar = this.f159172a;
        if (!(dVar instanceof az) || ((az) dVar)._reusableCancellableContinuation == null) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.m
    public final boolean b() {
        if (!(this._state instanceof cl)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (!j()) {
            g();
        }
    }

    public final void g() {
        bh bhVar = (bh) this._parentHandle;
        if (bhVar != null) {
            bhVar.cJ_();
        }
        this._parentHandle = ck.f159094a;
    }

    @Override // h.c.b.a.e
    public e getCallerFrame() {
        d<T> dVar = this.f159172a;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    private final boolean l() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f159170c.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean m() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f159170c.compareAndSet(this, 0, 2));
        return true;
    }

    public String toString() {
        return h() + '(' + as.a(this.f159172a) + "){" + this._state + "}@" + Integer.toHexString(System.identityHashCode(this));
    }

    public final Object e() {
        bz bzVar;
        k();
        if (l()) {
            return a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof CompletedExceptionally) {
            Throwable th = ((CompletedExceptionally) obj).cause;
            if (!ar.f159023c) {
                throw th;
            } else if (!(this instanceof e)) {
                throw th;
            } else {
                throw u.a(th, this);
            }
        } else if (this.f159038f != 1 || (bzVar = (bz) getContext().get(bz.f159061c)) == null || bzVar.b()) {
            return c(obj);
        } else {
            CancellationException m2 = bzVar.m();
            a(obj, m2);
            if (!ar.f159023c) {
                throw m2;
            } else if (!(this instanceof e)) {
                throw m2;
            } else {
                throw u.a(m2, this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    private final void k() {
        bz bzVar;
        boolean b2 = b();
        if (this.f159038f == 0) {
            d<T> dVar = this.f159172a;
            if (!(dVar instanceof az)) {
                dVar = null;
            }
            az azVar = (az) dVar;
            if (azVar != null) {
                while (true) {
                    Object obj = azVar._reusableCancellableContinuation;
                    if (obj == ba.f159036b) {
                        if (az.f159028c.compareAndSet(azVar, ba.f159036b, this)) {
                            break;
                        }
                    } else if (obj != null) {
                        if (!(obj instanceof Throwable)) {
                            throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                        } else if (az.f159028c.compareAndSet(azVar, obj, null)) {
                            Throwable th = (Throwable) obj;
                            if (th != null) {
                                if (!b2) {
                                    b(th);
                                    return;
                                }
                                return;
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                }
            }
        }
        if (!b2 && this._parentHandle == null && (bzVar = (bz) this.f159172a.getContext().get(bz.f159061c)) != null) {
            bzVar.n();
            bh a2 = bz.a.a(bzVar, true, false, new r(bzVar, this), 2);
            this._parentHandle = a2;
            if (b() && !j()) {
                a2.cJ_();
                this._parentHandle = ck.f159094a;
            }
        }
    }

    public Throwable a(bz bzVar) {
        return bzVar.m();
    }

    private final void a(int i2) {
        if (!m()) {
            bd.a(this, i2);
        }
    }

    private static void e(Object obj) {
        throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)).toString());
    }

    @Override // kotlinx.coroutines.m
    public final Object a(Throwable th) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof cl)) {
                return null;
            }
        } while (!f159171d.compareAndSet(this, obj, new CompletedExceptionally(th, false, 2, null)));
        f();
        return o.f159174a;
    }

    @Override // kotlinx.coroutines.m
    public final void b(Object obj) {
        if (!ar.f159021a || obj == o.f159174a) {
            a(this.f159038f);
            return;
        }
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.bc
    public final <T> T c(Object obj) {
        return obj instanceof ab ? (T) ((ab) obj).f158999b : obj instanceof ac ? (T) ((ac) obj).f159000a : obj;
    }

    @Override // kotlinx.coroutines.m
    public final boolean b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof cl)) {
                return false;
            }
            z = obj instanceof k;
        } while (!f159171d.compareAndSet(this, obj, new q(this, th, z)));
        if (z) {
            try {
                ((k) obj).a(th);
            } catch (Throwable th2) {
                aj.a(getContext(), new ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
            }
        }
        f();
        a(0);
        return true;
    }

    @Override // h.c.d
    public void resumeWith(Object obj) {
        Throwable r3 = q.m226exceptionOrNullimpl(obj);
        if (r3 != null) {
            if (ar.f159023c) {
                r3 = u.a(r3, this);
            }
            obj = new CompletedExceptionally(r3, false, 2, null);
        }
        a(obj, this.f159038f);
    }

    @Override // kotlinx.coroutines.m
    public final Object a(T t) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof cl)) {
                if (obj instanceof ab) {
                    ab abVar = (ab) obj;
                    if (abVar.f158998a == null) {
                        if (!ar.f159021a || abVar.f158999b == t) {
                            return o.f159174a;
                        }
                        throw new AssertionError();
                    }
                }
                return null;
            }
        } while (!f159171d.compareAndSet(this, obj, t));
        f();
        return o.f159174a;
    }

    @Override // kotlinx.coroutines.m
    public final void a(b<? super Throwable, z> bVar) {
        Throwable th = null;
        b<? super Throwable, z> bVar2 = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                if (bVar2 == null) {
                    if (bVar instanceof k) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = new bw(bVar);
                    }
                }
                if (f159171d.compareAndSet(this, obj, bVar2)) {
                    return;
                }
            } else if (obj instanceof k) {
                a(bVar, obj);
            } else if (obj instanceof q) {
                if (!((CompletedExceptionally) obj).makeHandled()) {
                    a(bVar, obj);
                }
                try {
                    if (!(obj instanceof CompletedExceptionally)) {
                        obj = null;
                    }
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (completedExceptionally != null) {
                        th = completedExceptionally.cause;
                    }
                    bVar.invoke(th);
                    return;
                } catch (Throwable th2) {
                    aj.a(getContext(), new ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(d<? super T> dVar, int i2) {
        super(i2);
        this.f159172a = dVar;
        this.f159173b = dVar.getContext();
    }

    private final q a(Object obj, int i2) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof cl)) {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (qVar.a()) {
                        return qVar;
                    }
                }
                e(obj);
            } else if (f159171d.compareAndSet(this, obj2, obj)) {
                f();
                a(i2);
                return null;
            }
        }
    }

    private static void a(b<? super Throwable, z> bVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + bVar + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.bc
    public final void a(Object obj, Throwable th) {
        if (obj instanceof ac) {
            try {
                ((ac) obj).f159001b.invoke(th);
            } catch (Throwable th2) {
                aj.a(getContext(), new ae("Exception in cancellation handler for ".concat(String.valueOf(this)), th2));
            }
        }
    }

    @Override // kotlinx.coroutines.m
    public final void a(ah ahVar, T t) {
        int i2;
        d<T> dVar = this.f159172a;
        ah ahVar2 = null;
        if (!(dVar instanceof az)) {
            dVar = null;
        }
        az azVar = (az) dVar;
        if (azVar != null) {
            ahVar2 = azVar.f159031d;
        }
        if (ahVar2 == ahVar) {
            i2 = 2;
        } else {
            i2 = this.f159038f;
        }
        a(t, i2);
    }
}
