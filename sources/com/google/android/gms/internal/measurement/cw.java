package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

abstract class cw<K, V> implements Map.Entry<K, V> {
    static {
        Covode.recordClassIndex(31716);
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    cw() {
    }

    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i2 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!ck.a(getKey(), entry.getKey()) || !ck.a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
