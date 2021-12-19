package androidx.lifecycle;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f3470a;

    static {
        Covode.recordClassIndex(1273);
    }

    CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.f3470a = eVarArr;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        s sVar = new s();
        for (e eVar : this.f3470a) {
            eVar.a(mVar, aVar, false, sVar);
        }
        for (e eVar2 : this.f3470a) {
            eVar2.a(mVar, aVar, true, sVar);
        }
    }
}
