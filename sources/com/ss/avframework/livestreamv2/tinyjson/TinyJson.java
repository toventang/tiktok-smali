package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class TinyJson {
    public static final TinyJson INSTANCE = new TinyJson();

    public static final <T> T fromJson(JSONObject jSONObject, Class<T> cls) {
        return (T) fromJson$default(jSONObject, cls, null, 4, null);
    }

    private TinyJson() {
    }

    static {
        Covode.recordClassIndex(100484);
    }

    public static final <T> JSONObject toJson(T t, Class<T> cls) {
        l.c(t, "");
        l.c(cls, "");
        return Serializer.INSTANCE.toJson(t, cls);
    }

    public static final <T> T fromJson(JSONObject jSONObject, Class<T> cls, T t) {
        l.c(jSONObject, "");
        l.c(cls, "");
        return (T) Deserializer.INSTANCE.fromJson(jSONObject, cls, t);
    }

    public static /* synthetic */ Object fromJson$default(JSONObject jSONObject, Class cls, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return fromJson(jSONObject, cls, obj);
    }
}
