package com.ss.android.ugc.effectmanager.knadapt;

import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.l;
import java.io.InputStream;
import org.json.JSONException;

public final class AdapterExtKt {
    static {
        Covode.recordClassIndex(95540);
    }

    public static final <T extends h<?>> T execute(EffectNetWorkerWrapper effectNetWorkerWrapper, EffectRequest effectRequest, IJsonConverter iJsonConverter, Class<T> cls) {
        String str;
        l.c(effectNetWorkerWrapper, "");
        l.c(iJsonConverter, "");
        InputStream execute = effectNetWorkerWrapper.getIEffectNetWorker().execute(effectRequest);
        if (execute != null) {
            T t = (T) ((h) iJsonConverter.convertJsonToObj(execute, cls));
            CloseUtil.close(execute);
            if (t != null) {
                int statusCode = t.getStatusCode();
                if (statusCode == 0) {
                    return t;
                }
                throw new StatusCodeException(statusCode, t.getResponseMessage());
            }
            throw new JSONException("Json convert fail");
        } else if (NetworkUtils.isNetworkAvailable(effectNetWorkerWrapper.getContext())) {
            String str2 = null;
            if (effectRequest != null) {
                str = effectRequest.getErrorMsg();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (effectRequest != null) {
                    str2 = effectRequest.getErrorMsg();
                }
                throw new NetworkErrorException(str2);
            }
            throw new NetworkErrorException("Download error");
        } else {
            throw new Exception("network unavailable");
        }
    }

    public static final <T extends h<?>> T parse(EffectNetWorkerWrapper effectNetWorkerWrapper, EffectRequest effectRequest, InputStream inputStream, IJsonConverter iJsonConverter, Class<T> cls) {
        l.c(effectNetWorkerWrapper, "");
        l.c(iJsonConverter, "");
        if (inputStream == null) {
            l.a();
        }
        T t = (T) ((h) iJsonConverter.convertJsonToObj(inputStream, cls));
        if (t != null) {
            int statusCode = t.getStatusCode();
            if (statusCode == 0) {
                return t;
            }
            throw new StatusCodeException(statusCode, t.getResponseMessage());
        }
        throw new JSONException("Json convert fail");
    }
}
