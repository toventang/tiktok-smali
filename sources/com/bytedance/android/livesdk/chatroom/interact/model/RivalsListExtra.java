package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RivalsListExtra extends Extra {
    @c(a = "log_pb")
    public LogPbBean logPbBean;

    static {
        Covode.recordClassIndex(8608);
    }

    public static final class LogPbBean {
        @c(a = "impr_id")
        public String imprId;

        static {
            Covode.recordClassIndex(8609);
        }

        public final String getImprId() {
            return this.imprId;
        }

        public final String toString() {
            return "LogPbBean{imprId='" + this.imprId + '\'' + '}';
        }
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRequestId() {
        LogPbBean logPbBean2 = this.logPbBean;
        if (logPbBean2 != null) {
            return logPbBean2.imprId;
        }
        return "";
    }

    public String toString() {
        return "RivalsListExtra{logPbBean=" + this.logPbBean + '}';
    }
}
