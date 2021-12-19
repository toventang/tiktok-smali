package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxAudio$$MethodInvoker implements a<LynxAudio> {
    static {
        Covode.recordClassIndex(21906);
    }

    public void invoke(LynxAudio lynxAudio, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals("duration")) {
                        lynxAudio.duration(callback);
                        return;
                    }
                    break;
                case -892481550:
                    if (str.equals("status")) {
                        lynxAudio.status(callback);
                        return;
                    }
                    break;
                case -679066215:
                    if (str.equals("playBitrate")) {
                        lynxAudio.playBitrate(callback);
                        return;
                    }
                    break;
                case -553589393:
                    if (str.equals("cacheTime")) {
                        lynxAudio.cacheTime(callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxAudio.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        lynxAudio.play(callback);
                        return;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        lynxAudio.seek(readableMap, callback);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        lynxAudio.stop(callback);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        lynxAudio.pause(callback);
                        return;
                    }
                    break;
                case 601235430:
                    if (str.equals("currentTime")) {
                        lynxAudio.currentTime(callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxAudio.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1457763334:
                    if (str.equals("currentSrcID")) {
                        lynxAudio.currentSrcID(callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxAudio.scrollIntoView(readableMap);
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
