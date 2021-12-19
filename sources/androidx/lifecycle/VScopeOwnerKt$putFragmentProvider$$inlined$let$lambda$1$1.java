package androidx.lifecycle;

import androidx.lifecycle.ab;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ab.b f3495a;

    static {
        Covode.recordClassIndex(1289);
    }

    VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1(ab.b bVar) {
        this.f3495a = bVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            ab.f3506a.remove(this.f3495a.$provider$inlined);
        }
    }
}
