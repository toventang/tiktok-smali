package com.ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.o;
import com.google.gson.t;
import com.ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;
import com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.c.b;
import com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f106573a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final b f106574b = new b();

    /* renamed from: c  reason: collision with root package name */
    static int f106575c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f106576d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f106577e = new a();

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.a$a  reason: collision with other inner class name */
    public static final class C2721a implements d {
        static {
            Covode.recordClassIndex(68099);
        }

        C2721a() {
        }

        @Override // com.ss.android.ugc.aweme.kids.homepage.compliance.d
        public final void a(KidsSettings kidsSettings) {
            l.d(kidsSettings, "");
            if (kidsSettings.getAbTestParamStruct() instanceof o) {
                com.google.gson.l abTestParamStruct = kidsSettings.getAbTestParamStruct();
                Objects.requireNonNull(abTestParamStruct, "null cannot be cast to non-null type com.google.gson.JsonObject");
                o j2 = abTestParamStruct.j();
                l.b(j2, "");
                com.ss.android.ugc.aweme.kids.experiment.abmock.a.a(j2);
            }
            KidsComplianceSettings complianceSettings = kidsSettings.getComplianceSettings();
            if (complianceSettings != null) {
                l.d(complianceSettings, "");
                c cVar = a.f106573a;
                cVar.f106586c = complianceSettings;
                cVar.f106584a = complianceSettings;
                cVar.f106585b.storeString("cached_setting", new f().b(complianceSettings));
                c.b(new b());
                SettingServiceImpl.a().a(complianceSettings);
                String complianceEncrypt = complianceSettings.getComplianceEncrypt();
                c cVar2 = a.f106573a;
                cVar2.f106587d = complianceEncrypt;
                cVar2.f106585b.storeString("cmpl_enc", complianceEncrypt);
                KidsWellbeingSetting wellbeingSetting = complianceSettings.getWellbeingSetting();
                if (wellbeingSetting != null) {
                    KidsWellbeingServiceImpl.c().a(wellbeingSetting);
                }
            }
        }
    }

    private a() {
    }

    public static void a() {
        f106574b.a(new C2721a());
    }

    static {
        Covode.recordClassIndex(68098);
    }

    public static KMReportReason b() {
        String str;
        c cVar = f106573a;
        KidsComplianceSettings a2 = cVar.a();
        if (a2 == null || a2.getKmReportReasons() == null) {
            return null;
        }
        f fVar = new f();
        try {
            KidsComplianceSettings a3 = cVar.a();
            if (a3 != null) {
                str = a3.getKmReportReasons();
            } else {
                str = null;
            }
            Object a4 = fVar.a(str, KMReportReason.class);
            l.b(a4, "");
            return (KMReportReason) a4;
        } catch (t unused) {
            return null;
        }
    }
}
