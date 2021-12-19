package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.d;

public interface IHostMediaDepend {
    static {
        Covode.recordClassIndex(21416);
    }

    void handleJsInvoke(Context context, d dVar, IChooseMediaResultCallback iChooseMediaResultCallback);
}
