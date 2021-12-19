package com.ss.android.ugc.aweme.influencer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.web.a.a;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.GetGeckoChannelVersionMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethodCrossPlatform;
import com.ss.android.ugc.b;
import h.a.n;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class ECommerceLiveBridgeMethodServiceImpl implements IECommerceLiveBridgeService {
    static {
        Covode.recordClassIndex(66929);
    }

    public static IECommerceLiveBridgeService a() {
        MethodCollector.i(11570);
        Object a2 = b.a(IECommerceLiveBridgeService.class, false);
        if (a2 != null) {
            IECommerceLiveBridgeService iECommerceLiveBridgeService = (IECommerceLiveBridgeService) a2;
            MethodCollector.o(11570);
            return iECommerceLiveBridgeService;
        }
        if (b.bE == null) {
            synchronized (IECommerceLiveBridgeService.class) {
                try {
                    if (b.bE == null) {
                        b.bE = new ECommerceLiveBridgeMethodServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11570);
                    throw th;
                }
            }
        }
        ECommerceLiveBridgeMethodServiceImpl eCommerceLiveBridgeMethodServiceImpl = (ECommerceLiveBridgeMethodServiceImpl) b.bE;
        MethodCollector.o(11570);
        return eCommerceLiveBridgeMethodServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return n.b(new OpenSchemaSingleTaskMethod(bVar), new GetGeckoChannelVersionMethod(bVar), new OpenWhatsAppChatMethod(bVar), new CopyTextToPasteBoardMethod(bVar), new SendEmailMethod(bVar));
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final void a(e eVar, WeakReference<Context> weakReference) {
        l.d(eVar, "");
        l.d(weakReference, "");
        a aVar = eVar.f60185b;
        eVar.a("openSingletonSchema", new OpenSchemaSingleTaskMethodCrossPlatform(aVar).attach(weakReference));
        eVar.a("routeToWhatsapp", new OpenWhatsAppChatMethodCrossPlatform(aVar).attach(weakReference));
        eVar.a("copyTextToPasteBoard", new CopyTextToPasteBoardMethodCrossPlatform(aVar).attach(weakReference));
        eVar.a("sendEMailTo", new SendEmailMethodCrossPlatform(aVar).attach(weakReference));
    }
}
