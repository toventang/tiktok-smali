package com.bytedance.s.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.c;
import com.bytedance.ies.powerlist.page.e;
import com.bytedance.ies.powerlist.page.h;
import com.bytedance.ies.powerlist.page.i;
import h.f.b.l;

public class a implements c {
    static {
        Covode.recordClassIndex(26206);
    }

    public void a() {
    }

    public void a(Exception exc) {
    }

    public void a(boolean z) {
    }

    public void b() {
    }

    @Override // com.bytedance.ies.powerlist.page.c
    public final void a(h hVar) {
        l.c(hVar, "");
        e eVar = hVar.f34397a.f34399a;
        i iVar = hVar.f34397a;
        if (iVar instanceof i.d) {
            int i2 = b.f42641a[eVar.ordinal()];
            if (i2 == 2) {
                b();
            } else if (i2 == 3) {
                a();
            }
        } else if (iVar instanceof i.c) {
            if (b.f42642b[eVar.ordinal()] == 3) {
                a(true);
            }
        } else if (iVar instanceof i.b) {
            Exception exc = ((i.b) iVar).f34405e;
            if (b.f42643c[eVar.ordinal()] == 1) {
                a(exc);
            }
        } else if ((iVar instanceof i.a) && b.f42644d[eVar.ordinal()] == 1) {
            a(false);
        }
    }
}
