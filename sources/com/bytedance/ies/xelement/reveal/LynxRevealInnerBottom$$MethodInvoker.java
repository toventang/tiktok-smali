package com.bytedance.ies.xelement.reveal;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxRevealInnerBottom$$MethodInvoker implements a<LynxRevealInnerBottom> {
    static {
        Covode.recordClassIndex(22479);
    }

    public void invoke(LynxRevealInnerBottom lynxRevealInnerBottom, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode == 1908871954) {
                    if (str.equals("scrollIntoView")) {
                        lynxRevealInnerBottom.scrollIntoView(readableMap);
                        return;
                    }
                }
            } else if (str.equals("boundingClientRect")) {
                lynxRevealInnerBottom.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e2.toString());
        }
    }
}
