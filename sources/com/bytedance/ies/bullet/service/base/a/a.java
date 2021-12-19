package com.bytedance.ies.bullet.service.base.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.b.b;
import h.f.b.l;

public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    public final b f32516a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Context f32517b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32518c;

    static {
        Covode.recordClassIndex(19280);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.m
    public final /* bridge */ /* synthetic */ h a() {
        return this.f32516a;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.m
    public final Context b() {
        return this.f32517b;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.m
    public final boolean c() {
        return this.f32518c;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.m
    public final <T> T a(Class<T> cls) {
        l.c(cls, "");
        l.c(cls, "");
        return (T) a().a(cls);
    }

    public a(Context context, boolean z) {
        this.f32517b = context;
        this.f32518c = z;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.m
    public final <T> void a(Class<T> cls, T t) {
        l.c(cls, "");
        l.c(cls, "");
        a().a(cls, t);
    }
}
