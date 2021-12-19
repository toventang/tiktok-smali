package com.ss.android.ugc.aweme.music.assem.video;

import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.managers.c;

public abstract class a extends com.bytedance.assem.arch.d.a implements b<Object> {

    /* renamed from: j  reason: collision with root package name */
    private volatile c f111282j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f111283k = new Object();

    static {
        Covode.recordClassIndex(71516);
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
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
        if (this.f111282j == null) {
            synchronized (this.f111283k) {
                if (this.f111282j == null) {
                    this.f111282j = new c(this);
                }
            }
        }
        return this.f111282j;
    }
}
