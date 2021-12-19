package com.lynx.component.svg;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class UISvg$$MethodInvoker implements a<UISvg> {
    static {
        Covode.recordClassIndex(34625);
    }

    public void invoke(UISvg uISvg, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode == 1908871954) {
                    if (str.equals("scrollIntoView")) {
                        uISvg.scrollIntoView(readableMap);
                        return;
                    }
                }
            } else if (str.equals("boundingClientRect")) {
                uISvg.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e2.toString());
        }
    }
}
