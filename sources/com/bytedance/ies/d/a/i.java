package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.y;
import h.f.b.l;
import h.m.d;
import h.q;
import h.r;
import java.util.Map;
import org.json.JSONObject;

public interface i {

    public interface a {
        static {
            Covode.recordClassIndex(19852);
        }

        void a(c cVar);

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(19851);
    }

    void a(String str, Map<String, String> map, a aVar);

    void a(String str, Map<String, String> map, String str2, JSONObject jSONObject, a aVar);

    void b(String str, Map<String, String> map, a aVar);

    void b(String str, Map<String, String> map, String str2, JSONObject jSONObject, a aVar);

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f33236a;

        /* renamed from: b  reason: collision with root package name */
        public String f33237b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f33238c;

        /* renamed from: d  reason: collision with root package name */
        public int f33239d = -1;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f33240e;

        /* renamed from: f  reason: collision with root package name */
        public int f33241f = y.b.FALLBACK.ordinal();

        static {
            Covode.recordClassIndex(19854);
        }

        /* access modifiers changed from: package-private */
        public final String a() {
            String str = this.f33237b;
            if (str != null) {
                return str;
            }
            byte[] bArr = this.f33236a;
            if (bArr != null) {
                this.f33237b = new String(bArr, d.f158808a);
            }
            return this.f33237b;
        }

        public final JSONObject b() {
            Object obj;
            JSONObject jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            try {
                String a2 = a();
                if (a2 != null) {
                    jSONObject = new JSONObject(a2);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject2.put("raw", jSONObject);
                jSONObject2.put("headers", ak.a(this.f33238c));
                jSONObject2.put("cached", this.f33241f);
                obj = q.m223constructorimpl(jSONObject2.put("status_code", this.f33239d));
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            Throwable r1 = q.m226exceptionOrNullimpl(obj);
            if (r1 != null) {
                q.b("Format json error.", r1);
            }
            return jSONObject2;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(19853);
        }

        public static void a(i iVar, String str, Map<String, String> map, a aVar) {
            l.c(str, "");
            l.c(map, "");
            l.c(aVar, "");
            iVar.a(str, map, aVar);
        }

        public static void a(i iVar, String str, Map<String, String> map, String str2, JSONObject jSONObject, a aVar) {
            l.c(str, "");
            l.c(map, "");
            l.c(str2, "");
            l.c(jSONObject, "");
            l.c(aVar, "");
            iVar.a(str, map, str2, jSONObject, aVar);
        }
    }
}
