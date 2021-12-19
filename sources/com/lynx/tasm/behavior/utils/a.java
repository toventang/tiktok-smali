package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public interface a<T extends LynxBaseUI> {
    static {
        Covode.recordClassIndex(35222);
    }

    void invoke(T t, String str, ReadableMap readableMap, Callback callback);
}
