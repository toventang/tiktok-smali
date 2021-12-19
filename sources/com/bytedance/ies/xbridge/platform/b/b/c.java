package com.bytedance.ies.xbridge.platform.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.ies.xbridge.platform.b.a;
import h.f.b.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f36399a;

    static {
        Covode.recordClassIndex(21805);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final int a() {
        return this.f36399a.length();
    }

    @Override // com.bytedance.ies.xbridge.m
    public final List<Object> b() {
        return a.a(this.f36399a);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final double b(int i2) {
        return this.f36399a.optDouble(i2);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final int c(int i2) {
        return this.f36399a.optInt(i2);
    }

    public c(JSONArray jSONArray) {
        l.c(jSONArray, "");
        this.f36399a = jSONArray;
    }

    @Override // com.bytedance.ies.xbridge.m
    public final boolean a(int i2) {
        return this.f36399a.optBoolean(i2);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final String d(int i2) {
        String optString = this.f36399a.optString(i2);
        l.a((Object) optString, "");
        return optString;
    }

    @Override // com.bytedance.ies.xbridge.m
    public final m e(int i2) {
        JSONArray optJSONArray = this.f36399a.optJSONArray(i2);
        if (optJSONArray == null) {
            return null;
        }
        return new c(optJSONArray);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final n f(int i2) {
        JSONObject optJSONObject = this.f36399a.optJSONObject(i2);
        if (optJSONObject == null) {
            return null;
        }
        return new d(optJSONObject);
    }

    @Override // com.bytedance.ies.xbridge.m
    public final k g(int i2) {
        return new a(this.f36399a.opt(i2));
    }

    @Override // com.bytedance.ies.xbridge.m
    public final o h(int i2) {
        Object opt = this.f36399a.opt(i2);
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
