package com.ss.android.ugc.aweme.base.arch;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.b.f;
import com.bytedance.jedi.ext.adapter.i;
import h.f.b.l;

public abstract class d<VH extends JediViewHolder<? extends g, ?>> extends h<VH, i<VH>> {

    /* renamed from: a  reason: collision with root package name */
    public final i<VH> f67986a;

    static {
        Covode.recordClassIndex(41869);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.c
    public final /* bridge */ /* synthetic */ f b() {
        return this.f67986a;
    }

    public d(m mVar) {
        l.d(mVar, "");
        i<VH> iVar = new i<>(mVar);
        a(iVar);
        this.f67986a = iVar;
    }
}
