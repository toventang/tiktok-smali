package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;

abstract class cv<K, V> implements dy<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Map<K, Collection<V>> f50753a;

    static {
        Covode.recordClassIndex(31715);
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> a();

    cv() {
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }

    @Override // com.google.android.gms.internal.measurement.dy
    public Map<K, Collection<V>> zza() {
        Map<K, Collection<V>> map = this.f50753a;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> a2 = a();
        this.f50753a = a2;
        return a2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dy) {
            return zza().equals(((dy) obj).zza());
        }
        return false;
    }

    public boolean zza(Object obj) {
        for (Collection<V> collection : zza().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
