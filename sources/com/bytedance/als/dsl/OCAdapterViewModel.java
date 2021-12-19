package com.bytedance.als.dsl;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.n;
import h.f.b.l;

public final class OCAdapterViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final n f6457a;

    /* renamed from: b  reason: collision with root package name */
    private f f6458b;

    static {
        Covode.recordClassIndex(3106);
    }

    public final f a() {
        f a2 = this.f6457a.a();
        l.b(a2, "");
        this.f6458b = a2;
        return a2;
    }

    public final f b() {
        f fVar = this.f6458b;
        if (fVar == null) {
            return a();
        }
        return fVar;
    }

    public OCAdapterViewModel(f fVar, e eVar) {
        n nVar;
        l.d(eVar, "");
        if (fVar == null) {
            nVar = new n(null, eVar.f6462a);
        } else {
            nVar = new n(fVar, eVar.f6462a);
        }
        this.f6457a = nVar;
    }
}
