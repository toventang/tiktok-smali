package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;

public final class SDKServiceImpl$split$1 implements VEListener.q {
    final /* synthetic */ ISDKService.SplitCallback $callback;
    final /* synthetic */ x $editor;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;

    static {
        Covode.recordClassIndex(79562);
    }

    @Override // com.ss.android.vesdk.VEListener.q
    public final void onCompileDone() {
        this.$callback.onSuccess(this.$width, this.$height);
        this.$editor.j();
    }

    @Override // com.ss.android.vesdk.VEListener.q
    public final void onCompileProgress(float f2) {
        if (this.$callback.checkIsCanceled()) {
            this.$editor.j();
        }
    }

    SDKServiceImpl$split$1(ISDKService.SplitCallback splitCallback, int i2, int i3, x xVar) {
        this.$callback = splitCallback;
        this.$width = i2;
        this.$height = i3;
        this.$editor = xVar;
    }

    @Override // com.ss.android.vesdk.VEListener.q
    public final void onCompileError(int i2, int i3, float f2, String str) {
        this.$callback.onFail();
        this.$editor.j();
    }
}
