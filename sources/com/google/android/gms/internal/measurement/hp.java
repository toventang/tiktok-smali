package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

final class hp implements hq {
    static {
        Covode.recordClassIndex(31855);
    }

    hp() {
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final ho<?, ?> a() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final Object b() {
        return hn.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final Map<?, ?> a(Object obj) {
        return (hn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final Map<?, ?> b(Object obj) {
        return (hn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final Object d(Object obj) {
        ((hn) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final boolean c(Object obj) {
        if (!((hn) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final int e(Object obj) {
        hn hnVar = (hn) obj;
        if (hnVar.isEmpty()) {
            return 0;
        }
        Iterator it = hnVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.hq
    public final Object a(Object obj, Object obj2) {
        hn hnVar = (hn) obj;
        hn hnVar2 = (hn) obj2;
        if (!hnVar2.isEmpty()) {
            if (!hnVar.zzd()) {
                hnVar = hnVar.zzb();
            }
            hnVar.zza(hnVar2);
        }
        return hnVar;
    }
}
