package com.bytedance.frameworks.baselib.network.http.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.c.e;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class a extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    private c f28953a;

    /* renamed from: b  reason: collision with root package name */
    private b f28954b;

    static {
        Covode.recordClassIndex(16988);
    }

    public a() {
        this(null, null);
    }

    private static List<e> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                for (String str : entry.getValue()) {
                    try {
                        for (e eVar : new e.a(str).a()) {
                            arrayList.add(eVar);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, List<String>> a(List<e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        for (e eVar : list) {
            i2 = Math.min(i2, eVar.f28971l);
        }
        if (i2 == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(list.get(0).toString());
        for (int i3 = 1; i3 < list.size(); i3++) {
            sb.append("; ").append(list.get(i3).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public a(c cVar, b bVar) {
        this.f28953a = cVar == null ? new d() : cVar;
        this.f28954b = bVar == null ? b.f28957c : bVar;
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f28953a.a(uri)) {
            if (e.a(eVar, uri) && ((!eVar.f28968i || "https".equalsIgnoreCase(uri.getScheme())) && e.b(eVar, uri))) {
                arrayList.add(eVar);
            }
        }
        return a(arrayList);
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final void put(URI uri, Map<String, List<String>> map) {
        String substring;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (e eVar : a(map)) {
            if (eVar.f28963d == null) {
                eVar.a(uri.getHost());
            }
            if (eVar.f28966g == null) {
                String path = uri.getPath();
                if (path == null) {
                    substring = "/";
                } else {
                    substring = path.substring(0, path.lastIndexOf(47) + 1);
                }
                eVar.f28966g = substring;
            } else if (!e.a(eVar, uri)) {
            }
            if ("".equals(eVar.f28967h)) {
                eVar.f28967h = Integer.toString(h.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (eVar.f28967h != null && !e.b(eVar, uri)) {
            }
            if (this.f28954b.a(uri, eVar)) {
                this.f28953a.a(uri, eVar);
            }
        }
    }
}
