package com.ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f62960a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(38787);
    }

    public static final String a() {
        try {
            Object a2 = SettingsManager.a().a("delete_account_entrance_urls", f.class);
            if (!(a2 instanceof f)) {
                a2 = null;
            }
            f fVar = (f) a2;
            if (fVar == null) {
                return "";
            }
            String ftc = fVar.getFtc();
            if (ftc == null) {
                return "";
            }
            return ftc;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String b() {
        try {
            Object a2 = SettingsManager.a().a("delete_account_entrance_urls", f.class);
            if (!(a2 instanceof f)) {
                a2 = null;
            }
            f fVar = (f) a2;
            if (fVar == null) {
                return "";
            }
            String normal = fVar.getNormal();
            if (normal == null) {
                return "";
            }
            return normal;
        } catch (Throwable unused) {
            return "";
        }
    }
}
