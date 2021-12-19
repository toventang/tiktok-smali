package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import java.util.Map;
import org.json.JSONException;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f77396a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f77397b;

    /* renamed from: c  reason: collision with root package name */
    private static String f77398c;

    /* renamed from: d  reason: collision with root package name */
    private static PrivacyRestrictionResponse f77399d;

    private f() {
    }

    static {
        Covode.recordClassIndex(47873);
        Keva repo = Keva.getRepo("privacy_setting");
        l.b(repo, "");
        f77397b = repo;
    }

    public static n b() {
        n privacySettingRestriction;
        PrivacyRestrictionResponse a2 = a();
        if (a2 == null || (privacySettingRestriction = a2.getPrivacySettingRestriction()) == null) {
            return e.a();
        }
        return privacySettingRestriction;
    }

    public static Map<String, m> c() {
        Map<String, m> popupAgreement;
        PrivacyRestrictionResponse a2 = a();
        if (a2 == null || (popupAgreement = a2.getPopupAgreement()) == null) {
            return e.c();
        }
        return popupAgreement;
    }

    public static Map<String, m> d() {
        Map<String, m> postRecord;
        PrivacyRestrictionResponse a2 = a();
        if (a2 == null || (postRecord = a2.getPostRecord()) == null) {
            return e.e();
        }
        return postRecord;
    }

    static PrivacyRestrictionResponse a() {
        String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
        String str = f77398c;
        if (str == null || !p.a(str, a2, false)) {
            f77399d = null;
        }
        if (f77399d == null) {
            try {
                f77399d = (PrivacyRestrictionResponse) dg.a().a(f77397b.getString(a("privacy_data"), ""), PrivacyRestrictionResponse.class);
            } catch (JSONException unused) {
            }
            f77398c = a2;
        }
        return f77399d;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements b<Map<String, ? extends m>, Map<String, ? extends m>> {
        final /* synthetic */ String $recordName;

        static {
            Covode.recordClassIndex(47874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$recordName = str;
        }

        /* renamed from: a */
        public final Map<String, m> invoke(Map<String, m> map) {
            l.d(map, "");
            Map<String, m> d2 = ag.d(map);
            if (d2.get(this.$recordName) == null) {
                l.b();
            }
            d2.put(this.$recordName, new m());
            return d2;
        }
    }

    private static String a(String str) {
        String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
        if (a2 == null || a2.length() == 0) {
            return str;
        }
        return str + a2;
    }

    static void a(PrivacyRestrictionResponse privacyRestrictionResponse) {
        if (!l.a(privacyRestrictionResponse, f77399d)) {
            f77399d = privacyRestrictionResponse;
            if (privacyRestrictionResponse == null) {
                f77397b.erase(a("privacy_data"));
            } else {
                f77397b.storeString(a("privacy_data"), dg.a().b(privacyRestrictionResponse));
            }
            e.b();
            e.d();
            e.f();
        }
    }
}
