package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class ai implements IHostWallet {
    static {
        Covode.recordClassIndex(69500);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWallet
    public final IHostWallet.a getBillingClient(IHostWallet.b bVar) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWallet
    public final Map<String, String> getHostWalletSetting() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }
}
