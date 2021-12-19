package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.a.m;
import h.f.a.r;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.g  reason: invalid package */
public final class g implements com.bytedance.ies.bullet.kit.web.g {
    static {
        Covode.recordClassIndex(42870);
    }

    @Override // com.bytedance.ies.bullet.kit.web.g
    public final r<WebView, String, Map<String, String>, m<? super String, ? super Map<String, String>, z>, z> a() {
        return a.f69512a;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.g$a */
    static final class a extends h.f.b.m implements r<WebView, String, Map<String, String>, m<? super String, ? super Map<String, String>, ? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f69512a = new a();

        static {
            Covode.recordClassIndex(42871);
        }

        a() {
            super(4);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(WebView webView, String str, Map<String, String> map, m<? super String, ? super Map<String, String>, ? extends z> mVar) {
            m<? super String, ? super Map<String, String>, ? extends z> mVar2 = mVar;
            l.d(webView, "");
            l.d(mVar2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
                l.b(adLandingPageConfig, "");
                Boolean enableReferer = adLandingPageConfig.getEnableReferer();
                l.b(enableReferer, "");
                if (enableReferer.booleanValue()) {
                    linkedHashMap.put("referer", "https://www.tiktok.com");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            mVar2.invoke(str, linkedHashMap);
            return z.f158842a;
        }
    }
}
