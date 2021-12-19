package com.ss.bytertc.base.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;

public class JsonUtils {
    private static final f sGson = new g().b();

    static {
        Covode.recordClassIndex(100720);
    }

    public static String toJson(Object obj) {
        return sGson.b(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) sGson.a(str, (Class) cls);
    }

    public static <T> T convert(Object obj, Class<T> cls) {
        f fVar = sGson;
        return (T) fVar.a(fVar.b(obj), (Class) cls);
    }
}
