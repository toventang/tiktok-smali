package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public class BDImageInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public String mErrorMsg;
    public int mFileIndex = -1;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    static {
        Covode.recordClassIndex(100637);
    }

    public BDImageInfo(String str, long j2, String str2, int i2, String str3, String str4) {
        this.mImageTosKey = str;
        this.mProgress = j2;
        this.mErrorCode = j2;
        this.mErrorMsg = str2;
        this.mFileIndex = i2;
        this.mMetaInfo = str3;
        this.mEncryptionMeta = str4;
    }
}
