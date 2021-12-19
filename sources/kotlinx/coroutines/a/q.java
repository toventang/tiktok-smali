package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;

public final class q<E> extends a<E> {
    static {
        Covode.recordClassIndex(105501);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.a
    public final boolean b() {
        return true;
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

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a.c
    public final Object a(E e2) {
        v<?> b2;
        do {
            Object a2 = super.a((Object) e2);
            if (a2 == b.f158955a) {
                return b.f158955a;
            }
            if (a2 == b.f158956b) {
                b2 = b(e2);
                if (b2 == null) {
                    return b.f158955a;
                }
            } else if (a2 instanceof k) {
                return a2;
            } else {
                throw new IllegalStateException("Invalid offerInternal result ".concat(String.valueOf(a2)).toString());
            }
        } while (!(b2 instanceof k));
        return b2;
    }
}
