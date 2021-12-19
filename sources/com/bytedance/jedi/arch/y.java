package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;

public interface y<S extends af, VM extends JediViewModel<S>> {
    static {
        Covode.recordClassIndex(24356);
    }

    void binding(VM vm);
}
