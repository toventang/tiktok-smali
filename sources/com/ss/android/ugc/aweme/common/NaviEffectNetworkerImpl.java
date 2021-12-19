package com.ss.android.ugc.aweme.common;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import h.f.b.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public final class NaviEffectNetworkerImpl implements IEffectNetWorker {

    public interface EffectNetworkAPI {
        static {
            Covode.recordClassIndex(47115);
        }

        @h
        @ae
        b<TypedInput> doGet(@a boolean z, @o int i2, @ag String str, @aa(a = true) LinkedHashMap<String, String> linkedHashMap);

        @t
        @ae
        b<TypedInput> doPost(@a boolean z, @o int i2, @ag String str, @com.bytedance.retrofit2.b.b Map<String, ? extends Object> map);
    }

    static {
        Covode.recordClassIndex(47114);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        InputStream inputStream = null;
        if (effectRequest == null) {
            return null;
        }
        try {
            inputStream = a(effectRequest);
            return inputStream;
        } catch (Exception e2) {
            e2.printStackTrace();
            return inputStream;
        }
    }

    private static InputStream a(EffectRequest effectRequest) {
        u<TypedInput> execute;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        try {
            Pair<String, String> a2 = i.a(effectRequest.getUrl(), linkedHashMap);
            String str = (String) a2.first;
            String str2 = (String) a2.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            au networkService = createIAVServiceProxybyMonsterPlugin.getNetworkService();
            l.b(str, "");
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) networkService.createRetrofit(str, isUseCommonParams, EffectNetworkAPI.class);
            if (isUseCommonParams) {
                linkedHashMap.put("game_version", "1.0");
            }
            if (l.a((Object) "POST", (Object) effectRequest.getHttpMethod())) {
                b<TypedInput> doPost = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str2, effectRequest.getParams());
                if (doPost == null) {
                    l.b();
                }
                execute = doPost.execute();
                l.b(execute, "");
            } else {
                b<TypedInput> doGet = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str2, linkedHashMap);
                if (doGet == null) {
                    l.b();
                }
                execute = doGet.execute();
                l.b(execute, "");
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
