package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxBaseInputView$$MethodInvoker implements a<LynxBaseInputView> {
    static {
        Covode.recordClassIndex(22308);
    }

    public void invoke(LynxBaseInputView lynxBaseInputView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1904435132:
                    if (str.equals("controlKeyBoard")) {
                        lynxBaseInputView.controlKeyBoard(readableMap, callback);
                        return;
                    }
                    break;
                case -1148585618:
                    if (str.equals("addText")) {
                        lynxBaseInputView.addText(readableMap, callback);
                        return;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        lynxBaseInputView.select(callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxBaseInputView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3027047:
                    if (str.equals("blur")) {
                        lynxBaseInputView.blur(callback);
                        return;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        lynxBaseInputView.focus(callback);
                        return;
                    }
                    break;
                case 923542547:
                    if (str.equals("setSelectionRange")) {
                        lynxBaseInputView.setSelectionRange(readableMap, callback);
                        return;
                    }
                    break;
                case 1194478112:
                    if (str.equals("setInputFilter")) {
                        lynxBaseInputView.setInputFilter(readableMap);
                        return;
                    }
                    break;
                case 1212545271:
                    if (str.equals("sendDelEvent")) {
                        lynxBaseInputView.sendDelEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 1406685743:
                    if (str.equals("setValue")) {
                        lynxBaseInputView.setValue(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxBaseInputView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxBaseInputView.scrollIntoView(readableMap);
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
