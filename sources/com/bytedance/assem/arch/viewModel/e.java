package com.bytedance.assem.arch.viewModel;

import com.bytedance.assem.arch.extensions.j;
import com.bytedance.covode.number.Covode;
import h.c.f;
import h.h;
import java.util.concurrent.Executor;
import kotlinx.coroutines.am;
import kotlinx.coroutines.be;
import kotlinx.coroutines.br;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.z;

public final class e implements h<am> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25711a;

    /* renamed from: b  reason: collision with root package name */
    private am f25712b;

    static {
        Covode.recordClassIndex(14973);
    }

    @Override // h.h
    public final boolean isInitialized() {
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // h.h
    public final /* synthetic */ am getValue() {
        Executor executor;
        f fVar;
        am amVar = this.f25712b;
        if (amVar == null) {
            Executor a2 = j.a(this.f25711a);
            z a3 = cu.a();
            if (!(a2 instanceof be)) {
                executor = null;
            } else {
                executor = a2;
            }
            be beVar = (be) executor;
            if (beVar == null || (fVar = beVar.f159039a) == null) {
                fVar = new br(a2);
            }
            amVar = new d(a3.plus(fVar));
            this.f25712b = amVar;
        }
        return amVar;
    }

    public e(boolean z) {
        this.f25711a = z;
    }
}
