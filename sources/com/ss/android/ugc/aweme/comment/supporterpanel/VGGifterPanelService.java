package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface VGGifterPanelService {
    static {
        Covode.recordClassIndex(44618);
    }

    @f(a = "/tiktok/v1/gift/gifter_list/")
    t<b> getGifterPanel(@l.b.t(a = "aweme_id") String str, @l.b.t(a = "gift_id") Long l2, @l.b.t(a = "cursor") Long l3);
}
