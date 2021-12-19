package com.ss.android.ugc.aweme.dsp.playerservice.c;

import com.bytedance.covode.number.Covode;

public enum f {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    static {
        Covode.recordClassIndex(52051);
    }

    public final boolean isPauseState() {
        if (this == PLAYBACK_STATE_PAUSED) {
            return true;
        }
        return false;
    }

    public final boolean isPlayingState() {
        if (this == PLAYBACK_STATE_PLAYING) {
            return true;
        }
        return false;
    }

    public final boolean isStartState() {
        if (this == PLAYBACK_STATE_START) {
            return true;
        }
        return false;
    }

    public final boolean isStopState() {
        if (this == PLAYBACK_STATE_STOPPED) {
            return true;
        }
        return false;
    }

    public final boolean isUnPlayingState() {
        if (this == PLAYBACK_STATE_STOPPED || this == PLAYBACK_STATE_PAUSED) {
            return true;
        }
        return false;
    }

    public final boolean startPlaying() {
        if (this == PLAYBACK_STATE_PLAYING || this == PLAYBACK_STATE_START) {
            return true;
        }
        return false;
    }

    public final boolean isPlayingOrPause() {
        if (this == PLAYBACK_STATE_START || this == PLAYBACK_STATE_PLAYING || this == PLAYBACK_STATE_PAUSED) {
            return true;
        }
        return false;
    }
}
