package com.bytedance.helios.sdk.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.i;
import com.bytedance.helios.api.b.j;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.api.config.FrequencyConfig;
import com.bytedance.helios.sdk.f.d.a;
import com.bytedance.helios.sdk.utils.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30962a;

    static {
        Covode.recordClassIndex(17962);
    }

    public c(boolean z) {
        this.f30962a = z;
    }

    @Override // com.bytedance.helios.sdk.f.a.b
    public final boolean a(n nVar, ApiInfo apiInfo) {
        boolean z;
        boolean z2;
        Set<j> set;
        Set<j> set2;
        Set<String> set3;
        l.c(nVar, "");
        l.c(apiInfo, "");
        if (nVar.z == null) {
            nVar.z = new i();
            z = true;
        } else {
            z = false;
        }
        if (!this.f30962a || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        l.c(nVar, "");
        l.c(apiInfo, "");
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashSet<FrequencyConfig> linkedHashSet = new LinkedHashSet();
        FrequencyConfig frequencyConfig = apiInfo.getFrequencyConfig();
        if (frequencyConfig != null) {
            linkedHashSet.add(frequencyConfig);
        }
        Set<FrequencyConfig> set4 = a.f30977b.get(Integer.valueOf(nVar.f30673b));
        if (set4 != null) {
            linkedHashSet.addAll(set4);
        }
        boolean z3 = false;
        for (FrequencyConfig frequencyConfig2 : linkedHashSet) {
            String name = frequencyConfig2.getName();
            if (name == null) {
                name = String.valueOf(nVar.f30673b);
            }
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = a.f30976a.get(name);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
            long sessionIntervalTime = currentTimeMillis - frequencyConfig2.getSessionIntervalTime();
            ArrayList arrayList = new ArrayList();
            for (T t : copyOnWriteArrayList) {
                if (t.longValue() < sessionIntervalTime) {
                    arrayList.add(t);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
            int size = copyOnWriteArrayList.size() + 1;
            if (z2) {
                if (copyOnWriteArrayList.size() >= frequencyConfig2.getTimelineLimit()) {
                    copyOnWriteArrayList.remove(h.a.n.i((List) copyOnWriteArrayList));
                }
                copyOnWriteArrayList.add(Long.valueOf(nVar.f30683l));
            }
            a.f30976a.put(name, copyOnWriteArrayList);
            if (size > frequencyConfig2.getCallThreshold()) {
                String name2 = frequencyConfig2.getName();
                if (name2 == null) {
                    name2 = String.valueOf(nVar.f30673b);
                }
                j jVar = new j(name2, size, frequencyConfig2.getCallThreshold());
                i iVar = nVar.z;
                if (!(iVar == null || (set3 = iVar.f30661a) == null)) {
                    set3.add(jVar.f30663a);
                }
                i iVar2 = nVar.z;
                if (!(iVar2 == null || (set2 = iVar2.f30662b) == null)) {
                    set2.add(jVar);
                }
                z3 = true;
            }
        }
        if (z3) {
            nVar.u.add("frequency");
            i iVar3 = nVar.z;
            if (iVar3 != null) {
                set = iVar3.f30662b;
                if (set != null) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (l.a((Object) it.next().f30663a, (Object) String.valueOf(nVar.f30673b))) {
                            nVar.u.add("frequency_api");
                        } else {
                            nVar.u.add("frequency_group");
                        }
                    }
                }
            } else {
                set = null;
            }
            nVar.n.put("frequency_logs", com.bytedance.helios.sdk.utils.c.a(set));
            f.a("Helios-Control-Api", "FrequencyCondition isStatistics=" + this.f30962a + " id=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
        }
        return z3;
    }
}
