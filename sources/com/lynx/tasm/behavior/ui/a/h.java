package com.lynx.tasm.behavior.ui.a;

import com.bytedance.covode.number.Covode;

public enum h {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    static {
        Covode.recordClassIndex(35057);
    }

    public static h valueOf(int i2) {
        if (i2 == 0) {
            return REPEAT;
        }
        if (i2 == 1) {
            return NO_REPEAT;
        }
        if (i2 == 2) {
            return REPEAT_X;
        }
        if (i2 == 3) {
            return REPEAT_Y;
        }
        if (i2 == 4) {
            return ROUND;
        }
        if (i2 != 5) {
            return REPEAT;
        }
        return SPACE;
    }
}
