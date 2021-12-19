package com.ss.android.ugc.aweme.account.login.v2;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.util.b;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.a.n;
import h.f.b.l;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64141a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f64142b = n.b("gmail.com", "hotmail.com", "outlook.com", "yahoo.com", "icloud.com");

    /* renamed from: c  reason: collision with root package name */
    private static final Date f64143c;

    private a() {
    }

    static {
        long j2;
        Covode.recordClassIndex(39524);
        long currentTimeMillis = System.currentTimeMillis();
        if (!b.a()) {
            j2 = 31536000000L;
        } else {
            j2 = 0;
        }
        f64143c = new Date(currentTimeMillis - j2);
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
        } catch (com.bytedance.ies.a unused) {
        }
        return f64142b;
    }

    public static Date b() {
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AgeGateSettings ageGateSettings = iESSettingsProxy.getAgeGateSettings();
            l.b(ageGateSettings, "");
            if (ageGateSettings.getInitialDate().intValue() > 0) {
                return new Date(TimeUnit.SECONDS.toMillis((long) ageGateSettings.getInitialDate().intValue()));
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return f64143c;
    }
}
