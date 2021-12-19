package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;

public enum d {
    Loading,
    Loaded,
    Error,
    End;

    static {
        Covode.recordClassIndex(20535);
    }
}
