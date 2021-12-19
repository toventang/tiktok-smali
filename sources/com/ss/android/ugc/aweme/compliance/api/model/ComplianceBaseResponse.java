package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public class ComplianceBaseResponse implements Serializable {
    @c(a = "log_pb")
    private final LogPbBean logPb;

    static {
        Covode.recordClassIndex(47329);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }
}
