package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.c.d;
import h.q;

public abstract class dt<T> implements d<T> {
    static {
        Covode.recordClassIndex(93448);
    }

    public abstract void a(T t);

    public abstract void a(Throwable th);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c.d
    public void resumeWith(Object obj) {
        Throwable r1 = q.m226exceptionOrNullimpl(obj);
        if (r1 == null) {
            a(obj);
        } else {
            a(r1);
        }
    }
}
