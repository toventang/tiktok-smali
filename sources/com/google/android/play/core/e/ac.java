package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Map<String, String>> f53223a = new HashMap();

    static {
        Covode.recordClassIndex(32897);
    }

    public final ad a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : this.f53223a.entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new ad(Collections.unmodifiableMap(hashMap));
    }
}
