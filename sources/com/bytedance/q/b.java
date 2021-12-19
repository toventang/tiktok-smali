package com.bytedance.q;

import com.bytedance.covode.number.Covode;

public interface b<IN> {
    static {
        Covode.recordClassIndex(25890);
    }

    Object a();

    <I> I a(Class<? extends d<I, ?>> cls);

    Object a(IN in);

    Object a(String str);

    void a(String str, Object obj);

    <O> O b(Class<? extends d<?, O>> cls);
}
