package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;

public enum n {
    UNKNOWN,
    NORMAL_GIFT,
    TASK_GIFT,
    STICKER_GIFT,
    MIDDLE_GIFT,
    SPECIAL_GIFT,
    FREE_CELL,
    GOLDEN_BEAN_CELL,
    GAME;

    static {
        Covode.recordClassIndex(9971);
    }
}
