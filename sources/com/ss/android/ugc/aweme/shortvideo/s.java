package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.tools.b.b;
import com.ss.android.ugc.aweme.tools.b.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final BaseShortVideoContext f130189a;

    static {
        Covode.recordClassIndex(85399);
    }

    s(BaseShortVideoContext baseShortVideoContext) {
        this.f130189a = baseShortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.tools.b.b
    public final String a(f fVar) {
        BaseShortVideoContext baseShortVideoContext = this.f130189a;
        switch (q.AnonymousClass3.f129927a[fVar.ordinal()]) {
            case 1:
                return baseShortVideoContext.getMainBusinessData();
            case 2:
                return baseShortVideoContext.socialData;
            case 3:
                return baseShortVideoContext.commerceData;
            case 4:
                return baseShortVideoContext.ugData;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return baseShortVideoContext.techData;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return baseShortVideoContext.globalData;
            default:
                return null;
        }
    }
}
