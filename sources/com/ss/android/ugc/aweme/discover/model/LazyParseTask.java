package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.c;
import java.util.concurrent.Callable;

public interface LazyParseTask<T extends c> {
    static {
        Covode.recordClassIndex(50911);
    }

    Callable<T> getLazyParseCallable();

    void setLazyParseCallable(Callable<T> callable);
}
