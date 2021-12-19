package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.z;

/* access modifiers changed from: package-private */
public final class dc<T> extends t<T> {
    static {
        Covode.recordClassIndex(105622);
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.a
    public final void b(Object obj) {
        Object a2 = aa.a(obj, this.f159155e);
        f context = this.f159155e.getContext();
        Object a3 = z.a(context, null);
        try {
            this.f159155e.resumeWith(a2);
        } finally {
            z.b(context, a3);
        }
    }

    public dc(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }
}
