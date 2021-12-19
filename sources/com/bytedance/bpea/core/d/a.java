package com.bytedance.bpea.core.d;

import com.bytedance.bpea.basics.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0566a f26660a = new C0566a((byte) 0);

    static {
        Covode.recordClassIndex(15703);
    }

    /* renamed from: com.bytedance.bpea.core.d.a$a  reason: collision with other inner class name */
    public static final class C0566a {
        static {
            Covode.recordClassIndex(15704);
        }

        private C0566a() {
        }

        public static h a() {
            return new h(0, "success");
        }

        public static h b() {
            return new h(-1001, "cert content illegal");
        }

        public /* synthetic */ C0566a(byte b2) {
            this();
        }

        public static h a(h hVar) {
            l.c(hVar, "");
            hVar.f26606a.put("isInterrupt", true);
            return hVar;
        }

        public static h a(JSONObject jSONObject) {
            h a2 = a();
            a2.a("translationResult", jSONObject);
            return a2;
        }
    }
}
