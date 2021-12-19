package com.ss.android.ugc.tools.infosticker.a.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.infosticker.a.b.k;
import com.ss.android.ugc.tools.utils.i;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final String f149451a;

    static {
        Covode.recordClassIndex(98404);
    }

    public b(String str) {
        l.d(str, "");
        this.f149451a = str;
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.k
    public final boolean b(InfoStickerEffect infoStickerEffect) {
        l.d(infoStickerEffect, "");
        return i.a(a(infoStickerEffect));
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.b.k
    public final String a(InfoStickerEffect infoStickerEffect) {
        l.d(infoStickerEffect, "");
        return com.ss.android.ugc.aweme.filter.repository.a.a.b.a(this.f149451a) + infoStickerEffect.getId() + ".gif";
    }
}
