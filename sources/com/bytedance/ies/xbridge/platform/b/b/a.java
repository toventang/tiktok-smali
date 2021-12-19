package com.bytedance.ies.xbridge.platform.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Object f36395a;

    static {
        Covode.recordClassIndex(21803);
    }

    @Override // com.bytedance.ies.xbridge.k
    public final boolean b() {
        Object obj = this.f36395a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new Exception("Dynamic is not Boolean");
    }

    @Override // com.bytedance.ies.xbridge.k
    public final int d() {
        Object obj = this.f36395a;
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new Exception("Dynamic is not Int");
    }

    @Override // com.bytedance.ies.xbridge.k
    public final String e() {
        Object obj = this.f36395a;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new Exception("Dynamic is not String");
    }

    @Override // com.bytedance.ies.xbridge.k
    public final m f() {
        if (this.f36395a instanceof JSONArray) {
            return new c((JSONArray) this.f36395a);
        }
        throw new Exception("Dynamic is not JSONArray");
    }

    @Override // com.bytedance.ies.xbridge.k
    public final n g() {
        if (this.f36395a instanceof JSONObject) {
            return new d((JSONObject) this.f36395a);
        }
        throw new Exception("Dynamic is not JSONObject");
    }

    @Override // com.bytedance.ies.xbridge.k
    public final o a() {
        Object obj = this.f36395a;
        if (obj instanceof JSONArray) {
            return o.Array;
        }
        if (obj instanceof Boolean) {
            return o.Boolean;
        }
        if (obj instanceof JSONObject) {
            return o.Map;
        }
        if (obj instanceof Integer) {
            return o.Int;
        }
        if (obj instanceof Number) {
            return o.Number;
        }
        if (obj instanceof String) {
            return o.String;
        }
        return o.Null;
    }

    @Override // com.bytedance.ies.xbridge.k
    public final double c() {
        Object obj = this.f36395a;
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return (double) ((Number) obj).intValue();
        }
        if (obj instanceof Float) {
            return (double) ((Number) obj).floatValue();
        }
        if (obj instanceof Long) {
            return (double) ((Number) obj).longValue();
        }
        throw new Exception("Dynamic is not Double");
    }

    public a(Object obj) {
        this.f36395a = obj;
    }
}
