package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import h.f.b.l;
import org.json.JSONObject;

public interface n {
    static {
        Covode.recordClassIndex(19860);
    }

    void a(Throwable th);

    void a(JSONObject jSONObject);

    public static class a implements n {
        static {
            Covode.recordClassIndex(19861);
        }

        @Override // com.bytedance.ies.d.a.n
        public void a(Throwable th) {
            l.c(th, "");
        }

        @Override // com.bytedance.ies.d.a.n
        public void a(JSONObject jSONObject) {
            l.c(jSONObject, "");
        }

        public void a(i.c cVar) {
            l.c(cVar, "");
            a(cVar.b());
        }
    }
}
