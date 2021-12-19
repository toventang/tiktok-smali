package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.q;
import h.r;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f159129a;

    static {
        Object obj;
        Covode.recordClassIndex(105657);
        try {
            obj = q.m223constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        f159129a = q.m229isSuccessimpl(obj);
    }
}
