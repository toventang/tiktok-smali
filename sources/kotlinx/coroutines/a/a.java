package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.q;
import h.r;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a.aa;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;

public abstract class a<E> extends c<E> implements h<E> {
    static {
        Covode.recordClassIndex(105470);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* renamed from: kotlinx.coroutines.a.a$a  reason: collision with other inner class name */
    static final class C4190a<E> extends t<E> {

        /* renamed from: a  reason: collision with root package name */
        public final m<Object> f158946a;

        /* renamed from: b  reason: collision with root package name */
        public final int f158947b = 2;

        static {
            Covode.recordClassIndex(105471);
        }

        @Override // kotlinx.coroutines.a.v
        public final void cN_() {
            this.f158946a.b(o.f159174a);
        }

        @Override // kotlinx.coroutines.internal.l
        public final String toString() {
            return "ReceiveElement@" + Integer.toHexString(System.identityHashCode(this)) + "[receiveMode=" + this.f158947b + ']';
        }

        public C4190a(m<Object> mVar) {
            this.f158946a = mVar;
        }

        public final Object a(E e2) {
            if (this.f158947b != 2) {
                return e2;
            }
            return aa.a(e2);
        }

        @Override // kotlinx.coroutines.a.v
        public final v b(E e2) {
            Object a2 = this.f158946a.a(a((Object) e2));
            if (a2 == null) {
                return null;
            }
            if (!ar.f159021a || a2 == o.f159174a) {
                return o.f159174a;
            }
            throw new AssertionError();
        }

        @Override // kotlinx.coroutines.a.t
        public final void a(k<?> kVar) {
            if (this.f158947b == 1 && kVar.f158979a == null) {
                this.f158946a.resumeWith(q.m223constructorimpl(null));
            } else if (this.f158947b == 2) {
                this.f158946a.resumeWith(q.m223constructorimpl(aa.a(new aa.a(kVar.f158979a))));
            } else {
                this.f158946a.resumeWith(q.m223constructorimpl(r.a(kVar.e())));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final v<E> d() {
        return super.d();
    }

    public static final class c extends l.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f158950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f158951b;

        static {
            Covode.recordClassIndex(105473);
        }

        @Override // kotlinx.coroutines.internal.c
        public final /* synthetic */ Object a() {
            if (this.f158951b.b()) {
                return null;
            }
            return k.f159131a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l lVar, l lVar2, a aVar) {
            super(lVar2);
            this.f158950a = lVar;
            this.f158951b = aVar;
        }
    }

    final class b extends kotlinx.coroutines.k {

        /* renamed from: b  reason: collision with root package name */
        private final t<?> f158949b;

        static {
            Covode.recordClassIndex(105472);
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f158949b + ']';
        }

        @Override // kotlinx.coroutines.l
        public final void a(Throwable th) {
            this.f158949b.cK_();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            a(th);
            return z.f158842a;
        }

        public b(t<?> tVar) {
            this.f158949b = tVar;
        }
    }

    /* access modifiers changed from: protected */
    public Object c() {
        x i2;
        v b2;
        do {
            i2 = i();
            if (i2 == null) {
                return b.f158957c;
            }
            b2 = i2.b();
        } while (b2 == null);
        if (!ar.f159021a || b2 == o.f159174a) {
            i2.c();
            return i2.a();
        }
        throw new AssertionError();
    }

    public final boolean a(Throwable th) {
        boolean b_ = b_(th);
        a(b_);
        return b_;
    }

    @Override // kotlinx.coroutines.a.u
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
        }
        a((Throwable) cancellationException);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.a.a$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.a.u
    public final Object a(d<? super aa<? extends E>> dVar) {
        Object c2 = c();
        if (c2 != b.f158957c) {
            if (c2 instanceof k) {
                c2 = new aa.a(((k) c2).f158979a);
            }
            return aa.a(c2);
        }
        n a2 = p.a(h.c.a.b.a(dVar));
        if (a2 != null) {
            C4190a aVar = new C4190a(a2);
            while (true) {
                if (!a((t) aVar)) {
                    Object c3 = c();
                    if (!(c3 instanceof k)) {
                        if (c3 != b.f158957c) {
                            a2.resumeWith(q.m223constructorimpl(aVar.a(c3)));
                            break;
                        }
                    } else {
                        aVar.a((k<?>) ((k) c3));
                        break;
                    }
                } else {
                    a2.a((h.f.a.b<? super Throwable, z>) new b(aVar));
                    break;
                }
            }
            Object e2 = a2.e();
            if (e2 == h.c.a.a.COROUTINE_SUSPENDED) {
                h.f.b.l.d(dVar, "");
            }
            return e2;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        k<?> g2 = g();
        if (g2 != null) {
            Object obj = null;
            while (true) {
                l i2 = g2.i();
                if (!(i2 instanceof j)) {
                    if (ar.f159021a && !(i2 instanceof x)) {
                        throw new AssertionError();
                    } else if (!i2.cK_()) {
                        i2.k();
                    } else {
                        obj = i.a(obj, i2);
                    }
                } else if (obj != null) {
                    if (!(obj instanceof ArrayList)) {
                        ((x) obj).a(g2);
                        return;
                    }
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((x) arrayList.get(size)).a(g2);
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(t<? super E> tVar) {
        int a2;
        l i2;
        if (a()) {
            l lVar = this.f158961a;
            do {
                i2 = lVar.i();
                if (!(!(i2 instanceof x))) {
                    return false;
                }
            } while (!i2.a(tVar, lVar));
            return true;
        }
        l lVar2 = this.f158961a;
        c cVar = new c(tVar, tVar, this);
        do {
            l i3 = lVar2.i();
            if (!(!(i3 instanceof x))) {
                return false;
            }
            a2 = i3.a(tVar, lVar2, cVar);
            if (a2 == 1) {
                return true;
            }
        } while (a2 != 2);
        return false;
    }
}
