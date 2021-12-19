package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class bl {
    static {
        Covode.recordClassIndex(86138);
    }

    public static final boolean a(TimeSpeedModelExtension timeSpeedModelExtension) {
        l.d(timeSpeedModelExtension, "");
        if (timeSpeedModelExtension.getStickerInfo() == null || !timeSpeedModelExtension.getStickerInfo().isMusicBeatSticker()) {
            return false;
        }
        return true;
    }
}
