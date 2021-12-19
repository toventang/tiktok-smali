package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ISegmentInfo {
    static {
        Covode.recordClassIndex(28016);
    }

    long getBitrate();

    int getEndIndex();

    String getFileId();

    List<? extends ISegmentItem> getItems();

    int getMediaType();

    int getStartIndex();

    int getTotalNum();
}
