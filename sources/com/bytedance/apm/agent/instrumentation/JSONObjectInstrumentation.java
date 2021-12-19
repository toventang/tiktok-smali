package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.tracing.TraceMachine;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class JSONObjectInstrumentation {
    static {
        Covode.recordClassIndex(14333);
    }

    public static JSONObject init(String str) {
        TraceMachine.enterMethod("JSONObject", "init", "json_trace");
        JSONObject jSONObject = new JSONObject(str);
        TraceMachine.exitMethod();
        return jSONObject;
    }
}
