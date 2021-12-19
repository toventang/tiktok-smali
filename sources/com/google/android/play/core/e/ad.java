package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f53224a;

    static {
        Covode.recordClassIndex(32898);
    }

    /* synthetic */ ad(Map map) {
        this.f53224a = map;
    }

    public final Map<String, Set<String>> a(Collection<String> collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.f53224a.keySet()) {
            if (!this.f53224a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.f53224a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }
}
