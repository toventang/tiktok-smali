package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.types.lock.a;
import com.ss.android.ugc.aweme.sticker.types.lock.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class InternalRecordServiceImpl$$special$$inlined$singleton$6$lambda$1 implements a {
    final /* synthetic */ f $it;
    private final j stickerViewConfigure;

    static {
        Covode.recordClassIndex(79498);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
    public final boolean isLockStickerEnable() {
        return this.stickerViewConfigure.f135221i;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.lock.a
    public final boolean reallyLockedSticker(Effect effect) {
        return b.b(effect);
    }

    InternalRecordServiceImpl$$special$$inlined$singleton$6$lambda$1(f fVar) {
        this.$it = fVar;
        this.stickerViewConfigure = (j) fVar.a(j.class, (String) null);
    }
}
