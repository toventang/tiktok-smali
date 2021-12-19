package com.bytedance.android.livesdk.aj;

import com.bytedance.android.live.i.a.c;
import com.bytedance.android.livesdk.aj.b.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f13851a;

    static {
        Covode.recordClassIndex(7702);
    }

    j(i iVar) {
        this.f13851a = iVar;
    }

    @Override // com.bytedance.android.livesdk.aj.b.a
    public final void a(JSONObject jSONObject, String str) {
        c cVar;
        i iVar = this.f13851a;
        if (jSONObject != null) {
            if (iVar.f13844k != null) {
                try {
                    for (Map.Entry<String, String> entry : iVar.f13844k.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            iVar.a(jSONObject);
            if (iVar.f13840g == null || (cVar = iVar.f13840g.get()) == null) {
                iVar.f13839f.a(jSONObject, str);
            } else {
                cVar.a(jSONObject, str);
            }
            if (iVar.f13843j != null) {
                iVar.f13843j.a(jSONObject);
            }
        }
    }
}
