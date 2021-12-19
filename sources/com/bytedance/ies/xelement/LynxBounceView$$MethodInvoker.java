package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxBounceView$$MethodInvoker implements a<LynxBounceView> {
    static {
        Covode.recordClassIndex(21910);
    }

    public void invoke(LynxBounceView lynxBounceView, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 1419773105) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            lynxBounceView.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("requestUIInfo")) {
                    lynxBounceView.requestUIInfo(readableMap, callback);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                lynxBounceView.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e2.toString());
        }
    }
}
