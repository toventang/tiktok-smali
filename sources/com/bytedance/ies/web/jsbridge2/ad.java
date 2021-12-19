package com.bytedance.ies.web.jsbridge2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<b>> f35575a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    final LruCache<String, c> f35576b;

    /* renamed from: c  reason: collision with root package name */
    private final n.a f35577c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35578d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f35579e = false;

    static {
        Covode.recordClassIndex(21261);
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        ai f35589a = ai.PUBLIC;

        /* renamed from: b  reason: collision with root package name */
        Set<String> f35590b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        Set<String> f35591c = new HashSet();

        static {
            Covode.recordClassIndex(21266);
        }

        c() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Pattern f35585a;

        /* renamed from: b  reason: collision with root package name */
        public ai f35586b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f35587c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f35588d;

        static {
            Covode.recordClassIndex(21265);
        }

        public final String toString() {
            return "RemoteConfig{pattern=" + this.f35585a + ", permissionGroup=" + this.f35586b + ", includedMethods=" + this.f35587c + ", excludedMethods=" + this.f35588d + '}';
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends IllegalStateException {
        static {
            Covode.recordClassIndex(21264);
        }

        a(String str) {
            super(str);
        }
    }

    private static String d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig.".concat(String.valueOf(str));
    }

    public final List<b> b(String str) {
        if (this.f35579e) {
            return this.f35575a.get(str);
        }
        throw new a("Permission config is outdated!");
    }

    public static String a(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("[.]")).length) < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        return split[length - 2] + "." + split[length - 1];
    }

    private static b a(JSONObject jSONObject) {
        b bVar = new b();
        bVar.f35585a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f35586b = ai.from(jSONObject.getString("group"));
        bVar.f35587c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                bVar.f35587c.add(optJSONArray.getString(i2));
            }
        }
        bVar.f35588d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                bVar.f35588d.add(optJSONArray2.getString(i3));
            }
        }
        return bVar;
    }

    public final ai c(String str) {
        ai aiVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String a2 = a(authority);
        if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(authority) && a2 != null) {
            try {
                List<b> b2 = b(a2);
                if (b2 == null) {
                    return null;
                }
                for (b bVar : b2) {
                    if (bVar.f35585a.matcher(str).find() && (aiVar == null || bVar.f35586b.compareTo((Enum) aiVar) >= 0)) {
                        aiVar = bVar.f35586b;
                    }
                }
            } catch (a unused) {
            }
        }
        return aiVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject, List<TimeLineEvent> list) {
        b(jSONObject, list);
        this.f35577c.b(d(this.f35578d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    public final c a(String str, List<TimeLineEvent> list) {
        Object valueOf;
        c cVar = new c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String a2 = a(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || a2 == null) {
            this.f35576b.put(str, cVar);
            return cVar;
        }
        List<b> b2 = b(a2);
        TimeLineEvent.a a3 = new TimeLineEvent.a().a(TimeLineEvent.b.q, a2);
        String str2 = TimeLineEvent.b.f35559m;
        if (b2 == null) {
            valueOf = TimeLineEvent.b.f35554h;
        } else {
            valueOf = Integer.valueOf(b2.size());
        }
        a3.a(str2, valueOf).a(TimeLineEvent.b.aF, list);
        if (b2 == null) {
            cVar.f35589a = ai.PUBLIC;
            this.f35576b.put(str, cVar);
            return cVar;
        }
        for (b bVar : b2) {
            if (bVar.f35585a.matcher(str).find()) {
                if (bVar.f35586b.compareTo((Enum) cVar.f35589a) >= 0) {
                    cVar.f35589a = bVar.f35586b;
                }
                cVar.f35590b.addAll(bVar.f35587c);
                cVar.f35591c.addAll(bVar.f35588d);
            }
        }
        this.f35576b.put(str, cVar);
        new TimeLineEvent.a().a(TimeLineEvent.b.f35553g, TimeLineEvent.b.N).a(TimeLineEvent.b.A, cVar.f35589a.toString()).a(TimeLineEvent.b.B, cVar.f35590b.toString()).a(TimeLineEvent.b.C, cVar.f35591c.toString()).a(TimeLineEvent.b.aG, list);
        return cVar;
    }

    public final void b(JSONObject jSONObject, List<TimeLineEvent> list) {
        try {
            TimeLineEvent.a aVar = new TimeLineEvent.a();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    copyOnWriteArrayList.add(a(jSONArray.getJSONObject(i2)));
                }
                concurrentHashMap.put(next, copyOnWriteArrayList);
                aVar.a(jSONObject.getString("channel"), Long.valueOf(jSONObject.getLong("package_version")));
            }
            this.f35575a = concurrentHashMap;
            aVar.a(TimeLineEvent.b.an, list);
        } catch (JSONException e2) {
            k.b(e2);
            if (list != null) {
                new TimeLineEvent.a().a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage()).a(TimeLineEvent.b.f35551e, jSONObject.toString()).a(TimeLineEvent.b.ao, list);
            }
        }
        this.f35576b.evictAll();
        this.f35579e = true;
    }

    ad(String str, n.a aVar, final Executor executor, JSONObject jSONObject, final List<TimeLineEvent> list) {
        this.f35578d = str;
        this.f35576b = new LruCache<>(128);
        this.f35577c = aVar;
        if (jSONObject == null) {
            aVar.a(d(str), new n.a.AbstractC0809a() {
                /* class com.bytedance.ies.web.jsbridge2.ad.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21262);
                }

                @Override // com.bytedance.ies.web.jsbridge2.n.a.AbstractC0809a
                public final void a(final String str) {
                    executor.execute(new Runnable() {
                        /* class com.bytedance.ies.web.jsbridge2.ad.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(21263);
                        }

                        public final void run() {
                            if (list != null) {
                                new TimeLineEvent.a().a(TimeLineEvent.b.f35551e, Boolean.valueOf(!TextUtils.isEmpty(str))).a(TimeLineEvent.b.am, list);
                            }
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    ad.this.b(new JSONObject(str), list);
                                } catch (JSONException e2) {
                                    k.b(e2);
                                }
                            }
                        }
                    });
                }
            });
        } else {
            a(jSONObject, list);
        }
    }
}
