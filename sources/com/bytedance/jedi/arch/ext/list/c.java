package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.a.m;
import h.z;
import java.util.List;

public interface c<T, RECEIVER> {
    static {
        Covode.recordClassIndex(24245);
    }

    b<RECEIVER, z> a();

    m<RECEIVER, Throwable, z> b();

    m<RECEIVER, List<? extends T>, z> c();
}
