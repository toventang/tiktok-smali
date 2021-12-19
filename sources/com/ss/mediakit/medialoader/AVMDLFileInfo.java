package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

public class AVMDLFileInfo {
    public long mCacheSize = -1;
    public long mContentLenght = -1;
    public String mFilePath;

    static {
        Covode.recordClassIndex(101120);
    }

    AVMDLFileInfo() {
    }
}
