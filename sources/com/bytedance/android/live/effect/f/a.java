package com.bytedance.android.live.effect.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9834a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(5024);
    }

    public static final String[] a(List<com.bytedance.android.livesdkapi.depend.model.a> list, String[] strArr) {
        T t;
        String str;
        l.d(list, "");
        l.d(strArr, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f23001g, (Object) str2)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null || (str = t2.A) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr2 = (String[]) array;
        StringBuilder sb = new StringBuilder("effect extra list:");
        String arrays = Arrays.toString(strArr2);
        l.b(arrays, "");
        com.bytedance.android.live.core.c.a.a(3, "ComposerUtils", sb.append(arrays).toString());
        return strArr2;
    }

    public static final String[] a(List<com.bytedance.android.livesdkapi.depend.model.a> list, Map<com.bytedance.android.livesdkapi.depend.model.a, ? extends Map<String, Float>> map) {
        l.d(list, "");
        l.d(map, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.equals(t)) {
                    if (next != null) {
                        Map map2 = (Map) map.get(next);
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                arrayList.add(t.f23001g + ':' + ((String) entry.getKey()) + ':' + ((Number) entry.getValue()).floatValue());
                            }
                        }
                    }
                }
            }
            arrayList.add(t.f23001g);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
