package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.c.e;
import h.c.f;
import h.f.a.m;

public final /* synthetic */ class h {
    static {
        Covode.recordClassIndex(105637);
    }

    public static final <T> T a(f fVar, m<? super am, ? super d<? super T>, ? extends Object> mVar) {
        bl blVar;
        f a2;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) fVar.get(e.f158671b);
        if (eVar == null) {
            blVar = cw.a();
            a2 = ag.a(bs.f159054a, fVar.plus(blVar));
        } else {
            if (!(eVar instanceof bl)) {
                eVar = null;
            }
            blVar = (bl) eVar;
            if (blVar == null || !blVar.shouldBeProcessedFromContext()) {
                blVar = cw.b();
            }
            a2 = ag.a(bs.f159054a, fVar);
        }
        e eVar2 = new e(a2, currentThread, blVar);
        eVar2.a(ao.DEFAULT, eVar2, mVar);
        return (T) eVar2.j();
    }
}
