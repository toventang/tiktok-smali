package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class Voucher implements Parcelable, Serializable {
    public static final Parcelable.Creator<Voucher> CREATOR = new a();
    @c(a = "button_text")
    private final String buttonText;
    @c(a = "claim_time")
    private final Long claimTime;
    @c(a = "claim_user_type")
    private final int claimUserType;
    @c(a = "cost_role")
    private final int costRole;
    @c(a = "cost_role_text")
    private final String costRoleText;
    @c(a = "cost_type")
    private final int costType;
    @c(a = "currency_symbol")
    private final String currencySymbol;
    @c(a = "discount_text")
    private final String discountText;
    @c(a = "exclusions_text")
    private final String exclusionsText;
    @c(a = "is_best")
    private final Boolean isBest;
    @c(a = "main_order_id")
    private final String mainOrderID;
    @c(a = "odp_schema")
    private final String odpSchema;
    @c(a = "orientation_text")
    private final String orientationText;
    @c(a = "promotion_id")
    private final String promotionID;
    @c(a = "reduction_type")
    private final int reductionType;
    @c(a = "scope_text")
    private final String scopeText;
    @c(a = "selected")
    private final Boolean selected;
    @c(a = "status")
    private final int status;
    @c(a = "status_text")
    private final String statusText;
    @c(a = "threshold_text")
    private final String thresholdText;
    @c(a = "usable_end_time")
    private final Long usableEndTime;
    @c(a = "usable_start_time")
    private final Long usableStartTime;
    @c(a = "use_limit_text")
    private final String useLimitText;
    @c(a = "use_limit_type")
    private final int useLimitType;
    @c(a = "valid_time_text")
    private final String validTimeText;
    @c(a = "valid_time_text_style")
    private final Integer validTimeTextStyle;
    @c(a = "vap_schema")
    private final String vapSchema;
    @c(a = "voucher_business_type")
    private final String voucherBusinessType;
    @c(a = "voucher_id")
    private final String voucherID;
    @c(a = "voucher_type_id")
    private final String voucherTypeID;

    static {
        Covode.recordClassIndex(53647);
    }

    public Voucher() {
        this(null, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Voucher copy$default(Voucher voucher, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l2, Long l3, Long l4, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, int i8, Object obj) {
        Boolean bool3 = bool;
        String str19 = str4;
        String str20 = str3;
        Long l5 = l4;
        int i9 = i3;
        int i10 = i2;
        String str21 = str2;
        String str22 = str;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        Long l6 = l2;
        Long l7 = l3;
        Integer num2 = num;
        String str23 = str17;
        String str24 = str16;
        String str25 = str15;
        String str26 = str14;
        String str27 = str7;
        String str28 = str6;
        Boolean bool4 = bool2;
        String str29 = str5;
        String str30 = str8;
        String str31 = str9;
        String str32 = str10;
        String str33 = str11;
        String str34 = str12;
        String str35 = str18;
        String str36 = str13;
        if ((i8 & 1) != 0) {
            str22 = voucher.voucherID;
        }
        if ((i8 & 2) != 0) {
            str21 = voucher.voucherTypeID;
        }
        if ((i8 & 4) != 0) {
            i10 = voucher.status;
        }
        if ((i8 & 8) != 0) {
            i9 = voucher.costType;
        }
        if ((i8 & 16) != 0) {
            i11 = voucher.costRole;
        }
        if ((i8 & 32) != 0) {
            i12 = voucher.reductionType;
        }
        if ((i8 & 64) != 0) {
            i13 = voucher.claimUserType;
        }
        if ((i8 & 128) != 0) {
            i14 = voucher.useLimitType;
        }
        if ((i8 & 256) != 0) {
            l6 = voucher.claimTime;
        }
        if ((i8 & 512) != 0) {
            l7 = voucher.usableStartTime;
        }
        if ((i8 & 1024) != 0) {
            l5 = voucher.usableEndTime;
        }
        if ((i8 & 2048) != 0) {
            str20 = voucher.mainOrderID;
        }
        if ((i8 & 4096) != 0) {
            str19 = voucher.voucherBusinessType;
        }
        if ((i8 & 8192) != 0) {
            bool3 = voucher.selected;
        }
        if ((i8 & 16384) != 0) {
            str29 = voucher.promotionID;
        }
        if ((32768 & i8) != 0) {
            bool4 = voucher.isBest;
        }
        if ((65536 & i8) != 0) {
            str28 = voucher.statusText;
        }
        if ((131072 & i8) != 0) {
            str27 = voucher.costRoleText;
        }
        if ((262144 & i8) != 0) {
            str30 = voucher.discountText;
        }
        if ((524288 & i8) != 0) {
            str31 = voucher.thresholdText;
        }
        if ((1048576 & i8) != 0) {
            str32 = voucher.useLimitText;
        }
        if ((2097152 & i8) != 0) {
            str33 = voucher.orientationText;
        }
        if ((4194304 & i8) != 0) {
            str34 = voucher.odpSchema;
        }
        if ((8388608 & i8) != 0) {
            str36 = voucher.scopeText;
        }
        if ((16777216 & i8) != 0) {
            str26 = voucher.exclusionsText;
        }
        if ((33554432 & i8) != 0) {
            str25 = voucher.currencySymbol;
        }
        if ((67108864 & i8) != 0) {
            str24 = voucher.buttonText;
        }
        if ((134217728 & i8) != 0) {
            str23 = voucher.validTimeText;
        }
        if ((268435456 & i8) != 0) {
            num2 = voucher.validTimeTextStyle;
        }
        if ((i8 & 536870912) != 0) {
            str35 = voucher.vapSchema;
        }
        return voucher.copy(str22, str21, i10, i9, i11, i12, i13, i14, l6, l7, l5, str20, str19, bool3, str29, bool4, str28, str27, str30, str31, str32, str33, str34, str36, str26, str25, str24, str23, num2, str35);
    }

    public final String component1() {
        return this.voucherID;
    }

    public final Long component10() {
        return this.usableStartTime;
    }

    public final Long component11() {
        return this.usableEndTime;
    }

    public final String component12() {
        return this.mainOrderID;
    }

    public final String component13() {
        return this.voucherBusinessType;
    }

    public final Boolean component14() {
        return this.selected;
    }

    public final String component15() {
        return this.promotionID;
    }

    public final Boolean component16() {
        return this.isBest;
    }

    public final String component17() {
        return this.statusText;
    }

    public final String component18() {
        return this.costRoleText;
    }

    public final String component19() {
        return this.discountText;
    }

    public final String component2() {
        return this.voucherTypeID;
    }

    public final String component20() {
        return this.thresholdText;
    }

    public final String component21() {
        return this.useLimitText;
    }

    public final String component22() {
        return this.orientationText;
    }

    public final String component23() {
        return this.odpSchema;
    }

    public final String component24() {
        return this.scopeText;
    }

    public final String component25() {
        return this.exclusionsText;
    }

    public final String component26() {
        return this.currencySymbol;
    }

    public final String component27() {
        return this.buttonText;
    }

    public final String component28() {
        return this.validTimeText;
    }

    public final Integer component29() {
        return this.validTimeTextStyle;
    }

    public final int component3() {
        return this.status;
    }

    public final String component30() {
        return this.vapSchema;
    }

    public final int component4() {
        return this.costType;
    }

    public final int component5() {
        return this.costRole;
    }

    public final int component6() {
        return this.reductionType;
    }

    public final int component7() {
        return this.claimUserType;
    }

    public final int component8() {
        return this.useLimitType;
    }

    public final Long component9() {
        return this.claimTime;
    }

    public final Voucher copy(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l2, Long l3, Long l4, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18) {
        l.d(str2, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        return new Voucher(str, str2, i2, i3, i4, i5, i6, i7, l2, l3, l4, str3, str4, bool, str5, bool2, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num, str18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) obj;
        return l.a(this.voucherID, voucher.voucherID) && l.a(this.voucherTypeID, voucher.voucherTypeID) && this.status == voucher.status && this.costType == voucher.costType && this.costRole == voucher.costRole && this.reductionType == voucher.reductionType && this.claimUserType == voucher.claimUserType && this.useLimitType == voucher.useLimitType && l.a(this.claimTime, voucher.claimTime) && l.a(this.usableStartTime, voucher.usableStartTime) && l.a(this.usableEndTime, voucher.usableEndTime) && l.a(this.mainOrderID, voucher.mainOrderID) && l.a(this.voucherBusinessType, voucher.voucherBusinessType) && l.a(this.selected, voucher.selected) && l.a(this.promotionID, voucher.promotionID) && l.a(this.isBest, voucher.isBest) && l.a(this.statusText, voucher.statusText) && l.a(this.costRoleText, voucher.costRoleText) && l.a(this.discountText, voucher.discountText) && l.a(this.thresholdText, voucher.thresholdText) && l.a(this.useLimitText, voucher.useLimitText) && l.a(this.orientationText, voucher.orientationText) && l.a(this.odpSchema, voucher.odpSchema) && l.a(this.scopeText, voucher.scopeText) && l.a(this.exclusionsText, voucher.exclusionsText) && l.a(this.currencySymbol, voucher.currencySymbol) && l.a(this.buttonText, voucher.buttonText) && l.a(this.validTimeText, voucher.validTimeText) && l.a(this.validTimeTextStyle, voucher.validTimeTextStyle) && l.a(this.vapSchema, voucher.vapSchema);
    }

    public final int hashCode() {
        String str = this.voucherID;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voucherTypeID;
        int hashCode2 = (((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.costType)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.costRole)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.reductionType)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.claimUserType)) * 31) + com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_Voucher_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.useLimitType)) * 31;
        Long l2 = this.claimTime;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.usableStartTime;
        int hashCode4 = (hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.usableEndTime;
        int hashCode5 = (hashCode4 + (l4 != null ? l4.hashCode() : 0)) * 31;
        String str3 = this.mainOrderID;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.voucherBusinessType;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.selected;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str5 = this.promotionID;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool2 = this.isBest;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str6 = this.statusText;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.costRoleText;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.discountText;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.thresholdText;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.useLimitText;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.orientationText;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.odpSchema;
        int hashCode17 = (hashCode16 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.scopeText;
        int hashCode18 = (hashCode17 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.exclusionsText;
        int hashCode19 = (hashCode18 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.currencySymbol;
        int hashCode20 = (hashCode19 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.buttonText;
        int hashCode21 = (hashCode20 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.validTimeText;
        int hashCode22 = (hashCode21 + (str17 != null ? str17.hashCode() : 0)) * 31;
        Integer num = this.validTimeTextStyle;
        int hashCode23 = (hashCode22 + (num != null ? num.hashCode() : 0)) * 31;
        String str18 = this.vapSchema;
        if (str18 != null) {
            i2 = str18.hashCode();
        }
        return hashCode23 + i2;
    }

    public final String toString() {
        return "Voucher(voucherID=" + this.voucherID + ", voucherTypeID=" + this.voucherTypeID + ", status=" + this.status + ", costType=" + this.costType + ", costRole=" + this.costRole + ", reductionType=" + this.reductionType + ", claimUserType=" + this.claimUserType + ", useLimitType=" + this.useLimitType + ", claimTime=" + this.claimTime + ", usableStartTime=" + this.usableStartTime + ", usableEndTime=" + this.usableEndTime + ", mainOrderID=" + this.mainOrderID + ", voucherBusinessType=" + this.voucherBusinessType + ", selected=" + this.selected + ", promotionID=" + this.promotionID + ", isBest=" + this.isBest + ", statusText=" + this.statusText + ", costRoleText=" + this.costRoleText + ", discountText=" + this.discountText + ", thresholdText=" + this.thresholdText + ", useLimitText=" + this.useLimitText + ", orientationText=" + this.orientationText + ", odpSchema=" + this.odpSchema + ", scopeText=" + this.scopeText + ", exclusionsText=" + this.exclusionsText + ", currencySymbol=" + this.currencySymbol + ", buttonText=" + this.buttonText + ", validTimeText=" + this.validTimeText + ", validTimeTextStyle=" + this.validTimeTextStyle + ", vapSchema=" + this.vapSchema + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.voucherID);
        parcel.writeString(this.voucherTypeID);
        parcel.writeInt(this.status);
        parcel.writeInt(this.costType);
        parcel.writeInt(this.costRole);
        parcel.writeInt(this.reductionType);
        parcel.writeInt(this.claimUserType);
        parcel.writeInt(this.useLimitType);
        Long l2 = this.claimTime;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l3 = this.usableStartTime;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l4 = this.usableEndTime;
        if (l4 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.mainOrderID);
        parcel.writeString(this.voucherBusinessType);
        Boolean bool = this.selected;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.promotionID);
        Boolean bool2 = this.isBest;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.statusText);
        parcel.writeString(this.costRoleText);
        parcel.writeString(this.discountText);
        parcel.writeString(this.thresholdText);
        parcel.writeString(this.useLimitText);
        parcel.writeString(this.orientationText);
        parcel.writeString(this.odpSchema);
        parcel.writeString(this.scopeText);
        parcel.writeString(this.exclusionsText);
        parcel.writeString(this.currencySymbol);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.validTimeText);
        Integer num = this.validTimeTextStyle;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.vapSchema);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getClaimTime() {
        return this.claimTime;
    }

    public final int getClaimUserType() {
        return this.claimUserType;
    }

    public final int getCostRole() {
        return this.costRole;
    }

    public final String getCostRoleText() {
        return this.costRoleText;
    }

    public final int getCostType() {
        return this.costType;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final String getExclusionsText() {
        return this.exclusionsText;
    }

    public final String getMainOrderID() {
        return this.mainOrderID;
    }

    public final String getOdpSchema() {
        return this.odpSchema;
    }

    public final String getOrientationText() {
        return this.orientationText;
    }

    public final String getPromotionID() {
        return this.promotionID;
    }

    public final int getReductionType() {
        return this.reductionType;
    }

    public final String getScopeText() {
        return this.scopeText;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getThresholdText() {
        return this.thresholdText;
    }

    public final Long getUsableEndTime() {
        return this.usableEndTime;
    }

    public final Long getUsableStartTime() {
        return this.usableStartTime;
    }

    public final String getUseLimitText() {
        return this.useLimitText;
    }

    public final int getUseLimitType() {
        return this.useLimitType;
    }

    public final String getValidTimeText() {
        return this.validTimeText;
    }

    public final Integer getValidTimeTextStyle() {
        return this.validTimeTextStyle;
    }

    public final String getVapSchema() {
        return this.vapSchema;
    }

    public final String getVoucherBusinessType() {
        return this.voucherBusinessType;
    }

    public final String getVoucherID() {
        return this.voucherID;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public final Boolean isBest() {
        return this.isBest;
    }

    public static class a implements Parcelable.Creator<Voucher> {
        static {
            Covode.recordClassIndex(53648);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Voucher[] newArray(int i2) {
            return new Voucher[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Voucher createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            Integer num = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf3 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new Voucher(readString, readString2, readInt, readInt2, readInt3, readInt4, readInt5, readInt6, valueOf, valueOf2, valueOf3, readString3, readString4, bool, readString5, bool2, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, num, parcel.readString());
        }
    }

    public Voucher(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l2, Long l3, Long l4, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18) {
        l.d(str2, "");
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        this.voucherID = str;
        this.voucherTypeID = str2;
        this.status = i2;
        this.costType = i3;
        this.costRole = i4;
        this.reductionType = i5;
        this.claimUserType = i6;
        this.useLimitType = i7;
        this.claimTime = l2;
        this.usableStartTime = l3;
        this.usableEndTime = l4;
        this.mainOrderID = str3;
        this.voucherBusinessType = str4;
        this.selected = bool;
        this.promotionID = str5;
        this.isBest = bool2;
        this.statusText = str6;
        this.costRoleText = str7;
        this.discountText = str8;
        this.thresholdText = str9;
        this.useLimitText = str10;
        this.orientationText = str11;
        this.odpSchema = str12;
        this.scopeText = str13;
        this.exclusionsText = str14;
        this.currencySymbol = str15;
        this.buttonText = str16;
        this.validTimeText = str17;
        this.validTimeTextStyle = num;
        this.vapSchema = str18;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Voucher(java.lang.String r33, java.lang.String r34, int r35, int r36, int r37, int r38, int r39, int r40, java.lang.Long r41, java.lang.Long r42, java.lang.Long r43, java.lang.String r44, java.lang.String r45, java.lang.Boolean r46, java.lang.String r47, java.lang.Boolean r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.Integer r61, java.lang.String r62, int r63, h.f.b.g r64) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher.<init>(java.lang.String, java.lang.String, int, int, int, int, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, h.f.b.g):void");
    }
}
