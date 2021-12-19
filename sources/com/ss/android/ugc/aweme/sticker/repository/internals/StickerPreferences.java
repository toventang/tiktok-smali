package com.ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.a;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@a(a = "av_settings.xml")
public interface StickerPreferences {
    static {
        Covode.recordClassIndex(88559);
    }

    @c(a = "time_auto_apply_sticker")
    long getAutoApplyStickerTime(long j2);

    @c(a = "setting_bubble_guide_shown")
    boolean getBubbleGuideShown(boolean z);

    @c(a = "setting_sticker_first")
    boolean getStickerFirst(boolean z);

    @b(a = "time_auto_apply_sticker")
    void setAutoApplyStickerTime(long j2);

    @b(a = "setting_bubble_guide_shown")
    void setBubbleGuideShown(boolean z);

    @b(a = "setting_sticker_first")
    void setStickerFirst(boolean z);
}
