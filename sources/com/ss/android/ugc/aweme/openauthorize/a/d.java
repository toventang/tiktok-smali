package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "app_icon")
    private String appIcon;
    @c(a = "check_result")
    private b checkResult;
    @c(a = "is_lite")
    private Boolean isLite;
    @c(a = "page_detail")
    private e pageDetail;
    @c(a = "status_code")
    private Integer statusCode;
    @c(a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(73692);
    }

    public final String getAppIcon() {
        return this.appIcon;
    }

    public final b getCheckResult() {
        return this.checkResult;
    }

    public final e getPageDetail() {
        return this.pageDetail;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Boolean isLite() {
        return this.isLite;
    }

    public final void setAppIcon(String str) {
        this.appIcon = str;
    }

    public final void setCheckResult(b bVar) {
        this.checkResult = bVar;
    }

    public final void setLite(Boolean bool) {
        this.isLite = bool;
    }

    public final void setPageDetail(e eVar) {
        this.pageDetail = eVar;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
