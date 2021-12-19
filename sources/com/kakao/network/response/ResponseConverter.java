package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public interface ResponseConverter<F, T> {
    static {
        Covode.recordClassIndex(34386);
    }

    T convert(F f2);

    F fromArray(JSONArray jSONArray, int i2);
}
