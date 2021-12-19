package com.bytedance.ugc.ugcwidget.cache;

import com.bytedance.covode.number.Covode;

public final class UGCLongCache<T> {

    public interface ValueBuilder<T> {
        static {
            Covode.recordClassIndex(27970);
        }

        T buildValue(long j2);
    }

    static {
        Covode.recordClassIndex(27969);
    }
}
