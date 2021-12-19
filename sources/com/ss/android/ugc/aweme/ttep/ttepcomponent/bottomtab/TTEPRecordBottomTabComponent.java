package com.ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.recorder.b.a;
import com.ss.android.ugc.gamora.recorder.b.b;
import com.ss.android.ugc.gamora.recorder.b.i;
import h.f.b.l;
import java.util.List;

public final class TTEPRecordBottomTabComponent extends i implements b {
    static {
        Covode.recordClassIndex(92370);
    }

    @Override // com.bytedance.als.j, com.ss.android.ugc.gamora.recorder.b.i
    public final void onCreate() {
        super.onCreate();
        showBottomTab(false);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b, com.ss.android.ugc.gamora.recorder.b.i
    public final void showBottomTab(boolean z) {
        super.showBottomTab(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTEPRecordBottomTabComponent(com.bytedance.scene.group.b bVar, f fVar, List<? extends a> list) {
        super(bVar, fVar, list);
        l.d(bVar, "");
        l.d(fVar, "");
        l.d(list, "");
    }
}
