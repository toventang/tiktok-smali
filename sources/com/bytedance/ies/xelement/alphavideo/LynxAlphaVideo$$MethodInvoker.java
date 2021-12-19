package com.bytedance.ies.xelement.alphavideo;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxAlphaVideo$$MethodInvoker implements a<LynxAlphaVideo> {
    static {
        Covode.recordClassIndex(21976);
    }

    public void invoke(LynxAlphaVideo lynxAlphaVideo, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1073342556:
                    if (str.equals("isPlaying")) {
                        lynxAlphaVideo.isPlaying(readableMap, callback);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        lynxAlphaVideo.resume(readableMap, callback);
                        return;
                    }
                    break;
                case -407658560:
                    if (str.equals("unsubscribeUpdateEvent")) {
                        lynxAlphaVideo.unsubscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxAlphaVideo.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        lynxAlphaVideo.play(readableMap, callback);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        lynxAlphaVideo.stop(readableMap, callback);
                        return;
                    }
                    break;
                case 47962023:
                    if (str.equals("subscribeUpdateEvent")) {
                        lynxAlphaVideo.subscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        lynxAlphaVideo.getDuration(readableMap, callback);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        lynxAlphaVideo.pause(readableMap, callback);
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        lynxAlphaVideo.release(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxAlphaVideo.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxAlphaVideo.scrollIntoView(readableMap);
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
