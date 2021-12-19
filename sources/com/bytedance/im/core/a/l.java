package com.bytedance.im.core.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class l implements Serializable {
    @c(a = "enable")
    public int enable;
    @c(a = "report_duration_days")
    public int reportDurationDays = 1;

    static {
        Covode.recordClassIndex(22623);
    }

    public String toString() {
        return "ReportDBInfoConfig{enable:" + this.enable + ", reportDurationDays:" + this.reportDurationDays + "}";
    }
}
