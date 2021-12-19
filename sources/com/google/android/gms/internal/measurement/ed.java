package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractMap;
import java.util.Map;

final class ed extends dl<Map.Entry<K, V>> {
    private final /* synthetic */ ee zza;

    static {
        Covode.recordClassIndex(31751);
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return true;
    }

    public final int size() {
        return this.zza.f50806b;
    }

    ed(ee eeVar) {
        this.zza = eeVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i2) {
        cl.a(i2, this.zza.f50806b);
        int i3 = i2 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zza.f50805a[i3], this.zza.f50805a[i3 + 1]);
    }
}
