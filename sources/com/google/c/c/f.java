package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class f<K, V> implements Map.Entry<K, V> {
    static {
        Covode.recordClassIndex(33505);
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    f() {
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
        return ((Object) getKey()) + "=" + ((Object) getValue());
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!i.a(getKey(), entry.getKey()) || !i.a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
