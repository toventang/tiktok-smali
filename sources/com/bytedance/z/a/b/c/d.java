package com.bytedance.z.a.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.c.b;
import com.bytedance.z.a.d.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public List<LinkedHashMap<Long, Long>> f46291a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<LinkedHashMap<Long, Long>> f46292b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<LinkedHashMap<Long, Long>> f46293c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private List<Integer> f46294d = a.b();

    /* renamed from: e  reason: collision with root package name */
    private long f46295e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f46296f = 0;

    /* renamed from: g  reason: collision with root package name */
    private long f46297g = 0;

    static {
        Covode.recordClassIndex(28259);
    }

    private long c() {
        if (this.f46295e == 0) {
            this.f46295e = a(this.f46291a);
        }
        return this.f46295e;
    }

    public final long a() {
        if (this.f46296f == 0) {
            this.f46296f = a(this.f46292b);
        }
        return this.f46296f;
    }

    public final long b() {
        if (this.f46297g == 0) {
            this.f46297g = a(this.f46293c);
        }
        return this.f46297g;
    }

    public final String toString() {
        return "ProcTimeInStateInfo{freqTimeMapList=" + this.f46291a + ", freqDeltaTimeMapList=" + this.f46292b + ", totalCpuTime=" + c() + ", totalDeltaCpuTime=" + a() + ", totalMergeCpuTime=" + b() + '}';
    }

    public final void a(LinkedHashMap<Long, Long> linkedHashMap) {
        if (linkedHashMap != null) {
            this.f46291a.add(linkedHashMap);
        }
    }

    private long a(List<LinkedHashMap<Long, Long>> list) {
        int size;
        long j2 = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.f46294d.size()) {
            for (int i2 = 0; i2 != size; i2++) {
                for (Map.Entry<Long, Long> entry : list.get(i2).entrySet()) {
                    j2 += entry.getValue().longValue();
                }
            }
        }
        return j2;
    }

    public final void a(b bVar) {
        if (bVar == null) {
            this.f46292b.addAll(this.f46291a);
            return;
        }
        List<LinkedHashMap<Long, Long>> list = ((d) bVar).f46291a;
        if (!list.isEmpty() && this.f46291a.size() == list.size()) {
            this.f46292b.clear();
            for (int i2 = 0; i2 != this.f46291a.size(); i2++) {
                LinkedHashMap<Long, Long> linkedHashMap = list.get(i2);
                LinkedHashMap<Long, Long> linkedHashMap2 = new LinkedHashMap<>();
                for (Map.Entry<Long, Long> entry : this.f46291a.get(i2).entrySet()) {
                    Long key = entry.getKey();
                    Long value = entry.getValue();
                    Long l2 = linkedHashMap.get(key);
                    if (l2 != null) {
                        linkedHashMap2.put(key, Long.valueOf(value.longValue() - l2.longValue()));
                    }
                }
                this.f46292b.add(linkedHashMap2);
            }
        }
    }

    public final void b(b bVar) {
        if (bVar != null) {
            d dVar = (d) bVar;
            List<LinkedHashMap<Long, Long>> list = dVar.f46291a;
            List<LinkedHashMap<Long, Long>> list2 = dVar.f46292b;
            if (!list2.isEmpty()) {
                list = list2;
            }
            if (this.f46293c.isEmpty()) {
                this.f46293c.addAll(list);
                return;
            }
            int size = this.f46293c.size();
            if (size == list.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 != size; i2++) {
                    LinkedHashMap<Long, Long> linkedHashMap = list.get(i2);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<Long, Long> entry : this.f46293c.get(i2).entrySet()) {
                        Long key = entry.getKey();
                        Long value = entry.getValue();
                        Long l2 = linkedHashMap.get(key);
                        if (l2 != null) {
                            linkedHashMap2.put(key, Long.valueOf(value.longValue() + l2.longValue()));
                        }
                    }
                    arrayList.add(linkedHashMap2);
                }
                this.f46293c = arrayList;
            }
        }
    }
}
