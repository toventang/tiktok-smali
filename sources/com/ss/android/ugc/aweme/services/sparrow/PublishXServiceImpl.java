package com.ss.android.ugc.aweme.services.sparrow;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cr.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.publish.d.a;
import com.ss.android.ugc.aweme.service.IPublishXService;
import com.ss.android.ugc.aweme.service.ISparrowService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.upload.y;
import com.ss.android.ugc.aweme.utils.fe;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class PublishXServiceImpl implements c {
    static {
        Covode.recordClassIndex(79801);
    }

    private final String eventConclusion(Throwable th) {
        if (!(th instanceof et)) {
            return "no conclusion available";
        }
        if (isQuietlySyntheticCancel((et) th)) {
            return "User cancelled publish, no need to handle";
        }
        if (th.getCause() instanceof a) {
            return "Debug mock publish failure enabled";
        }
        return "no conclusion available";
    }

    private final int eventExplanation(Throwable th) {
        if ((th instanceof et) && (th.getCause() instanceof a)) {
            return 1;
        }
        return -1;
    }

    private final String eventMessage(Throwable th) {
        if ((th instanceof et) && isQuietlySyntheticCancel((et) th)) {
            return "User cancelled publish";
        }
        return "no message available";
    }

    private final boolean isQuietlySyntheticCancel(et etVar) {
        Throwable cause = etVar.getCause();
        if ((cause instanceof ee) && ((ee) cause).getCode() == -66666) {
            return true;
        }
        if (!(cause instanceof y) || ((y) cause).getErrorCode() != -39993) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.cr.c
    public final void reportPublishFailure(Throwable th, boolean z) {
        l.d(th, "");
        IPublishXService a2 = ((ISparrowService) ServiceManager.get().getService(ISparrowService.class)).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("message", eventMessage(th));
        linkedHashMap.put("conclusion", eventConclusion(th));
        linkedHashMap.put("explanation", Integer.valueOf(eventExplanation(th)));
        String a3 = g.a().w().a();
        l.b(a3, "");
        linkedHashMap.put("did", a3);
        linkedHashMap.put("uid", g.a().A().c());
        Application application = i.f115645a;
        l.b(application, "");
        linkedHashMap.put("network_type", fe.b(application).toString());
        IAVSettingsService avSettingsService = AVServiceImpl.a().avSettingsService();
        l.b(avSettingsService, "");
        String vESDKVersion = avSettingsService.getVESDKVersion();
        l.b(vESDKVersion, "");
        linkedHashMap.put("vesdk_version", vESDKVersion);
        IAVSettingsService avSettingsService2 = AVServiceImpl.a().avSettingsService();
        l.b(avSettingsService2, "");
        String effectVersion = avSettingsService2.getEffectVersion();
        l.b(effectVersion, "");
        linkedHashMap.put("effectsdk_version", effectVersion);
        a2.a(th, linkedHashMap);
    }
}
