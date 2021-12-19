package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.c.a.c;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;

public final class d implements a, com.ss.android.ugc.gamora.recorder.sticker.c.d {

    /* renamed from: a  reason: collision with root package name */
    private final f f148347a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.l.a f148348b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<c.a> f148349c;

    static {
        Covode.recordClassIndex(97763);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148347a;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.d
    public final com.ss.android.ugc.gamora.recorder.sticker.c.c a(j jVar) {
        l.d(jVar, "");
        return new c(this.f148349c, (androidx.appcompat.app.d) getDiContainer().a(androidx.appcompat.app.d.class, (String) null), jVar, (ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null), this.f148348b);
    }

    public d(f fVar, com.ss.android.ugc.aweme.shortvideo.l.a aVar, h.f.a.a<c.a> aVar2) {
        l.d(fVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f148347a = fVar;
        this.f148348b = aVar;
        this.f148349c = aVar2;
    }
}
