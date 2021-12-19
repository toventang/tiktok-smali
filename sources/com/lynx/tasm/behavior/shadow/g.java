package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;

public class g {
    static {
        Covode.recordClassIndex(34969);
    }

    public static boolean a(float f2) {
        if (Float.compare(f2, 1.0E9f) >= 0 || Float.compare(f2, -1.0E9f) <= 0) {
            return true;
        }
        return false;
    }
}
