package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.sticker.ICaptionService;

public final class CaptionServiceImpl implements ICaptionService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f130852a = true;

    static {
        Covode.recordClassIndex(85764);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final boolean getAlwaysShowCaptionStatus() {
        return this.f130852a;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final boolean isConsumptionEnableAutoCaption() {
        if (b.a().a(true, "studio_consumption_enable_auto_captions", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final String getCaptionCacheDir() {
        return g.a().g().c().d("caption");
    }

    public static ICaptionService a() {
        MethodCollector.i(5858);
        Object a2 = com.ss.android.ugc.b.a(ICaptionService.class, false);
        if (a2 != null) {
            ICaptionService iCaptionService = (ICaptionService) a2;
            MethodCollector.o(5858);
            return iCaptionService;
        }
        if (com.ss.android.ugc.b.ef == null) {
            synchronized (ICaptionService.class) {
                try {
                    if (com.ss.android.ugc.b.ef == null) {
                        com.ss.android.ugc.b.ef = new CaptionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5858);
                    throw th;
                }
            }
        }
        CaptionServiceImpl captionServiceImpl = (CaptionServiceImpl) com.ss.android.ugc.b.ef;
        MethodCollector.o(5858);
        return captionServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.ICaptionService
    public final void setAlwaysShowCaptionStatus(boolean z) {
        this.f130852a = z;
    }
}
