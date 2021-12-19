package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cw.g;

@a(a = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
public class PipoInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10142);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "pipo_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        g.c().submit(a.f18253a);
    }

    static final /* synthetic */ void lambda$run$0$PipoInitTask() {
        if (com.bytedance.android.live.t.a.a(IWalletService.class) != null) {
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a((com.bytedance.android.live.wallet.g) null);
        }
    }
}
