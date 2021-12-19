package com.bytedance.bpea.core.checker.a;

import com.bytedance.bpea.basics.a;
import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.core.d.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends a {

    /* renamed from: c  reason: collision with root package name */
    private List<String> f26657c = new ArrayList();

    static {
        Covode.recordClassIndex(15696);
    }

    public f() {
        super(c.ENTRY_VERIFY);
    }

    @Override // com.bytedance.bpea.core.checker.a.a
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("allowList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        List<String> list = this.f26657c;
                        String optString = optJSONArray.optString(i2);
                        l.a((Object) optString, "");
                        list.add(optString);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.bpea.core.checker.a.b
    public final h a(com.bytedance.bpea.basics.f fVar) {
        l.c(fVar, "");
        l.c("methodName", "");
        Object obj = fVar.f26604e.get("methodName");
        if (obj == null) {
            obj = fVar.f26600a;
        }
        if ((!this.f26657c.isEmpty()) && obj != null) {
            boolean z = false;
            Iterator<T> it = this.f26657c.iterator();
            while (it.hasNext()) {
                if (l.a(obj, (Object) it.next())) {
                    z = true;
                }
            }
            if (!z) {
                throw new a(-2001, "entryToken verify fail");
            }
        }
        return a.C0566a.a();
    }
}
