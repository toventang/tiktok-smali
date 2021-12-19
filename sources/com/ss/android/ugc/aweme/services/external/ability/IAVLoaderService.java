package com.ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;

public interface IAVLoaderService {

    public interface ILoaderCallback<T> {
        static {
            Covode.recordClassIndex(79658);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79657);
    }

    void setLoader(ILoaderCallback<Boolean> iLoaderCallback);

    void setLoaderOnly();
}
