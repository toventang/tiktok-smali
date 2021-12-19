package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class NativeAssetPackStateUpdateListener implements c {
    static {
        Covode.recordClassIndex(32663);
    }

    @Override // com.google.android.play.core.c.a
    public final /* synthetic */ void a(Object obj) {
        MethodCollector.i(9230);
        onStateUpdate((AssetPackState) obj);
        MethodCollector.o(9230);
    }

    public native void onStateUpdate(AssetPackState assetPackState);
}
