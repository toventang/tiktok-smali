package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.d.a.y;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab implements o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f33169d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ah<String, y> f33170a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<String> f33171b = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final g f33172c;

    /* renamed from: e  reason: collision with root package name */
    private final i f33173e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f33174f;

    static {
        Covode.recordClassIndex(19818);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19819);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.d.a.o
    public final void a(String str, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3, ad adVar) {
        boolean z;
        l.c(adVar, "");
        q.a("Start request: ".concat(String.valueOf(adVar)));
        SortedMap<String, ai> sortedMap4 = adVar.f33187e;
        JSONObject jSONObject = null;
        SortedMap<String, String> a2 = sortedMap4 != null ? a(sortedMap, sortedMap2, null, sortedMap4) : null;
        SortedMap<String, ai> sortedMap5 = adVar.f33188f;
        if (sortedMap5 != null) {
            jSONObject = ak.a(a(sortedMap, sortedMap2, null, sortedMap5));
        }
        z zVar = new z(adVar.f33183a, adVar.f33184b, adVar.f33186d, a2, jSONObject, adVar.f33190h, adVar.f33191i);
        String str2 = zVar.f33282c;
        Locale locale = Locale.ROOT;
        l.a((Object) locale, "");
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(locale);
            l.a((Object) lowerCase, "");
            if (l.a((Object) lowerCase, (Object) UGCMonitor.TYPE_POST)) {
                z = true;
            } else {
                y a3 = this.f33170a.a(zVar.toString());
                if (a3 != null) {
                    z = a(a3);
                } else {
                    z = true;
                }
            }
            a(str, zVar, adVar.f33189g, false, z);
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.d.a.o
    public final void a() {
        this.f33170a.b();
        g gVar = this.f33172c;
        if (gVar != null) {
            gVar.a("__prefetch_cache_key_array", this.f33171b);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f33179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f33180b;

        static {
            Covode.recordClassIndex(19821);
        }

        c(ab abVar, h.f.a.a aVar) {
            this.f33179a = abVar;
            this.f33180b = aVar;
        }

        public final void run() {
            g gVar = this.f33179a.f33172c;
            if (gVar != null) {
                Collection<String> b2 = gVar.b("__prefetch_cache_key_array");
                if (b2 == null) {
                    q.a("Nothing found in LocalStorage.");
                    gVar.a();
                    return;
                }
                for (String str : b2) {
                    String a2 = gVar.a(str);
                    if (a2 != null) {
                        try {
                            y a3 = y.a.a(new JSONObject(a2));
                            if (ab.a(a3)) {
                                gVar.c(str);
                            } else {
                                this.f33179a.f33170a.a(str, a3);
                                this.f33179a.f33171b.add(str);
                            }
                        } catch (JSONException e2) {
                            q.a("Failed to load cache at ".concat(String.valueOf(str)), e2);
                        }
                    }
                }
            }
            this.f33180b.invoke();
        }
    }

    @Override // com.bytedance.ies.d.a.o
    public final void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f33174f.execute(new c(this, aVar));
    }

    public static final class b implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f33175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y f33177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z f33178d;

        static {
            Covode.recordClassIndex(19820);
        }

        @Override // com.bytedance.ies.d.a.i.a
        public final void a(Throwable th) {
            l.c(th, "");
            q.a("Request failed, url: " + this.f33176b);
            this.f33177c.a(th);
        }

        @Override // com.bytedance.ies.d.a.i.a
        public final void a(i.c cVar) {
            l.c(cVar, "");
            q.a("Received response, url: " + this.f33176b);
            this.f33177c.a(cVar);
            if (this.f33177c.f33278j > 0) {
                q.a("Putting to cache, key: " + this.f33178d + ", expires: " + this.f33177c.f33278j);
                this.f33175a.a(this.f33178d, this.f33177c);
            }
        }

        b(ab abVar, String str, y yVar, z zVar) {
            this.f33175a = abVar;
            this.f33176b = str;
            this.f33177c = yVar;
            this.f33178d = zVar;
        }
    }

    public static boolean a(y yVar) {
        if ((System.currentTimeMillis() - yVar.f33277i) - yVar.f33278j > 0) {
            return true;
        }
        return false;
    }

    private final void c(z zVar) {
        String zVar2 = zVar.toString();
        this.f33170a.b(zVar2);
        g gVar = this.f33172c;
        if (gVar != null) {
            if (this.f33171b.remove(zVar2)) {
                gVar.a("__prefetch_cache_key_array", this.f33171b);
            }
            gVar.c(zVar2);
        }
    }

    @Override // com.bytedance.ies.d.a.o
    public final y b(z zVar) {
        l.c(zVar, "");
        q.a("Skip Cache to normal fetch for " + zVar + '.');
        return a((String) null, zVar, -1L, true, true);
    }

    @Override // com.bytedance.ies.d.a.o
    public final y a(z zVar) {
        String a2;
        Object obj;
        l.c(zVar, "");
        q.a("Start to get from cache for " + zVar + '.');
        String zVar2 = zVar.toString();
        y a3 = this.f33170a.a(zVar2);
        if (a3 == null) {
            q.a("Not found in lruCache.");
            g gVar = this.f33172c;
            if (!(gVar == null || (a2 = gVar.a(zVar2)) == null)) {
                try {
                    obj = q.m223constructorimpl(y.a.a(new JSONObject(a2)));
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                if (q.m228isFailureimpl(obj)) {
                    obj = null;
                }
                y yVar = (y) obj;
                if (yVar == null || a(yVar)) {
                    q.a("Found in local storage but expired.");
                    c(zVar);
                } else {
                    q.a("Found in local storage.");
                    yVar.a(y.b.CACHED);
                    a(zVar, yVar);
                    return yVar;
                }
            }
        } else if (!a(a3)) {
            q.a("Found in lruCache.");
            if (a3.f33274f != null) {
                a3.a(y.b.CACHED);
            }
            return a3;
        } else {
            q.a("Found in lruCache but expired.");
            c(zVar);
        }
        q.a("Fallback to normal fetch.");
        return a((String) null, zVar, -1L, true, true);
    }

    static final class d extends m implements h.f.a.m<String, y, Boolean> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(19822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ab abVar) {
            super(2);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(String str, y yVar) {
            y yVar2 = yVar;
            l.c(str, "");
            l.c(yVar2, "");
            return Boolean.valueOf(ab.a(yVar2));
        }
    }

    static final class e extends m implements h.f.a.m<String, y, z> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(19823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ab abVar) {
            super(2);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, y yVar) {
            String str2 = str;
            y yVar2 = yVar;
            l.c(str2, "");
            l.c(yVar2, "");
            g gVar = this.this$0.f33172c;
            if (gVar != null) {
                gVar.c(str2);
                this.this$0.f33171b.remove(str2);
                gVar.a("__prefetch_cache_key_array", this.this$0.f33171b);
            }
            q.a("PrefetchRequest " + yVar2.f33276h.f33281b + " expired(expires: " + yVar2.f33278j + "), removed from cache.");
            return z.f158842a;
        }
    }

    public final void a(z zVar, y yVar) {
        g gVar;
        if (yVar.f33278j > 0) {
            String zVar2 = zVar.toString();
            this.f33170a.a(zVar2, yVar);
            if (yVar.f33274f != null && (gVar = this.f33172c) != null) {
                if (this.f33171b.add(zVar2)) {
                    gVar.a("__prefetch_cache_key_array", this.f33171b);
                }
                String jSONObject = yVar.a().toString();
                l.a((Object) jSONObject, "");
                gVar.a(zVar2, jSONObject);
            }
        }
    }

    @Override // com.bytedance.ies.d.a.o
    public final List<y> a(String str, h hVar) {
        l.c(str, "");
        q.a("Start to get cache by " + str + '.');
        ArrayList arrayList = null;
        for (T t : this.f33170a.a().values()) {
            if (l.a((Object) str, (Object) t.f33275g)) {
                if (!a((y) t)) {
                    q.a(t.f33276h.f33281b + " found in lruCache.");
                    if (t.f33274f != null) {
                        t.a(y.b.CACHED);
                    }
                    t.f33272d = t.f33277i;
                    t.f33270b = hVar;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(t);
                } else {
                    q.a(t.f33276h.f33281b + " found in lruCache but expired.");
                    c(t.f33276h);
                }
            }
        }
        return arrayList;
    }

    public ab(g gVar, i iVar, Executor executor, int i2) {
        l.c(iVar, "");
        l.c(executor, "");
        this.f33172c = gVar;
        this.f33173e = iVar;
        this.f33174f = executor;
        this.f33170a = new ah<>(i2, new d(this), new e(this));
    }

    private static SortedMap<String, String> a(SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3, SortedMap<String, ai> sortedMap4) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, ai> entry : sortedMap4.entrySet()) {
            ai value = entry.getValue();
            if (value instanceof ag) {
                str = entry.getValue().f33211a;
            } else if (value instanceof al) {
                if (sortedMap3 != null) {
                    str = sortedMap3.get(entry.getValue().f33211a);
                }
                q.a("No param '" + entry.getValue().f33211a + "' found.");
            } else if (value instanceof t) {
                if (sortedMap != null) {
                    str = sortedMap.get(entry.getValue().f33211a);
                }
                q.a("No param '" + entry.getValue().f33211a + "' found.");
            } else {
                if (sortedMap2 != null) {
                    str = sortedMap2.get(entry.getValue().f33211a);
                }
                q.a("No param '" + entry.getValue().f33211a + "' found.");
            }
            if (str != null) {
                String key = entry.getKey();
                l.a((Object) key, "");
                treeMap.put(key, str);
                q.a("Append param: " + entry.getKey() + " = " + str);
            }
            q.a("No param '" + entry.getValue().f33211a + "' found.");
        }
        return treeMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.d.a.y a(java.lang.String r11, com.bytedance.ies.d.a.z r12, long r13, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.ab.a(java.lang.String, com.bytedance.ies.d.a.z, long, boolean, boolean):com.bytedance.ies.d.a.y");
    }
}
