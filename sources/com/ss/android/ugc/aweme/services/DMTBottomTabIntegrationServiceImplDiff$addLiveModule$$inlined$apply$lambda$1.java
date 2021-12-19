package com.ss.android.ugc.aweme.services;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import com.ss.android.ugc.aweme.experiment.ef;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.servicimpl.b;
import com.ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.ss.android.ugc.aweme.tools.live.sticker.a;
import com.ss.android.ugc.aweme.utils.d;
import h.f.b.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class DMTBottomTabIntegrationServiceImplDiff$addLiveModule$$inlined$apply$lambda$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ b $context$inlined;
    final /* synthetic */ f $diContainer$inlined;
    final /* synthetic */ b $this_apply;
    final /* synthetic */ List $this_apply$inlined;

    static {
        Covode.recordClassIndex(79442);
    }

    DMTBottomTabIntegrationServiceImplDiff$addLiveModule$$inlined$apply$lambda$1(b bVar, List list, b bVar2, f fVar) {
        this.$this_apply = bVar;
        this.$this_apply$inlined = list;
        this.$context$inlined = bVar2;
        this.$diContainer$inlined = fVar;
    }

    @Override // b.g
    public final Object then(i<LiveSettingApi.b> iVar) {
        Integer num;
        LiveSettingApi.b.a aVar;
        l.b(iVar, "");
        int i2 = 0;
        if (iVar.a()) {
            LiveSettingApi.b d2 = iVar.d();
            int i3 = 2;
            if (!(d2 == null || (aVar = d2.f140212a) == null)) {
                c.s.a(aVar.f140213a);
                ch chVar = aVar.f140214b;
                if (chVar != null) {
                    c.s.a(chVar);
                }
                cg cgVar = aVar.f140215c;
                if (cgVar != null) {
                    c.s.a(cgVar);
                }
                ch chVar2 = aVar.f140214b;
                if (chVar2 == null || !chVar2.f69861a) {
                    cg cgVar2 = aVar.f140215c;
                    if (cgVar2 == null || !cgVar2.f69843c) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                }
                this.$context$inlined.f121856d.invoke(Boolean.valueOf(aVar.f140213a));
                i3 = i2;
            }
            if (this.$this_apply.f121853a.invoke().booleanValue()) {
                a.f140240a = 3;
                DMTBottomTabIntegrationServiceImplDiff.INSTANCE.addLiveTabInternal(this.$diContainer$inlined, this.$this_apply.f121857e);
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", this.$this_apply.f121854b.r);
                com.ss.android.ugc.aweme.account.model.a e2 = c.u.e();
                if (e2 != null) {
                    num = Integer.valueOf(e2.m());
                } else {
                    num = null;
                }
                d.a("livesdk_live_tab_show", a2.a("fans_cnt", num).a("is_video_application_needed", i3).f149193a);
            }
        } else {
            this.$this_apply.f121856d.invoke(false);
        }
        if (!ef.a()) {
            DMTBottomTabIntegrationServiceImplDiff.INSTANCE.tryShowPopupForLiveWhenFirstTime(this.$diContainer$inlined);
        }
        return null;
    }
}
