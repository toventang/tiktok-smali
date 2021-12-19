package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159133a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");

    /* renamed from: d  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f159134d = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: e  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f159135e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    static {
        Covode.recordClassIndex(105661);
    }

    public boolean cM_() {
        return g() instanceof s;
    }

    public boolean cK_() {
        if (j() == null) {
            return true;
        }
        return false;
    }

    public final Object g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l h() {
        return k.a(g());
    }

    public final l i() {
        l d2 = d();
        if (d2 == null) {
            return c((l) this._prev);
        }
        return d2;
    }

    private s c() {
        s sVar = (s) this._removedRef;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        f159133a.lazySet(this, sVar2);
        return sVar2;
    }

    public final void k() {
        Object g2 = g();
        if (g2 != null) {
            ((s) g2).f159154a.d();
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void l() {
        l lVar = this;
        while (true) {
            Object g2 = lVar.g();
            if (g2 instanceof s) {
                lVar = ((s) g2).f159154a;
            } else {
                lVar.d();
                return;
            }
        }
    }

    public final l j() {
        Object g2;
        l lVar;
        do {
            g2 = g();
            if (g2 instanceof s) {
                return ((s) g2).f159154a;
            }
            if (g2 == this) {
                return (l) g2;
            }
            if (g2 != null) {
                lVar = (l) g2;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } while (!f159134d.compareAndSet(this, g2, lVar.c()));
        lVar.d();
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (kotlinx.coroutines.internal.l.f159134d.compareAndSet(r3, r4, ((kotlinx.coroutines.internal.s) r2).f159154a) == false) goto L_0x0000;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private kotlinx.coroutines.internal.l d() {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r6 = r7._prev
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.l) r6
            r5 = 0
            r4 = r6
        L_0x0006:
            r3 = r5
        L_0x0007:
            java.lang.Object r2 = r4._next
            r0 = r7
            if (r2 != r0) goto L_0x0018
            if (r6 != r4) goto L_0x000f
            return r4
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.f159135e
            boolean r0 = r0.compareAndSet(r7, r6, r4)
            if (r0 == 0) goto L_0x0000
            return r4
        L_0x0018:
            boolean r0 = r7.cM_()
            if (r0 == 0) goto L_0x001f
            return r5
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            return r4
        L_0x0022:
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.r
            if (r0 == 0) goto L_0x002c
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.r) r2
            r2.a(r4)
            goto L_0x0000
        L_0x002c:
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.s
            if (r0 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.l.f159134d
            kotlinx.coroutines.internal.s r2 = (kotlinx.coroutines.internal.s) r2
            kotlinx.coroutines.internal.l r0 = r2.f159154a
            boolean r0 = r1.compareAndSet(r3, r4, r0)
            if (r0 == 0) goto L_0x0000
            r4 = r3
            goto L_0x0006
        L_0x0040:
            java.lang.Object r2 = r4._prev
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            r4 = r2
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.l.d():kotlinx.coroutines.internal.l");
    }

    public static abstract class a extends c<l> {

        /* renamed from: d  reason: collision with root package name */
        public l f159136d;

        /* renamed from: e  reason: collision with root package name */
        public final l f159137e;

        static {
            Covode.recordClassIndex(105662);
        }

        public a(l lVar) {
            this.f159137e = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlinx.coroutines.internal.c
        public final /* synthetic */ void a(l lVar, Object obj) {
            boolean z;
            l lVar2;
            if (obj == null) {
                z = true;
                lVar2 = this.f159137e;
            } else {
                z = false;
                lVar2 = this.f159136d;
            }
            if (lVar2 != null && l.f159134d.compareAndSet(lVar, this, lVar2) && z) {
                l lVar3 = this.f159137e;
                l lVar4 = this.f159136d;
                if (lVar4 == null) {
                    h.f.b.l.a();
                }
                lVar3.b(lVar4);
            }
        }
    }

    private static l c(l lVar) {
        while (lVar.cM_()) {
            lVar = (l) lVar._prev;
        }
        return lVar;
    }

    public final void b(l lVar) {
        Object obj;
        do {
            obj = lVar._prev;
            if (g() != lVar) {
                return;
            }
        } while (!f159135e.compareAndSet(lVar, obj, this));
        if (cM_()) {
            lVar.d();
        }
    }

    public final boolean a(l lVar) {
        f159135e.lazySet(lVar, this);
        f159134d.lazySet(lVar, this);
        while (g() == this) {
            if (f159134d.compareAndSet(this, this, lVar)) {
                lVar.b(this);
                return true;
            }
        }
        return false;
    }

    public final boolean a(l lVar, l lVar2) {
        f159135e.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159134d;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar)) {
            return false;
        }
        lVar.b(lVar2);
        return true;
    }

    public final int a(l lVar, l lVar2, a aVar) {
        f159135e.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159134d;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        aVar.f159136d = lVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }
}
