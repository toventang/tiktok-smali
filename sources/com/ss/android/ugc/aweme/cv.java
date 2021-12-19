package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;

public interface cv {
    static {
        Covode.recordClassIndex(49105);
    }

    void onUpdateFailed(String str);

    void onUpdateSuccess(boolean z);
}
