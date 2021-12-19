package com.ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.types.lock.b;
import com.ss.android.ugc.aweme.sticker.types.lock.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;

public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    static {
        Covode.recordClassIndex(79806);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isLockSticker(Effect effect) {
        return c.b(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean hasUnlocked(Effect effect) {
        l.d(effect, "");
        return b.a(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isScanUnLockType(String str) {
        l.d(str, "");
        if (b.a(str) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isStickerPreviewable(Effect effect) {
        l.d(effect, "");
        return g.p(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean idUnlocked(String str) {
        l.d(str, "");
        l.d(str, "");
        ArrayList<String> a2 = e.a();
        if (a2.isEmpty()) {
            return false;
        }
        return a2.contains(str);
    }
}
