package com.ss.android.ugc.aweme.profile.widgets.follow;

import androidx.lifecycle.ad;
import com.bytedance.assem.arch.d.a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.managers.c;

public abstract class e extends a implements b<Object> {

    /* renamed from: j  reason: collision with root package name */
    private volatile c f117782j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f117783k = new Object();

    static {
        Covode.recordClassIndex(76277);
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        generatedComponent();
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return u().generatedComponent();
    }

    @Override // com.bytedance.assem.arch.core.a
    public final ad.b q() {
        ad.b a2 = dagger.hilt.android.internal.b.a.a(this);
        if (a2 != null) {
            return a2;
        }
        return super.q();
    }

    private c u() {
        if (this.f117782j == null) {
            synchronized (this.f117783k) {
                if (this.f117782j == null) {
                    this.f117782j = new c(this);
                }
            }
        }
        return this.f117782j;
    }
}
