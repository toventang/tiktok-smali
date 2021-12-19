package com.ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "login_type")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f63696a;
    @com.google.gson.a.c(a = "mobile")

    /* renamed from: b  reason: collision with root package name */
    public final String f63697b;
    @com.google.gson.a.c(a = "login_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f63698c;
    @com.google.gson.a.c(a = "email")

    /* renamed from: d  reason: collision with root package name */
    public final String f63699d;
    @com.google.gson.a.c(a = "connect")

    /* renamed from: e  reason: collision with root package name */
    public final a f63700e;
    @com.google.gson.a.c(a = "screen_name")

    /* renamed from: f  reason: collision with root package name */
    public final String f63701f;

    static {
        Covode.recordClassIndex(39279);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f63696a, cVar.f63696a) && l.a(this.f63697b, cVar.f63697b) && l.a(this.f63698c, cVar.f63698c) && l.a(this.f63699d, cVar.f63699d) && l.a(this.f63700e, cVar.f63700e) && l.a(this.f63701f, cVar.f63701f);
    }

    public final int hashCode() {
        Integer num = this.f63696a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f63697b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f63698c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63699d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        a aVar = this.f63700e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f63701f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "LoginInfo(login_type=" + this.f63696a + ", mobile=" + this.f63697b + ", login_name=" + this.f63698c + ", email=" + this.f63699d + ", connect=" + this.f63700e + ", screen_name=" + this.f63701f + ")";
    }

    public static final class a {
        @com.google.gson.a.c(a = "platform")

        /* renamed from: a  reason: collision with root package name */
        public final String f63702a = null;
        @com.google.gson.a.c(a = "platform_screen_name")

        /* renamed from: b  reason: collision with root package name */
        public final String f63703b = null;
        @com.google.gson.a.c(a = "profile_image_url")

        /* renamed from: c  reason: collision with root package name */
        public final String f63704c = null;

        static {
            Covode.recordClassIndex(39280);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f63702a, aVar.f63702a) && l.a(this.f63703b, aVar.f63703b) && l.a(this.f63704c, aVar.f63704c);
        }

        public final int hashCode() {
            String str = this.f63702a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f63703b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f63704c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Connect(platform=" + this.f63702a + ", platform_screen_name=" + this.f63703b + ", profile_image_url=" + this.f63704c + ")";
        }

        private a() {
        }
    }

    private /* synthetic */ c() {
        this(-1);
    }

    private c(Integer num) {
        this.f63696a = num;
        this.f63697b = null;
        this.f63698c = null;
        this.f63699d = null;
        this.f63700e = null;
        this.f63701f = null;
    }
}
