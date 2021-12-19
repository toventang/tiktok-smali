package com.ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.a;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    private Effect f135395a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Boolean> f135396b;

    /* renamed from: c  reason: collision with root package name */
    private final b<Effect, z> f135397c;

    /* renamed from: d  reason: collision with root package name */
    private final a<z> f135398d;

    /* renamed from: e  reason: collision with root package name */
    private final a<z> f135399e;

    static {
        Covode.recordClassIndex(88447);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135398d.invoke();
        this.f135395a = null;
    }

    public final void b() {
        if (g.s(this.f135395a)) {
            this.f135398d.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return g.s(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f135399e.invoke();
        if (this.f135395a != null) {
            this.f135398d.invoke();
        }
        if (this.f135396b.invoke().booleanValue()) {
            this.f135397c.invoke(aVar.f135378a);
        }
        this.f135395a = aVar.f135378a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(a<Boolean> aVar, b<? super Effect, z> bVar, a<z> aVar2, a<z> aVar3) {
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f135396b = aVar;
        this.f135397c = bVar;
        this.f135398d = aVar2;
        this.f135399e = aVar3;
    }
}
