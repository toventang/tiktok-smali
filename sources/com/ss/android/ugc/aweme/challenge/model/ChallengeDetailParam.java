package com.ss.android.ugc.aweme.challenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import h.f.a.a;
import h.f.b.l;
import h.h;
import h.i;
import h.m.p;
import java.io.Serializable;

public final class ChallengeDetailParam implements IRouteArg, Serializable {
    public static final Parcelable.Creator<ChallengeDetailParam> CREATOR = new Creator();
    private String awemeId;
    private String bannerId;
    private String challengeFrom;
    private int challengeType;
    private int clickReason;
    private final h enterFrom$delegate;
    private String enterpriseUid;
    private String extra_challenge_id;
    private String extra_cid;
    private String from;
    private String fromToken;
    private Integer isBundled;
    private String isCommerce;
    private boolean isHashTag;
    private String parentTagId;
    private String previewToken;
    private String processId;
    private String shootEnterFrom;
    private int showTabIndex;

    public static class Creator implements Parcelable.Creator<ChallengeDetailParam> {
        static {
            Covode.recordClassIndex(43158);
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ChallengeDetailParam(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeDetailParam[] newArray(int i2) {
            return new ChallengeDetailParam[i2];
        }
    }

    static {
        Covode.recordClassIndex(43157);
    }

    public ChallengeDetailParam() {
        this(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
    }

    public ChallengeDetailParam(String str) {
        this(str, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262142, null);
    }

    public ChallengeDetailParam(String str, String str2) {
        this(str, str2, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262140, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2) {
        this(str, str2, i2, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262136, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3) {
        this(str, str2, i2, str3, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262128, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4) {
        this(str, str2, i2, str3, str4, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262112, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5) {
        this(str, str2, i2, str3, str4, str5, null, null, null, null, null, false, 0, null, 0, null, null, null, 262080, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6) {
        this(str, str2, i2, str3, str4, str5, str6, null, null, null, null, false, 0, null, 0, null, null, null, 262016, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num) {
        this(str, str2, i2, str3, str4, str5, str6, num, null, null, null, false, 0, null, 0, null, null, null, 261888, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, null, null, false, 0, null, 0, null, null, null, 261632, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, null, false, 0, null, 0, null, null, null, 261120, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, false, 0, null, 0, null, null, null, 260096, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, 0, null, 0, null, null, null, 258048, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, null, 0, null, null, null, 253952, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, str10, 0, null, null, null, 245760, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, str10, i4, null, null, null, 229376, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4, String str11) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, str10, i4, str11, null, null, 196608, null);
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4, String str11, String str12) {
        this(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, str10, i4, str11, str12, null, 131072, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r13 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        if (r12 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        if (r11 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0181, code lost:
        if (r10 == null) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam __fromBundle(android.os.Bundle r41) {
        /*
        // Method dump skipped, instructions count: 623
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
    }

    public static int com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ChallengeDetailParam copy$default(ChallengeDetailParam challengeDetailParam, String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4, String str11, String str12, String str13, int i5, Object obj) {
        String str14 = str;
        String str15 = str2;
        int i6 = i2;
        String str16 = str3;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        Integer num2 = num;
        String str21 = str10;
        String str22 = str8;
        String str23 = str9;
        boolean z2 = z;
        int i7 = i3;
        String str24 = str13;
        int i8 = i4;
        String str25 = str11;
        String str26 = str12;
        if ((i5 & 1) != 0) {
            str14 = challengeDetailParam.extra_challenge_id;
        }
        if ((i5 & 2) != 0) {
            str15 = challengeDetailParam.challengeFrom;
        }
        if ((i5 & 4) != 0) {
            i6 = challengeDetailParam.challengeType;
        }
        if ((i5 & 8) != 0) {
            str16 = challengeDetailParam.parentTagId;
        }
        if ((i5 & 16) != 0) {
            str18 = challengeDetailParam.awemeId;
        }
        if ((i5 & 32) != 0) {
            str19 = challengeDetailParam.shootEnterFrom;
        }
        if ((i5 & 64) != 0) {
            str20 = challengeDetailParam.bannerId;
        }
        if ((i5 & 128) != 0) {
            num2 = challengeDetailParam.isBundled;
        }
        if ((i5 & 256) != 0) {
            str17 = challengeDetailParam.from;
        }
        if ((i5 & 512) != 0) {
            str22 = challengeDetailParam.extra_cid;
        }
        if ((i5 & 1024) != 0) {
            str23 = challengeDetailParam.fromToken;
        }
        if ((i5 & 2048) != 0) {
            z2 = challengeDetailParam.isHashTag;
        }
        if ((i5 & 4096) != 0) {
            i7 = challengeDetailParam.clickReason;
        }
        if ((i5 & 8192) != 0) {
            str21 = challengeDetailParam.enterpriseUid;
        }
        if ((i5 & 16384) != 0) {
            i8 = challengeDetailParam.showTabIndex;
        }
        if ((32768 & i5) != 0) {
            str25 = challengeDetailParam.isCommerce;
        }
        if ((65536 & i5) != 0) {
            str26 = challengeDetailParam.previewToken;
        }
        if ((i5 & 131072) != 0) {
            str24 = challengeDetailParam.processId;
        }
        return challengeDetailParam.copy(str14, str15, i6, str16, str18, str19, str20, num2, str17, str22, str23, z2, i7, str21, i8, str25, str26, str24);
    }

    public final String component1() {
        return this.extra_challenge_id;
    }

    public final String component10() {
        return this.extra_cid;
    }

    public final String component11() {
        return this.fromToken;
    }

    public final boolean component12() {
        return this.isHashTag;
    }

    public final int component13() {
        return this.clickReason;
    }

    public final String component14() {
        return this.enterpriseUid;
    }

    public final int component15() {
        return this.showTabIndex;
    }

    public final String component16() {
        return this.isCommerce;
    }

    public final String component17() {
        return this.previewToken;
    }

    public final String component18() {
        return this.processId;
    }

    public final String component2() {
        return this.challengeFrom;
    }

    public final int component3() {
        return this.challengeType;
    }

    public final String component4() {
        return this.parentTagId;
    }

    public final String component5() {
        return this.awemeId;
    }

    public final String component6() {
        return this.shootEnterFrom;
    }

    public final String component7() {
        return this.bannerId;
    }

    public final Integer component8() {
        return this.isBundled;
    }

    public final String component9() {
        return this.from;
    }

    public final ChallengeDetailParam copy(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4, String str11, String str12, String str13) {
        return new ChallengeDetailParam(str, str2, i2, str3, str4, str5, str6, num, str7, str8, str9, z, i3, str10, i4, str11, str12, str13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeDetailParam)) {
            return false;
        }
        ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
        return l.a(this.extra_challenge_id, challengeDetailParam.extra_challenge_id) && l.a(this.challengeFrom, challengeDetailParam.challengeFrom) && this.challengeType == challengeDetailParam.challengeType && l.a(this.parentTagId, challengeDetailParam.parentTagId) && l.a(this.awemeId, challengeDetailParam.awemeId) && l.a(this.shootEnterFrom, challengeDetailParam.shootEnterFrom) && l.a(this.bannerId, challengeDetailParam.bannerId) && l.a(this.isBundled, challengeDetailParam.isBundled) && l.a(this.from, challengeDetailParam.from) && l.a(this.extra_cid, challengeDetailParam.extra_cid) && l.a(this.fromToken, challengeDetailParam.fromToken) && this.isHashTag == challengeDetailParam.isHashTag && this.clickReason == challengeDetailParam.clickReason && l.a(this.enterpriseUid, challengeDetailParam.enterpriseUid) && this.showTabIndex == challengeDetailParam.showTabIndex && l.a(this.isCommerce, challengeDetailParam.isCommerce) && l.a(this.previewToken, challengeDetailParam.previewToken) && l.a(this.processId, challengeDetailParam.processId);
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final int hashCode() {
        String str = this.extra_challenge_id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.challengeFrom;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.challengeType)) * 31;
        String str3 = this.parentTagId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.awemeId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.shootEnterFrom;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.bannerId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.isBundled;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.from;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.extra_cid;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.fromToken;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z = this.isHashTag;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode10 + i3) * 31) + com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.clickReason)) * 31;
        String str10 = this.enterpriseUid;
        int hashCode11 = (((com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str10 != null ? str10.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_challenge_model_ChallengeDetailParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showTabIndex)) * 31;
        String str11 = this.isCommerce;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.previewToken;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.processId;
        if (str13 != null) {
            i2 = str13.hashCode();
        }
        return hashCode13 + i2;
    }

    public final String toString() {
        return "ChallengeDetailParam(extra_challenge_id=" + this.extra_challenge_id + ", challengeFrom=" + this.challengeFrom + ", challengeType=" + this.challengeType + ", parentTagId=" + this.parentTagId + ", awemeId=" + this.awemeId + ", shootEnterFrom=" + this.shootEnterFrom + ", bannerId=" + this.bannerId + ", isBundled=" + this.isBundled + ", from=" + this.from + ", extra_cid=" + this.extra_cid + ", fromToken=" + this.fromToken + ", isHashTag=" + this.isHashTag + ", clickReason=" + this.clickReason + ", enterpriseUid=" + this.enterpriseUid + ", showTabIndex=" + this.showTabIndex + ", isCommerce=" + this.isCommerce + ", previewToken=" + this.previewToken + ", processId=" + this.processId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        l.d(parcel, "");
        parcel.writeString(this.extra_challenge_id);
        parcel.writeString(this.challengeFrom);
        parcel.writeInt(this.challengeType);
        parcel.writeString(this.parentTagId);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.bannerId);
        Integer num = this.isBundled;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.from);
        parcel.writeString(this.extra_cid);
        parcel.writeString(this.fromToken);
        parcel.writeInt(this.isHashTag ? 1 : 0);
        parcel.writeInt(this.clickReason);
        parcel.writeString(this.enterpriseUid);
        parcel.writeInt(this.showTabIndex);
        parcel.writeString(this.isCommerce);
        parcel.writeString(this.previewToken);
        parcel.writeString(this.processId);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final String getChallengeFrom() {
        return this.challengeFrom;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    public final String getExtra_challenge_id() {
        return this.extra_challenge_id;
    }

    public final String getExtra_cid() {
        return this.extra_cid;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromToken() {
        return this.fromToken;
    }

    public final String getParentTagId() {
        return this.parentTagId;
    }

    public final String getPreviewToken() {
        return this.previewToken;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final String isCommerce() {
        return this.isCommerce;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public ChallengeDetailParam(String str, String str2, int i2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, boolean z, int i3, String str10, int i4, String str11, String str12, String str13) {
        this.extra_challenge_id = str;
        this.challengeFrom = str2;
        this.challengeType = i2;
        this.parentTagId = str3;
        this.awemeId = str4;
        this.shootEnterFrom = str5;
        this.bannerId = str6;
        this.isBundled = num;
        this.from = str7;
        this.extra_cid = str8;
        this.fromToken = str9;
        this.isHashTag = z;
        this.clickReason = i3;
        this.enterpriseUid = str10;
        this.showTabIndex = i4;
        this.isCommerce = str11;
        this.previewToken = str12;
        this.processId = str13;
        this.enterFrom$delegate = i.a((a) new ChallengeDetailParam$enterFrom$2(this));
        if (TextUtils.equals(this.isCommerce, "1") || p.a("true", this.isCommerce, true)) {
            CommerceChallengeServiceImpl.e().a(getCid());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeDetailParam(java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, int r33, java.lang.String r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, int r39, h.f.b.g r40) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }

    public final String getCid() {
        String str = this.extra_challenge_id;
        if (str == null || str.length() == 0) {
            return this.extra_cid;
        }
        return this.extra_challenge_id;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBannerId(String str) {
        this.bannerId = str;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setChallengeFrom(String str) {
        this.challengeFrom = str;
    }

    public final void setChallengeType(int i2) {
        this.challengeType = i2;
    }

    public final void setCid(String str) {
        this.extra_challenge_id = str;
    }

    public final void setClickReason(int i2) {
        this.clickReason = i2;
    }

    public final void setCommerce(String str) {
        this.isCommerce = str;
    }

    public final void setEnterpriseUid(String str) {
        this.enterpriseUid = str;
    }

    public final void setExtra_challenge_id(String str) {
        this.extra_challenge_id = str;
    }

    public final void setExtra_cid(String str) {
        this.extra_cid = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setFromToken(String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setParentTagId(String str) {
        this.parentTagId = str;
    }

    public final void setPreviewToken(String str) {
        this.previewToken = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShowTabIndex(int i2) {
        this.showTabIndex = i2;
    }
}
