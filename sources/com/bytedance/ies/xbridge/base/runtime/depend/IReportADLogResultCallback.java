package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.c.b;

public interface IReportADLogResultCallback {

    public static final class a {
        static {
            Covode.recordClassIndex(21435);
        }
    }

    static {
        Covode.recordClassIndex(21434);
    }

    void onFailure(int i2, String str);

    void onSuccess(b bVar, String str);
}
