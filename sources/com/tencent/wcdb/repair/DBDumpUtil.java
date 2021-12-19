package com.tencent.wcdb.repair;

import com.bytedance.covode.number.Covode;

public class DBDumpUtil {
    static {
        Covode.recordClassIndex(103075);
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);
}
