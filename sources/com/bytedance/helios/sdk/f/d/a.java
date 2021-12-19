package com.bytedance.helios.sdk.f.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.FrequencyConfig;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, CopyOnWriteArrayList<Long>> f30976a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, Set<FrequencyConfig>> f30977b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f30978c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(17994);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : HeliosEnvImpl.INSTANCE.getFrequencyGroupModels()) {
            Iterator<T> it = t.getApiIds().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Integer valueOf = Integer.valueOf(intValue);
                Set set = (Set) linkedHashMap.get(Integer.valueOf(intValue));
                if (set == null) {
                    set = new LinkedHashSet();
                }
                set.add(t.getFrequencyConfig());
                linkedHashMap.put(valueOf, set);
            }
        }
        f30977b = linkedHashMap;
    }
}
