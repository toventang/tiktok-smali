package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.ar;

public final class n<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final v f159139a = new v("REMOVE_FROZEN");

    /* renamed from: b  reason: collision with root package name */
    public static final a f159140b = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f159141d = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f159142e = AtomicLongFieldUpdater.newUpdater(n.class, "_state");
    private volatile Object _next;
    volatile long _state;

    /* renamed from: c  reason: collision with root package name */
    private final int f159143c;

    /* renamed from: f  reason: collision with root package name */
    private AtomicReferenceArray f159144f;

    /* renamed from: g  reason: collision with root package name */
    private final int f159145g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f159146h;

    public static final class a {
        static {
            Covode.recordClassIndex(105665);
        }

        public static int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public static long a(long j2, int i2) {
            return (j2 & -1073741824) | (((long) i2) << 0);
        }

        public static long b(long j2, int i2) {
            return (j2 & -1152921503533105153L) | (((long) i2) << 30);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final n<E> d() {
        return a(e());
    }

    private final long e() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f159142e.compareAndSet(this, j2, j3));
        return j3;
    }

    static {
        Covode.recordClassIndex(105664);
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f159142e.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final Object c() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f159139a;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = this.f159143c;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == (i2 & i3)) {
                return null;
            }
            Object obj = this.f159144f.get(i3 & i2);
            if (obj == null) {
                if (this.f159146h) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i4 = (i2 + 1) & 1073741823;
                if (f159142e.compareAndSet(this, j2, a.a(j2, i4))) {
                    this.f159144f.set(this.f159143c & i2, null);
                    return obj;
                } else if (this.f159146h) {
                    n<E> nVar = this;
                    do {
                        nVar = nVar.a(i2, i4);
                    } while (nVar != null);
                    return obj;
                }
            }
        }
    }

    public final boolean a() {
        long j2 = this._state;
        if (((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f159147a;

        static {
            Covode.recordClassIndex(105666);
        }

        public b(int i2) {
            this.f159147a = i2;
        }
    }

    private final n<E> a(long j2) {
        while (true) {
            n<E> nVar = (n) this._next;
            if (nVar != null) {
                return nVar;
            }
            f159141d.compareAndSet(this, null, b(j2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: java.util.concurrent.atomic.AtomicReferenceArray */
    /* JADX WARN: Multi-variable type inference failed */
    private final n<E> b(long j2) {
        n<E> nVar = new n<>(this.f159145g * 2, this.f159146h);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.f159143c;
            if ((i2 & i4) != (i3 & i4)) {
                Object obj = this.f159144f.get(i4 & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                nVar.f159144f.set(nVar.f159143c & i2, obj);
                i2++;
            } else {
                nVar._state = j2 & -1152921504606846977L;
                return nVar;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(E r18) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.n.a(java.lang.Object):int");
    }

    private final n<E> a(int i2, E e2) {
        Object obj = this.f159144f.get(this.f159143c & i2);
        if (!(obj instanceof b) || ((b) obj).f159147a != i2) {
            return null;
        }
        this.f159144f.set(i2 & this.f159143c, e2);
        return this;
    }

    public n(int i2, boolean z) {
        boolean z2;
        this.f159145g = i2;
        this.f159146h = z;
        int i3 = i2 - 1;
        this.f159143c = i3;
        this.f159144f = new AtomicReferenceArray(i2);
        if (i3 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Check failed.".toString());
        } else if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final n<E> a(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (ar.f159021a && i4 != i2) {
                throw new AssertionError();
            } else if ((1152921504606846976L & j2) != 0) {
                return d();
            }
        } while (!f159142e.compareAndSet(this, j2, a.a(j2, i3)));
        this.f159144f.set(this.f159143c & i4, null);
        return null;
    }
}
