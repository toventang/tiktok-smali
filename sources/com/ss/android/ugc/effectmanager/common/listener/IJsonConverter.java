package com.ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public interface IJsonConverter {
    static {
        Covode.recordClassIndex(95297);
    }

    <T> T convertJsonToObj(InputStream inputStream, Class<T> cls);

    <T> String convertObjToJson(T t);
}
