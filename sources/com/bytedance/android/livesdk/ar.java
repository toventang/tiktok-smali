package com.bytedance.android.livesdk;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.as.d;
import com.bytedance.android.livesdk.client.b;
import com.bytedance.android.livesdk.client.c;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.x.f;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.MessageManagerFactory;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public final class ar {

    /* renamed from: a  reason: collision with root package name */
    static f f14027a;

    /* renamed from: b  reason: collision with root package name */
    static IMessageManager f14028b;

    static {
        Covode.recordClassIndex(7779);
    }

    public static IMessageManager a(long j2, boolean z, Context context) {
        c cVar = new c(z, u.a().b().c());
        b bVar = new b(z, u.a().b().c());
        cVar.a(j2, context);
        f fVar = f14027a;
        if (fVar != null) {
            fVar.b();
        }
        f14027a = new f();
        com.bytedance.android.livesdk.ac.b giftInterceptor = ((IGiftService) a.a(IGiftService.class)).getGiftInterceptor(j2, z);
        Configuration addInterceptor = a(cVar, bVar, j2, z).addInterceptor(f14027a).addInterceptor(giftInterceptor);
        IMessageManager iMessageManager = f14028b;
        if (iMessageManager == null) {
            f14028b = MessageManagerFactory.getV2(addInterceptor);
        } else {
            iMessageManager.reset();
            f14028b.refresh(addInterceptor);
        }
        giftInterceptor.a(f14028b);
        com.bytedance.android.livesdk.as.b.a().f14065b = f14028b;
        e.a().a(com.bytedance.android.livesdk.as.b.a().f14066c);
        return f14028b;
    }

    static Configuration a(c cVar, IMessageClient iMessageClient, long j2, boolean z) {
        return new Configuration().setWsClient(cVar).setMessageConverter(new com.bytedance.android.livesdk.ac.a.a()).setHttpClient(iMessageClient).setLogger(new com.bytedance.android.livesdk.ac.a.b()).setMonitor(new z()).setUplinkConfig(new d()).setWaitWsConnectDuration(LiveMessageTimeoutSetting.INSTANCE.getWsConnectTimeout()).setDuplicateSize(LiveMessageSetting.INSTANCE.duplicateSize()).setIsEnhanceWS(LiveMessageSetting.INSTANCE.enhanceWebsocket()).addInterceptor(new com.bytedance.android.livesdk.x.b(j2)).addInterceptor(new com.bytedance.android.livesdk.x.a()).addInterceptor(new com.bytedance.android.livesdk.x.c()).addInterceptor(new com.bytedance.android.livesdk.x.e()).addInterceptor(new com.bytedance.android.livesdk.x.d()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true);
    }
}
