package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.api.a.h;
import com.bytedance.android.live.effect.api.a.i;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.api.a.k;
import com.bytedance.android.live.effect.api.d;
import com.bytedance.android.live.effect.api.e;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.b.b;
import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public class c implements IEffectService {
    static {
        Covode.recordClassIndex(4939);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public d getEffectLogHelper() {
        return b.f9657a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public j getLiveEffectDataProvider() {
        return g.f9837b;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public k getLiveEffectRestoreManager() {
        return k.f9870a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public f getLiveFilterManager() {
        return j.b.f9740a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public h composerManager() {
        return b.f();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public i composerManagerB() {
        return c.a.a();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public e getLiveFilterHelper() {
        return new com.bytedance.android.live.effect.c.f();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public com.bytedance.android.live.effect.api.a.e baseComposerManager() {
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            return composerManagerB();
        }
        return composerManager();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public a convertStickerBean(Effect effect) {
        return com.bytedance.android.live.effect.f.d.a(effect);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public com.bytedance.android.live.effect.api.a.b getComposerHandler(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
        return new com.bytedance.android.live.effect.b.a(eVar);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public v getEffectNewDialogFragment(com.bytedance.android.live.effect.model.b bVar) {
        com.bytedance.android.live.effect.d.c cVar = new com.bytedance.android.live.effect.d.c();
        cVar.f9762f = bVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public v getEffectDialogFragment(g gVar, com.bytedance.android.live.effect.model.b bVar) {
        l.d(gVar, "");
        h hVar = new h();
        hVar.f9852a = gVar;
        hVar.f9853b = bVar;
        return hVar;
    }
}
