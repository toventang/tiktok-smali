package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class hn<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final hn f50983a;
    private boolean zza = true;

    public final void zzc() {
        this.zza = false;
    }

    public static <K, V> hn<K, V> zza() {
        return f50983a;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private hn() {
    }

    public final void clear() {
        a();
        super.clear();
    }

    static {
        Covode.recordClassIndex(31853);
        hn hnVar = new hn();
        f50983a = hnVar;
        hnVar.zza = false;
    }

    private final void a() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final hn<K, V> zzb() {
        if (isEmpty()) {
            return new hn<>();
        }
        return new hn<>(this);
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i2 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        a();
        return (V) super.remove(obj);
    }

    private hn(Map<K, V> map) {
        super(map);
    }

    public final void zza(hn<K, V> hnVar) {
        a();
        if (!hnVar.isEmpty()) {
            putAll(hnVar);
        }
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int a2 = gp.a(length, bArr, 0, length);
            if (a2 == 0) {
                return 1;
            }
            return a2;
        } else if (!(obj instanceof go)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        a();
        for (Object obj : map.keySet()) {
            gp.a(obj);
            gp.a(map.get(obj));
        }
        super.putAll(map);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                                equals = value.equals(obj2);
                                continue;
                            } else {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k2, V v) {
        a();
        gp.a(k2);
        gp.a(v);
        return (V) super.put(k2, v);
    }
}
