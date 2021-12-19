package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class NoticeCollapsibility {
    @c(a = "cut_off_days")
    public int cutOffDays;
    @c(a = "extra_notice_count")
    public int extraNoticeCount;

    static {
        Covode.recordClassIndex(72723);
    }
}
