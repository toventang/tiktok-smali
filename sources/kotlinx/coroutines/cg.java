package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.a.b;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.z;
import kotlinx.coroutines.b.a;

/* access modifiers changed from: package-private */
public final class cg<T> extends aw<T> {

    /* renamed from: b  reason: collision with root package name */
    private final d<z> f159092b;

    static {
        Covode.recordClassIndex(105598);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    public final void d() {
        a.a(this.f159092b, this);
    }

    public cg(f fVar, m<? super am, ? super d<? super T>, ? extends Object> mVar) {
        super(fVar, false);
        this.f159092b = b.a(mVar, this, this);
    }
}
