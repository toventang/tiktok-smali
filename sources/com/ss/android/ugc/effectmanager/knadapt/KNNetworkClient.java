package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.d;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.a.c.f;
import d.a.e.b;
import h.f.b.g;
import h.f.b.l;
import java.io.InputStream;

public final class KNNetworkClient implements d {
    public static final Companion Companion = new Companion(null);
    private final IEffectNetWorker effectNetWrapper;

    static {
        Covode.recordClassIndex(95552);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95553);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public KNNetworkClient(IEffectNetWorker iEffectNetWorker) {
        l.c(iEffectNetWorker, "");
        this.effectNetWrapper = iEffectNetWorker;
    }

    private final void logRequestedUrl(e eVar) {
        try {
            b.a("KNNetworker", "request url: ".concat(String.valueOf(new h.m.l("&?device_info=[^&]*").replace(eVar.f153434a, ""))));
        } catch (Exception e2) {
            b.a("KNNetworker", "error in print url", e2);
        }
    }

    @Override // com.ss.ugc.effectplatform.a.c.d
    public final f fetchFromNetwork(e eVar) {
        String str;
        l.c(eVar, "");
        if (eVar.f153435b == c.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        logRequestedUrl(eVar);
        EffectRequest effectRequest = new EffectRequest(str, eVar.f153434a, eVar.f153439f);
        effectRequest.setContentType(eVar.f153438e);
        if (eVar.f153436c != null) {
            effectRequest.setHeaders(eVar.f153436c);
        }
        if (eVar.f153437d != null) {
            effectRequest.setBodyParams(eVar.f153437d);
        }
        try {
            InputStream execute = this.effectNetWrapper.execute(effectRequest);
            if (execute != null) {
                return new f(200, new InputStreamByteRead(execute), effectRequest.getContentLength(), effectRequest.getErrorMsg());
            }
            return new f(400, new com.ss.ugc.effectplatform.a.c.b(), 0, effectRequest.getErrorMsg());
        } catch (Exception e2) {
            e2.printStackTrace();
            com.ss.ugc.effectplatform.a.c.b bVar = new com.ss.ugc.effectplatform.a.c.b();
            String errorMsg = effectRequest.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = e2.getMessage();
            }
            return new f(400, bVar, 0, errorMsg);
        }
    }
}
