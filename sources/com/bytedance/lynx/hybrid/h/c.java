package com.bytedance.lynx.hybrid.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.c;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c extends HashMap<String, Object> {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(25111);
    }

    public Object getABParamsValue(String str) {
        l.c(str, "");
        return str;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25112);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public Set getEntries() {
        return super.entrySet();
    }

    public Set getKeys() {
        return super.keySet();
    }

    public int getSize() {
        return super.size();
    }

    public Collection getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<String> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Collection<Object> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final /* bridge */ Object get(Object obj) {
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

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    @Override // java.util.Map, java.util.HashMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, obj2);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || obj2 == null) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public Object put(String str, Object obj) {
        Object obj2;
        l.c(str, "");
        l.c(obj, "");
        if (!str.equals("abParams")) {
            return super.put((Object) str, obj);
        }
        com.bytedance.lynx.hybrid.a.a aVar = c.a.a().f40904d;
        if (aVar == null || (obj2 = aVar.getABParamsValue(obj.toString())) == null) {
            obj2 = getABParamsValue(obj.toString());
        }
        return super.put((Object) str, obj2);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
