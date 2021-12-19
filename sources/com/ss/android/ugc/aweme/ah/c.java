package com.ss.android.ugc.aweme.ah;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.sticker.p.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f66314a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(40740);
    }

    public static void a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getBusiStickerService().a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.p.d
    public final void b(Effect effect) {
        String str;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        ad busiStickerService = createIAVServiceProxybyMonsterPlugin.getBusiStickerService();
        if (effect != null) {
            str = effect.getAdRawData();
        } else {
            str = null;
        }
        busiStickerService.b(str);
    }

    @Override // com.ss.android.ugc.aweme.sticker.p.d
    public final void a(Effect effect) {
        String str;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        ad busiStickerService = createIAVServiceProxybyMonsterPlugin.getBusiStickerService();
        if (effect != null) {
            str = effect.getAdRawData();
        } else {
            str = null;
        }
        busiStickerService.a(str);
    }
}
