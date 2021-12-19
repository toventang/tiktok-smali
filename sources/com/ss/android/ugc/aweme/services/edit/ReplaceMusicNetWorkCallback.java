package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;

public interface ReplaceMusicNetWorkCallback {
    static {
        Covode.recordClassIndex(79607);
    }

    void onFail(int i2, ReplaceMusicRequest replaceMusicRequest);

    void onSuccess();
}
