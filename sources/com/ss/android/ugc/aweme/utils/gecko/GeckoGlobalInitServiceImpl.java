package com.ss.android.ugc.aweme.utils.gecko;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.IGeckoGlobalInit;
import com.ss.android.ugc.aweme.utils.dc;

public class GeckoGlobalInitServiceImpl implements IGeckoGlobalInit {
    static {
        Covode.recordClassIndex(93572);
    }

    @Override // com.bytedance.geckox.IGeckoGlobalInit
    public final GeckoGlobalConfig a() {
        return dc.j();
    }
}
