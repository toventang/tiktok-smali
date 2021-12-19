package com.ss.android.ugc.gamora.recorder.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.repository.d.a.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f148475a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(97874);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
    public final boolean a(String str, Effect effect) {
        l.d(str, "");
        l.d(effect, "");
        if (effect.isBusiness() || c.h(effect) || c.a(effect.getExtra(), "prop_block_story")) {
            return true;
        }
        return false;
    }
}
