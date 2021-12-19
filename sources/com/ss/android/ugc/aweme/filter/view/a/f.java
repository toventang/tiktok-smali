package com.ss.android.ugc.aweme.filter.view.a;

import com.bytedance.covode.number.Covode;
import f.a.t;
import h.z;

public interface f {

    public enum a {
        OK,
        LOADING,
        ERROR,
        EMPTY;

        static {
            Covode.recordClassIndex(60681);
        }
    }

    static {
        Covode.recordClassIndex(60680);
    }

    void a();

    void b();

    t<a> c();

    t<Boolean> d();

    t<z> e();
}
