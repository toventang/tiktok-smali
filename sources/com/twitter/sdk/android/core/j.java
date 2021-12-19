package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.i;
import java.util.Map;

public interface j<T extends i> {
    static {
        Covode.recordClassIndex(103707);
    }

    T a();

    T a(long j2);

    void a(T t);

    Map<Long, T> b();

    void c();
}
