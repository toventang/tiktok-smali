package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;

public enum c {
    RECORD_VIDEO_SOUND(1),
    UPLOAD_VIDEO_SOUND(2),
    EDIT_RECORD_SOUND(4),
    VOLUME_NOT_MUTE(8),
    MUSIC(16),
    EDIT_AUDIO_EFFECT(32);
    
    private final int tag;

    public final int getTag() {
        return this.tag;
    }

    static {
        Covode.recordClassIndex(91518);
    }

    private c(int i2) {
        this.tag = i2;
    }
}
