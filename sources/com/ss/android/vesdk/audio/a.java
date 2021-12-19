package com.ss.android.vesdk.audio;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.m;

public interface a {
    static {
        Covode.recordClassIndex(99289);
    }

    int init(m mVar);

    void release(PrivacyCert privacyCert);

    int start(PrivacyCert privacyCert);

    int stop(PrivacyCert privacyCert);
}
