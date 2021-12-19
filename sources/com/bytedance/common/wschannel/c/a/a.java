package com.bytedance.common.wschannel.c.a;

import com.bytedance.covode.number.Covode;

public enum a {
    STATE_FOREGROUND,
    STATE_BACKGROUND,
    STATE_LIGHT_DOZE,
    STATE_DOZE;

    static {
        Covode.recordClassIndex(15953);
    }
}
