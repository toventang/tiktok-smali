package com.bytedance.ies.xelement.bytedlottie;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxBytedLottieView$$MethodInvoker implements a<LynxBytedLottieView> {
    static {
        Covode.recordClassIndex(22067);
    }

    public void invoke(LynxBytedLottieView lynxBytedLottieView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1998037676:
                    if (str.equals("isAnimating")) {
                        lynxBytedLottieView.isAnimating(readableMap, callback);
                        return;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        lynxBytedLottieView.resume(readableMap, callback);
                        return;
                    }
                    break;
                case -929558362:
                    if (str.equals("listenAnimationUpdate")) {
                        lynxBytedLottieView.listenAnimationUpdate(readableMap, callback);
                        return;
                    }
                    break;
                case -407658560:
                    if (str.equals("unsubscribeUpdateEvent")) {
                        lynxBytedLottieView.unsubscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxBytedLottieView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        lynxBytedLottieView.play(readableMap, callback);
                        return;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        lynxBytedLottieView.seek(readableMap, callback);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        lynxBytedLottieView.stop(readableMap, callback);
                        return;
                    }
                    break;
                case 47962023:
                    if (str.equals("subscribeUpdateEvent")) {
                        lynxBytedLottieView.subscribeUpdateEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        lynxBytedLottieView.getDuration(readableMap, callback);
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        lynxBytedLottieView.pause(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxBytedLottieView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxBytedLottieView.scrollIntoView(readableMap);
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
