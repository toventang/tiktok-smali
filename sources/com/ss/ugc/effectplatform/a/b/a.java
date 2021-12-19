package com.ss.ugc.effectplatform.a.b;

import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(102309);
    }

    <T> T convertJsonToObj(String str, Class<T> cls);

    <T> String convertObjToJson(T t);
}
