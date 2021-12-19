package com.ss.android.ugc.aweme.dsp.playerservice.c;

import com.bytedance.covode.number.Covode;

public enum h {
    PLAY_CURRENT,
    PLAY_CLICKED_PLAYABLE,
    PLAY_UNEXPIRED_PLAYABLE,
    ALL_PLAYABLE_EXPIRED,
    PLAYABLE_LIMITED_UPSELL_RESSO,
    ERROR;

    static {
        Covode.recordClassIndex(52053);
    }
}
