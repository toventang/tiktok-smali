package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.w;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f159131a = new v("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f159132b = new v("LIST_EMPTY");

    static {
        Covode.recordClassIndex(105660);
    }

    public static final l a(Object obj) {
        Object obj2;
        l lVar;
        if (!(obj instanceof s)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        s sVar = (s) obj2;
        if (sVar != null && (lVar = sVar.f159154a) != null) {
            return lVar;
        }
        if (obj != null) {
            return (l) obj;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
