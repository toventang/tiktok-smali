package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f<K, V> extends HashMap<K, V> {
    static {
        Covode.recordClassIndex(28634);
    }

    public static <K, V> Map<K, V> of() {
        return Collections.unmodifiableMap(new HashMap());
    }

    private f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> f<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return new f<>(map);
    }

    public static <K, V> Map<K, V> of(K k2, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k2, v);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k2, V v, K k3, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k2, v);
        hashMap.put(k3, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(k2, v);
        hashMap.put(k3, v2);
        hashMap.put(k4, v3);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(k2, v);
        hashMap.put(k3, v2);
        hashMap.put(k4, v3);
        hashMap.put(k5, v4);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        HashMap hashMap = new HashMap(5);
        hashMap.put(k2, v);
        hashMap.put(k3, v2);
        hashMap.put(k4, v3);
        hashMap.put(k5, v4);
        hashMap.put(k6, v5);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        HashMap hashMap = new HashMap(6);
        hashMap.put(k2, v);
        hashMap.put(k3, v2);
        hashMap.put(k4, v3);
        hashMap.put(k5, v4);
        hashMap.put(k6, v5);
        hashMap.put(k7, v6);
        return Collections.unmodifiableMap(hashMap);
    }
}
