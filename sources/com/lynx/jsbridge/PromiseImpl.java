package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;

public class PromiseImpl implements Promise {
    private Callback mReject;
    private Callback mResolve;

    static {
        Covode.recordClassIndex(34754);
    }

    @Override // com.lynx.jsbridge.Promise
    public void reject(String str) {
        reject("EUNSPECIFIED", str);
    }

    @Override // com.lynx.jsbridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
        }
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.lynx.jsbridge.Promise
    public void reject(String str, String str2) {
        if (this.mReject != null) {
            if (str == null) {
                str = "EUNSPECIFIED";
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("code", str);
            javaOnlyMap.putString("message", str2);
            this.mReject.invoke(javaOnlyMap);
        }
    }
}
