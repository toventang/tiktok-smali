package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ix implements Comparable<ix>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f51046a;

    /* renamed from: b  reason: collision with root package name */
    private V f51047b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ io f51048c;

    static {
        Covode.recordClassIndex(31890);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f51046a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f51047b;
    }

    public final int hashCode() {
        int hashCode;
        K k2 = this.f51046a;
        int i2 = 0;
        if (k2 == null) {
            hashCode = 0;
        } else {
            hashCode = k2.hashCode();
        }
        V v = this.f51047b;
        if (v != null) {
            i2 = v.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51046a);
        String valueOf2 = String.valueOf(this.f51047b);
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f51048c.e();
        V v2 = this.f51047b;
        this.f51047b = v;
        return v2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ix ixVar) {
        return ((Comparable) getKey()).compareTo(ixVar.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!a(this.f51046a, entry.getKey()) || !a(this.f51047b, entry.getValue())) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    ix(io ioVar, Map.Entry<K, V> entry) {
        this(ioVar, entry.getKey(), entry.getValue());
    }

    ix(io ioVar, K k2, V v) {
        this.f51048c = ioVar;
        this.f51046a = k2;
        this.f51047b = v;
    }
}
