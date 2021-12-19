package com.lynx.tasm.behavior.a;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface a {
    static {
        Covode.recordClassIndex(34888);
    }

    boolean blockNativeEvent();

    Map<String, com.lynx.tasm.c.a> getEvents();

    int getSign();

    boolean ignoreFocus();

    boolean isFocusable();

    void offResponseChain();

    void onFocusChanged(boolean z, boolean z2);

    void onResponseChain();

    a parent();
}
