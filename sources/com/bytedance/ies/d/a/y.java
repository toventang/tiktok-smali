package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import h.f.b.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.json.JSONObject;

public final class y implements i.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f33268k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final transient Set<aa> f33269a;

    /* renamed from: b  reason: collision with root package name */
    public transient h f33270b;

    /* renamed from: c  reason: collision with root package name */
    public transient b f33271c;

    /* renamed from: d  reason: collision with root package name */
    public transient long f33272d;

    /* renamed from: e  reason: collision with root package name */
    public transient Throwable f33273e;

    /* renamed from: f  reason: collision with root package name */
    public i.c f33274f;

    /* renamed from: g  reason: collision with root package name */
    public final String f33275g;

    /* renamed from: h  reason: collision with root package name */
    public final z f33276h;

    /* renamed from: i  reason: collision with root package name */
    public final long f33277i;

    /* renamed from: j  reason: collision with root package name */
    public final long f33278j;

    public enum b {
        FALLBACK,
        PENDING,
        CACHED;

        static {
            Covode.recordClassIndex(19880);
        }
    }

    static {
        Covode.recordClassIndex(19878);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19879);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static y a(JSONObject jSONObject) {
            SortedMap<String, String> sortedMap;
            l.c(jSONObject, "");
            String string = jSONObject.getString("page_url");
            l.a((Object) string, "");
            JSONObject jSONObject2 = jSONObject.getJSONObject("request");
            l.a((Object) jSONObject2, "");
            y yVar = new y(string, new z(jSONObject2), jSONObject.getLong("timestamp"), jSONObject.getLong("expires"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("response");
            new i.c();
            l.a((Object) jSONObject3, "");
            l.c(jSONObject3, "");
            i.c cVar = new i.c();
            JSONObject optJSONObject = jSONObject3.optJSONObject("headers");
            SortedMap<String, String> sortedMap2 = null;
            if (optJSONObject != null) {
                sortedMap = ak.a(optJSONObject);
            } else {
                sortedMap = null;
            }
            cVar.f33238c = sortedMap;
            cVar.f33237b = jSONObject3.optString("body");
            cVar.f33239d = jSONObject3.optInt("status_code");
            JSONObject optJSONObject2 = jSONObject3.optJSONObject("extra");
            if (optJSONObject2 != null) {
                sortedMap2 = ak.a(optJSONObject2);
            }
            cVar.f33240e = sortedMap2;
            yVar.f33274f = cVar;
            return yVar;
        }
    }

    private final void b() {
        String str;
        Class<?> cls;
        if (this.f33270b != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f33272d;
            h hVar = this.f33270b;
            if (hVar != null) {
                hVar.a(this.f33276h, this.f33271c);
            }
            StringBuilder append = new StringBuilder("{ request: ").append(this.f33276h.f33281b).append("], duration: ").append(currentTimeMillis).append(", hitState: ").append(this.f33271c).append(", content: ").append(this.f33276h.a()).append(", error: ");
            Throwable th = this.f33273e;
            if (th == null || (cls = th.getClass()) == null) {
                str = null;
            } else {
                str = cls.getSimpleName();
            }
            q.b(append.append(str).append(" }").toString());
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        JSONObject put = new JSONObject().put("page_url", this.f33275g).put("request", this.f33276h.a()).put("timestamp", this.f33277i).put("expires", this.f33278j);
        i.c cVar = this.f33274f;
        JSONObject jSONObject2 = null;
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            Map<String, String> map = cVar.f33238c;
            if (map != null) {
                jSONObject = ak.a(map);
            } else {
                jSONObject = null;
            }
            jSONObject3.put("headers", jSONObject);
            jSONObject3.put("body", cVar.a());
            jSONObject3.put("status_code", cVar.f33239d);
            Map<String, String> map2 = cVar.f33240e;
            if (map2 != null) {
                jSONObject2 = ak.a(map2);
            }
            jSONObject3.put("extra", jSONObject2);
            jSONObject2 = jSONObject3;
        }
        JSONObject put2 = put.put("response", jSONObject2);
        l.a((Object) put2, "");
        return put2;
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        this.f33271c = bVar;
    }

    public final void a(aa aaVar) {
        l.c(aaVar, "");
        this.f33269a.add(aaVar);
        i.c cVar = this.f33274f;
        if (cVar != null) {
            b();
            aaVar.a(cVar);
        }
        Throwable th = this.f33273e;
        if (th != null) {
            b();
            aaVar.a(th);
        }
    }

    @Override // com.bytedance.ies.d.a.i.a
    public final void a(i.c cVar) {
        l.c(cVar, "");
        this.f33274f = cVar;
        b();
        Set<aa> set = this.f33269a;
        l.a((Object) set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
    }

    @Override // com.bytedance.ies.d.a.i.a
    public final void a(Throwable th) {
        l.c(th, "");
        this.f33273e = th;
        b();
        Set<aa> set = this.f33269a;
        l.a((Object) set, "");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            it.next().a(th);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public y(String str, z zVar, long j2) {
        this(str, zVar, System.currentTimeMillis(), j2);
        l.c(str, "");
        l.c(zVar, "");
    }

    public y(String str, z zVar, long j2, long j3) {
        l.c(str, "");
        l.c(zVar, "");
        this.f33275g = str;
        this.f33276h = zVar;
        this.f33277i = j2;
        this.f33278j = j3;
        this.f33269a = Collections.synchronizedSet(new HashSet());
        this.f33271c = b.FALLBACK;
        this.f33272d = System.currentTimeMillis();
    }
}
