package com.android.installreferrer.api;

import com.bytedance.covode.number.Covode;

public interface InstallReferrerStateListener {
    static {
        Covode.recordClassIndex(2473);
    }

    void onInstallReferrerServiceDisconnected();

    void onInstallReferrerSetupFinished(int i2);
}
