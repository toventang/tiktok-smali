package com.bytedance.ies.bullet.kit.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.b.b;
import com.bytedance.ies.bullet.c.c.b.c;
import com.bytedance.ies.bullet.c.c.b.d;
import h.a.ag;
import h.v;
import java.util.Map;

public final class a extends c<a> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Boolean> f32404a;

    /* renamed from: b  reason: collision with root package name */
    public final b<Boolean> f32405b;

    static {
        Covode.recordClassIndex(19180);
    }

    public a() {
        this(null, 3);
    }

    @Override // com.bytedance.ies.bullet.c.c.b.a
    public final Map<String, b<?>> a() {
        return ag.a(v.a("hardwareAcceleration", this.f32404a), v.a("longClickable", this.f32405b));
    }

    private a(Boolean bool) {
        this.f32404a = new d(bool, false, 2);
        this.f32405b = new d(null, false, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Boolean bool, int i2) {
        this((i2 & 1) != 0 ? null : bool);
    }
}
