package com.bytedance.ies.xelement.viewpager;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxFoldView$$MethodInvoker implements a<LynxFoldView> {
    static {
        Covode.recordClassIndex(22531);
    }

    public void invoke(LynxFoldView lynxFoldView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1054205604:
                    if (str.equals("setFoldExpanded")) {
                        lynxFoldView.setFoldExpanded(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxFoldView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxFoldView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxFoldView.scrollIntoView(readableMap);
                        return;
                    }
                    break;
            }
            callback.invoke(3);
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e2.toString());
        }
    }
}
