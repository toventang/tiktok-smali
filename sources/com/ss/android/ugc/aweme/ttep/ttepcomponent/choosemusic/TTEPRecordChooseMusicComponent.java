package com.ss.android.ugc.aweme.ttep.ttepcomponent.choosemusic;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.gamora.recorder.choosemusic.a;
import com.ss.android.ugc.gamora.recorder.choosemusic.d;
import h.f.b.l;

public final class TTEPRecordChooseMusicComponent extends d implements a {
    static {
        Covode.recordClassIndex(92377);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPRecordChooseMusicComponent(b bVar, f fVar) {
        super(bVar, fVar);
        l.d(bVar, "");
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.d
    public final void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3) {
        super.setChooseMusicVisible(false, false, false);
    }
}
