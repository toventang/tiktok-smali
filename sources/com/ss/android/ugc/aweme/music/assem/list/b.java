package com.ss.android.ugc.aweme.music.assem.list;

import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.m;
import dagger.hilt.android.internal.b.a;
import dagger.hilt.android.internal.managers.c;

public abstract class b<VM extends AssemListViewModel<?, ?, ?>> extends m<VM> implements dagger.hilt.a.b<Object> {

    /* renamed from: j  reason: collision with root package name */
    private volatile c f111179j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f111180k = new Object();

    static {
        Covode.recordClassIndex(71370);
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

    private c x() {
        if (this.f111179j == null) {
            synchronized (this.f111180k) {
                if (this.f111179j == null) {
                    this.f111179j = new c(this);
                }
            }
        }
        return this.f111179j;
    }
}
