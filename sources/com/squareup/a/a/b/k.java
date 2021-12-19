package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.b;
import com.squareup.a.p;
import com.squareup.a.v;
import com.squareup.a.x;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final String f57692a = "OkHttp";

    /* renamed from: b  reason: collision with root package name */
    public static final String f57693b = ("OkHttp" + "-Sent-Millis");

    /* renamed from: c  reason: collision with root package name */
    public static final String f57694c = ("OkHttp" + "-Received-Millis");

    /* renamed from: d  reason: collision with root package name */
    public static final String f57695d = ("OkHttp" + "-Selected-Protocol");

    /* renamed from: e  reason: collision with root package name */
    public static final String f57696e = ("OkHttp" + "-Response-Source");

    /* renamed from: f  reason: collision with root package name */
    private static final Comparator<String> f57697f = new Comparator<String>() {
        /* class com.squareup.a.a.b.k.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35954);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    };

    static {
        Covode.recordClassIndex(35953);
    }

    public static long a(p pVar) {
        return b(pVar.a("Content-Length"));
    }

    private static long b(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static Map<String, List<String>> b(p pVar) {
        TreeMap treeMap = new TreeMap(f57697f);
        int length = pVar.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String a2 = pVar.a(i2);
            String b2 = pVar.b(i2);
            ArrayList arrayList = new ArrayList();
            Collection collection = (Collection) treeMap.get(a2);
            if (collection != null) {
                arrayList.addAll(collection);
            }
            arrayList.add(b2);
            treeMap.put(a2, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static Set<String> c(p pVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = pVar.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            if ("Vary".equalsIgnoreCase(pVar.a(i2))) {
                String b2 = pVar.b(i2);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = b2.split(",");
                for (String str : split) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    static boolean a(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static p a(p pVar, p pVar2) {
        Set<String> c2 = c(pVar2);
        if (c2.isEmpty()) {
            return new p.a().a();
        }
        p.a aVar = new p.a();
        int length = pVar.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String a2 = pVar.a(i2);
            if (c2.contains(a2)) {
                aVar.a(a2, pVar.b(i2));
            }
        }
        return aVar.a();
    }

    public static void a(v.a aVar, Map<String, List<String>> map) {
        String sb;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                List<String> value = entry.getValue();
                if (value.size() == 1) {
                    sb = value.get(0);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int size = value.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (i2 > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(value.get(i2));
                    }
                    sb = sb2.toString();
                }
                aVar.b(key, sb);
            }
        }
    }

    public static v a(b bVar, x xVar, Proxy proxy) {
        if (xVar.f57933c == 407) {
            return bVar.b(proxy, xVar);
        }
        return bVar.a(proxy, xVar);
    }
}
