package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.tools.b.a;
import com.ss.android.ugc.aweme.tools.b.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final BaseShortVideoContext f131083a;

    static {
        Covode.recordClassIndex(85900);
    }

    t(BaseShortVideoContext baseShortVideoContext) {
        this.f131083a = baseShortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.tools.b.a
    public final void a(f fVar, String str) {
        BaseShortVideoContext baseShortVideoContext = this.f131083a;
        switch (q.AnonymousClass3.f129927a[fVar.ordinal()]) {
            case 1:
                baseShortVideoContext.setMainBusinessData(str);
                return;
            case 2:
                baseShortVideoContext.socialData = str;
                return;
            case 3:
                baseShortVideoContext.commerceData = str;
                return;
            case 4:
                baseShortVideoContext.ugData = str;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                baseShortVideoContext.techData = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                baseShortVideoContext.globalData = str;
                return;
            default:
                return;
        }
    }
}
