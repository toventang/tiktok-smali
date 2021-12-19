package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IBufferInfo {
    static {
        Covode.recordClassIndex(28013);
    }

    long getFileAvailSize();

    long getHeadSize();

    float getPlayerAvailDuration();

    String getStreamId();
}
