package com.bytedance.ugc.ugcwidget.cache;

import com.bytedance.covode.number.Covode;

public final class UGCCache<K, V> {

    public interface ValueBuilder<K, V> {
        static {
            Covode.recordClassIndex(27968);
        }

        V buildValue(K k2);
    }

    static {
        Covode.recordClassIndex(27967);
    }
}
