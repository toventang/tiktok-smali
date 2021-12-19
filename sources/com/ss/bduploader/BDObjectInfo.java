package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public class BDObjectInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public int mFileIndex = -1;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    static {
        Covode.recordClassIndex(100654);
    }

    public BDObjectInfo(String str, long j2, int i2, String str2, String str3) {
        this.mImageTosKey = str;
        this.mProgress = j2;
        this.mErrorCode = j2;
        this.mFileIndex = i2;
        this.mMetaInfo = str2;
        this.mEncryptionMeta = str3;
    }
}
