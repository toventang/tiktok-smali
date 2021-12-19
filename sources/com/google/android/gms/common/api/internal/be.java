package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class be implements c.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f.a f50093a;

    static {
        Covode.recordClassIndex(31248);
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        f.this.o.post(new bd(this));
    }

    be(f.a aVar) {
        this.f50093a = aVar;
    }
}
