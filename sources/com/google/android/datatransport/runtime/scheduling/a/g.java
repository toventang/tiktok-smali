package com.google.android.datatransport.runtime.scheduling.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.h;
import com.google.android.datatransport.runtime.k;

public abstract class g {
    static {
        Covode.recordClassIndex(30973);
    }

    public abstract long a();

    public abstract k b();

    public abstract h c();

    public static g a(long j2, k kVar, h hVar) {
        return new b(j2, kVar, hVar);
    }
}
