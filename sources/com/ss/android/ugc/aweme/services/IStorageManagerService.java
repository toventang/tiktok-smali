package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public interface IStorageManagerService {
    static {
        Covode.recordClassIndex(79480);
    }

    void launchDiskManagerActivity();
}
