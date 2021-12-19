package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.j.h;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.o;

public final class d<E> extends c<E> implements f<E> {
    public volatile long _head;
    public volatile int _size;
    public volatile long _tail;

    /* renamed from: b  reason: collision with root package name */
    public final int f158965b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f158966c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f158967d;

    /* renamed from: e  reason: collision with root package name */
    private final List<a<E>> f158968e;

    static {
        Covode.recordClassIndex(105481);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final boolean e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class a<E> extends a<E> {
        public volatile long _subHead;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f158969b;

        /* renamed from: c  reason: collision with root package name */
        private final d<E> f158970c;

        static {
            Covode.recordClassIndex(105482);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.a
        public final boolean a() {
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.a
        public final boolean b() {
            if (this._subHead >= this.f158970c._tail) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.c
        public final boolean e() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.c
        public final boolean f() {
            throw new IllegalStateException("Should not be used".toString());
        }

        private final Object l() {
            long j2 = this._subHead;
            k<?> h2 = this.f158970c.h();
            if (j2 < this.f158970c._tail) {
                E a2 = this.f158970c.a(j2);
                k<?> h3 = h();
                if (h3 != null) {
                    return h3;
                }
                return a2;
            } else if (h2 != null) {
                return h2;
            } else {
                k<?> h4 = h();
                if (h4 == null) {
                    return b.f158957c;
                }
                return h4;
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.a
        public final Object c() {
            boolean z;
            Object obj;
            ReentrantLock reentrantLock = this.f158969b;
            reentrantLock.lock();
            try {
                Object l2 = l();
                boolean z2 = true;
                if ((l2 instanceof k) || l2 == b.f158957c) {
                    z = false;
                } else {
                    this._subHead++;
                    z = true;
                }
                reentrantLock.unlock();
                if (!(l2 instanceof k)) {
                    obj = null;
                } else {
                    obj = l2;
                }
                k kVar = (k) obj;
                if (kVar != null) {
                    b_(kVar.f158979a);
                }
                if (!k()) {
                    z2 = z;
                }
                if (z2) {
                    d.a(this.f158970c, null, 3);
                }
                return l2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r5.f158969b.unlock();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean k() {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.d.a.k():boolean");
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.a.a
        public final void a(boolean z) {
            if (z) {
                d.a(this.f158970c, this, 1);
                ReentrantLock reentrantLock = this.f158969b;
                reentrantLock.lock();
                try {
                    this._subHead = this.f158970c._tail;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final boolean f() {
        if (this._size >= this.f158965b) {
            return true;
        }
        return false;
    }

    private final void a() {
        boolean z = false;
        boolean z2 = false;
        for (a<E> aVar : this.f158968e) {
            if (aVar.k()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            a(this, null, 3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final String j() {
        return "(buffer:capacity=" + this.f158967d.length + ",size=" + this._size + ')';
    }

    @Override // kotlinx.coroutines.a.c, kotlinx.coroutines.a.y
    public final boolean b_(Throwable th) {
        if (!super.b_(th)) {
            return false;
        }
        a();
        return true;
    }

    public final E a(long j2) {
        return (E) this.f158967d[(int) (j2 % ((long) this.f158965b))];
    }

    public d(int i2) {
        this.f158965b = i2;
        if (i2 > 0) {
            this.f158966c = new ReentrantLock();
            this.f158967d = new Object[i2];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            this.f158968e = new CopyOnWriteArrayList();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final Object a(E e2) {
        ReentrantLock reentrantLock = this.f158966c;
        reentrantLock.lock();
        try {
            k<?> g2 = g();
            if (g2 != null) {
                return g2;
            }
            int i2 = this._size;
            if (i2 >= this.f158965b) {
                Object obj = b.f158956b;
                reentrantLock.unlock();
                return obj;
            }
            long j2 = this._tail;
            this.f158967d[(int) (j2 % ((long) this.f158965b))] = e2;
            this._size = i2 + 1;
            this._tail = j2 + 1;
            reentrantLock.unlock();
            a();
            return b.f158955a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void a(a<E> aVar) {
        boolean z;
        x i2;
        v b2;
        a<E> aVar2 = aVar;
        while (true) {
            ReentrantLock reentrantLock = this.f158966c;
            reentrantLock.lock();
            if (aVar2 != null) {
                try {
                    this.f158968e.remove(aVar2);
                    if (this._head != aVar2._subHead) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            long j2 = Long.MAX_VALUE;
            for (a<E> aVar3 : this.f158968e) {
                j2 = h.b(j2, aVar3._subHead);
            }
            long j3 = this._tail;
            long j4 = this._head;
            long b3 = h.b(j2, j3);
            if (b3 <= j4) {
                reentrantLock.unlock();
                return;
            }
            int i3 = this._size;
            while (j4 < b3) {
                Object[] objArr = this.f158967d;
                int i4 = this.f158965b;
                objArr[(int) (j4 % ((long) i4))] = null;
                if (i3 >= i4) {
                    z = true;
                } else {
                    z = false;
                }
                j4++;
                this._head = j4;
                i3--;
                this._size = i3;
                if (z) {
                    do {
                        i2 = i();
                        if (i2 != null) {
                            if (!(i2 instanceof k)) {
                                b2 = i2.b();
                            } else {
                                continue;
                            }
                        }
                    } while (b2 == null);
                    if (!ar.f159021a || b2 == o.f159174a) {
                        this.f158967d[(int) (j3 % ((long) this.f158965b))] = i2.a();
                        this._size = i3 + 1;
                        this._tail = j3 + 1;
                        reentrantLock.unlock();
                        i2.c();
                        a();
                        aVar2 = null;
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            reentrantLock.unlock();
            return;
        }
    }

    @Override // kotlinx.coroutines.a.f
    public final void a(CancellationException cancellationException) {
        b_(cancellationException);
        for (a<E> aVar : this.f158968e) {
            aVar.a((Throwable) cancellationException);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.d */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(d dVar, a aVar, int i2) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        dVar.a(aVar);
    }
}
