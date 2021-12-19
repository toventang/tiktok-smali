package com.bytedance.apm.agent.v2;

import com.bytedance.covode.number.Covode;

public class InstructOperationSwitch {
    public static boolean sPageLoadSwitch = true;
    public static boolean sUiSwitch = true;

    static {
        Covode.recordClassIndex(14385);
    }
}
