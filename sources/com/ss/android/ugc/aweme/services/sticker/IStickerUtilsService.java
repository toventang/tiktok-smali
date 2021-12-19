package com.ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IStickerUtilsService {
    static {
        Covode.recordClassIndex(79804);
    }

    boolean hasUnlocked(Effect effect);

    boolean idUnlocked(String str);

    boolean isLockSticker(Effect effect);

    boolean isScanUnLockType(String str);

    boolean isStickerPreviewable(Effect effect);
}
