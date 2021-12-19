package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.z;

/* access modifiers changed from: package-private */
public class cr extends a<z> {
    static {
        Covode.recordClassIndex(105609);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public final boolean e(Throwable th) {
        aj.a(getContext(), th);
        return true;
    }

    public cr(f fVar, boolean z) {
        super(fVar, z);
    }
}
