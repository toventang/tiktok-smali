package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface ISegmentItem {
    static {
        Covode.recordClassIndex(28017);
    }

    long getDuration();

    int getIndex();

    long getOffset();

    long getSize();

    long getTimestamp();
}
