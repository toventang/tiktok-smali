package com.ss.android.ugc.aweme.profile.widgets.common;

import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;
import dagger.hilt.android.internal.managers.c;

public abstract class a extends h implements b<Object> {

    /* renamed from: l  reason: collision with root package name */
    private volatile c f117695l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f117696m = new Object();

    static {
        Covode.recordClassIndex(76170);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
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
        if (this.f117695l == null) {
            synchronized (this.f117696m) {
                if (this.f117695l == null) {
                    this.f117695l = new c(this);
                }
            }
        }
        return this.f117695l;
    }
}
