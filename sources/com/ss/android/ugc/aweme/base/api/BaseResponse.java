package com.ss.android.ugc.aweme.base.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import java.util.Map;

public class BaseResponse extends a {
    public int error_code;
    public ServerTimeExtra extra;
    public Map<String, String> extraMap;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    static {
        Covode.recordClassIndex(41852);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.aweme.base.api.BaseResponse */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.api.a
    public <T> T checkValid() {
        checkStatusCode();
        super.checkValid();
        return this;
    }

    private void checkStatusCode() {
        if (this.status_code != 0) {
            throw new a(this.status_code).setErrorMsg(this.status_msg).setPrompt(this.prompts).setResponse(this);
        }
    }

    public static class ServerTimeExtra {
        public String logid;
        public long now;

        static {
            Covode.recordClassIndex(41853);
        }

        public String toString() {
            return "{now=" + this.now + ", logid='" + this.logid + '\'' + '}';
        }
    }

    public String toString() {
        return "BaseResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", extra=" + this.extra + '}';
    }
}
