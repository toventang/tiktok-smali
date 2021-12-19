package com.ss.android.ugc.aweme.services;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.ss.android.ugc.gamora.recorder.b.b;
import com.ss.android.ugc.gamora.recorder.h.d;
import h.f.b.l;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public final class DMTBottomTabIntegrationServiceImplDiff$tryShowPopupForLiveWhenFirstTime$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ f $diContainer;
    final /* synthetic */ d $liveTabPopUpKeva;

    static {
        Covode.recordClassIndex(79444);
    }

    DMTBottomTabIntegrationServiceImplDiff$tryShowPopupForLiveWhenFirstTime$1(d dVar, f fVar) {
        this.$liveTabPopUpKeva = dVar;
        this.$diContainer = fVar;
    }

    @Override // b.g
    public final void then(i<LiveSettingApi.a> iVar) {
        LiveSettingApi.a.C3697a aVar;
        l.b(iVar, "");
        if (iVar.a()) {
            LiveSettingApi.a d2 = iVar.d();
            if (d2 == null || (aVar = d2.f140210a) == null || !aVar.f140211a) {
                this.$liveTabPopUpKeva.a(false);
                return;
            }
            this.$liveTabPopUpKeva.a(true);
            Object a2 = this.$diContainer.a((Type) b.class, (String) null);
            ((b) a2).tryShowPopupForLiveTab();
            l.b(a2, "");
        }
    }
}
