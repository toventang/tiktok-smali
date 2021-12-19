package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.o;

public final class e<E> extends a<E> {

    /* renamed from: b  reason: collision with root package name */
    public final int f158971b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f158972c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f158973d;

    /* renamed from: e  reason: collision with root package name */
    private int f158974e;
    private volatile int size;

    static {
        Covode.recordClassIndex(105483);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean b() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final boolean f() {
        if (this.size == this.f158971b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final String j() {
        return "(buffer:capacity=" + this.f158971b + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final Object c() {
        ReentrantLock reentrantLock = this.f158972c;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object g2 = g();
                if (g2 == null) {
                    g2 = b.f158957c;
                }
                return g2;
            }
            Object[] objArr = this.f158973d;
            int i3 = this.f158974e;
            Object obj = objArr[i3];
            x xVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f158957c;
            boolean z = false;
            if (i2 == this.f158971b) {
                while (true) {
                    x i4 = i();
                    if (i4 == null) {
                        break;
                    }
                    v b2 = i4.b();
                    if (b2 != null) {
                        if (ar.f159021a) {
                            if (b2 == o.f159174a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = i4.a();
                        xVar = i4;
                        z = true;
                    } else {
                        xVar = i4;
                    }
                }
            }
            if (obj2 != b.f158957c && !(obj2 instanceof k)) {
                this.size = i2;
                Object[] objArr2 = this.f158973d;
                objArr2[(this.f158974e + i2) % objArr2.length] = obj2;
            }
            this.f158974e = (this.f158974e + 1) % this.f158973d.length;
            reentrantLock.unlock();
            if (z) {
                if (xVar == null) {
                    l.a();
                }
                xVar.c();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final Object a(x xVar) {
        ReentrantLock reentrantLock = this.f158972c;
        reentrantLock.lock();
        try {
            return super.a(xVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public e(int i2) {
        this.f158971b = i2;
        if (i2 > 0) {
            this.f158972c = new ReentrantLock();
            this.f158973d = new Object[Math.min(i2, 8)];
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    private final void a(int i2) {
        Object[] objArr = this.f158973d;
        if (i2 >= objArr.length) {
            Object[] objArr2 = new Object[Math.min(objArr.length * 2, this.f158971b)];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f158973d;
                objArr2[i3] = objArr3[(this.f158974e + i3) % objArr3.length];
            }
            this.f158973d = objArr2;
            this.f158974e = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final Object a(E e2) {
        v<E> d2;
        v b2;
        boolean z;
        ReentrantLock reentrantLock = this.f158972c;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            k<?> g2 = g();
            if (g2 != null) {
                return g2;
            }
            if (i2 < this.f158971b) {
                this.size = i2 + 1;
                if (i2 == 0) {
                    do {
                        d2 = d();
                        if (d2 != null) {
                            if (d2 instanceof k) {
                                this.size = i2;
                                reentrantLock.unlock();
                                return d2;
                            }
                            b2 = d2.b(e2);
                        }
                    } while (b2 == null);
                    if (ar.f159021a) {
                        if (b2 == o.f159174a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new AssertionError();
                        }
                    }
                    this.size = i2;
                    reentrantLock.unlock();
                    d2.cN_();
                    return d2.f();
                }
                a(i2);
                Object[] objArr = this.f158973d;
                objArr[(this.f158974e + i2) % objArr.length] = e2;
                Object obj = b.f158955a;
                reentrantLock.unlock();
                return obj;
            }
            Object obj2 = b.f158956b;
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final void a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f158972c;
            reentrantLock.lock();
            try {
                int i2 = this.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f158973d[this.f158974e] = 0;
                    this.f158974e = (this.f158974e + 1) % this.f158973d.length;
                }
                this.size = 0;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.a(z);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean a(t<? super E> tVar) {
        ReentrantLock reentrantLock = this.f158972c;
        reentrantLock.lock();
        try {
            return super.a((t) tVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
