package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;

public interface j<S extends com.bytedance.assem.arch.viewModel.j, ITEM> {
    static {
        Covode.recordClassIndex(16883);
    }

    S a(S s, ITEM item);

    ITEM b(S s, ITEM item);
}
