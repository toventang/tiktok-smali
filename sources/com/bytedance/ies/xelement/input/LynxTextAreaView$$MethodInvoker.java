package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.a;

public class LynxTextAreaView$$MethodInvoker implements a<LynxTextAreaView> {
    static {
        Covode.recordClassIndex(22324);
    }

    public void invoke(LynxTextAreaView lynxTextAreaView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1904435132:
                    if (str.equals("controlKeyBoard")) {
                        lynxTextAreaView.controlKeyBoard(readableMap, callback);
                        return;
                    }
                    break;
                case -1436387831:
                    if (str.equals("addMention")) {
                        lynxTextAreaView.addMention(readableMap, callback);
                        return;
                    }
                    break;
                case -1148585618:
                    if (str.equals("addText")) {
                        lynxTextAreaView.addText(readableMap, callback);
                        return;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        lynxTextAreaView.select(callback);
                        return;
                    }
                    break;
                case -366821380:
                    if (str.equals("resetSelectionMenu")) {
                        lynxTextAreaView.resetSelectionMenu();
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxTextAreaView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 3027047:
                    if (str.equals("blur")) {
                        lynxTextAreaView.blur(callback);
                        return;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        lynxTextAreaView.focus(callback);
                        return;
                    }
                    break;
                case 923542547:
                    if (str.equals("setSelectionRange")) {
                        lynxTextAreaView.setSelectionRange(readableMap, callback);
                        return;
                    }
                    break;
                case 1073937649:
                    if (str.equals("getTextInfo")) {
                        lynxTextAreaView.getTextInfo(callback);
                        return;
                    }
                    break;
                case 1194478112:
                    if (str.equals("setInputFilter")) {
                        lynxTextAreaView.setInputFilter(readableMap);
                        return;
                    }
                    break;
                case 1212545271:
                    if (str.equals("sendDelEvent")) {
                        lynxTextAreaView.sendDelEvent(readableMap, callback);
                        return;
                    }
                    break;
                case 1406685743:
                    if (str.equals("setValue")) {
                        lynxTextAreaView.setValue(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxTextAreaView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxTextAreaView.scrollIntoView(readableMap);
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
