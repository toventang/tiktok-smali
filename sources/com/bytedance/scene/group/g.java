package com.bytedance.scene.group;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;

public final class g implements m {

    /* renamed from: a  reason: collision with root package name */
    private n f42887a;

    static {
        Covode.recordClassIndex(26314);
    }

    g() {
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        a();
        return this.f42887a;
    }

    private void a() {
        if (this.f42887a == null) {
            this.f42887a = new n(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(i.a aVar) {
        a();
        this.f42887a.a(aVar);
    }
}
