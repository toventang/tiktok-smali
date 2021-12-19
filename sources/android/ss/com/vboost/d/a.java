package android.ss.com.vboost.d;

import android.ss.com.vboost.c.c;
import android.ss.com.vboost.d.f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f518a = a.class.getSimpleName();

    a() {
    }

    static {
        Covode.recordClassIndex(48);
    }

    static Object a(d dVar) {
        Object obj;
        if (!c.a().a(dVar)) {
            obj = null;
        } else if (!dVar.f532i) {
            obj = c.a().b(dVar);
        } else {
            obj = c.a().c(dVar);
        }
        f fVar = f.a.f556a;
        fVar.f544c.lock();
        try {
            fVar.f548g.remove(dVar);
            fVar.f546e.remove(dVar.f524a);
            return obj;
        } finally {
            fVar.f544c.unlock();
        }
    }
}
