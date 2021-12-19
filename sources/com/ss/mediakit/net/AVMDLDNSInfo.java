package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;

public class AVMDLDNSInfo {
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String[] mHosts;
    public String mId;
    public String mIpList;
    public int mType;

    static {
        Covode.recordClassIndex(101131);
    }

    public AVMDLDNSInfo(int i2, String str, String str2, long j2, String str3) {
        this.mType = i2;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j2;
        this.mId = str3;
    }

    public AVMDLDNSInfo(int i2, String[] strArr, String str, long j2, String str2) {
        this.mType = i2;
        this.mHosts = strArr;
        this.mIpList = str;
        this.mExpiredTime = j2;
        this.mId = str2;
    }

    public AVMDLDNSInfo(int i2, String str, String str2, long j2, String str3, String str4) {
        this.mType = i2;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j2;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
