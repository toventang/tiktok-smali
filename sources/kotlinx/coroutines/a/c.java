package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.b.ad;
import h.q;
import h.r;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.cn;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;

public abstract class c<E> implements y<E> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f158960b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: a  reason: collision with root package name */
    public final j f158961a = new j();
    private volatile Object onCloseHandler = null;

    static {
        Covode.recordClassIndex(105478);
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    /* access modifiers changed from: protected */
    public abstract boolean f();

    /* access modifiers changed from: protected */
    public String j() {
        return "";
    }

    public static final class a<E> extends x {

        /* renamed from: a  reason: collision with root package name */
        public final E f158962a;

        static {
            Covode.recordClassIndex(105479);
        }

        @Override // kotlinx.coroutines.a.x
        public final void a(k<?> kVar) {
        }

        @Override // kotlinx.coroutines.a.x
        public final void c() {
        }

        @Override // kotlinx.coroutines.a.x
        public final Object a() {
            return this.f158962a;
        }

        @Override // kotlinx.coroutines.a.x
        public final v b() {
            return o.f159174a;
        }

        @Override // kotlinx.coroutines.internal.l
        public final String toString() {
            return "SendBuffered@" + Integer.toHexString(System.identityHashCode(this)) + '(' + ((Object) this.f158962a) + ')';
        }

        public a(E e2) {
            this.f158962a = e2;
        }
    }

    public static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f158963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f158964b;

        static {
            Covode.recordClassIndex(105480);
        }

        @Override // kotlinx.coroutines.internal.c
        public final /* synthetic */ Object a() {
            if (this.f158964b.f()) {
                return null;
            }
            return k.f159131a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l lVar, l lVar2, c cVar) {
            super(lVar2);
            this.f158963a = lVar;
            this.f158964b = cVar;
        }
    }

    /* access modifiers changed from: protected */
    public final k<?> g() {
        l i2 = this.f158961a.i();
        if (!(i2 instanceof k)) {
            i2 = null;
        }
        k<?> kVar = (k) i2;
        if (kVar == null) {
            return null;
        }
        a(kVar);
        return kVar;
    }

    /* access modifiers changed from: protected */
    public final k<?> h() {
        l a2 = k.a(this.f158961a.g());
        if (!(a2 instanceof k)) {
            a2 = null;
        }
        k<?> kVar = (k) a2;
        if (kVar == null) {
            return null;
        }
        a(kVar);
        return kVar;
    }

    private final int a() {
        j jVar = this.f158961a;
        Object g2 = jVar.g();
        if (g2 != null) {
            int i2 = 0;
            for (l lVar = (l) g2; !h.f.b.l.a(lVar, jVar); lVar = k.a(lVar.g())) {
                if (lVar instanceof l) {
                    i2++;
                }
            }
            return i2;
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.coroutines.a.v<E> d() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.j r3 = r4.f158961a
        L_0x0002:
            java.lang.Object r2 = r3.g()
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.l) r2
            r1 = 0
            if (r2 != r3) goto L_0x0011
        L_0x000d:
            r2 = r1
        L_0x000e:
            kotlinx.coroutines.a.v r2 = (kotlinx.coroutines.a.v) r2
            return r2
        L_0x0011:
            boolean r0 = r2 instanceof kotlinx.coroutines.a.v
            if (r0 != 0) goto L_0x0016
            goto L_0x000d
        L_0x0016:
            boolean r0 = r2 instanceof kotlinx.coroutines.a.k
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.cM_()
            if (r0 != 0) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            kotlinx.coroutines.internal.l r0 = r2.j()
            if (r0 != 0) goto L_0x0028
            goto L_0x000e
        L_0x0028:
            r0.l()
            goto L_0x0002
        L_0x002c:
            h.w r1 = new h.w
            java.lang.String r0 = "null cannot be cast to non-null type"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.c.d():kotlinx.coroutines.a.v");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.a.x i() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.j r3 = r4.f158961a
        L_0x0002:
            java.lang.Object r2 = r3.g()
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.l) r2
            r1 = 0
            if (r2 != r3) goto L_0x0011
        L_0x000d:
            r2 = r1
        L_0x000e:
            kotlinx.coroutines.a.x r2 = (kotlinx.coroutines.a.x) r2
            return r2
        L_0x0011:
            boolean r0 = r2 instanceof kotlinx.coroutines.a.x
            if (r0 != 0) goto L_0x0016
            goto L_0x000d
        L_0x0016:
            boolean r0 = r2 instanceof kotlinx.coroutines.a.k
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.cM_()
            if (r0 != 0) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            kotlinx.coroutines.internal.l r0 = r2.j()
            if (r0 != 0) goto L_0x0028
            goto L_0x000e
        L_0x0028:
            r0.l()
            goto L_0x0002
        L_0x002c:
            h.w r1 = new h.w
            java.lang.String r0 = "null cannot be cast to non-null type"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.c.i():kotlinx.coroutines.a.x");
    }

    public String toString() {
        String concat;
        StringBuilder append = new StringBuilder().append(getClass().getSimpleName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('{');
        l h2 = this.f158961a.h();
        if (h2 == this.f158961a) {
            concat = "EmptyQueue";
        } else {
            if (h2 instanceof k) {
                concat = h2.toString();
            } else if (h2 instanceof t) {
                concat = "ReceiveQueued";
            } else if (h2 instanceof x) {
                concat = "SendQueued";
            } else {
                concat = "UNEXPECTED:".concat(String.valueOf(h2));
            }
            l i2 = this.f158961a.i();
            if (i2 != h2) {
                concat = concat + ",queueSize=" + a();
                if (i2 instanceof k) {
                    concat = concat + ",closedForSend=" + i2;
                }
            }
        }
        return append.append(concat).append('}').append(j()).toString();
    }

    /* access modifiers changed from: protected */
    public final v<?> b(E e2) {
        l i2;
        l lVar = this.f158961a;
        a aVar = new a(e2);
        do {
            i2 = lVar.i();
            if (i2 instanceof v) {
                return (v) i2;
            }
        } while (!i2.a(aVar, lVar));
        return null;
    }

    private static void a(k<?> kVar) {
        Object obj = null;
        while (true) {
            l i2 = kVar.i();
            if ((i2 instanceof t) && i2 != null) {
                if (!i2.cK_()) {
                    i2.k();
                } else {
                    obj = i.a(obj, i2);
                }
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((t) obj).a(kVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((t) arrayList.get(size)).a(kVar);
        }
    }

    @Override // kotlinx.coroutines.a.y
    public boolean b_(Throwable th) {
        boolean z;
        Object obj;
        k kVar = new k(th);
        l lVar = this.f158961a;
        while (true) {
            l i2 = lVar.i();
            if (!(i2 instanceof k)) {
                if (i2.a(kVar, lVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                l i3 = this.f158961a.i();
                if (i3 != null) {
                    kVar = (k) i3;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
        a((k<?>) kVar);
        if (z && (obj = this.onCloseHandler) != null && obj != b.f158959e && f158960b.compareAndSet(this, obj, b.f158959e)) {
            ((h.f.a.b) ad.b(obj, 1)).invoke(th);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Object a(E e2) {
        v<E> d2;
        v b2;
        do {
            d2 = d();
            if (d2 == null) {
                return b.f158956b;
            }
            b2 = d2.b(e2);
        } while (b2 == null);
        if (!ar.f159021a || b2 == o.f159174a) {
            d2.cN_();
            return d2.f();
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    public Object a(x xVar) {
        int a2;
        l i2;
        if (e()) {
            l lVar = this.f158961a;
            do {
                i2 = lVar.i();
                if (i2 instanceof v) {
                    return i2;
                }
            } while (!i2.a(xVar, lVar));
            return null;
        }
        l lVar2 = this.f158961a;
        b bVar = new b(xVar, xVar, this);
        do {
            l i3 = lVar2.i();
            if (i3 instanceof v) {
                return i3;
            }
            a2 = i3.a(xVar, lVar2, bVar);
            if (a2 == 1) {
                return null;
            }
        } while (a2 != 2);
        return b.f158958d;
    }

    private static void a(d<?> dVar, k<?> kVar) {
        a(kVar);
        dVar.resumeWith(q.m223constructorimpl(r.a(kVar.d())));
    }

    @Override // kotlinx.coroutines.a.y
    public final Object a(E e2, d<? super z> dVar) {
        if (a((Object) e2) == b.f158955a) {
            return z.f158842a;
        }
        n a2 = p.a(h.c.a.b.a(dVar));
        while (true) {
            if (!(k.a(this.f158961a.g()) instanceof v) && f()) {
                z zVar = new z(e2, a2);
                Object a3 = a((x) zVar);
                if (a3 == null) {
                    a2.a((h.f.a.b<? super Throwable, z>) new cn(zVar));
                    break;
                } else if (a3 instanceof k) {
                    a(a2, (k) a3);
                    break;
                } else if (a3 != b.f158958d && !(a3 instanceof t)) {
                    throw new IllegalStateException("enqueueSend returned ".concat(String.valueOf(a3)).toString());
                }
            }
            Object a4 = a((Object) e2);
            if (a4 == b.f158955a) {
                a2.resumeWith(q.m223constructorimpl(z.f158842a));
                break;
            } else if (a4 != b.f158956b) {
                if (a4 instanceof k) {
                    a(a2, (k) a4);
                } else {
                    throw new IllegalStateException("offerInternal returned ".concat(String.valueOf(a4)).toString());
                }
            }
        }
        Object e3 = a2.e();
        if (e3 == h.c.a.a.COROUTINE_SUSPENDED) {
            h.f.b.l.d(dVar, "");
        }
        if (e3 == h.c.a.a.COROUTINE_SUSPENDED) {
            return e3;
        }
        return z.f158842a;
    }
}
