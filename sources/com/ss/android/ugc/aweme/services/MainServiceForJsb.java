package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.a;
import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import org.json.JSONObject;

public class MainServiceForJsb implements IMainServiceForJsb {
    public static final String JS_SDK_CONFIG_URL = a.a("/client_auth/js_sdk/config/v1/");

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getSSLocalScheme() {
        return "sslocal";
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getPlayNameMobile() {
        return com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.d();
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public boolean hasPlatformBinded() {
        return com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a();
    }

    static {
        Covode.recordClassIndex(79520);
    }

    public long getUserId() {
        return Long.parseLong(b.g().getCurUserId());
    }

    public boolean isLogin() {
        return b.g().isLogin();
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public boolean isPlatformBinded(String str) {
        return com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(str);
    }

    public boolean isBrowserActivity(Context context) {
        return CrossPlatformServiceImpl.c().a().isInstance(context);
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public boolean isApiSuccess(JSONObject jSONObject) {
        if (jSONObject == null || !"success".equals(jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    public static IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin(boolean z) {
        MethodCollector.i(6109);
        Object a2 = com.ss.android.ugc.b.a(IMainServiceForJsb.class, z);
        if (a2 != null) {
            IMainServiceForJsb iMainServiceForJsb = (IMainServiceForJsb) a2;
            MethodCollector.o(6109);
            return iMainServiceForJsb;
        }
        if (com.ss.android.ugc.b.du == null) {
            synchronized (IMainServiceForJsb.class) {
                try {
                    if (com.ss.android.ugc.b.du == null) {
                        com.ss.android.ugc.b.du = new MainServiceForJsb();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6109);
                    throw th;
                }
            }
        }
        MainServiceForJsb mainServiceForJsb = (MainServiceForJsb) com.ss.android.ugc.b.du;
        MethodCollector.o(6109);
        return mainServiceForJsb;
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public void startAdsAppActivity(Activity activity, String str) {
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(activity, str, "");
    }
}
