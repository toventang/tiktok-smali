package com.ss.android.ugc.aweme.crossplatform;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.web.i;
import com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider;
import com.ss.android.ugc.b;

public class HybridRegistryProvider implements IHybridRegistryProvider {
    static {
        Covode.recordClassIndex(48746);
    }

    public static IHybridRegistryProvider a() {
        Object a2 = b.a(IHybridRegistryProvider.class, false);
        if (a2 != null) {
            return (IHybridRegistryProvider) a2;
        }
        return new HybridRegistryProvider();
    }

    @Override // com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider
    public final i a(Context context) {
        return new com.ss.android.ugc.aweme.web.b(context);
    }
}
