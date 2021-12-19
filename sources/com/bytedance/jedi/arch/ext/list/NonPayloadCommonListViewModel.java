package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;

public abstract class NonPayloadCommonListViewModel<T, S extends IListState<T, o>> extends ListViewModel<T, o, S> {
    static {
        Covode.recordClassIndex(24226);
    }
}
