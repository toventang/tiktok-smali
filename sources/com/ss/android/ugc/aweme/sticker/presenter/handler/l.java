package com.ss.android.ugc.aweme.sticker.presenter.handler;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.guide.i;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public final i f135401a;

    static {
        Covode.recordClassIndex(88449);
    }

    public l(i iVar) {
        h.f.b.l.d(iVar, "");
        this.f135401a = iVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final b a(c cVar, m.a aVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        b a2 = aVar.a(cVar);
        if (cVar instanceof a) {
            this.f135401a.a(((a) cVar).f135378a);
        }
        return a2;
    }
}
