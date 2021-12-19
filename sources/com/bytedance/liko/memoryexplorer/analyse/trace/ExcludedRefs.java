package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class ExcludedRefs implements Serializable {
    private static final long serialVersionUID = 691858859591875722L;
    public final Map<String, Set<String>> excludeFieldMap;
    public final Map<String, Set<String>> excludeStaticFieldMap;
    public final Set<String> excludedThreads;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.liko.memoryexplorer.analyse.trace.ExcludedRefs$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(24742);
        }
    }

    static {
        Covode.recordClassIndex(24741);
    }

    public static final class Builder {
        private final Map<String, Set<String>> excludeFieldMap = new LinkedHashMap();
        private final Map<String, Set<String>> excludeStaticFieldMap = new LinkedHashMap();
        private final Set<String> excludedThreads = new LinkedHashSet();

        static {
            Covode.recordClassIndex(24743);
        }

        public final ExcludedRefs build() {
            return new ExcludedRefs(this.excludeFieldMap, this.excludeStaticFieldMap, this.excludedThreads, null);
        }

        public final Builder thread(String str) {
            ExcludedRefs.checkNotNull(str, "threadName");
            this.excludedThreads.add(str);
            return this;
        }

        public final Builder instanceField(String str, String str2) {
            ExcludedRefs.checkNotNull(str, "className");
            ExcludedRefs.checkNotNull(str2, "fieldName");
            Set<String> set = this.excludeFieldMap.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.excludeFieldMap.put(str, set);
            }
            set.add(str2);
            return this;
        }

        public final Builder staticField(String str, String str2) {
            ExcludedRefs.checkNotNull(str, "className");
            ExcludedRefs.checkNotNull(str2, "fieldName");
            Set<String> set = this.excludeStaticFieldMap.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.excludeStaticFieldMap.put(str, set);
            }
            set.add(str2);
            return this;
        }
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    private ExcludedRefs(Map<String, Set<String>> map, Map<String, Set<String>> map2, Set<String> set) {
        this.excludeFieldMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        this.excludeStaticFieldMap = Collections.unmodifiableMap(new LinkedHashMap(map2));
        this.excludedThreads = Collections.unmodifiableSet(new LinkedHashSet(set));
    }

    /* synthetic */ ExcludedRefs(Map map, Map map2, Set set, AnonymousClass1 r4) {
        this(map, map2, set);
    }
}
