package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.io.IOException;
import java.io.InputStream;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private RateSettingsResponse f133568a;

    /* renamed from: b  reason: collision with root package name */
    private RateSettingsResponse f133569b;

    static {
        Covode.recordClassIndex(87374);
    }

    private r() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final r f133571a = new r((byte) 0);

        static {
            Covode.recordClassIndex(87376);
        }
    }

    public final synchronized RateSettingsResponse a() {
        String str;
        MethodCollector.i(4527);
        if (this.f133568a == null) {
            RateSettingsResponse rateSettingsResponse = d.a().b().getCommonConfig().getRateSettingsResponse();
            if (rateSettingsResponse != null) {
                this.f133568a = rateSettingsResponse;
            } else {
                if (this.f133569b == null) {
                    RateSettingsResponse defaultRateSettingsResponse = d.a().b().getCommonConfig().getDefaultRateSettingsResponse();
                    this.f133569b = defaultRateSettingsResponse;
                    if (defaultRateSettingsResponse == null) {
                        Application application = com.ss.android.ugc.playerkit.simapicommon.a.f148866a;
                        String country = Resources.getSystem().getConfiguration().locale.getCountry();
                        if (s.f133573b.contains(country)) {
                            str = "ng";
                        } else if (s.f133572a.contains(country)) {
                            str = country.toLowerCase();
                        } else if (s.f133574c.contains(country)) {
                            str = "pe";
                        } else {
                            str = "other";
                        }
                        this.f133569b = (RateSettingsResponse) new f().a(a(application, "simkit_rate_settings/" + str + ".json"), new com.google.gson.b.a<RateSettingsResponse>() {
                            /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.r.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(87375);
                            }
                        }.type);
                    }
                }
                RateSettingsResponse rateSettingsResponse2 = this.f133569b;
                MethodCollector.o(4527);
                return rateSettingsResponse2;
            }
        }
        RateSettingsResponse rateSettingsResponse3 = this.f133568a;
        MethodCollector.o(4527);
        return rateSettingsResponse3;
    }

    /* synthetic */ r(byte b2) {
        this();
    }

    private static String a(Context context, String str) {
        MethodCollector.i(4530);
        try {
            InputStream open = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                open.close();
                MethodCollector.o(4530);
                return str2;
            } catch (Throwable th) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                MethodCollector.o(4530);
                throw th;
            }
        } catch (IOException unused) {
            MethodCollector.o(4530);
            return null;
        }
    }
}
