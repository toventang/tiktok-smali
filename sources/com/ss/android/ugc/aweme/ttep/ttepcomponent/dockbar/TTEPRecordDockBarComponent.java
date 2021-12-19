package com.ss.android.ugc.aweme.ttep.ttepcomponent.dockbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.recorder.e.a;
import com.ss.android.ugc.gamora.recorder.e.b;
import h.f.b.l;

public final class TTEPRecordDockBarComponent extends b implements a {
    static {
        Covode.recordClassIndex(92378);
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        setUploadVisibility(8);
    }

    @Override // com.ss.android.ugc.gamora.recorder.e.b
    public final void setUploadVisibility(int i2) {
        super.setUploadVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPRecordDockBarComponent(com.bytedance.scene.group.b bVar, f fVar) {
        super(bVar, fVar);
        l.d(bVar, "");
        l.d(fVar, "");
    }
}
