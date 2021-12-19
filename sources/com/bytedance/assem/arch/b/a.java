package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;

public enum a {
    Default,
    HostAttach,
    HostDetach,
    HostResume,
    HostStop,
    HostBind;

    static {
        Covode.recordClassIndex(14773);
    }
}
