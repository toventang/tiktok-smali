package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface s extends ExecutorService {
    static {
        Covode.recordClassIndex(33661);
    }

    <T> q<T> a(Callable<T> callable);
}
