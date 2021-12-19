package com.bytedance.ext_power_list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.v;
import h.k.d;

final /* synthetic */ class n extends v {
    static {
        Covode.recordClassIndex(16893);
    }

    n(AssemListViewModel assemListViewModel) {
        super(assemListViewModel);
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "config";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getConfig()Lcom/bytedance/ies/powerlist/page/config/PowerPageConfig;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(AssemListViewModel.class);
    }

    @Override // h.k.j
    public final Object get() {
        return ((AssemListViewModel) this.receiver).h();
    }
}
