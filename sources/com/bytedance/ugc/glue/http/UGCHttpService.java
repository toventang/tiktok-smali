package com.bytedance.ugc.glue.http;

import com.bytedance.covode.number.Covode;

public class UGCHttpService {
    private static UGCHttpService instance = new UGCHttpService();

    protected UGCHttpService() {
    }

    private static UGCHttpService getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27950);
    }

    static <T> void send(UGCRequest<T> uGCRequest) {
        getInstance().sendImpl(uGCRequest);
    }

    /* access modifiers changed from: protected */
    public <T> void sendImpl(UGCRequest<T> uGCRequest) {
        UGCCallback<T> callback = uGCRequest.getCallback();
        if (callback != null) {
            callback.onResponse(0, null);
        }
    }
}
