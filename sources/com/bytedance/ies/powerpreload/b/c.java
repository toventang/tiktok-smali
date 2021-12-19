package com.bytedance.ies.powerpreload.b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

public interface c<T, R> extends d {
    static {
        Covode.recordClassIndex(20629);
    }

    i getPreloadStrategy(Bundle bundle);

    boolean handleException(Exception exc);

    R preload(Bundle bundle, b<? super Class<T>, ? extends T> bVar);
}
