package com.ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.a;

public final class StickerPreferences_CukaieClosetAdapter extends a implements StickerPreferences {
    static {
        Covode.recordClassIndex(88560);
    }

    public StickerPreferences_CukaieClosetAdapter(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final long getAutoApplyStickerTime(long j2) {
        return super.getStore().a("time_auto_apply_sticker", j2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final boolean getBubbleGuideShown(boolean z) {
        return super.getStore().a("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final boolean getStickerFirst(boolean z) {
        return super.getStore().a("setting_sticker_first", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setAutoApplyStickerTime(long j2) {
        super.getStore().b("time_auto_apply_sticker", j2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setBubbleGuideShown(boolean z) {
        super.getStore().b("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences
    public final void setStickerFirst(boolean z) {
        super.getStore().b("setting_sticker_first", z);
    }
}
