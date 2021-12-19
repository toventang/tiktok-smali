package com.bytedance.apm.agent.instrumentation;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public class ClickInstrumentation {
    static {
        Covode.recordClassIndex(14322);
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
                if (view.getTag(-16777215) != null && !TextUtils.isEmpty(view.getTag(-16777215).toString())) {
                    jSONObject.put("view_tag_1", view.getTag(-16777215).toString());
                }
                if (view.getTag(-16777214) != null && !TextUtils.isEmpty(view.getTag(-16777214).toString())) {
                    jSONObject.put("view_tag_2", view.getTag(-16777214).toString());
                }
                if (view.getTag(-16777213) != null && (view.getTag(-16777213) instanceof Map)) {
                    for (Map.Entry entry : ((Map) view.getTag(-16777213)).entrySet()) {
                        jSONObject.put("view_tag_map_" + entry.getKey().toString(), entry.getValue().toString());
                    }
                }
                jSONObject.put("click_type", "View#OnClick");
                MonitorTool.monitorUIAction("view_click", "", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
