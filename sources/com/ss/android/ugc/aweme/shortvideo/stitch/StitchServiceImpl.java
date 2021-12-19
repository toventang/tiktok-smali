package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.stitch.IStitchService;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class StitchServiceImpl implements IStitchService {
    static {
        Covode.recordClassIndex(85718);
    }

    @Override // com.ss.android.ugc.aweme.services.stitch.IStitchService
    public final boolean canUseEffectInStitch(Effect effect) {
        if (effect == null) {
            return false;
        }
        IStickerUtilsService stickerInfo = AVExternalServiceImpl.a().infoService().stickerInfo();
        if (g.a("voice_recognization", effect) || c.d(effect) || c.e(effect) || g.f(effect) || c.g(effect) || g.i(effect) || c.f(effect) || (stickerInfo.isLockSticker(effect) && !stickerInfo.hasUnlocked(effect))) {
            return false;
        }
        return true;
    }
}
