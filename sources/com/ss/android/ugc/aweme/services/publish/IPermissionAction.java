package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;

public interface IPermissionAction {
    static {
        Covode.recordClassIndex(79776);
    }

    void cancel();

    void confirm();
}
