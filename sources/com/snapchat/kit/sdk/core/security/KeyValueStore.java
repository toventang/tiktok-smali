package com.snapchat.kit.sdk.core.security;

import com.bytedance.covode.number.Covode;

public interface KeyValueStore {
    static {
        Covode.recordClassIndex(35808);
    }

    void clearEntry(String str);

    <T> T get(String str, Class<T> cls);

    String getString(String str, String str2);

    void put(String str, Object obj);

    void putString(String str, String str2);
}
