package com.ss.android.ugc.aweme.services;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.experiment.ef;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.ss.android.ugc.aweme.tools.live.a.a;
import com.ss.android.ugc.gamora.recorder.h.d;
import h.f.a.b;
import h.f.b.l;
import java.util.List;

public final class DMTBottomTabIntegrationServiceImplDiff {
    public static final DMTBottomTabIntegrationServiceImplDiff INSTANCE = new DMTBottomTabIntegrationServiceImplDiff();

    private DMTBottomTabIntegrationServiceImplDiff() {
    }

    static {
        Covode.recordClassIndex(79441);
    }

    public final void tryShowPopupForLiveWhenFirstTime(f fVar) {
        d dVar = new d();
        if (!dVar.a() && ef.b()) {
            LiveSettingApi.f140209a.createInfo().a(new DMTBottomTabIntegrationServiceImplDiff$tryShowPopupForLiveWhenFirstTime$1(dVar, fVar), i.f4826c, null);
        }
    }

    public final boolean addLiveTabInternal(f fVar, b<? super Integer, Integer> bVar) {
        if (ef.a()) {
            d dVar = new d();
            if (dVar.a() && dVar.b()) {
                com.ss.android.ugc.gamora.recorder.b.b bVar2 = (com.ss.android.ugc.gamora.recorder.b.b) fVar.a(com.ss.android.ugc.gamora.recorder.b.b.class, (String) null);
                String currentBottomTag = bVar2.getCurrentBottomTag();
                bVar2.addBottomTab(bVar.invoke(Integer.valueOf(bVar2.bottomTabSize())).intValue() - 1, new a(fVar), 0);
                bVar2.resetToCurTab(currentBottomTag);
                return false;
            } else if (!dVar.a()) {
                LiveSettingApi.f140209a.createInfo().a(new DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$2(dVar, fVar, bVar), i.f4826c, null);
                return true;
            } else {
                com.ss.android.ugc.gamora.recorder.b.b bVar3 = (com.ss.android.ugc.gamora.recorder.b.b) fVar.a(com.ss.android.ugc.gamora.recorder.b.b.class, (String) null);
                bVar3.addBottomTab(bVar.invoke(Integer.valueOf(bVar3.bottomTabSize())).intValue(), new a(fVar), 0);
                return false;
            }
        } else {
            com.ss.android.ugc.gamora.recorder.b.b bVar4 = (com.ss.android.ugc.gamora.recorder.b.b) fVar.a(com.ss.android.ugc.gamora.recorder.b.b.class, (String) null);
            bVar4.addBottomTab(bVar.invoke(Integer.valueOf(bVar4.bottomTabSize())).intValue(), new a(fVar), 0);
            return false;
        }
    }

    public final List<com.ss.android.ugc.gamora.recorder.b.a> addLiveModule(f fVar, List<com.ss.android.ugc.gamora.recorder.b.a> list, com.ss.android.ugc.aweme.servicimpl.b bVar) {
        l.d(fVar, "");
        l.d(list, "");
        l.d(bVar, "");
        if (!c.u.a() && bVar.f121854b.ab == null) {
            if (ef.a() || !bVar.f121854b.al) {
                bVar.f121855c.invoke();
                LiveSettingApi.WebcastAPI webcastAPI = LiveSettingApi.f140209a;
                l.b(webcastAPI, "");
                webcastAPI.getLivePodCast().a(new DMTBottomTabIntegrationServiceImplDiff$addLiveModule$$inlined$apply$lambda$1(bVar, list, bVar, fVar), i.f4826c, null);
            } else {
                com.ss.android.ugc.aweme.tools.live.sticker.a.f140240a = 0;
                if (bVar.f121853a.invoke().booleanValue() && !bVar.f121854b.al) {
                    com.ss.android.ugc.aweme.tools.live.sticker.a.f140240a = 1;
                }
                if (!bVar.f121853a.invoke().booleanValue() && bVar.f121854b.al) {
                    com.ss.android.ugc.aweme.tools.live.sticker.a.f140240a = 2;
                }
                list.add(new a(fVar));
                if (!ef.a()) {
                    INSTANCE.tryShowPopupForLiveWhenFirstTime(fVar);
                }
            }
        }
        return list;
    }
}
