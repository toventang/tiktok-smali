package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;

public class FileUtils {
    static {
        Covode.recordClassIndex(103004);
    }

    public static native int setPermissions(String str, int i2, int i3, int i4);
}
