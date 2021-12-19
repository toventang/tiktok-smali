package androidx.lifecycle;

import androidx.a.a.c.a;
import com.bytedance.covode.number.Covode;

public final class aa {
    static {
        Covode.recordClassIndex(1293);
    }

    public static <X, Y> LiveData<Y> a(LiveData<X> liveData, final a<X, Y> aVar) {
        final r rVar = new r();
        rVar.a(liveData, new u<X>() {
            /* class androidx.lifecycle.aa.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1294);
            }

            @Override // androidx.lifecycle.u
            public final void onChanged(X x) {
                rVar.setValue(aVar.a(x));
            }
        });
        return rVar;
    }
}
