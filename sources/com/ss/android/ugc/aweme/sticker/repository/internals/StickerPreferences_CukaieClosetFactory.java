package com.ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class StickerPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(88561);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "av_settings.xml";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new StickerPreferences_CukaieClosetAdapter(eVar);
    }
}
