package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BioLinkReportConfig {
    @c(a = "is_bio_link_report_show")
    private boolean isBioLinkReportShow = true;
    @c(a = "show_report_jump_time")
    private int showReportJumpTime;

    static {
        Covode.recordClassIndex(75110);
    }

    public final int getShowReportJumpTime() {
        return this.showReportJumpTime;
    }

    public final boolean isBioLinkReportShow() {
        return this.isBioLinkReportShow;
    }

    public final void setBioLinkReportShow(boolean z) {
        this.isBioLinkReportShow = z;
    }

    public final void setShowReportJumpTime(int i2) {
        this.showReportJumpTime = i2;
    }
}
