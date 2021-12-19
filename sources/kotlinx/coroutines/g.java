package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.f;
import h.f.a.m;
import h.z;

public final class g {
    static {
        Covode.recordClassIndex(105636);
    }

    public static final <T> av<T> a(am amVar, f fVar, ao aoVar, m<? super am, ? super d<? super T>, ? extends Object> mVar) {
        aw awVar;
        f a2 = ag.a(amVar, fVar);
        if (aoVar.isLazy()) {
            awVar = new cg(a2, mVar);
        } else {
            awVar = new aw(a2, true);
        }
        ((a) awVar).a(aoVar, awVar, mVar);
        return awVar;
    }

    public static final bz b(am amVar, f fVar, ao aoVar, m<? super am, ? super d<? super z>, ? extends Object> mVar) {
        a crVar;
        f a2 = ag.a(amVar, fVar);
        if (aoVar.isLazy()) {
            crVar = new ch(a2, mVar);
        } else {
            crVar = new cr(a2, true);
        }
        crVar.a(aoVar, crVar, mVar);
        return crVar;
    }
}
