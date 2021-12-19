package androidx.lifecycle;

import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SingleGeneratedAdapterObserver implements k {

    /* renamed from: a  reason: collision with root package name */
    private final e f3494a;

    static {
        Covode.recordClassIndex(1287);
    }

    SingleGeneratedAdapterObserver(e eVar) {
        this.f3494a = eVar;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        this.f3494a.a(mVar, aVar, false, null);
        this.f3494a.a(mVar, aVar, true, null);
    }
}
