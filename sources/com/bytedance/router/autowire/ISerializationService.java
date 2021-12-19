package com.bytedance.router.autowire;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

public interface ISerializationService {
    static {
        Covode.recordClassIndex(26176);
    }

    String object2Json(Object obj);

    <T> T parseObject(String str, Type type);
}
