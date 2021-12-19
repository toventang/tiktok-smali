package com.ss.android.ugc.aweme.aabplugin.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.c;
import com.ss.android.ugc.aweme.aabplugin.core.base.a.d;
import com.ss.android.ugc.aweme.aabplugin.core.base.l;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;

public final class a extends l<d> {
    static {
        Covode.recordClassIndex(38426);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.l
    public final boolean a() {
        T t = this.f62492a;
        d.a(t);
        String str = t.f62519m;
        com.bytedance.m.b.a a2 = c.a(str);
        if (a2 == null) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "The state of " + str + "was not found");
            t.a(2, t.f62507a);
            return false;
        }
        int i2 = a2.f41329c;
        com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(t, i2);
        if (i2 == 5) {
            if (t.b()) {
                t.d();
                return true;
            }
        } else if (i2 == 2 || i2 == 4) {
            m<?> b2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.a().b(t.f62518l);
            if (b2 != null) {
                b2.b(t);
            }
            return false;
        }
        com.ss.android.ugc.aweme.aabplugin.core.base.a.a().a(t.f62518l, this.f62493b);
        com.ss.android.ugc.aweme.aabplugin.core.base.a.a().a(t);
        return false;
    }

    public a(d dVar) {
        super(dVar, new b(dVar.f62518l));
    }
}
