package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;
import java.io.Closeable;

public interface c extends Closeable {
    static {
        Covode.recordClassIndex(30968);
    }

    long a(k kVar);

    g a(k kVar, h hVar);

    Iterable<k> a();

    void a(k kVar, long j2);

    void a(Iterable<g> iterable);

    int b();

    void b(Iterable<g> iterable);

    boolean b(k kVar);

    Iterable<g> c(k kVar);
}
