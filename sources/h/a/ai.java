package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ai extends ah {
    static {
        Covode.recordClassIndex(105046);
    }

    public static final int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> a(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        return new TreeMap(map);
    }

    public static final <K, V> Map<K, V> a(p<? extends K, ? extends V> pVar) {
        l.d(pVar, "");
        Map<K, V> singletonMap = Collections.singletonMap(pVar.getFirst(), pVar.getSecond());
        l.b(singletonMap, "");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> b(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        l.b(singletonMap, "");
        return singletonMap;
    }
}
