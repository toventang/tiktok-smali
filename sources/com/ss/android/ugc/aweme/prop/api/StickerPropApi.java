package com.ss.android.ugc.aweme.prop.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.prop.c.b;
import com.ss.android.ugc.aweme.sticker.model.h;
import l.b.f;
import l.b.t;

public interface StickerPropApi {
    static {
        Covode.recordClassIndex(76768);
    }

    @f(a = "/aweme/v1/sticker/detail/")
    q<h> getStickerDetail(@t(a = "sticker_ids") String str);

    @f(a = "/aweme/v1/sticker/detail/")
    q<h> getStickerDetail(@t(a = "sticker_ids") String str, @t(a = "source") int i2);

    @f(a = "/aweme/v1/sticker/aweme/")
    q<b> queryStickerAwemeList(@t(a = "sticker_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "media_type") int i3);

    @f(a = "/aweme/v1/sticker/aweme/")
    q<b> queryStickerAwemeList(@t(a = "sticker_id") String str, @t(a = "cursor") long j2, @t(a = "count") int i2, @t(a = "source") int i3, @t(a = "media_type") int i4);
}
