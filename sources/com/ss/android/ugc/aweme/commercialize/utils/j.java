package com.ss.android.ugc.aweme.commercialize.utils;

import android.os.Build;
import android.os.SystemClock;
import androidx.c.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.i.c;
import h.i.d;
import org.json.JSONObject;

public final class j implements com.bytedance.android.monitor.webview.a {

    /* renamed from: a  reason: collision with root package name */
    public static final j f75776a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final c f75777b = d.a(SystemClock.uptimeMillis());

    /* renamed from: c  reason: collision with root package name */
    private static final h f75778c = i.a((h.f.a.a) a.f75780a);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f75779d = false;

    private j() {
    }

    static final class a extends m implements h.f.a.a<androidx.c.a<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75780a = new a();

        static {
            Covode.recordClassIndex(46739);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.c.a<String, String> invoke() {
            androidx.c.a aVar = new androidx.c.a(8);
            aVar.put("resource_performance", "landing_page_static_resource");
            aVar.put("perf", "landing_page_perf");
            aVar.put("performance", "landing_page_performance");
            aVar.put("blank", "landing_page_blank");
            aVar.put("navigationStart", "landing_page_navigation_start");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(46738);
        int i2 = Build.VERSION.SDK_INT;
    }

    @Override // com.bytedance.android.monitor.webview.a
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject optJSONObject;
        String str2;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        l.b(adLandingPageConfig, "");
        int hybridMonitorSampleRate = adLandingPageConfig.getHybridMonitorSampleRate();
        if (hybridMonitorSampleRate > 0 && f75777b.nextInt(hybridMonitorSampleRate) == 0 && !f75779d && str != null && str.length() != 0 && jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("extra")) != null) {
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("nativeInfo");
            JSONObject optJSONObject5 = optJSONObject.optJSONObject("jsInfo");
            if (((optJSONObject5 != null && (str2 = optJSONObject5.optString("ev_type")) != null) || (optJSONObject4 != null && (str2 = optJSONObject4.optString("event_type")) != null)) && !l.a((Object) str2, (Object) "custom")) {
                if (l.a((Object) str2, (Object) "resource_performance")) {
                    IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                    l.b(iESSettingsProxy2, "");
                    AdLandingPageConfig adLandingPageConfig2 = iESSettingsProxy2.getAdLandingPageConfig();
                    l.b(adLandingPageConfig2, "");
                    if (!adLandingPageConfig2.isHybridMonitorResPerfEnable()) {
                        return;
                    }
                }
                String str3 = (String) ((g) f75778c.getValue()).get(str2);
                if (str3 != null && str3.length() != 0 && (optJSONObject2 = optJSONObject.optJSONObject("nativeBase")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("context")) != null) {
                    String optString = optJSONObject3.optString("creative_id");
                    String optString2 = optJSONObject3.optString("log_extra");
                    if (optString != null && optString.length() != 0) {
                        String optString3 = optJSONObject3.optString("channel_name");
                        int optInt = optJSONObject3.optInt("preload_status", 0);
                        long optLong = optJSONObject3.optLong("preload_webview_time", -1);
                        l.b(optString3, "");
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", str3, optString, optString2, null).a("hybrid_data", String.valueOf(optJSONObject)).a("channel_name", optString3).a("preload_status", Integer.valueOf(optInt)).a("preload_webview_time", Long.valueOf(optLong)).b();
                    }
                }
            }
        }
    }
}
