package androidx.lifecycle;

import androidx.lifecycle.ab;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class VScopeOwnerKt$putActivityProvider$1$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ab.a f3496a;

    static {
        Covode.recordClassIndex(1288);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    VScopeOwnerKt$putActivityProvider$1$1(ab.a aVar) {
        this.f3496a = aVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            ab.f3506a.remove(this.f3496a.$provider);
        }
    }
}
