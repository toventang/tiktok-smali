package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.apm.q.s;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Stack;
import org.json.JSONObject;

public class TraceMachine {
    private static AgentLog log = AgentLogManager.getAgentLog();
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static ThreadLocal<Stack<Trace>> traceStackThreadLocal = new ThreadLocal<>();

    public static void exitMethod() {
        exitMethod("");
    }

    static {
        Covode.recordClassIndex(14384);
    }

    public static void exitMethod(String str) {
        if (traceStackThreadLocal.get() != null) {
            Stack<Trace> stack = traceStackThreadLocal.get();
            if (!stack.isEmpty()) {
                Trace pop = stack.pop();
                pop.setExitTime(System.currentTimeMillis());
                pop.setExtraData(str);
                handleCost(pop);
            }
        }
    }

    private static void handleCost(Trace trace) {
        boolean z;
        try {
            long j2 = trace.entryTime;
            long j3 = trace.exitTime;
            long longValue = Long.valueOf(j3 - j2).longValue();
            if (longValue > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("begin_time", j2);
                jSONObject.put("end_time", j3);
                JSONObject jSONObject2 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject2.put(trace.methodName, longValue);
                } else {
                    jSONObject2.put(trace.className + "#" + trace.methodName, longValue);
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("page_load".equals(trace.traceType)) {
                    jSONObject3.put("scene", trace.scene);
                    if (!sMethodSet.contains(trace.className + trace.methodName)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jSONObject3.put("is_first", z);
                    sMethodSet.add(trace.className + trace.methodName);
                } else {
                    jSONObject3.put("is_main", s.a());
                }
                jSONObject.put("extra_data", trace.extraData);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void enterMethod(String str, String str2, String str3) {
        enterMethod(str, str, str2, str3);
    }

    public static void enterMethod(String str, String str2, String str3, String str4) {
        Trace trace = new Trace(str, str2, str3, System.currentTimeMillis(), str4);
        if (traceStackThreadLocal.get() == null) {
            Stack<Trace> stack = new Stack<>();
            stack.push(trace);
            traceStackThreadLocal.set(stack);
            return;
        }
        traceStackThreadLocal.get().push(trace);
    }
}
