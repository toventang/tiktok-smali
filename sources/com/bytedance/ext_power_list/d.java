package com.bytedance.ext_power_list;

import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.a;
import com.bytedance.assem.arch.service.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import h.f.b.l;
import h.k.c;
import h.w;

public final class d {
    static {
        Covode.recordClassIndex(16872);
    }

    public static /* synthetic */ b a(PowerCell powerCell, c cVar) {
        l.c(powerCell, "");
        l.c(cVar, "");
        if (powerCell.i() instanceof a) {
            m i2 = powerCell.i();
            if (i2 != null) {
                return com.bytedance.assem.arch.service.d.a((a) i2, cVar);
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new RuntimeException("currentLifecycleOwner is " + powerCell.i() + ", PowerList has not attached on Assem.");
    }

    public static /* synthetic */ com.bytedance.assem.arch.service.c b(PowerCell powerCell, c cVar) {
        l.c(powerCell, "");
        l.c(cVar, "");
        if (powerCell.i() instanceof a) {
            m i2 = powerCell.i();
            if (i2 != null) {
                return com.bytedance.assem.arch.service.d.b((a) i2, cVar);
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new RuntimeException("currentLifecycleOwner is " + powerCell.i() + ", PowerList has not attached on Assem.");
    }
}
