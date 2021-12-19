package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import l.b.f;
import l.b.t;

public interface DonateApi {
    static {
        Covode.recordClassIndex(51720);
    }

    @f(a = "/aweme/v1/donate/item/")
    q<b> getDonateDetail(@t(a = "aweme_id") String str, @t(a = "cursor") Integer num, @t(a = "ngo_id") Integer num2, @t(a = "sec_uid") String str2, @t(a = "item_id") Long l2, @t(a = "item_type") Integer num3, @t(a = "extra") String str3, @t(a = "should_fetch_top_donor") boolean z);
}
