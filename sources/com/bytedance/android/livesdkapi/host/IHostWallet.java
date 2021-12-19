package com.bytedance.android.livesdkapi.host;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostWallet extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(13794);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(13795);
        }
    }

    static {
        Covode.recordClassIndex(13793);
    }

    a getBillingClient(b bVar);

    Map<String, String> getHostWalletSetting();
}
