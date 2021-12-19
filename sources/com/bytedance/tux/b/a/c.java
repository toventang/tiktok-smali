package com.bytedance.tux.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.g;
import com.bytedance.tux.icon.a;
import h.f.b.l;

public final class c extends b<a> {
    static {
        Covode.recordClassIndex(27312);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.b.a.b
    public final /* synthetic */ boolean a(a aVar, int i2, Object obj) {
        a aVar2 = aVar;
        l.c(aVar2, "");
        l.c(obj, "");
        if (i2 == g.m().f44668a) {
            g.m();
            l.c(obj, "");
            aVar2.setIconWidth(((Number) obj).intValue());
            return true;
        } else if (i2 == g.n().f44668a) {
            g.n();
            l.c(obj, "");
            aVar2.setIconHeight(((Number) obj).intValue());
            return true;
        } else if (i2 != g.v().f44668a) {
            return false;
        } else {
            g.v();
            l.c(obj, "");
            aVar2.setIconTintColorRes(((Number) obj).intValue());
            return true;
        }
    }
}
