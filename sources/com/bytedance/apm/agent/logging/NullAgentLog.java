package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public class NullAgentLog implements AgentLog {
    static {
        Covode.recordClassIndex(14368);
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return 5;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i2) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
    }
}
