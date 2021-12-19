package com.bytedance.lynx.a.a.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.a.a.b.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40842a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<c, Map<String, String>> f40843b = new ConcurrentHashMap();

    private a() {
    }

    static {
        Covode.recordClassIndex(25036);
    }

    public static final Map<String, String> a(c cVar) {
        l.c(cVar, "");
        Map<String, String> map = f40843b.get(cVar);
        if (map == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    public static final Map<String, String> a(c cVar, Uri uri, Map<String, String> map) {
        l.c(cVar, "");
        l.c(uri, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                l.a((Object) str, "");
                linkedHashMap.put(str, queryParameter);
            }
        }
        f40843b.put(cVar, linkedHashMap);
        return linkedHashMap;
    }
}
