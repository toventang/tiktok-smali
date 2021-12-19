package com.bytedance.assem.arch.extensions;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.p;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AssembleExtKt$assemble$3 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f25628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Assembler f25629b;

    static {
        Covode.recordClassIndex(14909);
    }

    AssembleExtKt$assemble$3(p pVar, Assembler assembler) {
        this.f25628a = pVar;
        this.f25629b = assembler;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f25638b[aVar.ordinal()] == 1) {
            this.f25629b.d(this.f25628a);
        }
    }
}
