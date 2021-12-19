package com.ss.android.ugc.aweme.account.login.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f63462a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f63463b = 86;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f63464c = null;

    /* renamed from: com.ss.android.ugc.aweme.account.login.h.a$a  reason: collision with other inner class name */
    public static class C1412a implements Serializable {
        @c(a = "countryCode_")
        private int countryCode_ = 86;
        @c(a = "countryIso_")
        private String countryIso_ = Locale.CHINA.getCountry();
        @c(a = "nationalNumber_")
        private long nationalNumber_ = 0;
        @c(a = "rawInput_")
        private String rawInput_ = "";

        static {
            Covode.recordClassIndex(39110);
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public String getCountryIso() {
            return this.countryIso_;
        }

        public long getNationalNumber() {
            return this.nationalNumber_;
        }

        public String getRawInput() {
            return this.rawInput_;
        }

        public C1412a setCountryCode(int i2) {
            this.countryCode_ = i2;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso_ = str;
        }

        public C1412a setNationalNumber(long j2) {
            this.nationalNumber_ = j2;
            return this;
        }

        public C1412a setRawInput(String str) {
            this.rawInput_ = str;
            return this;
        }

        public static C1412a create(int i2, long j2) {
            return new C1412a().setCountryCode(i2).setNationalNumber(j2);
        }
    }

    static {
        Covode.recordClassIndex(39109);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(" ");
        if (!str.startsWith("+") || indexOf <= 0) {
            return "";
        }
        return str.substring(1, indexOf);
    }

    public static String a(C1412a aVar) {
        if (aVar == null) {
            return "";
        }
        return "+" + aVar.getCountryCode() + " " + aVar.getNationalNumber();
    }

    public static String b(String str) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(" ");
        if (!str.startsWith("+") || indexOf <= 0 || (i2 = indexOf + 1) >= str.length()) {
            return str;
        }
        return str.substring(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x000e
            return r6
        L_0x000e:
            r4 = 0
            if (r7 == 0) goto L_0x0017
            int r3 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r8 == 0) goto L_0x0020
            long r1 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0020 }
            goto L_0x0022
        L_0x001f:
            r3 = 0
        L_0x0020:
            r1 = 0
        L_0x0022:
            com.ss.android.ugc.aweme.account.login.h.a$a r0 = new com.ss.android.ugc.aweme.account.login.h.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.account.login.h.a$a r0 = r0.setCountryCode(r3)
            com.ss.android.ugc.aweme.account.login.h.a$a r2 = r0.setNationalNumber(r1)
            int r1 = r2.getCountryCode()
            r0 = 86
            r3 = 1
            if (r1 != r0) goto L_0x004a
            long r0 = r2.getNationalNumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            r0 = 11
            if (r1 != r0) goto L_0x0049
            return r3
        L_0x0049:
            return r6
        L_0x004a:
            int r0 = r2.getCountryCode()
            if (r0 == 0) goto L_0x0059
            long r1 = r2.getNationalNumber()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0059
            return r3
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.h.a.a(java.lang.String, java.lang.String):boolean");
    }
}
