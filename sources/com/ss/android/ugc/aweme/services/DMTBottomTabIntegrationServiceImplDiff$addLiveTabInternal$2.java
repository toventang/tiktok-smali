package com.ss.android.ugc.aweme.services;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.experiment.ef;
import com.ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.ss.android.ugc.aweme.tools.live.a.a;
import com.ss.android.ugc.gamora.recorder.h.d;
import h.f.a.b;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public final class DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ f $diContainer;
    final /* synthetic */ b $getLiveIndex;
    final /* synthetic */ d $liveTabPopUpKeva;

    static {
        Covode.recordClassIndex(79443);
    }

    DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2(d dVar, f fVar, b bVar) {
        this.$liveTabPopUpKeva = dVar;
        this.$diContainer = fVar;
        this.$getLiveIndex = bVar;
    }

    @Override // b.g
    public final Object then(i<LiveSettingApi.a> iVar) {
        LiveSettingApi.a.C3697a aVar;
        boolean z = false;
        if (iVar == null || !iVar.a()) {
            this.$liveTabPopUpKeva.a(false);
        } else {
            LiveSettingApi.a d2 = iVar.d();
            d dVar = this.$liveTabPopUpKeva;
            if (!(d2 == null || (aVar = d2.f140210a) == null)) {
                z = aVar.f140211a;
            }
            dVar.a(z);
        }
        if (this.$liveTabPopUpKeva.b()) {
            com.ss.android.ugc.gamora.recorder.b.b bVar = (com.ss.android.ugc.gamora.recorder.b.b) this.$diContainer.a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null);
            String currentBottomTag = bVar.getCurrentBottomTag();
            bVar.addBottomTab(((Number) this.$getLiveIndex.invoke(Integer.valueOf(bVar.bottomTabSize()))).intValue() - 1, new a(this.$diContainer), 0);
            bVar.resetToCurTab(currentBottomTag);
            if (ef.b()) {
                bVar.tryShowPopupForLiveTab();
            }
            return bVar;
        }
        com.ss.android.ugc.gamora.recorder.b.b bVar2 = (com.ss.android.ugc.gamora.recorder.b.b) this.$diContainer.a((Type) com.ss.android.ugc.gamora.recorder.b.b.class, (String) null);
        bVar2.addBottomTab(((Number) this.$getLiveIndex.invoke(Integer.valueOf(bVar2.bottomTabSize()))).intValue(), new a(this.$diContainer), 0);
        return bVar2;
    }
}
