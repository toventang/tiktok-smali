package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.a.a;
import com.ss.android.ugc.aweme.compliance.privacy.data.a;
import com.ss.android.ugc.aweme.compliance.privacy.data.d;
import com.ss.android.ugc.aweme.compliance.privacy.data.f;
import com.ss.android.ugc.aweme.compliance.privacy.data.h;
import com.ss.android.ugc.aweme.compliance.privacy.utils.UseOldApiSetting;
import f.a.t;
import h.f.b.l;
import h.m.p;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f77380a = new b();

    private b() {
    }

    public static void c() {
        g.a((q) null);
        g.f77401b = null;
    }

    static {
        Covode.recordClassIndex(47862);
    }

    public static String a() {
        LogPbBean logPb;
        String imprId;
        PrivacyRestrictionResponse a2 = f.a();
        if (a2 == null || (logPb = a2.getLogPb()) == null || (imprId = logPb.getImprId()) == null) {
            return "";
        }
        return imprId;
    }

    public static q b() {
        q qVar = g.f77400a;
        if (qVar != null) {
            return q.a(qVar, null, null, null, null, null, null, null, 0, 255);
        }
        return null;
    }

    public static m a(String str) {
        m mVar;
        l.d(str, "");
        Map<String, m> c2 = f.c();
        if (c2 != null && (mVar = c2.get(str)) != null) {
            return mVar;
        }
        Map<String, m> d2 = f.d();
        if (d2 != null) {
            return d2.get(str);
        }
        return null;
    }

    public static void a(boolean z) {
        if (!a.d()) {
            return;
        }
        if (z || System.currentTimeMillis() - d.f77382b >= d.f77383c) {
            d.f77381a.fetchPrivacyRestriction().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(d.a.f77385a, d.b.f77386a);
        }
    }

    public static void b(String str) {
        PrivacyRestrictionResponse privacyRestrictionResponse;
        l.d(str, "");
        l.d(str, "");
        d.f77381a.updateAgreement(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(d.c.f77387a, d.C1787d.f77388a);
        l.d(str, "");
        f.a aVar = new f.a(str);
        Map<String, m> c2 = f.c();
        PrivacyRestrictionResponse privacyRestrictionResponse2 = null;
        if (c2 != null && c2.containsKey(str)) {
            PrivacyRestrictionResponse a2 = f.a();
            if (a2 != null) {
                Map<String, m> c3 = f.c();
                if (c3 == null) {
                    l.b();
                }
                privacyRestrictionResponse = PrivacyRestrictionResponse.copy$default(a2, null, aVar.invoke(c3), null, null, 13, null);
            } else {
                privacyRestrictionResponse = null;
            }
            f.a(privacyRestrictionResponse);
        }
        Map<String, m> d2 = f.d();
        if (d2 != null && d2.containsKey(str)) {
            PrivacyRestrictionResponse a3 = f.a();
            if (a3 != null) {
                Map<String, m> d3 = f.d();
                if (d3 == null) {
                    l.b();
                }
                privacyRestrictionResponse2 = PrivacyRestrictionResponse.copy$default(a3, null, null, aVar.invoke(d3), null, 11, null);
            }
            f.a(privacyRestrictionResponse2);
        }
    }

    public static void b(boolean z) {
        if (!a.d()) {
            return;
        }
        if (!z && System.currentTimeMillis() - h.f77404b < h.f77405c) {
            return;
        }
        if (UseOldApiSetting.INSTANCE.useOldApiSource()) {
            t b2 = t.a(new h.C1788h(h.f77403a.getPrivacyUserSettings().b(h.j.f77428a).a(h.k.f77429a).b(h.l.f77430a), com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b.a().b(h.m.f77431a).a(h.n.f77432a))).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((f.a.d.f) h.i.f77427a);
            l.b(b2, "");
            b2.a(h.d.f77410a, h.e.f77411a);
            return;
        }
        t<PrivacyUserSettingsResponse> b3 = h.f77403a.getPrivacyUserSettings().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(h.a.f77407a).a(h.b.f77408a).b(h.c.f77409a);
        l.b(b3, "");
        b3.a(h.f.f77412a, h.g.f77413a);
    }

    public static o a(int i2, String str) {
        o oVar;
        l.d(str, "");
        if (i2 != 0 || !l.a((Object) str, (Object) "group_chat")) {
            n b2 = f.b();
            if (b2 != null) {
                return b2.getTargetRestrictionItem(i2, str);
            }
            return null;
        }
        String a2 = a.a();
        if (a.f77374a == null || !p.a(a.f77374a, a2, false)) {
            o a3 = a.a(a2);
            if (a3 == null) {
                oVar = a.f77376c;
            } else {
                oVar = a3;
            }
            a.f77377d = oVar;
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new a.C1786a(a3));
            a.f77374a = a2;
        }
        return a.f77377d;
    }
}
