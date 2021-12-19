package androidx.h;

import androidx.h.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class m<T> extends i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3191a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3192b;
    private final d<?, T> n;

    static {
        Covode.recordClassIndex(1140);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.i
    public final void a(int i2) {
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.i
    public final void a(i<T> iVar, i.c cVar) {
    }

    @Override // androidx.h.i
    public final boolean d() {
        return true;
    }

    @Override // androidx.h.i
    public final boolean f() {
        return true;
    }

    @Override // androidx.h.i
    public final d<?, T> b() {
        return this.n;
    }

    @Override // androidx.h.i
    public final Object c() {
        return this.f3192b;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.i
    public final boolean a() {
        return this.f3191a;
    }

    m(i<T> iVar) {
        super(new k(iVar.f3143g), iVar.f3139c, iVar.f3140d, null, iVar.f3142f);
        this.n = iVar.b();
        this.f3191a = iVar.a();
        this.f3144h = iVar.f3144h;
        this.f3192b = iVar.c();
    }
}
