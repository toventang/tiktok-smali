package com.bytedance.ies.d.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<af>> f33246a;

    static {
        Covode.recordClassIndex(19866);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.ies.d.a.af>> */
    /* JADX WARN: Multi-variable type inference failed */
    private r(Map<String, ? extends List<? extends af>> map) {
        l.c(map, "");
        this.f33246a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(org.json.JSONObject r11) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.r.<init>(org.json.JSONObject):void");
    }

    public final p<List<String>, SortedMap<String, String>> a(aj ajVar) {
        String str;
        List<af> list;
        String str2 = "";
        l.c(ajVar, str2);
        String str3 = ajVar.f33213b;
        if (this.f33246a.containsKey(str3)) {
            list = this.f33246a.get(str3);
        } else {
            Uri a2 = ajVar.a();
            String path = a2.getPath();
            if (path == null || (list = this.f33246a.get(path)) == null) {
                String path2 = a2.getPath();
                if (path2 != null) {
                    str2 = path2;
                }
                if (h.m.p.a((CharSequence) str2, '/')) {
                    str = h.m.p.b(str2, '/');
                } else {
                    str = str2 + '/';
                }
                list = this.f33246a.get(str);
            }
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> a3 = it.next().a(ajVar);
                if (a3 != null) {
                    return new p<>(a3, null);
                }
            }
        }
        return null;
    }
}
