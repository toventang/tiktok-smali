package com.bytedance.webx.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Set<com.bytedance.webx.d.b> f45992a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static class a<K, V> extends TreeMap<K, V> {
        public int mId;

        static {
            Covode.recordClassIndex(28127);
        }

        private a() {
            this.mId = -1;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(28126);
    }

    public static a a(com.bytedance.webx.d.b bVar, String str) {
        TreeMap<Integer, a> treeMap;
        if (bVar == null) {
            com.bytedance.webx.b.a.a.a("EventManager");
            return null;
        }
        Map<String, TreeMap<Integer, a>> a2 = bVar.a();
        if (a2 == null || (treeMap = a2.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        a value = treeMap.firstEntry().getValue();
        com.bytedance.webx.a a3 = value.a();
        if (!a3.f45903f || !a3.a()) {
            if (h.f45997a.f46015a) {
                value.x().hashCode();
                com.bytedance.webx.b.a.a.a("WebX");
                value.x().hashCode();
                a3.getClass().getCanonicalName();
                com.bytedance.webx.b.a.a.a("WebX");
            }
            return a(bVar, value, str);
        } else if (!h.f45997a.f46015a) {
            return value;
        } else {
            value.x().hashCode();
            com.bytedance.webx.b.a.a.a("WebX");
            value.x().hashCode();
            a3.getClass().getCanonicalName();
            com.bytedance.webx.b.a.a.a("WebX");
            return value;
        }
    }

    public static a a(com.bytedance.webx.d.b bVar, a aVar, String str) {
        TreeMap<Integer, a> treeMap;
        Map<String, TreeMap<Integer, a>> a2 = bVar.a();
        if (a2 == null || (treeMap = a2.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        Iterator<a> it = treeMap.values().iterator();
        while (it.hasNext()) {
            if (aVar == it.next()) {
                while (it.hasNext()) {
                    a next = it.next();
                    com.bytedance.webx.a a3 = next.a();
                    if (a3.f45903f && a3.a()) {
                        if (h.f45997a.f46015a) {
                            aVar.x().hashCode();
                            a3.getClass().getCanonicalName();
                            com.bytedance.webx.b.a.a.a("WebX");
                        }
                        return next;
                    } else if (h.f45997a.f46015a) {
                        aVar.x().hashCode();
                        a3.getClass().getCanonicalName();
                        com.bytedance.webx.b.a.a.a("WebX");
                    }
                }
                if (h.f45997a.f46015a) {
                    aVar.x().hashCode();
                    aVar.x().getClass().getCanonicalName();
                    com.bytedance.webx.b.a.a.a("WebX");
                    aVar.x().hashCode();
                    com.bytedance.webx.b.a.a.a("WebX");
                }
                return null;
            }
        }
        if (h.f45997a.f46015a) {
            aVar.x().getClass().getCanonicalName();
            com.bytedance.webx.b.a.a.a("WebX");
            com.bytedance.webx.b.a.a.a("WebX");
        }
        return null;
    }
}
