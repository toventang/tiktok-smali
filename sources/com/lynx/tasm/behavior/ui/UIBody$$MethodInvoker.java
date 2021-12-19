package com.lynx.tasm.behavior.ui;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class UIBody$$MethodInvoker implements a<UIBody> {
    static {
        Covode.recordClassIndex(35033);
    }

    public void invoke(UIBody uIBody, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 1419773105) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            uIBody.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("requestUIInfo")) {
                    uIBody.requestUIInfo(readableMap, callback);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                uIBody.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e2.toString());
        }
    }
}
