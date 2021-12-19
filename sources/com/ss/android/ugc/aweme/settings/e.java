package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123101a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f123102b = ((a) SettingsManager.a().a("eoy_2021_config", a.class, f123101a));

    /* renamed from: c  reason: collision with root package name */
    public static final e f123103c = new e();

    public static final class a {
        @c(a = "eoy_grey_stage")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f123104a;
        @c(a = "expired_time")

        /* renamed from: b  reason: collision with root package name */
        public final int f123105b;

        static {
            Covode.recordClassIndex(80851);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f123104a == aVar.f123104a && this.f123105b == aVar.f123105b;
        }

        public final int hashCode() {
            boolean z = this.f123104a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return (i2 * 31) + this.f123105b;
        }

        public final String toString() {
            return "Eoy2021Config(eoyGreyStage=" + this.f123104a + ", expiredTime=" + this.f123105b + ")";
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(80850);
    }
}
