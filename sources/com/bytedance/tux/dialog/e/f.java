package com.bytedance.tux.dialog.e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b;
import h.f.b.l;
import h.z;

public final class f {
    static {
        Covode.recordClassIndex(27395);
    }

    public static final b a(b bVar, View view, h.f.a.b<? super e, z> bVar2) {
        l.c(bVar, "");
        l.c(view, "");
        e eVar = new e(bVar.o, view);
        if (bVar2 != null) {
            bVar2.invoke(eVar);
        }
        bVar.a(eVar);
        return bVar;
    }
}
