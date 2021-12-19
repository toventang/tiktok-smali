package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;

class SegmentApplyException extends BaseException {
    private int applyCode;

    static {
        Covode.recordClassIndex(37553);
    }

    SegmentApplyException(int i2, String str) {
        super(1072, "applyCode=" + i2 + ", " + str);
        this.applyCode = i2;
    }
}
