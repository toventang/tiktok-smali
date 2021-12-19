package com.ss.android.ugc.aweme.effectplatform;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

public final class w implements IEffectNetWorker {
    static {
        Covode.recordClassIndex(56024);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        u<TypedInput> execute;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Pair<String, String> a2 = i.a(effectRequest.getUrl(), linkedHashMap);
            String str = (String) a2.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            g.a().w();
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) g.a().C().createRetrofit((String) a2.first, isUseCommonParams, EffectNetworkAPI.class);
            if ("POST".equals(effectRequest.getHttpMethod())) {
                execute = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str, effectRequest.getParams()).execute();
            } else {
                execute = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str, linkedHashMap).execute();
            }
            if (!execute.f42629a.a()) {
                return null;
            }
            InputStream in = execute.f42630b.in();
            effectRequest.setContentLength(execute.f42630b.length());
            return in;
        } catch (IOException e2) {
            effectRequest.setErrorMsg(e2.getMessage());
            return null;
        } catch (Exception e3) {
            effectRequest.setErrorMsg(e3.getMessage());
            return null;
        }
    }
}
