package com.ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

public interface IVideoExposureDataConvertor {
    static {
        Covode.recordClassIndex(79852);
    }

    VideoExposureData converToExposureData(Object obj);
}
