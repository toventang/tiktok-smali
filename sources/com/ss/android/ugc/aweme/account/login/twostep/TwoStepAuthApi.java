package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.g;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import l.b.f;
import l.b.o;

public final class TwoStepAuthApi {

    /* renamed from: a  reason: collision with root package name */
    public static String f63745a;

    /* renamed from: b  reason: collision with root package name */
    public static final TwoStepAuthApi f63746b = new TwoStepAuthApi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f63747c = i.a((h.f.a.a) d.f63768a);

    public interface Api {
        static {
            Covode.recordClassIndex(39303);
        }

        @o(a = "/passport/safe/two_step_verification/add_auth_device/")
        @g
        b.i<z> addAuthDevice(@l.b.c(a = "verify_ticket") String str);

        @o(a = "/passport/safe/two_step_verification/add_verification/")
        @g
        b.i<a> addVerification(@l.b.c(a = "verify_ticket") String str, @l.b.c(a = "verify_way") String str2, @l.b.c(a = "is_default") int i2);

        @f(a = "/passport/safe/two_step_verification/get_auth_device_list/")
        b.i<b> getAuthDeviceList();

        @f(a = "/passport/auth/available_ways/")
        b.i<c> getAvailableWays();

        @f(a = "/passport/safe/api/user/unusual_info_preview/")
        b.i<x> getUnusualInfo();

        @f(a = "/passport/safe/two_step_verification/get_verification_list/")
        b.i<a> getVerification();

        @o(a = "/passport/safe/two_step_verification/remove_all/")
        @g
        b.i<a> removeAllVerification(@l.b.c(a = "verify_ticket") String str);

        @o(a = "/passport/safe/two_step_verification/remove_auth_device/")
        @g
        b.i<b> removeAuthDevice(@l.b.c(a = "del_did") String str);

        @o(a = "/passport/safe/two_step_verification/remove_verification/")
        @g
        b.i<a> removeVerification(@l.b.c(a = "verify_ticket") String str, @l.b.c(a = "verify_way") String str2);

        @o(a = "/passport/email/send_code/")
        @g
        b.i<a> sendEmailCode(@l.b.c(a = "verify_ticket") String str, @l.b.c(a = "type") Integer num);

        @o(a = "/passport/mobile/send_code/v1/")
        @g
        b.i<b> sendSmsCode(@l.b.c(a = "verify_ticket") String str, @l.b.c(a = "is6Digits") Integer num, @l.b.c(a = "type") Integer num2);

        @o(a = "/passport/email/check_code/")
        @g
        b.i<c> verifyEmailCode(@l.b.c(a = "mix_mode") Integer num, @l.b.c(a = "email") String str, @l.b.c(a = "code") String str2, @l.b.c(a = "type") int i2, @l.b.c(a = "verify_ticket") String str3);

        @o(a = "/passport/account/verify/")
        @g
        b.i<c> verifyPassword(@l.b.c(a = "username") String str, @l.b.c(a = "mobile") String str2, @l.b.c(a = "email") String str3, @l.b.c(a = "password") String str4, @l.b.c(a = "mix_mode") int i2, @l.b.c(a = "verify_ticket") String str5);

        @o(a = "/passport/mobile/check_code/")
        @g
        b.i<c> verifySmsCode(@l.b.c(a = "mix_mode") Integer num, @l.b.c(a = "mobile") String str, @l.b.c(a = "code") String str2, @l.b.c(a = "type") int i2, @l.b.c(a = "verify_ticket") String str3);

        @o(a = "/passport/auth/verify/")
        @g
        b.i<c> verifyThirdParty(@l.b.c(a = "access_token") String str, @l.b.c(a = "access_token_secret") String str2, @l.b.c(a = "code") String str3, @l.b.c(a = "expires_in") Integer num, @l.b.c(a = "openid") Integer num2, @l.b.c(a = "platform") String str4, @l.b.c(a = "platform_app_id") Integer num3, @l.b.c(a = "mid") Integer num4, @l.b.c(a = "verify_ticket") String str5);
    }

    public static final class a {
        @com.google.gson.a.c(a = "message")

        /* renamed from: a  reason: collision with root package name */
        public final String f63748a;
        @com.google.gson.a.c(a = "data")

        /* renamed from: b  reason: collision with root package name */
        public final C1429a f63749b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a  reason: collision with other inner class name */
        public static final class C1429a {
            @com.google.gson.a.c(a = "email")

            /* renamed from: a  reason: collision with root package name */
            public final String f63750a;
            @com.google.gson.a.c(a = "captcha")

            /* renamed from: b  reason: collision with root package name */
            public final String f63751b;
            @com.google.gson.a.c(a = "description")

            /* renamed from: c  reason: collision with root package name */
            public final String f63752c;
            @com.google.gson.a.c(a = "error_code")

            /* renamed from: d  reason: collision with root package name */
            public final Integer f63753d;

            static {
                Covode.recordClassIndex(39305);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1429a)) {
                    return false;
                }
                C1429a aVar = (C1429a) obj;
                return l.a(this.f63750a, aVar.f63750a) && l.a(this.f63751b, aVar.f63751b) && l.a(this.f63752c, aVar.f63752c) && l.a(this.f63753d, aVar.f63753d);
            }

            public final int hashCode() {
                String str = this.f63750a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f63751b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f63752c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num = this.f63753d;
                if (num != null) {
                    i2 = num.hashCode();
                }
                return hashCode3 + i2;
            }

            public final String toString() {
                return "Data(email=" + this.f63750a + ", captcha=" + this.f63751b + ", errorDescription=" + this.f63752c + ", errorCode=" + this.f63753d + ")";
            }
        }

        static {
            Covode.recordClassIndex(39304);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f63748a, aVar.f63748a) && l.a(this.f63749b, aVar.f63749b);
        }

        public final int hashCode() {
            String str = this.f63748a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C1429a aVar = this.f63749b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "SendEmailCodeResponse(message=" + this.f63748a + ", data=" + this.f63749b + ")";
        }
    }

    public static final class b {
        @com.google.gson.a.c(a = "message")

        /* renamed from: a  reason: collision with root package name */
        public final String f63754a;
        @com.google.gson.a.c(a = "data")

        /* renamed from: b  reason: collision with root package name */
        public final a f63755b;

        public static final class a {
            @com.google.gson.a.c(a = "mobile")

            /* renamed from: a  reason: collision with root package name */
            public final String f63756a;
            @com.google.gson.a.c(a = "retry_time")

            /* renamed from: b  reason: collision with root package name */
            public final Integer f63757b;
            @com.google.gson.a.c(a = "captcha")

            /* renamed from: c  reason: collision with root package name */
            public final String f63758c;
            @com.google.gson.a.c(a = "description")

            /* renamed from: d  reason: collision with root package name */
            public final String f63759d;
            @com.google.gson.a.c(a = "error_code")

            /* renamed from: e  reason: collision with root package name */
            public final Integer f63760e;
            @com.google.gson.a.c(a = "next_url")

            /* renamed from: f  reason: collision with root package name */
            public final String f63761f;

            static {
                Covode.recordClassIndex(39307);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return l.a(this.f63756a, aVar.f63756a) && l.a(this.f63757b, aVar.f63757b) && l.a(this.f63758c, aVar.f63758c) && l.a(this.f63759d, aVar.f63759d) && l.a(this.f63760e, aVar.f63760e) && l.a(this.f63761f, aVar.f63761f);
            }

            public final int hashCode() {
                String str = this.f63756a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f63757b;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f63758c;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f63759d;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num2 = this.f63760e;
                int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
                String str4 = this.f63761f;
                if (str4 != null) {
                    i2 = str4.hashCode();
                }
                return hashCode5 + i2;
            }

            public final String toString() {
                return "Data(mobile=" + this.f63756a + ", retryTime=" + this.f63757b + ", captcha=" + this.f63758c + ", errorDescription=" + this.f63759d + ", errorCode=" + this.f63760e + ", nextUrl=" + this.f63761f + ")";
            }
        }

        static {
            Covode.recordClassIndex(39306);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f63754a, bVar.f63754a) && l.a(this.f63755b, bVar.f63755b);
        }

        public final int hashCode() {
            String str = this.f63754a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a aVar = this.f63755b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "SendSmsCodeResponse(message=" + this.f63754a + ", data=" + this.f63755b + ")";
        }
    }

    public static final class c {
        @com.google.gson.a.c(a = "message")

        /* renamed from: a  reason: collision with root package name */
        public final String f63762a;
        @com.google.gson.a.c(a = "data")

        /* renamed from: b  reason: collision with root package name */
        public final a f63763b;

        public static final class a {
            @com.google.gson.a.c(a = "ticket")

            /* renamed from: a  reason: collision with root package name */
            public final String f63764a;
            @com.google.gson.a.c(a = "captcha")

            /* renamed from: b  reason: collision with root package name */
            public final String f63765b;
            @com.google.gson.a.c(a = "error_code")

            /* renamed from: c  reason: collision with root package name */
            public final Integer f63766c;
            @com.google.gson.a.c(a = "description")

            /* renamed from: d  reason: collision with root package name */
            public final String f63767d;

            static {
                Covode.recordClassIndex(39309);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return l.a(this.f63764a, aVar.f63764a) && l.a(this.f63765b, aVar.f63765b) && l.a(this.f63766c, aVar.f63766c) && l.a(this.f63767d, aVar.f63767d);
            }

            public final int hashCode() {
                String str = this.f63764a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f63765b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Integer num = this.f63766c;
                int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
                String str3 = this.f63767d;
                if (str3 != null) {
                    i2 = str3.hashCode();
                }
                return hashCode3 + i2;
            }

            public final String toString() {
                return "Data(ticket=" + this.f63764a + ", captcha=" + this.f63765b + ", errorCode=" + this.f63766c + ", errorDescription=" + this.f63767d + ")";
            }
        }

        static {
            Covode.recordClassIndex(39308);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f63762a, cVar.f63762a) && l.a(this.f63763b, cVar.f63763b);
        }

        public final int hashCode() {
            String str = this.f63762a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a aVar = this.f63763b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "TwoStepApiResponse(message=" + this.f63762a + ", data=" + this.f63763b + ")";
        }
    }

    public static Api a() {
        return (Api) f63747c.getValue();
    }

    private TwoStepAuthApi() {
    }

    public static b.i<b> b() {
        return a().getAuthDeviceList();
    }

    static final class d extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63768a = new d();

        static {
            Covode.recordClassIndex(39310);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            String str = AccountApiInModule.f62856a;
            l.b(str, "");
            return com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(39302);
    }

    public static b.i<a> a(String str) {
        l.d(str, "");
        return a().removeAllVerification(str);
    }

    public static b.i<a> a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return a().removeVerification(str, str2);
    }

    public static b.i<a> a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        return a().addVerification(str, str2, i2);
    }
}
