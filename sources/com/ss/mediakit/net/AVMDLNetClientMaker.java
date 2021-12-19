package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;

public interface AVMDLNetClientMaker {
    static {
        Covode.recordClassIndex(101147);
    }

    AVMDLNetClient getNetClient();
}
