package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;

public class TTUploadDNSInfo {
    public Error mErr;
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String mId;
    public String mIpList;
    public int mType;

    static {
        Covode.recordClassIndex(101429);
    }

    public TTUploadDNSInfo(int i2, String str, String str2, long j2, String str3) {
        this.mType = i2;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j2;
        this.mId = str3;
    }

    public TTUploadDNSInfo(int i2, String str, String str2, long j2, String str3, String str4) {
        this.mType = i2;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j2;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
