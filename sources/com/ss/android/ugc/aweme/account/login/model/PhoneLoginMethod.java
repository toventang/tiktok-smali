package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import h.f.b.g;
import h.f.b.l;

public final class PhoneLoginMethod extends BaseLoginMethod {
    private a.C1412a phoneNumber;

    static {
        Covode.recordClassIndex(39141);
    }

    public PhoneLoginMethod(String str, a.C1412a aVar) {
        this(str, null, aVar, null, null, null, null, 122, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar) {
        this(str, loginMethodName, aVar, null, null, null, null, 120, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar, CommonUserInfo commonUserInfo) {
        this(str, loginMethodName, aVar, commonUserInfo, null, null, null, 112, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar, CommonUserInfo commonUserInfo, Long l2) {
        this(str, loginMethodName, aVar, commonUserInfo, l2, null, null, 96, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar, CommonUserInfo commonUserInfo, Long l2, Long l3) {
        this(str, loginMethodName, aVar, commonUserInfo, l2, l3, null, 64, null);
    }

    public final a.C1412a getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(a.C1412a aVar) {
        l.d(aVar, "");
        this.phoneNumber = aVar;
    }

    private final String parseNumber(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                int digit = Character.digit(str.charAt(i2), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() == 0) {
            return "0";
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l2) {
        this(str, loginMethodName, new a.C1412a(), null, l2, null, null, 104, null);
        l.d(str, "");
        l.d(loginMethodName, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(Integer.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(Long.parseLong(parseNumber(str4)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool) {
        super(str, loginMethodName, commonUserInfo, null, l2, l3, bool, null, null, 392, null);
        l.d(str, "");
        l.d(loginMethodName, "");
        l.d(aVar, "");
        l.d(commonUserInfo, "");
        this.phoneNumber = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, Long l2, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, (i2 & 4) != 0 ? "" : str2, str3, str4, l2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, a.C1412a aVar, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? LoginMethodName.PHONE_SMS : loginMethodName, aVar, (i2 & 8) != 0 ? CommonUserInfo.a.a() : commonUserInfo, (i2 & 16) != 0 ? -1L : l2, (i2 & 32) != 0 ? -1L : l3, (i2 & 64) != 0 ? false : bool);
    }
}
