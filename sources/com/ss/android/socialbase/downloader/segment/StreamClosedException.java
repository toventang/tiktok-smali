package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;

public class StreamClosedException extends BaseException {
    static {
        Covode.recordClassIndex(37554);
    }

    public StreamClosedException(String str) {
        super(1068, str);
    }
}
