package com.ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import h.f.a.a;
import h.h;
import h.i;

public final class KeyboardModel extends ac {
    private final h keyboardStatus$delegate = i.a((a) KeyboardModel$keyboardStatus$2.INSTANCE);

    static {
        Covode.recordClassIndex(50907);
    }

    public final c<Integer> getKeyboardStatus() {
        return (c) this.keyboardStatus$delegate.getValue();
    }
}
