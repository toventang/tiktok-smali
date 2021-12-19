package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f53150a;

    static {
        Covode.recordClassIndex(32845);
    }

    f(l lVar) {
        this.f53150a = lVar;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        if (this.f53150a.f53166k != null) {
            this.f53150a.f53157b.d("Unbind from service.", new Object[0]);
            this.f53150a.f53156a.unbindService(this.f53150a.f53165j);
            this.f53150a.f53160e = false;
            this.f53150a.f53166k = null;
            this.f53150a.f53165j = null;
        }
    }
}
