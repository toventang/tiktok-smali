package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;

public class o<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f158991d = new v("EMPTY");

    /* renamed from: e  reason: collision with root package name */
    private static final a f158992e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f158993b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    private Object f158994c = f158991d;

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
    @Override // kotlinx.coroutines.a.c
    public final boolean f() {
        return false;
    }

    static final class a {
        static {
            Covode.recordClassIndex(105499);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean b() {
        if (this.f158994c == f158991d) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(105498);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final String j() {
        return "(value=" + this.f158994c + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final Object c() {
        ReentrantLock reentrantLock = this.f158993b;
        reentrantLock.lock();
        try {
            Object obj = this.f158994c;
            v vVar = f158991d;
            if (obj == vVar) {
                Object g2 = g();
                if (g2 == null) {
                    g2 = b.f158957c;
                }
                return g2;
            }
            this.f158994c = vVar;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public void a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f158993b;
            reentrantLock.lock();
            try {
                this.f158994c = f158991d;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.a(z);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean a(t<? super E> tVar) {
        ReentrantLock reentrantLock = this.f158993b;
        reentrantLock.lock();
        try {
            return super.a((t) tVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public Object a(E e2) {
        v<E> d2;
        v b2;
        boolean z;
        ReentrantLock reentrantLock = this.f158993b;
        reentrantLock.lock();
        try {
            k<?> g2 = g();
            if (g2 != null) {
                return g2;
            }
            if (this.f158994c == f158991d) {
                do {
                    d2 = d();
                    if (d2 != null) {
                        if (d2 instanceof k) {
                            reentrantLock.unlock();
                            return d2;
                        }
                        b2 = d2.b(e2);
                    }
                } while (b2 == null);
                if (ar.f159021a) {
                    if (b2 == kotlinx.coroutines.o.f159174a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                reentrantLock.unlock();
                d2.cN_();
                return d2.f();
            }
            this.f158994c = e2;
            Object obj = b.f158955a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
