package com.bytedance.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public abstract class AbsOpenResultCallback implements OpenResultCallback {
    static {
        Covode.recordClassIndex(26100);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onOpen(Intent intent) {
        OpenResultCallback$$CC.onOpen(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
    }
}
