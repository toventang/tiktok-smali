package com.bytedance.ies.xbridge.model.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.l;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f36290a;

    static {
        Covode.recordClassIndex(21714);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final Map<String, Object> b() {
        return e.a(this.f36290a);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final l a() {
        Iterator<String> keys = this.f36290a.keys();
        h.f.b.l.a((Object) keys, "");
        return new b(keys);
    }

    public d(JSONObject jSONObject) {
        h.f.b.l.c(jSONObject, "");
        this.f36290a = jSONObject;
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean a(String str) {
        h.f.b.l.c(str, "");
        return this.f36290a.has(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean b(String str) {
        h.f.b.l.c(str, "");
        return this.f36290a.isNull(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final boolean c(String str) {
        h.f.b.l.c(str, "");
        return this.f36290a.optBoolean(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final double d(String str) {
        h.f.b.l.c(str, "");
        return this.f36290a.optDouble(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final int e(String str) {
        h.f.b.l.c(str, "");
        return this.f36290a.optInt(str);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final String f(String str) {
        h.f.b.l.c(str, "");
        String optString = this.f36290a.optString(str);
        h.f.b.l.a((Object) optString, "");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.n
    public final m g(String str) {
        h.f.b.l.c(str, "");
        JSONArray optJSONArray = this.f36290a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new c(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final n h(String str) {
        h.f.b.l.c(str, "");
        JSONObject optJSONObject = this.f36290a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new d(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.n
    public final k i(String str) {
        h.f.b.l.c(str, "");
        return new a(this.f36290a.opt(str));
    }

    @Override // com.bytedance.ies.xbridge.n
    public final o j(String str) {
        h.f.b.l.c(str, "");
        Object opt = this.f36290a.opt(str);
        if (opt instanceof JSONArray) {
            return o.Array;
        }
        if (opt instanceof Boolean) {
            return o.Boolean;
        }
        if (opt instanceof JSONObject) {
            return o.Map;
        }
        if (opt instanceof Integer) {
            return o.Int;
        }
        if (opt instanceof Number) {
            return o.Number;
        }
        if (opt instanceof String) {
            return o.String;
        }
        return o.Null;
    }
}
