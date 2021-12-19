package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q<K, V> extends HashMap<K, List<V>> {
    private static final long serialVersionUID = -8278080958339137414L;

    static {
        Covode.recordClassIndex(16397);
    }

    public List<V> newList() {
        return new ArrayList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.crash.util.q<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public List<V> getList(K k2) {
        List<V> list = (List) super.get(k2);
        if (list != null) {
            return list;
        }
        List<V> newList = newList();
        put(k2, newList);
        return newList;
    }

    public void removeAll(V v) {
        for (V v2 : values()) {
            v2.remove(v);
        }
    }

    public void add(K k2, V v) {
        getList(k2).add(v);
    }

    public void removeInList(K k2, V v) {
        getList(k2).remove(v);
    }

    public void addMulti(V v, K... kArr) {
        if (!(v == null || kArr == null || kArr.length <= 0)) {
            for (K k2 : kArr) {
                getList(k2).add(v);
            }
        }
    }
}
