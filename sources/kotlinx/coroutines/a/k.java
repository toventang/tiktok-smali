package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.o;

public final class k<E> extends x implements v<E> {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f158979a;

    static {
        Covode.recordClassIndex(105490);
    }

    @Override // kotlinx.coroutines.a.x
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }

    @Override // kotlinx.coroutines.a.x
    public final void c() {
    }

    @Override // kotlinx.coroutines.a.v
    public final void cN_() {
    }

    @Override // kotlinx.coroutines.a.v
    public final /* bridge */ /* synthetic */ Object f() {
        return this;
    }

    @Override // kotlinx.coroutines.a.x
    public final v b() {
        return o.f159174a;
    }

    public final Throwable d() {
        Throwable th = this.f158979a;
        if (th == null) {
            return new m("Channel was closed");
        }
        return th;
    }

    public final Throwable e() {
        Throwable th = this.f158979a;
        if (th == null) {
            return new l("Channel was closed");
        }
        return th;
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        return "Closed@" + Integer.toHexString(System.identityHashCode(this)) + '[' + this.f158979a + ']';
    }

    public k(Throwable th) {
        this.f158979a = th;
    }

    @Override // kotlinx.coroutines.a.v
    public final v b(E e2) {
        return o.f159174a;
    }

    @Override // kotlinx.coroutines.a.x
    public final void a(k<?> kVar) {
        if (ar.f159021a) {
            throw new AssertionError();
        }
    }
}
