package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.tools.f.b;

final /* synthetic */ class MainServiceImpl$$Lambda$1 implements b {
    private final IMainService.DownLoadFinishListener arg$1;

    static {
        Covode.recordClassIndex(79525);
    }

    MainServiceImpl$$Lambda$1(IMainService.DownLoadFinishListener downLoadFinishListener) {
        this.arg$1 = downLoadFinishListener;
    }

    @Override // com.ss.android.ugc.aweme.tools.f.b
    public final void onFinish(int i2) {
        MainServiceImpl.lambda$downloadStickerHelper$1$MainServiceImpl(this.arg$1, i2);
    }
}
