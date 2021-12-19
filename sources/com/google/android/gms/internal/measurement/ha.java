package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

final class ha<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    Map.Entry<K, gy> f50966a;

    static {
        Covode.recordClassIndex(31840);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f50966a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f50966a.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    private ha(Map.Entry<K, gy> entry) {
        this.f50966a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof ht) {
            gy value = this.f50966a.getValue();
            ht htVar = value.f50972b;
            value.f50971a = null;
            value.f50973c = null;
            value.f50972b = (ht) obj;
            return htVar;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ ha(Map.Entry entry, byte b2) {
        this(entry);
    }
}
