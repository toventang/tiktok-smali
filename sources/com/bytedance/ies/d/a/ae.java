package com.bytedance.ies.d.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.w;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, af> f33192a;

    static {
        Covode.recordClassIndex(19826);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.String, ? extends com.bytedance.ies.d.a.af> */
    /* JADX WARN: Multi-variable type inference failed */
    private ae(Map<String, ? extends af> map) {
        this.f33192a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ae(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            h.f.b.l.c(r7, r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r7.keys()
            h.f.b.l.a(r3, r5)
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            h.f.b.l.a(r2, r5)
            com.bytedance.ies.d.a.af r1 = new com.bytedance.ies.d.a.af
            org.json.JSONObject r0 = r7.getJSONObject(r2)
            h.f.b.l.a(r0, r5)
            r1.<init>(r2, r0)
            r4.put(r2, r1)
            goto L_0x0011
        L_0x0030:
            r6.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.ae.<init>(org.json.JSONObject):void");
    }

    public final p<List<String>, SortedMap<String, String>> a(aj ajVar) {
        l.c(ajVar, "");
        Uri a2 = ajVar.a();
        String str = ajVar.f33213b;
        String path = a2.getPath();
        if (path != null) {
            for (Map.Entry<String, af> entry : this.f33192a.entrySet()) {
                boolean z = false;
                List<String> split = new h.m.l("/").split(path, 0);
                List<String> split2 = new h.m.l("/").split(entry.getKey(), 0);
                if (split.size() == split2.size()) {
                    TreeMap treeMap = new TreeMap();
                    int size = split.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            String str2 = split2.get(i2);
                            if (!h.m.p.b(str2, ":", z)) {
                                if (!l.a((Object) split.get(i2), (Object) str2)) {
                                    break;
                                }
                            } else if (str2 != null) {
                                String substring = str2.substring(1);
                                l.a((Object) substring, "");
                                treeMap.put(substring, split.get(i2));
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                            i2++;
                            z = false;
                        } else {
                            q.b("[scheme:" + str + "] match_result_rule:" + entry.getKey());
                            List<String> a3 = entry.getValue().a(ajVar);
                            if (a3 != null) {
                                return new p<>(a3, treeMap);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
