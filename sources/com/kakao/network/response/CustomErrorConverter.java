package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public interface CustomErrorConverter<T> {
    static {
        Covode.recordClassIndex(34379);
    }

    T convert(int i2, String str);
}
