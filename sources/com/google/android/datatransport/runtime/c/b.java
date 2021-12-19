package com.google.android.datatransport.runtime.c;

import com.bytedance.covode.number.Covode;

public interface b {

    public interface a<T> {
        static {
            Covode.recordClassIndex(30931);
        }

        T a();
    }

    static {
        Covode.recordClassIndex(30930);
    }

    <T> T a(a<T> aVar);
}
