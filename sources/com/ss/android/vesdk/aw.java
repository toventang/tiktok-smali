package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public enum aw {
    DEFAULT,
    DUET,
    REACTION,
    CUSTOM_VIDEO_BG,
    DUET_KARAOKE,
    KARAOKE,
    KARAOKE_PURE_AUDIO,
    CUSTOM_VIDEO_BG_GIF,
    AUDIO;

    static {
        Covode.recordClassIndex(99305);
    }
}
