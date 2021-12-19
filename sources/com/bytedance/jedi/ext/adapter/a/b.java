package com.bytedance.jedi.ext.adapter.a;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.ext.adapter.extension.b;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(24405);
    }

    public static /* synthetic */ g a(com.bytedance.jedi.ext.adapter.extension.b bVar) {
        m mVar = bVar.f39702e;
        e.b bVar2 = null;
        if (!(mVar instanceof h)) {
            mVar = null;
        }
        h hVar = (h) mVar;
        if (hVar != null) {
            l.c(bVar, "");
            l.c(hVar, "");
            e eVar = bVar.f39698b;
            if (eVar == null) {
                e.b bVar3 = bVar.f39697a;
                if (bVar3 != null) {
                    l.c(bVar3, "");
                    e.a aVar = new e.a(bVar3);
                    aVar.f39444b = true;
                    aVar.f39443a = 10;
                    if (!aVar.f39444b || aVar.f39443a > 0) {
                        eVar = new e(aVar.f39445c, aVar.f39444b, aVar.f39443a, (byte) 0);
                    } else {
                        throw new IllegalArgumentException("Prefetch distance must be a positive number when prefetch is enabled");
                    }
                } else {
                    eVar = null;
                }
            }
            b.C0972b bVar4 = new b.C0972b(bVar, eVar, bVar.f39702e, eVar, bVar.f39700d);
            e eVar2 = bVar4.f39569a;
            if (eVar2 != null) {
                bVar2 = eVar2.f39440a;
            }
            l.c(bVar4, "");
            l.c(hVar, "");
            g gVar = new g(bVar4, new d(bVar4), hVar);
            gVar.q = (ListViewModel) bVar2;
            return gVar;
        }
        throw new IllegalArgumentException("realAdapter does not provide ISubscriber, please specify it".toString());
    }
}
