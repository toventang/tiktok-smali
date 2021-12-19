package com.google.i18n.phonenumbers.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegexCache {
    private LRUCache<String, Pattern> cache;

    static {
        Covode.recordClassIndex(34120);
    }

    /* access modifiers changed from: package-private */
    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    public RegexCache(int i2) {
        this.cache = new LRUCache<>(i2);
    }

    /* access modifiers changed from: package-private */
    public static class LRUCache<K, V> {
        private LinkedHashMap<K, V> map;
        public int size;

        static {
            Covode.recordClassIndex(34121);
        }

        public LRUCache(int i2) {
            this.size = i2;
            this.map = new LinkedHashMap<K, V>(((i2 * 4) / 3) + 1, 0.75f, true) {
                /* class com.google.i18n.phonenumbers.internal.RegexCache.LRUCache.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34122);
                }

                /* access modifiers changed from: protected */
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    if (size() > LRUCache.this.size) {
                        return true;
                    }
                    return false;
                }
            };
        }

        public synchronized boolean containsKey(K k2) {
            boolean containsKey;
            MethodCollector.i(5452);
            containsKey = this.map.containsKey(k2);
            MethodCollector.o(5452);
            return containsKey;
        }

        public synchronized V get(K k2) {
            V v;
            MethodCollector.i(5441);
            v = this.map.get(k2);
            MethodCollector.o(5441);
            return v;
        }

        public synchronized void put(K k2, V v) {
            MethodCollector.i(5450);
            this.map.put(k2, v);
            MethodCollector.o(5450);
        }
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }
}
