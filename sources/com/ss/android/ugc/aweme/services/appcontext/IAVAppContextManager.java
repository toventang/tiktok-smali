package com.ss.android.ugc.aweme.services.appcontext;

import com.bytedance.covode.number.Covode;

public interface IAVAppContextManager {
    static {
        Covode.recordClassIndex(79581);
    }

    long getUpdateVersionCode();

    long getVersionCode();
}
