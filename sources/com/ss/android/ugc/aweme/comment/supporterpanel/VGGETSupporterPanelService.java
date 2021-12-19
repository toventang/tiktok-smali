package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface VGGETSupporterPanelService {
    static {
        Covode.recordClassIndex(44617);
    }

    @f(a = "/tiktok/v1/gift/supporter_panel/")
    t<f> getSupporterPanel(@l.b.t(a = "aweme_id") String str);
}
