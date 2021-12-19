package com.bytedance.frameworks.baselib.network.http.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static String f28978a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f28979b = f.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f28980d = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f28981c;

    /* renamed from: e  reason: collision with root package name */
    private final Map<URI, Set<h>> f28982e = new LinkedHashMap();

    static {
        Covode.recordClassIndex(16998);
    }

    public final synchronized void a() {
        MethodCollector.i(2246);
        Map<URI, Set<h>> map = this.f28982e;
        if (map == null || map.isEmpty()) {
            MethodCollector.o(2246);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<URI, Set<h>> entry : this.f28982e.entrySet()) {
            if (entry != null) {
                URI key = entry.getKey();
                if (key.getScheme() != null && key.getScheme().equals("https")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            MethodCollector.o(2246);
            return;
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2 != null) {
                URI uri = (URI) entry2.getKey();
                Set<h> set = (Set) entry2.getValue();
                try {
                    URI uri2 = new URI(uri.toString().replace("https:", "http:"));
                    Set<h> set2 = this.f28982e.get(uri2);
                    if (set2 == null || set2.isEmpty()) {
                        this.f28982e.remove(uri);
                        this.f28982e.put(uri2, set);
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (h hVar : set2) {
                            boolean z = false;
                            for (h hVar2 : set) {
                                if (hVar != null && hVar2 != null && hVar.getHttpCookie().equals(hVar2.getHttpCookie()) && hVar2.getWhenCreated().longValue() >= hVar.getWhenCreated().longValue()) {
                                    linkedHashSet.add(hVar2);
                                    z = true;
                                }
                            }
                            if (!z) {
                                linkedHashSet.add(hVar);
                            }
                        }
                        for (h hVar3 : set) {
                            if (!linkedHashSet.contains(hVar3)) {
                                linkedHashSet.add(hVar3);
                            }
                        }
                        this.f28982e.remove(uri);
                        this.f28982e.put(uri2, linkedHashSet);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            Map<URI, Set<h>> map2 = this.f28982e;
            if (map2 != null) {
                if (!map2.isEmpty()) {
                    SharedPreferences.Editor edit = this.f28981c.edit();
                    edit.clear();
                    for (Map.Entry<URI, Set<h>> entry3 : this.f28982e.entrySet()) {
                        URI key2 = entry3.getKey();
                        for (h hVar4 : entry3.getValue()) {
                            String str = key2.toString() + "|" + hVar4.getHttpCookie().f28965f;
                            String encode = hVar4.encode();
                            if (hVar4.getHttpCookie().f28964e > 0) {
                                edit.putString(str, encode);
                            } else {
                                f28980d.put(str, encode);
                            }
                        }
                    }
                    a.a(edit);
                    MethodCollector.o(2246);
                    return;
                }
            }
            MethodCollector.o(2246);
        } catch (Throwable unused2) {
            MethodCollector.o(2246);
        }
    }

    public f(Context context) {
        String str = f28978a;
        str = str == null ? "cookieStore" : str;
        int i2 = Build.VERSION.SDK_INT;
        SharedPreferences a2 = d.a(context, str, 4);
        this.f28981c = a2;
        a(a2.getAll(), true);
        a((Map<String, ?>) f28980d, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0015 A[SYNTHETIC] */
    @Override // com.bytedance.frameworks.baselib.network.http.c.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.bytedance.frameworks.baselib.network.http.c.e> a(java.net.URI r11) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.f.a(java.net.URI):java.util.List");
    }

    private static URI b(URI uri, e eVar) {
        String str;
        if (eVar.f28963d == null) {
            return uri;
        }
        String str2 = eVar.f28963d;
        if (str2.charAt(0) == '.') {
            str2 = str2.substring(1);
        }
        try {
            if (eVar.f28966g == null) {
                str = "/";
            } else {
                str = eVar.f28966g;
            }
            return new URI("http", str2, str, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    private void a(URI uri, List<h> list) {
        SharedPreferences.Editor edit = this.f28981c.edit();
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            String str = uri.toString() + "|" + it.next().getHttpCookie().f28965f;
            edit.remove(str);
            f28980d.remove(str);
        }
        edit.apply();
    }

    private synchronized void a(Map<String, ?> map, boolean z) {
        MethodCollector.i(2228);
        if (map == null || map.isEmpty()) {
            MethodCollector.o(2228);
            return;
        }
        try {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                try {
                    URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                    h decode = h.decode((String) entry.getValue());
                    Set<h> set = this.f28982e.get(uri);
                    if (set == null) {
                        set = new HashSet<>();
                        this.f28982e.put(uri, set);
                    }
                    if (decode != null) {
                        set.add(decode);
                    }
                } catch (URISyntaxException e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                e.a(new Runnable() {
                    /* class com.bytedance.frameworks.baselib.network.http.c.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16999);
                    }

                    public final void run() {
                        try {
                            f.this.a();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            MethodCollector.o(2228);
        } catch (Throwable unused) {
            MethodCollector.o(2228);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.c.c
    public final synchronized void a(URI uri, e eVar) {
        MethodCollector.i(2261);
        URI b2 = b(uri, eVar);
        Set<h> set = this.f28982e.get(b2);
        h hVar = new h(eVar);
        if (set == null) {
            set = new HashSet<>();
            this.f28982e.put(b2, set);
        } else {
            set.remove(hVar);
        }
        set.add(hVar);
        String str = b2.toString() + "|" + hVar.getHttpCookie().f28965f;
        String encode = hVar.encode();
        if (hVar.getHttpCookie().f28964e > 0) {
            SharedPreferences.Editor edit = this.f28981c.edit();
            edit.putString(str, encode);
            edit.apply();
            MethodCollector.o(2261);
            return;
        }
        f28980d.put(str, encode);
        MethodCollector.o(2261);
    }
}
