package com.ss.android.ugc.aweme.video.simplayer.tt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.m;
import com.ss.android.ugc.playerkit.model.m;

public final class b extends m {
    static {
        Covode.recordClassIndex(94175);
    }

    public b(boolean z) {
        super(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.i
    public final j a(m.e eVar) {
        com.ss.android.ugc.playerkit.model.m playerConfig = a.C3820a.f143369a.a().getPlayerConfig(eVar, false, this.f143479a);
        if (playerConfig.f148755b == m.e.Ijk) {
            return new com.ss.android.ugc.aweme.player.sdk.a.m(playerConfig.f148754a, playerConfig.f148756c, playerConfig.f148758e, playerConfig.f148759f, playerConfig);
        }
        if (playerConfig.f148755b == m.e.IjkHardware) {
            return new com.ss.android.ugc.aweme.player.sdk.a.m(playerConfig.f148754a, playerConfig.f148756c, playerConfig.f148758e, playerConfig.f148759f, playerConfig);
        }
        if (playerConfig.f148755b == m.e.TT || playerConfig.f148755b == m.e.TT_IJK_ENGINE) {
            return new com.ss.android.ugc.aweme.player.sdk.a.m(playerConfig.f148754a, playerConfig.f148756c, playerConfig.f148758e, playerConfig.f148759f, playerConfig);
        }
        if (playerConfig.f148755b == m.e.TT_HARDWARE) {
            return new com.ss.android.ugc.aweme.player.sdk.a.m(playerConfig.f148754a, true, playerConfig.f148758e, playerConfig.f148759f, playerConfig);
        }
        return new com.ss.android.ugc.aweme.player.sdk.a.m(playerConfig.f148754a);
    }
}
