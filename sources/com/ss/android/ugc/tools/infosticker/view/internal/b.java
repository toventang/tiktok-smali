package com.ss.android.ugc.tools.infosticker.view.internal;

import com.bytedance.covode.number.Covode;
import f.a.t;

public interface b {

    public enum a {
        DRAGGING,
        CLOSE;

        static {
            Covode.recordClassIndex(98462);
        }
    }

    static {
        Covode.recordClassIndex(98461);
    }

    t<a> a();

    void a(boolean z);
}
