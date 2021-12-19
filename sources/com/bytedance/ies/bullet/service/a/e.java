package com.bytedance.ies.bullet.service.a;

import com.bytedance.covode.number.Covode;

public interface e<K, V> {
    static {
        Covode.recordClassIndex(19272);
    }

    Boolean getBoolean(K k2);

    String getString(K k2);

    boolean putBooleanIfAbsent(K k2, boolean z);

    boolean putStringIfAbsent(K k2, String str);
}
