package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.e;

public interface IChooseMediaResultCallback {
    static {
        Covode.recordClassIndex(21411);
    }

    void onFailure(int i2, String str);

    void onSuccess(e eVar, String str);
}
