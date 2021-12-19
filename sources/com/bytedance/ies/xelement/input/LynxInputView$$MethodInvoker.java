package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxInputView$$MethodInvoker implements a<LynxInputView> {
    static {
        Covode.recordClassIndex(22319);
    }

    public void invoke(LynxInputView lynxInputView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1904435132:
                    if (str.equals("controlKeyBoard")) {
                        lynxInputView.controlKeyBoard(readableMap, callback);
                        return;
                    }
                    break;
                case -1148585618:
                    if (str.equals("addText")) {
                        lynxInputView.addText(readableMap, callback);
                        return;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        lynxInputView.select(callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxInputView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3027047:
                    if (str.equals("blur")) {
                        lynxInputView.blur(callback);
                        return;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        lynxInputView.focus(callback);
                        return;
                    }
                    break;
                case 923542547:
                    if (str.equals("setSelectionRange")) {
                        lynxInputView.setSelectionRange(readableMap, callback);
                        return;
                    }
                    break;
                case 1194478112:
                    if (str.equals("setInputFilter")) {
                        lynxInputView.setInputFilter(readableMap);
                        return;
                    }
                    break;
                case 1212545271:
                    if (str.equals("sendDelEvent")) {
                        lynxInputView.sendDelEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 1406685743:
                    if (str.equals("setValue")) {
                        lynxInputView.setValue(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxInputView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxInputView.scrollIntoView(readableMap);
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
