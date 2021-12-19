package com.bytedance.tux.extension.player;

import com.bytedance.covode.number.Covode;

public enum d {
    PLAYER_BUFFERING,
    PLAYER_IDLE,
    PLAYER_PREPARE,
    PLAYER_START,
    PLAYER_PAUSE;

    static {
        Covode.recordClassIndex(27441);
    }
}
