package com.ss.android.ugc.aweme.web;

import android.os.ResultReceiver;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.web.IJsCallback;

public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f144854a;

    /* renamed from: b  reason: collision with root package name */
    private m f144855b;

    static {
        Covode.recordClassIndex(94718);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.web.BaseLifeCycleObserver
    public void onDestroy(m mVar) {
        super.onDestroy(mVar);
        this.f144854a = null;
        this.f144855b.getLifecycle().b(this);
    }
}
