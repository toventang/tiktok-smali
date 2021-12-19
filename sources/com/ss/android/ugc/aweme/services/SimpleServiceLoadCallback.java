package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IExternalService;

public abstract class SimpleServiceLoadCallback implements IExternalService.ServiceLoadCallback {
    static {
        Covode.recordClassIndex(79564);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public void onOK() {
        onFailed();
    }
}
