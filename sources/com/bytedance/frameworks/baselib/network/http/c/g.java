package com.bytedance.frameworks.baselib.network.http.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.c;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.ss.android.ugc.aweme.feed.experiment.ag;
import com.ss.android.ugc.aweme.lancet.f;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends CookieManager {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28984a;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f28985g;

    /* renamed from: b  reason: collision with root package name */
    public volatile a f28986b;

    /* renamed from: c  reason: collision with root package name */
    private final android.webkit.CookieManager f28987c;

    /* renamed from: d  reason: collision with root package name */
    private Pattern f28988d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e  reason: collision with root package name */
    private final a f28989e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f28990f;

    public interface a {
        static {
            Covode.recordClassIndex(17002);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(17000);
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final Map get(URI uri, Map map) {
        return a(this, uri, map);
    }

    private boolean a(URI uri, String str) {
        if (uri != null && !m.a(str)) {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String str2 = "";
                Matcher matcher = this.f28988d.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group().toLowerCase();
                }
                if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static List<String> a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return map.get(str.toLowerCase());
        }
        return list;
    }

    private Map<String, List<String>> a(URI uri, Map<String, List<String>> map) {
        String str;
        Map<String, List<String>> map2;
        Map<String, List<String>> a2;
        android.webkit.CookieManager cookieManager = null;
        try {
            str = uri.toString();
            if (map != null) {
                try {
                    List<String> a3 = a(map, "X-SS-No-Cookie");
                    if (a3 != null) {
                        for (String str2 : a3) {
                            if (str2 != null && Boolean.parseBoolean(str2)) {
                                Logger.debug();
                                return Collections.emptyMap();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            e.d dVar = e.f29338j;
            if (dVar != null && (a2 = dVar.a()) != null && !a2.isEmpty() && (a2.containsKey("Cookie") || a2.containsKey("X-SS-Cookie"))) {
                return a2;
            }
        } catch (Throwable unused2) {
            str = null;
        }
        if (uri == null || this.f28987c == null) {
            return Collections.emptyMap();
        }
        try {
            e.h hVar = e.f29337i;
            if (hVar != null) {
                if (!f28985g) {
                    cookieManager = this.f28987c;
                }
                List<String> a4 = hVar.a(cookieManager, this.f28986b, uri);
                if (!h.a(a4)) {
                    return a(a4, map);
                }
            }
        } catch (Throwable unused3) {
        }
        if (!f28985g) {
            try {
                String cookie = this.f28987c.getCookie(str);
                if (cookie != null && cookie.length() > 0) {
                    Logger.debug();
                    return a(Collections.singletonList(cookie), map);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.f28986b == null) {
            return Collections.emptyMap();
        }
        try {
            a aVar = this.f28986b;
            if (map == null) {
                map2 = new LinkedHashMap<>();
            } else {
                map2 = map;
            }
            Map<String, List<String>> map3 = aVar.get(uri, map2);
            if (map3 != null && !map3.isEmpty()) {
                return a(map3.get("Cookie"), map);
            }
        } catch (Throwable unused4) {
        }
        return Collections.emptyMap();
    }

    private static Map<String, List<String>> a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f28984a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List<String> a2 = a(map, "Cookie");
                if (a2 == null || a2.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List<String> a3 = a(map, "X-SS-Cookie");
                if (a3 != null && !a3.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List<String> a4 = a(map, "Cookie");
            if (a4 == null || a4.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0228, code lost:
        if (r4 < com.ss.android.ugc.aweme.lancet.e.f107208a.length) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x022a, code lost:
        com.ss.android.ugc.aweme.lancet.b.a.b();
        com.ss.android.ugc.aweme.lancet.b.a.f107179a = !com.ss.android.ugc.aweme.lancet.b.a.f107179a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0237, code lost:
        if (com.ss.android.ugc.aweme.lancet.b.a.b() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        android.webkit.CookieManager.getInstance().flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r21 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r21.size() <= 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r7 = (java.util.List) r21.get("Set-Cookie");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r7 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r6 = com.ss.android.ugc.aweme.lancet.e.f107208a;
        r5 = r6.length;
        r4 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r3 >= r5) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        r2 = r6[r3];
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r1.hasNext() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (((java.lang.String) r1.next()).startsWith(r2) == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        com.ss.android.ugc.aweme.lancet.b.a.b();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        r3 = r3 + 1;
     */
    @Override // java.net.CookieHandler, java.net.CookieManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void put(java.net.URI r20, java.util.Map r21) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.g.put(java.net.URI, java.util.Map):void");
    }

    private void a(String str, boolean z) {
        if (z) {
            android.webkit.CookieManager.getInstance().flush();
            return;
        }
        ArrayList<String> arrayList = this.f28990f;
        if (arrayList != null && !arrayList.isEmpty() && Build.VERSION.SDK_INT >= 21) {
            Iterator<String> it = this.f28990f.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    android.webkit.CookieManager.getInstance().flush();
                    return;
                }
            }
        }
    }

    private void a(JSONObject jSONObject, String str, boolean z) {
        if (this.f28989e != null && z) {
            try {
                jSONObject.put("return", str);
            } catch (JSONException unused) {
            }
            this.f28989e.a();
        }
    }

    private static Map a(g gVar, URI uri, Map map) {
        List list;
        boolean z = com.ss.android.ugc.aweme.lancet.b.a.f107179a;
        Map<String, List<String>> a2 = gVar.a(uri, map);
        if (z) {
            try {
                HashMap hashMap = new HashMap(a2);
                if (map == null || TextUtils.isEmpty("Cookie")) {
                    list = null;
                } else {
                    list = (List) map.get("Cookie");
                    if (list == null || list.isEmpty()) {
                        list = (List) map.get("Cookie".toLowerCase());
                    }
                }
                if (list != null && list.size() > 0) {
                    hashMap.put("Cookie", list);
                }
                com.ss.android.ugc.aweme.lancet.b.a.a(uri, hashMap);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return f.a(uri, a2);
    }

    private static void a(android.webkit.CookieManager cookieManager, String str, String str2) {
        String cookie;
        cookieManager.setCookie(str, str2);
        if (com.ss.android.common.util.f.a(com.bytedance.ies.ugc.appcontext.g.a()) && ag.a() && (cookie = android.webkit.CookieManager.getInstance().getCookie(com.ss.android.ugc.aweme.feed.f.a.a())) != null && !TextUtils.equals(cookie, com.ss.android.ugc.aweme.feed.f.a.b())) {
            com.ss.android.ugc.aweme.feed.f.a.a(com.ss.android.ugc.aweme.feed.f.a.a(), cookie);
        }
    }

    public g(final Context context, int i2, android.webkit.CookieManager cookieManager, a aVar) {
        if (i2 > 0) {
            c.f26893c.schedule(new Runnable() {
                /* class com.bytedance.frameworks.baselib.network.http.c.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17001);
                }

                public final void run() {
                    g.this.f28986b = new a(new f(context), b.f28955a);
                }
            }, (long) i2, TimeUnit.SECONDS);
        } else {
            this.f28986b = new a(new f(context), b.f28955a);
        }
        this.f28987c = cookieManager;
        this.f28990f = null;
        this.f28989e = aVar;
        try {
            new JSONObject().put("init", "success");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a aVar2 = this.f28989e;
        if (aVar2 != null) {
            aVar2.a();
        }
    }
}
