package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import java.util.UUID;

final /* synthetic */ class x implements a {

    /* renamed from: a  reason: collision with root package name */
    private final v f80684a;

    static {
        Covode.recordClassIndex(50182);
    }

    x(v vVar) {
        this.f80684a = vVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        this.f80684a.b(UUID.randomUUID().toString());
        return null;
    }
}
