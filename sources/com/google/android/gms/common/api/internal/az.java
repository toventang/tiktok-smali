package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.c;

final class az implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f f50083a;

    static {
        Covode.recordClassIndex(31242);
    }

    az(f fVar) {
        this.f50083a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.f50083a.o.sendMessage(this.f50083a.o.obtainMessage(1, Boolean.valueOf(z)));
    }
}
