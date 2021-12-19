package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public class ConsoleAgentLog implements AgentLog {
    private int mLevel = 3;

    static {
        Covode.recordClassIndex(14366);
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.mLevel;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i2) {
        this.mLevel = i2;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.mLevel == 6) {
            print("AUDIT", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.mLevel >= 5) {
            print("DEBUG", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.mLevel > 0) {
            print("ERROR", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.mLevel >= 3) {
            print("INFO", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.mLevel >= 4) {
            print("VERBOSE", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.mLevel >= 2) {
            print("WARN", str);
        }
    }

    private static void print(String str, String str2) {
        System.out.println("[" + str + "] " + str2);
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.mLevel > 0) {
            print("ERROR", str + " " + th.getMessage());
        }
    }
}
