package com.ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class RequestIdService implements IRequestIdService {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, IRequestIdService.a> f67617a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41629);
    }

    public static IRequestIdService a() {
        MethodCollector.i(12579);
        Object a2 = b.a(IRequestIdService.class, false);
        if (a2 != null) {
            IRequestIdService iRequestIdService = (IRequestIdService) a2;
            MethodCollector.o(12579);
            return iRequestIdService;
        }
        if (b.S == null) {
            synchronized (IRequestIdService.class) {
                try {
                    if (b.S == null) {
                        b.S = new RequestIdService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12579);
                    throw th;
                }
            }
        }
        RequestIdService requestIdService = (RequestIdService) b.S;
        MethodCollector.o(12579);
        return requestIdService;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final IRequestIdService.a a(String str) {
        IRequestIdService.a aVar = this.f67617a.get(str);
        if (aVar == null) {
            return new IRequestIdService.a();
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final String a(Aweme aweme, int i2) {
        IRequestIdService.a a2;
        if (aweme == null || (a2 = a(aweme.getAid() + i2)) == null) {
            return "";
        }
        return a2.f67646a;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final JSONObject b(Aweme aweme, int i2) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        String str2 = aweme.getAid() + i2;
        JSONObject jSONObject = new JSONObject();
        try {
            IRequestIdService.a a2 = a(str2);
            String str3 = a2.f67646a;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("request_id", str3);
            }
            if (a2.f67647b != null) {
                jSONObject.put("order", a2.f67647b);
            }
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("is_photo", str);
            if (aweme.playlist_info == null || TextUtils.isEmpty(aweme.playlist_info.getMixId())) {
                return jSONObject;
            }
            jSONObject.put("playlist_id", aweme.playlist_info.getMixId());
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final void a(String str, String str2, int i2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f67617a.put(str, new IRequestIdService.a(str2, i2));
        }
    }
}
