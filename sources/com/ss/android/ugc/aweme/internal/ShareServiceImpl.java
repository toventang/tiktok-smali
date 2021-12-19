package com.ss.android.ugc.aweme.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.b;

public final class ShareServiceImpl implements IShareService {
    static {
        Covode.recordClassIndex(67185);
    }

    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final String a(int i2) {
        if (i2 == 2) {
            return "instagram";
        }
        if (i2 == 3) {
            return "instagram_story";
        }
        if (i2 == 101) {
            return "twitter";
        }
        switch (i2) {
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "whatsapp";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "facebook";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "messenger";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "snapchat";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "vk";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "zalo";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "line";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "kakaotalk";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "sms";
            case ABRConfig.ABR_SELECT_SCENE:
                return "whatsapp_status";
            default:
                return "";
        }
    }

    public static IShareService a() {
        MethodCollector.i(10087);
        Object a2 = b.a(IShareService.class, false);
        if (a2 != null) {
            IShareService iShareService = (IShareService) a2;
            MethodCollector.o(10087);
            return iShareService;
        }
        if (b.bN == null) {
            synchronized (IShareService.class) {
                try {
                    if (b.bN == null) {
                        b.bN = new ShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10087);
                    throw th;
                }
            }
        }
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) b.bN;
        MethodCollector.o(10087);
        return shareServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final void a(int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("publish_private_status", i2);
        bundle.putBoolean("music_prevent_download", z);
        ah.f123353b.a("ug_publish_share_show", (Aweme) null, bundle);
    }
}
