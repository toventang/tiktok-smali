package com.ss.android.ugc.aweme.tools.live.sticker;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.favorite.d;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import h.f.b.l;

public final class b extends d {
    static {
        Covode.recordClassIndex(91626);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b, com.ss.android.ugc.aweme.sticker.favorite.d
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (aVar.f135382e == null) {
            return true;
        }
        Bundle bundle = aVar.f135382e;
        if (bundle == null) {
            l.b();
        }
        if (!bundle.getBoolean("is_video_used_sticker")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.d dVar, o oVar, h hVar, com.ss.android.ugc.aweme.sticker.favorite.b bVar, StickerPreferences stickerPreferences, h.f.a.a<j> aVar) {
        super(dVar, bVar, oVar, hVar, stickerPreferences, aVar);
        l.d(dVar, "");
        l.d(oVar, "");
        l.d(hVar, "");
        l.d(bVar, "");
        l.d(stickerPreferences, "");
        l.d(aVar, "");
    }
}
