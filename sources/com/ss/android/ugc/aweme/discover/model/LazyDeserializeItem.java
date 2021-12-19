package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

public interface LazyDeserializeItem {
    static {
        Covode.recordClassIndex(50910);
    }

    boolean getNeedToBeSupplied();

    void setNeedToBeSupplied(boolean z);
}
