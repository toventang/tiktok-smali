package com.ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f87532a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(55025);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f87533a = new HashMap();

        static {
            Covode.recordClassIndex(55026);
        }

        public final void a(Map<String, ? extends Object> map) {
            l.d(map, "");
            this.f87533a.putAll(map);
        }

        public static int a(a aVar, Map<String, ? extends Object> map) {
            l.d(aVar, "");
            l.d(map, "");
            aVar.f87533a.putAll(map);
            return 0;
        }

        public final void b(String str, Object obj) {
            l.d(str, "");
            l.d(obj, "");
            this.f87533a.put(str, obj);
        }

        public final void c(String str, Object obj) {
            l.d(str, "");
            if (obj != null) {
                this.f87533a.put(str, obj);
            }
        }

        public final void a(String str, Object obj) {
            l.d(str, "");
            l.d(obj, "");
            this.f87533a.put(str, obj);
        }
    }

    public static void a(String str, b<? super a, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        JSONObject jSONObject = new JSONObject();
        a aVar = new a();
        bVar.invoke(aVar);
        for (Map.Entry<String, Object> entry : aVar.f87533a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        r.a(str, jSONObject);
    }

    public static void a(String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        r.a(str, jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, java.lang.String r5, h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.track.c.a, h.z> r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.track.c.a(android.content.Context, java.lang.String, h.f.a.b):void");
    }

    public static void a(String str, Map<String, ? extends Object> map, b<? super Map<String, Object>, z> bVar) {
        l.d(str, "");
        l.d(map, "");
        l.d(bVar, "");
        JSONObject jSONObject = new JSONObject();
        Map d2 = ag.d(map);
        bVar.invoke(d2);
        for (Map.Entry entry : d2.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        r.a(str, jSONObject);
    }
}
