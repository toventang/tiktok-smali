package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public enum ag {
    Unknown,
    Tap,
    Pan,
    Rotate,
    Scale,
    LongPress;

    static {
        Covode.recordClassIndex(99266);
    }
}
