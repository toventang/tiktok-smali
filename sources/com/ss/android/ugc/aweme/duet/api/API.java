package com.ss.android.ugc.aweme.duet.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.duet.a.a;
import com.ss.android.ugc.aweme.duet.a.c;
import l.b.f;
import l.b.t;

public interface API {
    static {
        Covode.recordClassIndex(52445);
    }

    @f(a = "/aweme/v1/anchor/aweme/")
    q<a> getDuetDetailList(@t(a = "anchor_id") String str, @t(a = "cursor") long j2, @t(a = "count") long j3, @t(a = "top_item_ids") String str2, @t(a = "anchor_type") int i2);

    @f(a = "/tiktok/v1/duet/detail/")
    q<c> getDuetDetailModel(@t(a = "origin_item_id") String str);
}
