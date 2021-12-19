package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public abstract class AssemViewModelWithItem<S extends j, ITEM> extends AssemViewModel<S> {

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.assem.arch.b.j f28666j;

    static {
        Covode.recordClassIndex(16867);
    }

    public final ITEM g() {
        com.bytedance.assem.arch.b.j jVar = this.f28666j;
        ITEM item = jVar != null ? (ITEM) jVar.a() : null;
        if (!(item instanceof Object)) {
            return null;
        }
        return item;
    }
}
