package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.l.h;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ak extends aj {
    static {
        Covode.recordClassIndex(105048);
    }

    public static final <K, V> h<Map.Entry<K, V>> f(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        return n.t(map.entrySet());
    }

    public static final <K, V> List<p<K, V>> e(Map<? extends K, ? extends V> map) {
        l.d(map, "");
        if (map.size() == 0) {
            return z.INSTANCE;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return z.INSTANCE;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return n.a(new p(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new p(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new p(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
