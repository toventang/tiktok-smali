package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

class WCDBInitializationProbe {
    static boolean libLoaded;

    static {
        Covode.recordClassIndex(103047);
    }

    private WCDBInitializationProbe() {
    }
}
