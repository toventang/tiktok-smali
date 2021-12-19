package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Map;

final class df extends cw<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f50772a;

    /* renamed from: b  reason: collision with root package name */
    private int f50773b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ da f50774c;

    static {
        Covode.recordClassIndex(31726);
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.cw
    public final K getKey() {
        return this.f50772a;
    }

    private final void a() {
        int i2 = this.f50773b;
        if (i2 == -1 || i2 >= this.f50774c.size() || !ck.a(this.f50772a, this.f50774c.f50758d[this.f50773b])) {
            this.f50773b = this.f50774c.a(this.f50772a);
        }
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.cw
    public final V getValue() {
        Map b2 = this.f50774c.b();
        if (b2 != null) {
            return (V) b2.get(this.f50772a);
        }
        a();
        if (this.f50773b == -1) {
            return null;
        }
        return (V) this.f50774c.f50759e[this.f50773b];
    }

    @Override // java.util.Map.Entry, com.google.android.gms.internal.measurement.cw
    public final V setValue(V v) {
        Map b2 = this.f50774c.b();
        if (b2 != null) {
            return (V) b2.put(this.f50772a, v);
        }
        a();
        if (this.f50773b == -1) {
            this.f50774c.put(this.f50772a, v);
            return null;
        }
        V v2 = (V) this.f50774c.f50759e[this.f50773b];
        this.f50774c.f50759e[this.f50773b] = v;
        return v2;
    }

    df(da daVar, int i2) {
        this.f50774c = daVar;
        this.f50772a = (K) daVar.f50758d[i2];
        this.f50773b = i2;
    }
}
