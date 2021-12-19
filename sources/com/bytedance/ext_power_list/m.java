package com.bytedance.ext_power_list;

import android.view.View;
import com.bytedance.assem.arch.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.f;
import com.bytedance.ies.powerlist.page.config.b;
import com.bytedance.ies.powerlist.page.config.c;
import h.f.b.l;

public abstract class m<VM extends AssemListViewModel<?, ?, ?>> extends a {
    static {
        Covode.recordClassIndex(16892);
    }

    public abstract VM u();

    public abstract PowerList v();

    public abstract c w();

    @Override // com.bytedance.assem.arch.core.p
    public void b(View view) {
        l.c(view, "");
        v().setListConfig(w());
        VM u = u();
        f<ITEM> fVar = (f<ITEM>) v().getState();
        l.a((Object) fVar, "");
        l.c(fVar, "");
        u.f28651j = fVar;
        v().a((b) new n(u).get());
    }
}
