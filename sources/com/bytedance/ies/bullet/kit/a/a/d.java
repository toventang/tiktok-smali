package com.bytedance.ies.bullet.kit.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f32184a;

    /* renamed from: b  reason: collision with root package name */
    public int f32185b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32186c;

    /* renamed from: d  reason: collision with root package name */
    public int f32187d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32188e;

    /* renamed from: f  reason: collision with root package name */
    public int f32189f;

    static {
        Covode.recordClassIndex(18875);
    }

    private /* synthetic */ d() {
        this("");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.j
    public final String toString() {
        return super.toString() + "\n [fallbackDomains=" + this.f32184a + ",shuffle = " + this.f32185b + ",cdnNoCache=" + this.f32186c + "，maxAttempt=" + this.f32187d + "，isRemote=" + this.f32188e + ",useInteraction = " + this.f32189f + ']';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        l.c(str, "");
        this.f32184a = new ArrayList();
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.j
    public final j a(j jVar) {
        l.c(jVar, "");
        if (jVar instanceof d) {
            d dVar = (d) jVar;
            this.f32184a = dVar.f32184a;
            this.f32185b = dVar.f32185b;
            this.f32186c = dVar.f32186c;
            this.f32187d = dVar.f32187d;
            this.f32189f = dVar.f32189f;
        }
        return super.a(jVar);
    }
}
