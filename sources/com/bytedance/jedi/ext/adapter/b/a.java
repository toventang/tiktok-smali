package com.bytedance.jedi.ext.adapter.b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

final class a extends e<Object> {
    static {
        Covode.recordClassIndex(24438);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e
    public final void b(Object obj) {
        l.c(obj, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        l.c(viewGroup, "");
        MethodCollector.i(6453);
        MethodCollector.o(6453);
    }
}
