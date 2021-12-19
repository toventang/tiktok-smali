package com.ss.android.ugc.tools.view.widget.b;

import com.bytedance.covode.number.Covode;
import java.lang.Enum;

public interface b<STATE extends Enum<STATE>> {
    static {
        Covode.recordClassIndex(98903);
    }

    STATE getState();

    void setState(STATE state);
}
