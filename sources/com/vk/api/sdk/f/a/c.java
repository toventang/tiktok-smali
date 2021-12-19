package com.vk.api.sdk.f.a;

import com.bytedance.covode.number.Covode;
import h.h;

public interface c {

    public enum a {
        VERBOSE,
        DEBUG,
        WARNING,
        ERROR,
        NONE;

        static {
            Covode.recordClassIndex(103811);
        }
    }

    static {
        Covode.recordClassIndex(103810);
    }

    h<a> a();

    void a(a aVar);
}
