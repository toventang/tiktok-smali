package com.bytedance.router.listener;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OpenResultCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RouteCallbackProxy implements OpenResultCallback {
    List<OpenResultCallback> mCallbackList = new ArrayList();
    private boolean mIsMulti = false;
    WeakReference<OpenResultCallback> mTempCallback = null;

    static {
        Covode.recordClassIndex(26184);
    }

    public void onSuccess() {
        onSuccess(null);
    }

    private OpenResultCallback getTempCallback() {
        WeakReference<OpenResultCallback> weakReference = this.mTempCallback;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onEmpty();
        }
        if (getTempCallback() != null) {
            getTempCallback().onEmpty();
        }
        this.mTempCallback = null;
        this.mIsMulti = false;
    }

    public void setMultiTempCallback(OpenResultCallback openResultCallback) {
        setTempCallback(openResultCallback, true);
    }

    public void setTempCallback(OpenResultCallback openResultCallback) {
        setTempCallback(openResultCallback, false);
    }

    public void addCallback(OpenResultCallback openResultCallback) {
        if (openResultCallback != null) {
            this.mCallbackList.add(openResultCallback);
        }
    }

    public void removeCallback(OpenResultCallback openResultCallback) {
        if (openResultCallback != null) {
            this.mCallbackList.remove(openResultCallback);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onActionResult(obj);
        }
        if (getTempCallback() != null) {
            getTempCallback().onActionResult(obj);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onIntercept(str);
        }
        if (getTempCallback() != null) {
            getTempCallback().onIntercept(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onMatched(str);
        }
        if (getTempCallback() != null) {
            getTempCallback().onMatched(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onMissed(str);
        }
        if (getTempCallback() != null) {
            getTempCallback().onMissed(str);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onOpen(Intent intent) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onOpen(intent);
        }
        if (getTempCallback() != null) {
            getTempCallback().onOpen(intent);
        }
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onSuccess(intent);
        }
        if (getTempCallback() != null) {
            getTempCallback().onSuccess(intent);
        }
        this.mTempCallback = null;
    }

    private void setTempCallback(OpenResultCallback openResultCallback, boolean z) {
        if (openResultCallback != null) {
            this.mTempCallback = new WeakReference<>(openResultCallback);
        }
        this.mIsMulti = z;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
        for (OpenResultCallback openResultCallback : this.mCallbackList) {
            openResultCallback.onFail(str, str2);
        }
        if (getTempCallback() != null) {
            getTempCallback().onFail(str, str2);
        }
        if (!this.mIsMulti) {
            this.mTempCallback = null;
            this.mIsMulti = false;
        }
    }
}
