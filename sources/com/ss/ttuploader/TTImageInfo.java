package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public class TTImageInfo {
    public String mAlgorithm;
    public String mEncryptionImageTosKey;
    public long mErrcode;
    public String mExtra;
    public int mFileIndex = -1;
    public String mImageToskey;
    public String mImageUri;
    public String mMetaInfo;
    public String mObjectId;
    public String mPlainObjectId;
    public long mProgress;
    public String mSecretKey;
    public String mSourceMd5;
    public String mVersion;

    static {
        Covode.recordClassIndex(101386);
    }

    public TTImageInfo(String str, long j2, int i2, String str2) {
        this.mImageUri = str;
        this.mImageToskey = str;
        this.mProgress = j2;
        this.mErrcode = j2;
        this.mFileIndex = i2;
        this.mMetaInfo = str2;
    }

    public TTImageInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j2, int i2) {
        this.mObjectId = str;
        this.mEncryptionImageTosKey = str;
        this.mSecretKey = str2;
        this.mAlgorithm = str3;
        this.mVersion = str4;
        this.mImageUri = str5;
        this.mProgress = j2;
        this.mFileIndex = i2;
        this.mSourceMd5 = str6;
        this.mExtra = str7;
        this.mPlainObjectId = str8;
        this.mImageToskey = str8;
    }
}
