package com.ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public interface IAVInitializer {
    static {
        Covode.recordClassIndex(79450);
    }

    void initMonitor(Application application);

    void initialize(Application application);
}
