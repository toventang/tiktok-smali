package d.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.f;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class b<K, V> implements f, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Map f156542a;

    static {
        Covode.recordClassIndex(103933);
    }

    public /* synthetic */ b() {
        this(false);
    }

    public final void clear() {
        this.f156542a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f156542a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f156542a.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f156542a.get(obj);
    }

    public final boolean isEmpty() {
        return this.f156542a.isEmpty();
    }

    @Override // java.util.Map
    public final V put(K k2, V v) {
        return (V) this.f156542a.put(k2, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        l.c(map, "");
        this.f156542a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) this.f156542a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return this.f156542a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return this.f156542a.keySet();
    }

    public final /* bridge */ int size() {
        return this.f156542a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this.f156542a.values();
    }

    public b(boolean z) {
        Map linkedHashMap;
        if (z) {
            linkedHashMap = new ConcurrentHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(0, 0.75f, true);
        }
        this.f156542a = linkedHashMap;
    }
}
