package com.ss.android.socialbase.downloader.exception;

import com.a;
import com.bytedance.covode.number.Covode;

public class DownloadOutOfSpaceException extends BaseException {
    private final long avaliableSpaceBytes;
    private final long requiredSpaceBytes;

    static {
        Covode.recordClassIndex(37381);
    }

    public long getAvaliableSpaceBytes() {
        return this.avaliableSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    public DownloadOutOfSpaceException(long j2, long j3) {
        super(1006, a.a("space is not enough required space is : %s but available space is :%s", new Object[]{String.valueOf(j3), String.valueOf(j2)}));
        this.avaliableSpaceBytes = j2;
        this.requiredSpaceBytes = j3;
    }
}
