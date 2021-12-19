package com.ss.android.ugc.aweme.sticker.presenter.handler.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.a.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import h.f.b.l;
import h.n;

public final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private final c f135367a;

    static {
        Covode.recordClassIndex(88428);
    }

    public b(c cVar) {
        l.d(cVar, "");
        this.f135367a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        int i2 = -1;
        if (cVar instanceof a) {
            a aVar2 = (a) cVar;
            if (!aVar2.f135381d) {
                i2 = aVar2.f135378a.getEffectType() == 0 ? this.f135367a.a(aVar2.f135378a, false) : aVar2.f135378a.getEffectType() == -1 ? this.f135367a.a(aVar2.f135378a, false) : 0;
            }
        } else if (!(cVar instanceof d)) {
            throw new n();
        } else if (!((d) cVar).f135387d) {
            i2 = this.f135367a.a();
        }
        return new com.ss.android.ugc.aweme.sticker.presenter.handler.c.b(i2);
    }
}
