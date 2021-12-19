package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;

public interface NestedState<SUB extends af> extends af {
    static {
        Covode.recordClassIndex(24154);
    }

    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
