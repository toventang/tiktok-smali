package com.bytedance.android.live.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* access modifiers changed from: package-private */
public final class d implements h.f.b.a.a, Map<String, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final o f7344a;

    static {
        Covode.recordClassIndex(3540);
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final class a implements h.f.b.a.a, Map.Entry<String, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map.Entry f7345a;

        static {
            Covode.recordClassIndex(3541);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map.Entry
        public final /* synthetic */ String getKey() {
            Object key = this.f7345a.getKey();
            l.b(key, "");
            return key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Object value = this.f7345a.getValue();
            l.b(value, "");
            return n.b((com.google.gson.l) value);
        }

        a(Map.Entry entry) {
            this.f7345a = entry;
        }
    }

    public final boolean isEmpty() {
        if (this.f7344a.f54898a.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        Set<String> keySet = this.f7344a.f54898a.keySet();
        l.b(keySet, "");
        return keySet;
    }

    public final /* bridge */ int size() {
        return this.f7344a.f54898a.size();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, com.google.gson.l>> entrySet = this.f7344a.f54898a.entrySet();
        l.b(entrySet, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new a(it.next()));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        Set<Map.Entry<String, com.google.gson.l>> entrySet = this.f7344a.f54898a.entrySet();
        l.b(entrySet, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            l.b(value, "");
            linkedHashSet.add(n.b((com.google.gson.l) value));
        }
        return linkedHashSet;
    }

    public d(o oVar) {
        l.d(oVar, "");
        this.f7344a = oVar;
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        l.d(obj, "");
        return this.f7344a.f54898a.keySet().contains(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        l.d(str, "");
        com.google.gson.l c2 = this.f7344a.c(str);
        if (c2 != null) {
            return n.b(c2);
        }
        return null;
    }

    public final boolean containsValue(Object obj) {
        Set<Map.Entry<String, com.google.gson.l>> entrySet = this.f7344a.f54898a.entrySet();
        l.b(entrySet, "");
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (l.a(it.next().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }
}
