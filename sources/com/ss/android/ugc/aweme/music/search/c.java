package com.ss.android.ugc.aweme.music.search;

import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.m;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.b.a;

public abstract class c<VM extends AssemListViewModel<?, ?, ?>> extends m<VM> implements b<Object> {

    /* renamed from: j  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.c f111695j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f111696k = new Object();

    static {
        Covode.recordClassIndex(71791);
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        generatedComponent();
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return x().generatedComponent();
    }

    @Override // com.bytedance.assem.arch.core.a
    public final ad.b q() {
        ad.b a2 = a.a(this);
        if (a2 != null) {
            return a2;
        }
        return super.q();
    }

    private dagger.hilt.android.internal.managers.c x() {
        if (this.f111695j == null) {
            synchronized (this.f111696k) {
                if (this.f111695j == null) {
                    this.f111695j = new dagger.hilt.android.internal.managers.c(this);
                }
            }
        }
        return this.f111695j;
    }
}
