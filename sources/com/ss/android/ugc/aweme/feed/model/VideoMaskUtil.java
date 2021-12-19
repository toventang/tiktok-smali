package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class VideoMaskUtil {
    public static final VideoMaskUtil INSTANCE = new VideoMaskUtil();

    private VideoMaskUtil() {
    }

    static {
        Covode.recordClassIndex(59472);
    }

    public final VideoMaskInfo getMaskInfo(List<VideoMaskInfo> list, int i2) {
        l.d(list, "");
        for (VideoMaskInfo videoMaskInfo : list) {
            Integer maskType = videoMaskInfo.getMaskType();
            if (maskType != null && maskType.intValue() == i2) {
                return videoMaskInfo;
            }
        }
        return new VideoMaskInfo(null, null, null, null, null, null, 63, null);
    }
}
