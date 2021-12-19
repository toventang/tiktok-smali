package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public interface AVMDLDataLoaderListener {
    static {
        Covode.recordClassIndex(101118);
    }

    String getCheckSumInfo(String str);

    long getInt64Value(int i2, long j2);

    String getStringValue(int i2, long j2, String str);

    void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo);
}
