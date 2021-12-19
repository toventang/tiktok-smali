package org.webrtc;

import com.bytedance.covode.number.Covode;

interface MediaCodecWrapperFactory {
    static {
        Covode.recordClassIndex(106623);
    }

    MediaCodecWrapper createByCodecName(String str);
}
