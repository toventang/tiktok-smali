package com.ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import java.util.Set;

public interface IAVStorageService {
    static {
        Covode.recordClassIndex(79815);
    }

    void checkStorageClean();

    Set<String> getPrefixAllowList();

    boolean isMonitorEnabled();

    void setMonitorLocalSwitch(boolean z);
}
