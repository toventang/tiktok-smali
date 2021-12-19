package com.bytedance.android.livesdkapi.depend.model.report;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ReportCommitData {
    @c(a = "desc")
    public String desc;
    @c(a = "record_id")
    public long recordId;
    @c(a = "report_id")
    public long reportId;
    @c(a = "status")
    public long status;

    static {
        Covode.recordClassIndex(13738);
    }
}
