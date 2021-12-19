package com.ss.android.ugc.aweme.kids.homepage.compliance;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import h.f.b.l;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f106583e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    KidsComplianceSettings f106584a;

    /* renamed from: b  reason: collision with root package name */
    final Keva f106585b;

    /* renamed from: c  reason: collision with root package name */
    KidsComplianceSettings f106586c;

    /* renamed from: d  reason: collision with root package name */
    String f106587d;

    static {
        Covode.recordClassIndex(68103);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68104);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final KidsComplianceSettings a() {
        KidsComplianceSettings kidsComplianceSettings = this.f106586c;
        if (kidsComplianceSettings == null) {
            return b();
        }
        return kidsComplianceSettings;
    }

    public c() {
        Keva repo = Keva.getRepo("compliance_setting");
        l.b(repo, "");
        this.f106585b = repo;
    }

    private final KidsComplianceSettings b() {
        KidsComplianceSettings kidsComplianceSettings = this.f106584a;
        if (kidsComplianceSettings != null) {
            return kidsComplianceSettings;
        }
        String string = this.f106585b.getString("cached_setting", "");
        l.b(string, "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f106584a = (KidsComplianceSettings) new f().a(string, KidsComplianceSettings.class);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.f106584a;
    }
}
