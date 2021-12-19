package com.ss.android.ugc.gamora.recorder.sticker.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import h.f.b.l;

public final class a implements r.b {

    /* renamed from: a  reason: collision with root package name */
    private final f f148318a;

    static {
        Covode.recordClassIndex(97749);
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f148318a = fVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r.b
    public final void a(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.h.a aVar = (com.ss.android.ugc.aweme.shortvideo.h.a) this.f148318a.b(com.ss.android.ugc.aweme.shortvideo.h.a.class, null);
        if (aVar != null) {
            aVar.a(z);
            if (!aVar.f()) {
                aVar.a(!z, false);
            }
        }
    }
}
