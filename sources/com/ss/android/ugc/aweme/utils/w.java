package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static int f143191a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Set<x>> f143192b = new HashMap();

    static {
        Covode.recordClassIndex(93728);
    }

    public static final void a(int i2) {
        Map<String, Set<x>> map = f143192b;
        if (map == null) {
            l.b();
        }
        for (Set<x> set : map.values()) {
            if (set == null) {
                l.b();
            }
            Iterator<x> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().f143195c == i2) {
                    it.remove();
                }
            }
        }
    }

    public static final Map<String, String> a(Aweme aweme, String str, String str2) {
        l.d(str, "");
        return a(aweme, str, str2, (dm) null);
    }

    public static final Map<String, String> a(Aweme aweme, String str, String str2, dm dmVar) {
        String str3;
        String str4;
        l.d(str, "");
        HashMap hashMap = new HashMap();
        Map<String, Set<x>> map = f143192b;
        if (map == null) {
            l.b();
        }
        Set<x> set = map.get(str);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : set) {
                if (t.f143195c == f143191a) {
                    arrayList.add(t);
                }
            }
            ArrayList<x> arrayList2 = arrayList;
            if (arrayList2 != null && arrayList2.size() > 0) {
                for (x xVar : arrayList2) {
                    x.a aVar = xVar.f143194b;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (aVar.a(aweme, str3)) {
                        x.a aVar2 = xVar.f143194b;
                        if (str2 == null) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        String a2 = aVar2.a(aweme, str4, dmVar);
                        if (!TextUtils.isEmpty(xVar.f143193a) && !TextUtils.isEmpty(a2)) {
                            hashMap.put(xVar.f143193a, a2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static final void a(String str, String str2, x.a aVar, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        Map<String, Set<x>> map = f143192b;
        if (map == null) {
            l.b();
        }
        Set<x> set = map.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            map.put(str, set);
        }
        set.add(new x(str2, aVar, i2));
    }
}
