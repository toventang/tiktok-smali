package com.bytedance.im.core.internal.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.d.e;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final e f38708a;

    static {
        Covode.recordClassIndex(23081);
    }

    @Override // com.bytedance.im.core.internal.d.b.d
    public final e a() {
        return this.f38708a;
    }

    @Override // com.bytedance.im.core.internal.d.b.d
    public c b() {
        return this.f38708a.d();
    }

    protected a(e eVar) {
        this.f38708a = eVar;
    }
}
