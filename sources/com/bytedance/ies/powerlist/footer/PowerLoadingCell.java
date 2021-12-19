package com.bytedance.ies.powerlist.footer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.i;
import h.f.b.l;

public abstract class PowerLoadingCell extends PowerCell<a> {
    static {
        Covode.recordClassIndex(20488);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void a(a aVar) {
        l.c(aVar, "");
        i iVar = aVar.f34291a.f34345b;
        if (iVar instanceof i.d) {
            c();
        } else if (iVar instanceof i.b) {
            a();
        } else if (iVar instanceof i.a) {
            b();
        }
    }
}
