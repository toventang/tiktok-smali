package com.ss.android.ugc.aweme.simreporterdt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import h.f.b.ad;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class SimDtReportService implements IPlayerEventReportService {

    /* renamed from: b  reason: collision with root package name */
    public a f133614b;

    /* renamed from: c  reason: collision with root package name */
    public IPlayerEventReporter f133615c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f133616d;

    /* renamed from: e  reason: collision with root package name */
    private ISimReporterConfig f133617e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashMap<String, Boolean> f133618f;

    /* renamed from: g  reason: collision with root package name */
    private final LinkedHashMap<String, Boolean> f133619g;

    /* renamed from: h  reason: collision with root package name */
    private final LinkedHashMap<String, Boolean> f133620h;

    /* renamed from: i  reason: collision with root package name */
    private final LinkedHashMap<String, String> f133621i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap<String, Long> f133622j;

    /* renamed from: k  reason: collision with root package name */
    private final LinkedHashMap<String, Long> f133623k;

    /* renamed from: l  reason: collision with root package name */
    private final LinkedHashMap<String, Long> f133624l;

    /* renamed from: m  reason: collision with root package name */
    private final LinkedHashMap<String, Long> f133625m;
    private final LinkedHashMap<String, List<Long>> n;
    private final LinkedHashMap<String, List<Long>> o;

    static {
        Covode.recordClassIndex(87404);
    }

    private SimDtReportService(byte b2) {
        this();
    }

    public static final class a extends LinkedHashMap<String, List<Long>> {
        static {
            Covode.recordClassIndex(87405);
        }

        a() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, List<Long>>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<List<Long>> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(List list) {
            return super.containsValue((Object) list);
        }

        public final /* bridge */ List get(String str) {
            return (List) super.get((Object) str);
        }

        public final /* bridge */ List remove(String str) {
            return (List) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final boolean containsValue(Object obj) {
            if (!ad.c(obj)) {
                return false;
            }
            return containsValue((List) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry<java.lang.String, ? extends java.util.List<java.lang.Long>>] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ List getOrDefault(String str, List list) {
            return (List) super.getOrDefault((Object) str, (Object) list);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
            if (!(obj instanceof String)) {
                return list;
            }
            return getOrDefault((String) obj, (List) list);
        }

        public final boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || ad.c(obj2)) {
                return remove((String) obj, (List) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, List list) {
            return super.remove((Object) str, (Object) list);
        }
    }

    public static final class b extends LinkedHashMap<String, List<Long>> {
        static {
            Covode.recordClassIndex(87406);
        }

        b() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, List<Long>>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<List<Long>> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(List list) {
            return super.containsValue((Object) list);
        }

        public final /* bridge */ List get(String str) {
            return (List) super.get((Object) str);
        }

        public final /* bridge */ List remove(String str) {
            return (List) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final boolean containsValue(Object obj) {
            if (!ad.c(obj)) {
                return false;
            }
            return containsValue((List) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry<java.lang.String, ? extends java.util.List<java.lang.Long>>] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ List getOrDefault(String str, List list) {
            return (List) super.getOrDefault((Object) str, (Object) list);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ List<Long> getOrDefault(Object obj, List<Long> list) {
            if (!(obj instanceof String)) {
                return list;
            }
            return getOrDefault((String) obj, (List) list);
        }

        public final boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || ad.c(obj2)) {
                return remove((String) obj, (List) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, List list) {
            return super.remove((Object) str, (Object) list);
        }
    }

    public static final class c extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87407);
        }

        c() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l2) {
            return super.containsValue((Object) l2);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            l.c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l2) {
            return (Long) super.getOrDefault((Object) str, (Object) l2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l2) {
            if (!(obj instanceof String)) {
                return l2;
            }
            return getOrDefault((String) obj, l2);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l2) {
            return super.remove((Object) str, (Object) l2);
        }
    }

    public static final class d extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87408);
        }

        d() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    public static final class e extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87409);
        }

        e() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l2) {
            return super.containsValue((Object) l2);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            l.c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l2) {
            return (Long) super.getOrDefault((Object) str, (Object) l2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l2) {
            if (!(obj instanceof String)) {
                return l2;
            }
            return getOrDefault((String) obj, l2);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l2) {
            return super.remove((Object) str, (Object) l2);
        }
    }

    public static final class f extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87410);
        }

        f() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    public static final class g extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87411);
        }

        g() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    public static final class h extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87412);
        }

        h() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l2) {
            return super.containsValue((Object) l2);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            l.c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l2) {
            return (Long) super.getOrDefault((Object) str, (Object) l2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l2) {
            if (!(obj instanceof String)) {
                return l2;
            }
            return getOrDefault((String) obj, l2);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l2) {
            return super.remove((Object) str, (Object) l2);
        }
    }

    public static final class i extends LinkedHashMap<String, String> {
        static {
            Covode.recordClassIndex(87413);
        }

        i() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, String>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<String> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(String str) {
            return super.containsValue((Object) str);
        }

        public final /* bridge */ String get(String str) {
            return (String) super.get((Object) str);
        }

        public final /* bridge */ String remove(String str) {
            return (String) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsValue((String) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            l.c(entry, "");
            if (size() > 5) {
                return true;
            }
            return false;
        }

        public final /* bridge */ String getOrDefault(String str, String str2) {
            return (String) super.getOrDefault((Object) str, (Object) str2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ String getOrDefault(Object obj, String str) {
            if (!(obj instanceof String)) {
                return str;
            }
            return getOrDefault((String) obj, str);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof String)) {
                return remove((String) obj, (String) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, String str2) {
            return super.remove((Object) str, (Object) str2);
        }
    }

    public static final class j extends LinkedHashMap<String, Long> {
        static {
            Covode.recordClassIndex(87414);
        }

        j() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Long>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Long> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Long l2) {
            return super.containsValue((Object) l2);
        }

        public final /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public final /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            l.c(entry, "");
            if (size() > 10) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Long getOrDefault(String str, Long l2) {
            return (Long) super.getOrDefault((Object) str, (Object) l2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Long getOrDefault(Object obj, Long l2) {
            if (!(obj instanceof String)) {
                return l2;
            }
            return getOrDefault((String) obj, l2);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Long)) {
                return remove((String) obj, (Long) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Long l2) {
            return super.remove((Object) str, (Object) l2);
        }
    }

    private /* synthetic */ SimDtReportService() {
        this(new com.ss.android.ugc.aweme.simreporterdt.impl.a());
    }

    private SimDtReportService(IPlayerEventReporter iPlayerEventReporter) {
        this.f133615c = iPlayerEventReporter;
        this.f133614b = new a();
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79174c = 1;
        ExecutorService a3 = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        h.f.b.l.a((Object) a3, "");
        this.f133616d = a3;
        this.f133617e = new com.ss.android.ugc.aweme.simreporter.api.a();
        this.f133618f = new d();
        this.f133619g = new f();
        this.f133620h = new g();
        this.f133621i = new i();
        this.f133622j = new j();
        this.f133623k = new e();
        this.f133624l = new h();
        this.f133625m = new c();
        this.n = new b();
        this.o = new a();
    }
}
