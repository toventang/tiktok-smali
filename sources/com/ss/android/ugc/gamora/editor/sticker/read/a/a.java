package com.ss.android.ugc.gamora.editor.sticker.read.a;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f146830a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f146831b;

    static {
        Covode.recordClassIndex(96710);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f146830a, aVar.f146830a) && l.a(this.f146831b, aVar.f146831b);
    }

    public final int hashCode() {
        Map<String, String> map = this.f146830a;
        int i2 = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<String> list = this.f146831b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UnLockTTSModel(lockMap=" + this.f146830a + ", unLocked=" + this.f146831b + ")";
    }

    public final List<String> a() {
        return n.k(this.f146831b);
    }

    public final String a(String str) {
        l.d(str, "");
        String str2 = this.f146830a.get(str);
        if (str2 == null) {
            return null;
        }
        Iterator<Map.Entry<String, String>> it = this.f146830a.entrySet().iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().getKey(), (Object) str)) {
                it.remove();
            }
        }
        this.f146831b.add(0, str2);
        return str2;
    }

    public final List<String> b(String str) {
        l.d(str, "");
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f146830a.keySet()) {
            int a2 = p.a((CharSequence) str, str2, 0, true);
            if (a2 >= 0) {
                arrayList.add(v.a(str2, Integer.valueOf(a2)));
            }
        }
        List<h.p> a3 = n.a((Iterable) arrayList, (Comparator) new C3938a());
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) a3, 10));
        for (h.p pVar : a3) {
            arrayList2.add(pVar.getFirst());
        }
        return arrayList2;
    }

    public a(Map<String, String> map, List<String> list) {
        l.d(map, "");
        l.d(list, "");
        this.f146830a = map;
        this.f146831b = list;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.a.a$a  reason: collision with other inner class name */
    public static final class C3938a<T> implements Comparator {
        static {
            Covode.recordClassIndex(96711);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Integer) t.getSecond(), (Integer) t2.getSecond());
        }
    }
}
