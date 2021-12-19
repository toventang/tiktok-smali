package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IStream {
    static {
        Covode.recordClassIndex(28018);
    }

    int getBandwidth();

    String getCodec();

    int getSegmentDuration();

    String getStreamId();
}
