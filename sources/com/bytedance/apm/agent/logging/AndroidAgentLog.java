package com.bytedance.apm.agent.logging;

import com.bytedance.covode.number.Covode;

public class AndroidAgentLog implements AgentLog {
    private int level = 3;

    static {
        Covode.recordClassIndex(14365);
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.level;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.level == 6) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_d("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.level >= 5) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_d("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.level > 0) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.level >= 3) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i2) {
        if (i2 > 6 || i2 <= 0) {
            throw new IllegalArgumentException("Log level is not between ERROR and AUDIT");
        }
        this.level = i2;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.level >= 4) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_v("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.level >= 2) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_w("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.level > 0) {
            com_bytedance_apm_agent_logging_AndroidAgentLog_com_ss_android_ugc_aweme_lancet_LogLancet_e("[tt_apm]", str, th);
        }
    }
}
