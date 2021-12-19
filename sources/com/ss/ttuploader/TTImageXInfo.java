package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public class TTImageXInfo {
    public long mErrcode;
    public int mFileIndex = -1;
    public String mMediaInfo;
    public long mProgress;
    public String mStoreUri;

    static {
        Covode.recordClassIndex(101390);
    }

    public TTImageXInfo(String str, long j2, int i2, String str2) {
        this.mStoreUri = str;
        this.mProgress = j2;
        this.mErrcode = j2;
        this.mFileIndex = i2;
        this.mMediaInfo = str2;
    }
}
