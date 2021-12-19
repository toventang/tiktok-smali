package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;

final class p extends m<Void> {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f53075c;

    static {
        Covode.recordClassIndex(32770);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(r rVar, m<Void> mVar) {
        super(rVar, mVar);
        this.f53075c = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.m, com.google.android.play.core.b.cc
    public final void a(Bundle bundle, Bundle bundle2) {
        super.a(bundle, bundle2);
        if (!this.f53075c.f53086f.compareAndSet(true, false)) {
            r.f53080a.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f53075c.a();
        }
    }
}
