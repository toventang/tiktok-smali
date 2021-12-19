package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;

public interface IEditVideoInfoService {
    static {
        Covode.recordClassIndex(79604);
    }

    VideoInfoData getVideoInfoData(String str);

    Long getVideoLength(String str);

    void setVideoInfoData(String str, VideoInfoData videoInfoData);

    void setVideoLength(String str, long j2);
}
