package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final o f35669a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35670b;

    static {
        Covode.recordClassIndex(21298);
    }

    private j(o oVar) {
        this.f35669a = oVar;
    }

    static j a(o oVar) {
        return new j(oVar);
    }

    /* access modifiers changed from: package-private */
    public final <T> String a(T t) {
        String str;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f35669a.a(t);
        }
        a(str);
        return str;
    }

    private static void a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            k.a((RuntimeException) new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(String str, Type type) {
        a(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.f35669a.a(str, type);
    }
}
