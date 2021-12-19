package com.bytedance.tux.dialog.e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(27393);
    }

    public static /* synthetic */ b a(b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        bVar.a(new c(bVar.o, view));
        return bVar;
    }

    public static final <T extends View> b a(b bVar, T t, int i2) {
        l.c(bVar, "");
        l.c(t, "");
        c cVar = new c(bVar.o, t);
        cVar.f44867a = i2;
        bVar.a(cVar);
        return bVar;
    }
}
