package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.n.t;
import java.util.Map;

public abstract class c<FETCH_STATE extends t> implements ag<FETCH_STATE> {
    static {
        Covode.recordClassIndex(29149);
    }

    @Override // com.facebook.imagepipeline.n.ag
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i2) {
        return null;
    }

    @Override // com.facebook.imagepipeline.n.ag
    public void onFetchCompletion(FETCH_STATE fetch_state, int i2) {
    }

    @Override // com.facebook.imagepipeline.n.ag
    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
