package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.l.h;
import h.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class aj extends ai {
    static {
        Covode.recordClassIndex(105047);
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, p<? extends K, ? extends V>[] pVarArr) {
        l.d(map, "");
        l.d(pVarArr, "");
        for (p<? extends K, ? extends V> pVar : pVarArr) {
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, Iterable<? extends p<? extends K, ? extends V>> iterable) {
        l.d(map, "");
        l.d(iterable, "");
        Iterator<? extends p<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }

    public static final <K, V> Map<K, V> a() {
        aa aaVar = aa.f158621a;
        Objects.requireNonNull(aaVar, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return aaVar;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        return new LinkedHashMap(map);
    }

    public static final <K, V> HashMap<K, V> c(p<? extends K, ? extends V>... pVarArr) {
        l.d(pVarArr, "");
        HashMap<K, V> hashMap = new HashMap<>(ag.a(pVarArr.length));
        ag.a(hashMap, pVarArr);
        return hashMap;
    }

    public static final <K, V> LinkedHashMap<K, V> d(p<? extends K, ? extends V>... pVarArr) {
        l.d(pVarArr, "");
        return (LinkedHashMap) ag.a(pVarArr, new LinkedHashMap(ag.a(1)));
    }

    public static final <K, V> Map<K, V> a(Iterable<? extends p<? extends K, ? extends V>> iterable) {
        l.d(iterable, "");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ag.a();
        }
        if (size != 1) {
            return ag.a(iterable, new LinkedHashMap(ag.a(collection.size())));
        }
        return ag.a((p) ((List) iterable).get(0));
    }

    public static final <K, V> Map<K, V> b(p<? extends K, ? extends V>... pVarArr) {
        l.d(pVarArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ag.a(pVarArr.length));
        ag.a(linkedHashMap, pVarArr);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        int size = map.size();
        if (size == 0) {
            return ag.a();
        }
        if (size != 1) {
            return ag.d(map);
        }
        return ag.b(map);
    }

    public static final <K, V> Map<K, V> a(p<? extends K, ? extends V>... pVarArr) {
        l.d(pVarArr, "");
        if (pVarArr.length > 0) {
            return ag.a(pVarArr, new LinkedHashMap(ag.a(pVarArr.length)));
        }
        return ag.a();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(h<? extends p<? extends K, ? extends V>> hVar, M m2) {
        l.d(hVar, "");
        l.d(m2, "");
        ag.a(m2, hVar);
        return m2;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends p<? extends K, ? extends V>> iterable, M m2) {
        l.d(iterable, "");
        l.d(m2, "");
        ag.a(m2, iterable);
        return m2;
    }

    public static final <K, V> Map<K, V> b(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        l.d(map, "");
        l.d(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map, p<? extends K, ? extends V> pVar) {
        l.d(map, "");
        l.d(pVar, "");
        if (map.isEmpty()) {
            return ag.a(pVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Map<? extends K, ? extends V> map, M m2) {
        l.d(map, "");
        l.d(m2, "");
        m2.putAll(map);
        return m2;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(p<? extends K, ? extends V>[] pVarArr, M m2) {
        l.d(pVarArr, "");
        l.d(m2, "");
        ag.a(m2, pVarArr);
        return m2;
    }

    public static final <K, V> void a(Map<? super K, ? super V> map, h<? extends p<? extends K, ? extends V>> hVar) {
        l.d(map, "");
        l.d(hVar, "");
        Iterator<? extends p<? extends K, ? extends V>> a2 = hVar.a();
        while (a2.hasNext()) {
            p pVar = (p) a2.next();
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }
}
