package com.bytedance.als.dsl;

import androidx.appcompat.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.s;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class f {
    static {
        Covode.recordClassIndex(3112);
    }

    public static final void a(d dVar, b<? super e, z> bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        ac a2 = ae.a((e) dVar).a(AlsVMContainer.class);
        l.b(a2, "");
        e eVar = new e((byte) 0);
        bVar.invoke(eVar);
        ((AlsVMContainer) a2).a(eVar);
    }

    public static final void a(j jVar, b<? super e, z> bVar) {
        l.d(jVar, "");
        l.d(bVar, "");
        ac a2 = s.a(jVar).a(AlsVMContainer.class);
        l.b(a2, "");
        e eVar = new e((byte) 0);
        bVar.invoke(eVar);
        ((AlsVMContainer) a2).a(eVar);
    }
}
