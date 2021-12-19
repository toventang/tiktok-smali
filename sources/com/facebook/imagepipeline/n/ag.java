package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.t;
import java.io.InputStream;
import java.util.Map;

public interface ag<FETCH_STATE extends t> {

    public interface a {
        static {
            Covode.recordClassIndex(29094);
        }

        void a();

        void a(InputStream inputStream, int i2);

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(29093);
    }

    FETCH_STATE createFetchState(k<e> kVar, al alVar);

    void fetch(FETCH_STATE fetch_state, a aVar);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i2);

    void onFetchCompletion(FETCH_STATE fetch_state, int i2);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
