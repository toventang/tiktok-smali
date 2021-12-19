package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class CommitRemarkNameResponse {
    @c(a = "remark_name")
    public String remarkName;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(75215);
    }

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
