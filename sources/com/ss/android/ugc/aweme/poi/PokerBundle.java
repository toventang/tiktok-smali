package com.ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class PokerBundle {
    @c(a = "adcode")
    private String adcode;
    @c(a = "city")
    private String city;
    @c(a = "country")
    private String country;
    @c(a = "district")
    private String district;
    @c(a = "province")
    private String province;

    static {
        Covode.recordClassIndex(74161);
    }

    public PokerBundle() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PokerBundle copy$default(PokerBundle pokerBundle, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pokerBundle.adcode;
        }
        if ((i2 & 2) != 0) {
            str2 = pokerBundle.district;
        }
        if ((i2 & 4) != 0) {
            str3 = pokerBundle.country;
        }
        if ((i2 & 8) != 0) {
            str4 = pokerBundle.province;
        }
        if ((i2 & 16) != 0) {
            str5 = pokerBundle.city;
        }
        return pokerBundle.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.adcode;
    }

    public final String component2() {
        return this.district;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.province;
    }

    public final String component5() {
        return this.city;
    }

    public final PokerBundle copy(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        return new PokerBundle(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PokerBundle)) {
            return false;
        }
        PokerBundle pokerBundle = (PokerBundle) obj;
        return l.a(this.adcode, pokerBundle.adcode) && l.a(this.district, pokerBundle.district) && l.a(this.country, pokerBundle.country) && l.a(this.province, pokerBundle.province) && l.a(this.city, pokerBundle.city);
    }

    public final int hashCode() {
        String str = this.adcode;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.district;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.country;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.province;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.city;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PokerBundle(adcode=" + this.adcode + ", district=" + this.district + ", country=" + this.country + ", province=" + this.province + ", city=" + this.city + ")";
    }

    public final String getAdcode() {
        return this.adcode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getProvince() {
        return this.province;
    }

    public final void setAdcode(String str) {
        l.d(str, "");
        this.adcode = str;
    }

    public final void setCity(String str) {
        l.d(str, "");
        this.city = str;
    }

    public final void setCountry(String str) {
        l.d(str, "");
        this.country = str;
    }

    public final void setDistrict(String str) {
        l.d(str, "");
        this.district = str;
    }

    public final void setProvince(String str) {
        l.d(str, "");
        this.province = str;
    }

    public PokerBundle(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.adcode = str;
        this.district = str2;
        this.country = str3;
        this.province = str4;
        this.city = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PokerBundle(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, h.f.b.g r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.PokerBundle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
