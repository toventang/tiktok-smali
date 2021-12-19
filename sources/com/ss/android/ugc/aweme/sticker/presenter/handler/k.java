package com.ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    private final b<Effect, z> f135400a;

    static {
        Covode.recordClassIndex(88448);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(b<? super Effect, z> bVar) {
        l.d(bVar, "");
        this.f135400a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        if (cVar instanceof a) {
            a aVar2 = (a) cVar;
            if (aVar2.f135378a.getEffectType() == 2) {
                com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(a.a(aVar2.f135378a, aVar2.f135379b, aVar2.f135380c, aVar2.f135382e));
                this.f135400a.invoke(aVar2.f135378a);
                return a2;
            }
        }
        return aVar.a(cVar);
    }
}
