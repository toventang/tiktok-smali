package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class PageShowHelper {
    static {
        Covode.recordClassIndex(14317);
    }

    public static void onPageShowHideAction(Object obj, boolean z) {
        String name;
        String str;
        if (obj instanceof String) {
            name = (String) obj;
        } else {
            name = obj.getClass().getName();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof IPageMonitor) {
                jSONObject.put("label", ((IPageMonitor) obj).getMonitorLabel());
            }
        } catch (Exception unused) {
        }
        if (z) {
            str = "page_show";
            if (ApmDelegate.a.f25042a.b().f24772e != null) {
                ApmDelegate.a.f25042a.b();
            }
        } else {
            str = "page_hide";
        }
        MonitorTool.monitorUIAction(str, name, jSONObject);
    }
}
