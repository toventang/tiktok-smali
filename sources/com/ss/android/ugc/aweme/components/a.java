package com.ss.android.ugc.aweme.components;

import com.bytedance.covode.number.Covode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(48426);
    }

    public static WritableArray a(Object[] objArr) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : objArr) {
            if (obj == null) {
                createArray.pushNull();
            }
            if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Double) {
                createArray.pushDouble(((Double) obj).doubleValue());
            }
            if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            }
            if (obj instanceof String) {
                createArray.pushString((String) obj);
            }
            if (obj instanceof Map) {
                createArray.pushMap(b.a((Map) obj));
            }
            if (obj.getClass().isArray()) {
                createArray.pushArray(a((Object[]) obj));
            }
        }
        return createArray;
    }
}
