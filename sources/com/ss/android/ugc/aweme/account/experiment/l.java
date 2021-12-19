package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f63012a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f63013b = true;

    private l() {
    }

    static {
        Covode.recordClassIndex(38813);
    }

    public static final boolean a() {
        if (!SettingsManager.a().a("new_user_email_verification_enabled", false) || !b.a().a("new_user_email_verification", ClientExpManager.new_user_email_verification())) {
            return false;
        }
        return true;
    }
}
