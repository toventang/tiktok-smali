package com.ss.android.ugc.aweme.simkit.model;

import com.bytedance.covode.number.Covode;

public class BaseResponse {
    public int error_code;
    public ServerTimeExtra extra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    static {
        Covode.recordClassIndex(87384);
    }

    public static class ServerTimeExtra {
        public String logid;
        public long now;

        static {
            Covode.recordClassIndex(87385);
        }

        public String toString() {
            return "{now=" + this.now + ", logid='" + this.logid + '\'' + '}';
        }
    }

    public String toString() {
        return "BaseResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", extra=" + this.extra + '}';
    }
}
