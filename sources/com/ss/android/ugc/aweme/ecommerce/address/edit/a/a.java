package com.ss.android.ugc.aweme.ecommerce.address.edit.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84398a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f84399b = n.b("gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com");

    private a() {
    }

    static {
        Covode.recordClassIndex(52666);
    }

    public static List<String> a() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            EmailLoginSettings emailLoginSettings = iESSettingsProxy.getEmailLoginSettings();
            l.b(emailLoginSettings, "");
            List<String> domainRecommendation = emailLoginSettings.getDomainRecommendation();
            l.b(domainRecommendation, "");
            if (!domainRecommendation.isEmpty()) {
                return emailLoginSettings.getDomainRecommendation();
            }
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.a("getDomainRecommendation error: " + e2.getMessage());
        }
        return f84399b;
    }
}
