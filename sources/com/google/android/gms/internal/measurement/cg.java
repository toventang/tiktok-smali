package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final /* synthetic */ class cg implements cq {

    /* renamed from: a  reason: collision with root package name */
    static final cq f50743a = new cg();

    static {
        Covode.recordClassIndex(31700);
    }

    private cg() {
    }

    @Override // com.google.android.gms.internal.measurement.cq
    public final Object a() {
        Set<Map.Entry> entrySet = new dw().f50794a.entrySet();
        if (entrySet.isEmpty()) {
            return dk.f50777a;
        }
        ds dsVar = new ds(entrySet.size());
        int i2 = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            dt zza = dt.zza((Collection) entry.getValue());
            if (!zza.isEmpty()) {
                int i3 = (dsVar.f50791b + 1) << 1;
                if (i3 > dsVar.f50790a.length) {
                    Object[] objArr = dsVar.f50790a;
                    int length = dsVar.f50790a.length;
                    if (i3 >= 0) {
                        int i4 = length + (length >> 1) + 1;
                        if (i4 < i3) {
                            i4 = Integer.highestOneBit(i3 - 1) << 1;
                        }
                        if (i4 < 0) {
                            i4 = Integer.MAX_VALUE;
                        }
                        dsVar.f50790a = Arrays.copyOf(objArr, i4);
                        dsVar.f50792c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                }
                cx.a(key, zza);
                dsVar.f50790a[dsVar.f50791b * 2] = key;
                dsVar.f50790a[(dsVar.f50791b * 2) + 1] = zza;
                dsVar.f50791b++;
                i2 += zza.size();
            }
        }
        dsVar.f50792c = true;
        return new dx(eb.a(dsVar.f50791b, dsVar.f50790a), i2);
    }
}
