package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.m;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.managers.c;

public abstract class a<VM extends AssemListViewModel<?, ?, ?>> extends m<VM> implements b<Object> {

    /* renamed from: j  reason: collision with root package name */
    private volatile c f120154j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f120155k = new Object();

    static {
        Covode.recordClassIndex(78137);
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
        ad.b a2 = dagger.hilt.android.internal.b.a.a(this);
        if (a2 != null) {
            return a2;
        }
        return super.q();
    }

    private c x() {
        if (this.f120154j == null) {
            synchronized (this.f120155k) {
                if (this.f120154j == null) {
                    this.f120154j = new c(this);
                }
            }
        }
        return this.f120154j;
    }
}
