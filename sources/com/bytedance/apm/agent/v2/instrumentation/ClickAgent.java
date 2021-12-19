package com.bytedance.apm.agent.v2.instrumentation;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class ClickAgent {
    static {
        Covode.recordClassIndex(14388);
    }

    public static void onTabChanged(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view_name", str);
            jSONObject.put("click_type", "TabHost#OnTabChanged");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void onClick(View view) {
        CharSequence text;
        if (view != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                Resources resources = view.getContext().getResources();
                if (view.getId() != -1) {
                    jSONObject.put("view_id", view.getId());
                    jSONObject.put("view_name", resources.getResourceEntryName(view.getId()));
                }
                if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
                    String charSequence = text.toString();
                    if (charSequence.length() > 100) {
                        charSequence = charSequence.substring(0, 100);
                    }
                    jSONObject.put("view_text", charSequence);
                }
                if (view.getParent() != null) {
                    String simpleName = view.getParent().getClass().getSimpleName();
                    if (view.getParent().getParent() != null) {
                        simpleName = view.getParent().getParent().getClass().getSimpleName() + "#" + simpleName + "#" + view.getClass().getSimpleName();
                    }
                    jSONObject.put("view_path", simpleName);
                }
                jSONObject.put("click_type", "View#OnClick");
                MonitorTool.monitorUIAction("view_click", "", jSONObject);
            } catch (Exception e2) {
                if (c.e()) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
