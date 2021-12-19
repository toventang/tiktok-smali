package com.ss.android.ugc.aweme.sticker.types.lock;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface a {
    static {
        Covode.recordClassIndex(88917);
    }

    boolean isLockStickerEnable();

    boolean reallyLockedSticker(Effect effect);
}
