package com.google.android.gms.measurement.internal;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.lk;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class kf {

    /* renamed from: a  reason: collision with root package name */
    BitSet f51990a;

    /* renamed from: b  reason: collision with root package name */
    private String f51991b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51992c;

    /* renamed from: d  reason: collision with root package name */
    private ay.i f51993d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f51994e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f51995f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f51996g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ kd f51997h;

    static {
        Covode.recordClassIndex(32363);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x003b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.ay.a a(int r9) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.kf.a(int):com.google.android.gms.internal.measurement.ay$a");
    }

    /* access modifiers changed from: package-private */
    public final void a(kk kkVar) {
        int a2 = kkVar.a();
        if (kkVar.f52010c != null) {
            this.f51994e.set(a2, kkVar.f52010c.booleanValue());
        }
        if (kkVar.f52011d != null) {
            this.f51990a.set(a2, kkVar.f52011d.booleanValue());
        }
        if (kkVar.f52012e != null) {
            Long l2 = this.f51995f.get(Integer.valueOf(a2));
            long longValue = kkVar.f52012e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f51995f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (kkVar.f52013f != null) {
            List<Long> list = this.f51996g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList<>();
                this.f51996g.put(Integer.valueOf(a2), list);
            }
            if (kkVar.b()) {
                list.clear();
            }
            lk.b();
            if (this.f51997h.s().d(this.f51991b, p.ag) && kkVar.c()) {
                list.clear();
            }
            lk.b();
            if (this.f51997h.s().d(this.f51991b, p.ag)) {
                long longValue2 = kkVar.f52013f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(kkVar.f52013f.longValue() / 1000));
        }
    }

    private kf(kd kdVar, String str) {
        this.f51997h = kdVar;
        this.f51991b = str;
        this.f51992c = true;
        this.f51990a = new BitSet();
        this.f51994e = new BitSet();
        this.f51995f = new a();
        this.f51996g = new a();
    }

    /* synthetic */ kf(kd kdVar, String str, byte b2) {
        this(kdVar, str);
    }

    private kf(kd kdVar, String str, ay.i iVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f51997h = kdVar;
        this.f51991b = str;
        this.f51990a = bitSet;
        this.f51994e = bitSet2;
        this.f51995f = map;
        this.f51996g = new a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f51996g.put(num, arrayList);
            }
        }
        this.f51992c = false;
        this.f51993d = iVar;
    }

    /* synthetic */ kf(kd kdVar, String str, ay.i iVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte b2) {
        this(kdVar, str, iVar, bitSet, bitSet2, map, map2);
    }
}
