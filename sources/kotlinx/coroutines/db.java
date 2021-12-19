package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;

public final class db extends ah {

    /* renamed from: a  reason: collision with root package name */
    public static final db f159104a = new db();

    @Override // kotlinx.coroutines.ah
    public final boolean isDispatchNeeded(f fVar) {
        return false;
    }

    @Override // kotlinx.coroutines.ah
    public final String toString() {
        return "Unconfined";
    }

    private db() {
    }

    static {
        Covode.recordClassIndex(105621);
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        dd ddVar = (dd) fVar.get(dd.f159105b);
        if (ddVar != null) {
            ddVar.f159106a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
