package f.a.e.d;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.c.h;
import f.a.e.j.k;
import f.a.e.j.n;
import f.a.z;

public abstract class p<T, U, V> extends r implements k<U, V>, z<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final z<? super V> f157226a;

    /* renamed from: b  reason: collision with root package name */
    public final h<U> f157227b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f157228c;

    /* renamed from: d  reason: collision with root package name */
    protected volatile boolean f157229d;

    /* renamed from: e  reason: collision with root package name */
    protected Throwable f157230e;

    static {
        Covode.recordClassIndex(104452);
    }

    @Override // f.a.e.j.k
    public void a(z<? super V> zVar, U u) {
    }

    @Override // f.a.e.j.k
    public final boolean b() {
        return this.f157229d;
    }

    @Override // f.a.e.j.k
    public final Throwable d() {
        return this.f157230e;
    }

    @Override // f.a.e.j.k
    public final boolean a() {
        return this.f157228c;
    }

    public final boolean c() {
        if (this.f157231f.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    @Override // f.a.e.j.k
    public final int a(int i2) {
        return this.f157231f.addAndGet(i2);
    }

    public p(z<? super V> zVar, h<U> hVar) {
        this.f157226a = zVar;
        this.f157227b = hVar;
    }

    /* access modifiers changed from: protected */
    public final void a(U u, b bVar) {
        z<? super V> zVar = this.f157226a;
        h<U> hVar = this.f157227b;
        if (this.f157231f.get() != 0 || !this.f157231f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!c()) {
                return;
            }
        } else {
            a((z) zVar, (Object) u);
            if (a(-1) == 0) {
                return;
            }
        }
        n.a(hVar, zVar, bVar, this);
    }

    public final void b(U u, b bVar) {
        z<? super V> zVar = this.f157226a;
        h<U> hVar = this.f157227b;
        if (this.f157231f.get() != 0 || !this.f157231f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!c()) {
                return;
            }
        } else if (hVar.isEmpty()) {
            a((z) zVar, (Object) u);
            if (a(-1) == 0) {
                return;
            }
        } else {
            hVar.offer(u);
        }
        n.a(hVar, zVar, bVar, this);
    }
}
