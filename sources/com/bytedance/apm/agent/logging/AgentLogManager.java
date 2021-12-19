package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public class AgentLogManager {
    private static DefaultAgentLog instance = new DefaultAgentLog();

    public static AgentLog getAgentLog() {
        return instance;
    }

    static {
        Covode.recordClassIndex(14364);
    }

    public static void setAgentLog(AgentLog agentLog) {
        instance.setImpl(agentLog);
    }
}
