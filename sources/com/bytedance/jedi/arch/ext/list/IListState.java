package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.o;

public interface IListState<T, P extends o> extends NestedState<ListState<T, P>> {
    static {
        Covode.recordClassIndex(24191);
    }
}
