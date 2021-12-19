package com.bytedance.ies.xelement.defaultimpl.player.engine.api.a;

import com.bytedance.covode.number.Covode;

public enum o {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    static {
        Covode.recordClassIndex(22214);
    }

    public final boolean isPlayingState() {
        int i2 = p.f36961a[ordinal()];
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }
}
