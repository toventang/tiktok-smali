package com.bytedance.ies.bullet.service.f.a.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.c.i;
import com.bytedance.ies.bullet.service.f.a.e;
import h.f.b.l;

public final class b extends i<b, e> {

    /* renamed from: a  reason: collision with root package name */
    public final e f32684a = new e();

    static {
        Covode.recordClassIndex(19437);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.p
    public final /* bridge */ /* synthetic */ q a() {
        return this.f32684a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Uri.Builder builder) {
        super(builder);
        l.c(builder, "");
    }

    public final b a(Uri uri) {
        l.c(uri, "");
        this.f32684a.f32757a.a(uri);
        return this;
    }

    public final b a(com.bytedance.ies.bullet.service.f.a.b.b bVar) {
        l.c(bVar, "");
        this.f32684a.f32758b.a(bVar.name());
        return this;
    }
}
