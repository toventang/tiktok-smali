package com.bytedance.assem.arch.extensions;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.g;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.z;

public final class AssembleExtKt$assemble$$inlined$let$lambda$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f25618a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z.e f25619b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f25620c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Assembler f25621d;

    static {
        Covode.recordClassIndex(14906);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f25637a[aVar.ordinal()] == 1) {
            this.f25621d.d(this.f25618a);
        }
    }

    AssembleExtKt$assemble$$inlined$let$lambda$1(g gVar, z.e eVar, e eVar2, Assembler assembler) {
        this.f25618a = gVar;
        this.f25619b = eVar;
        this.f25620c = eVar2;
        this.f25621d = assembler;
    }
}
