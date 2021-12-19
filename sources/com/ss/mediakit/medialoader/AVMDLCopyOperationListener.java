package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public interface AVMDLCopyOperationListener {
    static {
        Covode.recordClassIndex(101113);
    }

    void onCopyComplete(boolean z, int i2, String str);
}
