package com.benchmark.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(3019);
    }

    static MediaCodecInfo a(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            codecInfoAt.getName();
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
