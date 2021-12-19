package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class DecorationTextAuditResult {
    @c(a = "audit_nopass_warn")
    private String auditNotPassWarnText;
    @c(a = "audit_status")
    private int auditStatus;

    static {
        Covode.recordClassIndex(11269);
    }

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i2) {
        this.auditStatus = i2;
    }
}
