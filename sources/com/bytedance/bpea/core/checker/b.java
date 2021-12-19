package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.core.a.c;
import com.bytedance.bpea.core.c.f;
import com.bytedance.bpea.core.d.a;
import com.bytedance.bpea.core.d.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f26658a = "ConditionChecker";

    static {
        Covode.recordClassIndex(15699);
    }

    public b() {
        super(f.START_CONDITION_CHECK, f.END_CONDITION_CHECK);
    }

    @Override // com.bytedance.bpea.core.checker.c
    public final h b(d dVar, com.bytedance.bpea.basics.f fVar) {
        String certToken;
        String certToken2;
        l.c(fVar, "");
        if (dVar == null || (certToken = dVar.certToken()) == null || certToken.length() == 0) {
            com.bytedance.bpea.basics.b.a(this.f26658a, "certToken is empty,skip condition check");
            return a.C0566a.b();
        }
        JSONObject jSONObject = new JSONObject();
        if (!(dVar == null || (certToken2 = dVar.certToken()) == null)) {
            com.bytedance.bpea.core.b.a<List<com.bytedance.bpea.core.checker.a.a>> b2 = com.bytedance.bpea.core.a.f.b(certToken2);
            if (b2.f26628a < 0) {
                com.bytedance.bpea.basics.b.d(this.f26658a, "parse conditions combine dynamic and default failed,try to parse from default config");
                b2 = com.bytedance.bpea.core.a.f.c(certToken2);
            }
            if (b2.f26628a < 0) {
                c a2 = com.bytedance.bpea.core.a.b.a(fVar, com.bytedance.bpea.core.a.d.NO_MATCHED_LIMIT);
                String str = "limit parse failed";
                if (a2 == c.WARNING) {
                    a(com.bytedance.bpea.core.c.d.WARN);
                    int i2 = b2.f26628a;
                    String str2 = b2.f26629b;
                    if (str2 != null) {
                        str = str2;
                    }
                    return new h(i2, str);
                } else if (a2 == c.ERROR) {
                    a(com.bytedance.bpea.core.c.d.ERROR);
                    int i3 = b2.f26628a;
                    String str3 = b2.f26629b;
                    if (str3 != null) {
                        str = str3;
                    }
                    throw new com.bytedance.bpea.basics.a(i3, str);
                }
            }
            T<com.bytedance.bpea.core.checker.a.a> t = b2.f26630c;
            if (t == null || t.isEmpty()) {
                com.bytedance.bpea.basics.b.a(this.f26658a, "conditions is empty");
            } else {
                for (com.bytedance.bpea.core.checker.a.a aVar : t) {
                    com.bytedance.bpea.basics.b.a(this.f26658a, "start check condition:".concat(String.valueOf(aVar)));
                    h a3 = aVar.a(fVar);
                    com.bytedance.bpea.basics.b.a(this.f26658a, "check condition result:".concat(String.valueOf(a3)));
                    if (a3.f26607b == 0) {
                        b.a.a(jSONObject, (JSONObject) a3.f26606a.get("translationResult"));
                    } else {
                        int i4 = a3.f26607b;
                        String str4 = a3.f26608c;
                        System.currentTimeMillis();
                        l.c(str4, "");
                        com.bytedance.bpea.core.c.b.a(new com.bytedance.bpea.core.c.a(null, null, f.WARN, i4, str4));
                        b.a.a(jSONObject, (JSONObject) a3.f26606a.get("translationResult"));
                    }
                }
            }
        }
        com.bytedance.bpea.basics.b.a(this.f26658a, "translateResult:".concat(String.valueOf(jSONObject)));
        return a.C0566a.a(jSONObject);
    }
}
