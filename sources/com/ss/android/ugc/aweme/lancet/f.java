package com.ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.business.c.c;
import com.ss.android.ugc.aweme.net.j.b;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class f {
    static {
        Covode.recordClassIndex(68578);
    }

    public static Map<String, List<String>> a(URI uri, Map<String, List<String>> map) {
        boolean z;
        if (uri != null) {
            try {
                if (uri.toString().startsWith("http://") && !map.isEmpty()) {
                    b a2 = c.a.a();
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    HashMap hashMap = new HashMap();
                    Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
                    while (true) {
                        int i2 = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        ArrayList arrayList = new ArrayList();
                        for (String str : next.getValue()) {
                            StringBuilder sb = new StringBuilder();
                            String[] split = str.split(";");
                            int length = split.length;
                            int i3 = 0;
                            while (i3 < length) {
                                String str2 = split[i3];
                                String[] split2 = str2.split("=");
                                if (split2.length > i2) {
                                    String trim = split2[0].trim();
                                    hashSet.add(trim);
                                    if (a2 == null || a2.f112396d == null || !a2.f112396d.contains(trim.toLowerCase(Locale.ROOT)) || c.a.a(a2, uri.toString())) {
                                        sb.append(str2).append(";");
                                    } else {
                                        hashSet2.add(trim);
                                    }
                                } else {
                                    sb.append(str2).append(";");
                                }
                                i3++;
                                i2 = 1;
                            }
                            arrayList.add(sb.toString());
                            i2 = 1;
                        }
                        hashMap.put(next.getKey(), arrayList);
                    }
                    if (!hashSet.isEmpty()) {
                        if (!hashSet2.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c.a.a(new com.ss.android.ugc.aweme.compliance.business.c.b(z, null, uri.toString(), new HashSet(), new HashSet(), hashSet, hashSet2, new HashSet(), new HashSet()));
                    }
                    return hashMap;
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
