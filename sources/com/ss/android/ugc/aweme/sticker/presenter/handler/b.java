package com.ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.n;

public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private Effect f135370a;

    static {
        Covode.recordClassIndex(88431);
    }

    public abstract void a();

    public abstract void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, a aVar);

    public abstract boolean a(a aVar);

    /* access modifiers changed from: protected */
    public void b(a aVar) {
        l.d(aVar, "");
    }

    private final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(m.a aVar, c cVar) {
        if (this.f135370a != null) {
            a();
            this.f135370a = null;
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(cVar);
        if (!(aVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.a.a.b)) {
            l.d(a2, "");
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        if (cVar instanceof a) {
            a aVar2 = (a) cVar;
            if (!a(aVar2)) {
                return a(aVar, cVar);
            }
            if (!(aVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.a.a.b)) {
                b(aVar2);
            }
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(aVar2);
            a(a2, aVar2);
            this.f135370a = aVar2.f135378a;
            return a2;
        } else if (cVar instanceof d) {
            return a(aVar, cVar);
        } else {
            throw new n();
        }
    }
}
