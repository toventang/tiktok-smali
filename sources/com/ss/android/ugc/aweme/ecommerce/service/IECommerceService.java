package com.ss.android.ugc.aweme.ecommerce.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

public interface IECommerceService {
    static {
        Covode.recordClassIndex(54827);
    }

    void addJSMethods(e eVar, WeakReference<Context> weakReference);

    List<IInterceptor> getEComPipeRouterInterceptors();

    List<IInterceptor> getECommerceRouterInterceptors();

    List<k> getJSMethods(b bVar);

    b getOrderCenterEntry();

    void postEvent(String str, JSONObject jSONObject);

    void prefetchPdp(String str, Context context);

    void prefetchPdp(String str, Context context, int i2, h.f.a.b<? super ProductBaseEpt, z> bVar);

    void prefetchSchema(String str, Context context);

    void showThirdpartyDisclaimerTips(Context context, String str);
}
