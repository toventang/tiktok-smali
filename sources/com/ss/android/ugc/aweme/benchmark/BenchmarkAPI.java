package com.ss.android.ugc.aweme.benchmark;

import b.i;
import com.bytedance.covode.number.Covode;
import l.b.f;

public interface BenchmarkAPI {
    static {
        Covode.recordClassIndex(42241);
    }

    @f(a = "/aweme/v1/device/benchmark/")
    i<String> getBenchmarks();
}
