package com.ss.android.ugc.aweme.sticker.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f134969a;

    static {
        Covode.recordClassIndex(88241);
    }

    public n(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f134969a = shortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        if (cVar instanceof a) {
            a aVar2 = (a) cVar;
            String effectId = aVar2.f135378a.getEffectId();
            if (!(effectId == null || effectId.length() == 0)) {
                l.a("prop_try", ag.c(v.a("creation_id", this.f134969a.q), v.a("shoot_way", this.f134969a.r), v.a("content_source", this.f134969a.j().getContentSource()), v.a("content_type", this.f134969a.j().getContentType()), v.a("enter_from", "video_shoot_page"), v.a("prop_id", aVar2.f135378a.getEffectId())));
            }
        }
        return aVar.a(cVar);
    }
}
