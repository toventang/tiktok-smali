package com.bytedance.sdk.xbridge.registry.core.model.idl;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

public interface CompletionBlock<S extends XBaseResultModel> {
    static {
        Covode.recordClassIndex(26911);
    }

    void onFailure(int i2, String str, S s);

    void onRawSuccess(S s);

    void onSuccess(S s, String str);
}
