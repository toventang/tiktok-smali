package com.bytedance.apm.agent.v2.instrumentation;

import android.text.TextUtils;
import com.bytedance.apm.agent.helper.PageShowCallback;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.agent.v2.InstructOperationSwitch;
import com.bytedance.covode.number.Covode;

public class ActivityAgent {
    static {
        Covode.recordClassIndex(14386);
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (z && InstructOperationSwitch.sUiSwitch && TextUtils.equals("onResume", str2)) {
            PageShowCallback.onPageShowHideAction(str, true);
        }
        if (InstructOperationSwitch.sPageLoadSwitch) {
            AutoPageTraceHelper.onTrace(str, str2, z);
        }
    }
}
