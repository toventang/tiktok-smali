package com.ss.android.token;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.business.c.c;
import com.ss.android.ugc.aweme.net.j.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f61016a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f61017b = true;

    /* renamed from: c  reason: collision with root package name */
    public static Set<String> f61018c = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(37589);
    }

    public static void a(Collection<String> collection) {
        if (f61016a) {
            f.f61019a.a(collection);
            return;
        }
        Set<String> set = f61018c;
        if (set != null) {
            set.addAll(collection);
        }
    }

    public static Map a(String str) {
        Map<String, String> map;
        boolean z;
        if (f61016a) {
            map = f.f61019a.c(str);
        } else {
            map = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("http://") && map != null && !map.isEmpty()) {
                b a2 = c.a.a();
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    hashSet.add(entry.getKey());
                    if (a2 != null && a2.f112396d != null && a2.f112396d.contains(entry.getKey().toLowerCase(Locale.ROOT)) && !c.a.a(a2, str)) {
                        hashSet2.add(entry.getKey());
                    }
                }
                if (!hashSet2.isEmpty()) {
                    for (String str2 : hashSet2) {
                        map.remove(str2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    if (!hashSet2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c.a.a(new com.ss.android.ugc.aweme.compliance.business.c.b(z, null, str, hashSet, hashSet2, new HashSet(), new HashSet(), new HashSet(), new HashSet()));
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static void a(String str, List<c> list) {
        String str2;
        if (f61016a) {
            f fVar = f.f61019a;
            if (!(!f.f61021j || f.f61019a == null || !f.f61019a.a(str) || f.f61019a.b(str) || list == null || list.isEmpty())) {
                String str3 = null;
                String str4 = null;
                for (c cVar : list) {
                    if ("X-Tt-Token-Sign".equalsIgnoreCase(cVar.f61014a)) {
                        str4 = cVar.f61015b;
                    } else if ("X-Tt-Token".equalsIgnoreCase(cVar.f61014a)) {
                        str3 = cVar.f61015b;
                    }
                    if (!(TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
                        Iterator<c> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str2 = "";
                                break;
                            }
                            c next = it.next();
                            if ("X-Tt-Logid".equalsIgnoreCase(next.f61014a)) {
                                str2 = next.f61015b;
                                com.ss.android.d.a("TokenFactory", "processResponseHeader logid = ".concat(String.valueOf(str2)));
                                break;
                            }
                        }
                        f.f61019a.a(str4, str3, str2);
                        for (c cVar2 : list) {
                            if ("x-tt-multi-sids".equalsIgnoreCase(cVar2.f61014a)) {
                                String str5 = cVar2.f61015b;
                                fVar.f61023c = str5;
                                if (fVar.f61031m != null) {
                                    fVar.f61031m.a().a("x-tt-multi-sids", str5).a();
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}
