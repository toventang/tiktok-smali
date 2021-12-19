package com.lynx.tasm.behavior.shadow;

import android.view.View;
import com.bytedance.covode.number.Covode;

public enum e {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    static {
        Covode.recordClassIndex(34967);
    }

    public static e fromInt(int i2) {
        if (i2 == 0) {
            return UNDEFINED;
        }
        if (i2 == 1) {
            return EXACTLY;
        }
        if (i2 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown measureMode");
    }

    public static int fromMeasureSpec(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return AT_MOST.intValue();
        }
        if (mode == 0) {
            return UNDEFINED.intValue();
        }
        if (mode == 1073741824) {
            return EXACTLY.intValue();
        }
        throw new IllegalArgumentException("Unknown measureSpec");
    }

    private e(int i2) {
        this.mIntValue = i2;
    }
}
