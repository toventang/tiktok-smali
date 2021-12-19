package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.vesdk.VERecordData;
import h.f.b.l;

public final class ab {
    static {
        Covode.recordClassIndex(86569);
    }

    public static final void a(VERecordData vERecordData) {
        l.d(vERecordData, "");
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f150790b) {
            String str = vERecordSegmentData.f150795b;
            if (str == null || str.length() == 0) {
                String str2 = dj.f126462e + System.currentTimeMillis();
                l.b(vERecordSegmentData, "");
                TEVideoUtils.generateMuteWav(str2, 44100, 2, ((int) (vERecordSegmentData.f150805l - vERecordSegmentData.f150804k)) / 1000);
                vERecordSegmentData.f150795b = str2;
            }
        }
    }
}
