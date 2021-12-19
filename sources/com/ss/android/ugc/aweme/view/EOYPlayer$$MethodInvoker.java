package com.ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class EOYPlayer$$MethodInvoker implements a<EOYPlayer> {
    static {
        Covode.recordClassIndex(94234);
    }

    public void invoke(EOYPlayer eOYPlayer, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        eOYPlayer.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        eOYPlayer.click(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        eOYPlayer.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        eOYPlayer.scrollIntoView(readableMap);
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
