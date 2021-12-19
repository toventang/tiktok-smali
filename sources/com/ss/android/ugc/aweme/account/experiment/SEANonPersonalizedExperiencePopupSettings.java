package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;

public final class SEANonPersonalizedExperiencePopupSettings {
    public static final a DEFAULT = new a();
    public static final SEANonPersonalizedExperiencePopupSettings INSTANCE = new SEANonPersonalizedExperiencePopupSettings();

    public static final class a {
        @c(a = "days_until_show_popup")

        /* renamed from: a  reason: collision with root package name */
        public final int f62966a = 3;
        @c(a = "days_until_force_login")

        /* renamed from: b  reason: collision with root package name */
        public final int f62967b = 5;

        static {
            Covode.recordClassIndex(38792);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f62966a == aVar.f62966a && this.f62967b == aVar.f62967b;
        }

        public final int hashCode() {
            return (this.f62966a * 31) + this.f62967b;
        }

        public final String toString() {
            return "Settings(daysUntilPopupShow=" + this.f62966a + ", daysUntilForcedLoginShow=" + this.f62967b + ")";
        }
    }

    private SEANonPersonalizedExperiencePopupSettings() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(38791);
    }

    public static final a getPopupSettings() {
        return (a) SettingsManager.a().a("non_personalized_with_popup_and_force_login_time", a.class, DEFAULT);
    }
}
