package com.ss.android.ugc.asve.b;

import com.bytedance.covode.number.Covode;

public enum f {
    AS_OPTION_FLAG_PICTURE_SIZE((byte) 1),
    AS_OPTION_FLAG_FPS_RANGE((byte) 2),
    AS_OPTION_FLAG_MTK_3DNR((byte) 4),
    AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED((byte) 8);
    
    private final byte option;

    public final byte getOption() {
        return this.option;
    }

    static {
        Covode.recordClassIndex(38077);
    }

    private f(byte b2) {
        this.option = b2;
    }
}
