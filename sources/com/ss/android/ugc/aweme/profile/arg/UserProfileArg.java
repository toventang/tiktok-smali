package com.ss.android.ugc.aweme.profile.arg;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import h.f.b.g;
import h.f.b.l;

public final class UserProfileArg implements IRouteArg {
    public static final Parcelable.Creator<UserProfileArg> CREATOR = new a();
    private final String aid;
    private final String compatiblSecUserId;
    private final String enterFrom;
    private final String enterMethod;
    private final Integer enterpriseType;
    private final String eventType;
    private String extraSecUserId;
    private String extraUserId;
    private final String iD;
    private final boolean isFromLiveRecord;
    private final String label;
    private final String liveRequestId;
    private final String liveRoomId;
    private final String liveRoomOwnerId;
    private final String liveType;
    private final String position;
    private final String preEnterFrom;
    private final String previousPage;
    private final String profileFromScene;
    private final String relationFrom;
    private final String sceneId;
    private final String searchRequestId;
    private final String sourceAid;
    private final String trackParams;
    private final String type;
    private final String uniqueId;

    static {
        Covode.recordClassIndex(74817);
    }

    public UserProfileArg() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public UserProfileArg(String str) {
        this(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108862, null);
    }

    public UserProfileArg(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108860, null);
    }

    public UserProfileArg(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108856, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108848, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108832, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108800, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108736, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108608, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108352, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67107840, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67106816, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67104768, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, null, null, false, null, null, null, null, null, null, null, null, null, null, 67100672, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, null, false, null, null, null, null, null, null, null, null, null, null, 67092480, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, false, null, null, null, null, null, null, null, null, null, null, 67076096, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, null, null, null, null, null, null, null, null, null, null, 67043328, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, null, null, null, null, null, null, null, null, null, 66977792, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, null, null, null, null, null, null, null, null, 66846720, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, null, null, null, null, null, null, null, 66584576, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, null, null, null, null, null, null, 66060288, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, null, null, null, null, null, 65011712, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, str20, null, null, null, null, 62914560, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, str20, str21, null, null, null, 58720256, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, str20, str21, str22, null, null, 50331648, null);
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, str20, str21, str22, str23, null, 33554432, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c0, code lost:
        if (r14 == null) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.profile.arg.UserProfileArg __fromBundle(android.os.Bundle r57) {
        /*
        // Method dump skipped, instructions count: 922
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.arg.UserProfileArg.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.profile.arg.UserProfileArg");
    }

    public static /* synthetic */ UserProfileArg copy$default(UserProfileArg userProfileArg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i2, Object obj) {
        String str25 = str;
        String str26 = str13;
        String str27 = str12;
        String str28 = str11;
        String str29 = str5;
        String str30 = str4;
        String str31 = str3;
        String str32 = str2;
        String str33 = str6;
        String str34 = str7;
        String str35 = str8;
        String str36 = str9;
        Integer num2 = num;
        String str37 = str10;
        String str38 = str23;
        String str39 = str16;
        String str40 = str15;
        boolean z2 = z;
        String str41 = str14;
        String str42 = str17;
        String str43 = str24;
        String str44 = str18;
        String str45 = str19;
        String str46 = str20;
        String str47 = str21;
        String str48 = str22;
        if ((i2 & 1) != 0) {
            str25 = userProfileArg.extraUserId;
        }
        if ((i2 & 2) != 0) {
            str32 = userProfileArg.iD;
        }
        if ((i2 & 4) != 0) {
            str31 = userProfileArg.extraSecUserId;
        }
        if ((i2 & 8) != 0) {
            str30 = userProfileArg.compatiblSecUserId;
        }
        if ((i2 & 16) != 0) {
            str29 = userProfileArg.profileFromScene;
        }
        if ((i2 & 32) != 0) {
            str33 = userProfileArg.uniqueId;
        }
        if ((i2 & 64) != 0) {
            str34 = userProfileArg.label;
        }
        if ((i2 & 128) != 0) {
            str35 = userProfileArg.aid;
        }
        if ((i2 & 256) != 0) {
            str36 = userProfileArg.type;
        }
        if ((i2 & 512) != 0) {
            num2 = userProfileArg.enterpriseType;
        }
        if ((i2 & 1024) != 0) {
            str37 = userProfileArg.enterMethod;
        }
        if ((i2 & 2048) != 0) {
            str28 = userProfileArg.liveRequestId;
        }
        if ((i2 & 4096) != 0) {
            str27 = userProfileArg.liveRoomId;
        }
        if ((i2 & 8192) != 0) {
            str26 = userProfileArg.liveRoomOwnerId;
        }
        if ((i2 & 16384) != 0) {
            str41 = userProfileArg.liveType;
        }
        if ((32768 & i2) != 0) {
            z2 = userProfileArg.isFromLiveRecord;
        }
        if ((65536 & i2) != 0) {
            str40 = userProfileArg.sceneId;
        }
        if ((131072 & i2) != 0) {
            str39 = userProfileArg.enterFrom;
        }
        if ((262144 & i2) != 0) {
            str42 = userProfileArg.preEnterFrom;
        }
        if ((524288 & i2) != 0) {
            str44 = userProfileArg.eventType;
        }
        if ((1048576 & i2) != 0) {
            str45 = userProfileArg.previousPage;
        }
        if ((2097152 & i2) != 0) {
            str46 = userProfileArg.relationFrom;
        }
        if ((4194304 & i2) != 0) {
            str47 = userProfileArg.sourceAid;
        }
        if ((8388608 & i2) != 0) {
            str48 = userProfileArg.trackParams;
        }
        if ((16777216 & i2) != 0) {
            str38 = userProfileArg.position;
        }
        if ((i2 & 33554432) != 0) {
            str43 = userProfileArg.searchRequestId;
        }
        return userProfileArg.copy(str25, str32, str31, str30, str29, str33, str34, str35, str36, num2, str37, str28, str27, str26, str41, z2, str40, str39, str42, str44, str45, str46, str47, str48, str38, str43);
    }

    public final String component1() {
        return this.extraUserId;
    }

    public final Integer component10() {
        return this.enterpriseType;
    }

    public final String component11() {
        return this.enterMethod;
    }

    public final String component12() {
        return this.liveRequestId;
    }

    public final String component13() {
        return this.liveRoomId;
    }

    public final String component14() {
        return this.liveRoomOwnerId;
    }

    public final String component15() {
        return this.liveType;
    }

    public final boolean component16() {
        return this.isFromLiveRecord;
    }

    public final String component17() {
        return this.sceneId;
    }

    public final String component18() {
        return this.enterFrom;
    }

    public final String component19() {
        return this.preEnterFrom;
    }

    public final String component2() {
        return this.iD;
    }

    public final String component20() {
        return this.eventType;
    }

    public final String component21() {
        return this.previousPage;
    }

    public final String component22() {
        return this.relationFrom;
    }

    public final String component23() {
        return this.sourceAid;
    }

    public final String component24() {
        return this.trackParams;
    }

    public final String component25() {
        return this.position;
    }

    public final String component26() {
        return this.searchRequestId;
    }

    public final String component3() {
        return this.extraSecUserId;
    }

    public final String component4() {
        return this.compatiblSecUserId;
    }

    public final String component5() {
        return this.profileFromScene;
    }

    public final String component6() {
        return this.uniqueId;
    }

    public final String component7() {
        return this.label;
    }

    public final String component8() {
        return this.aid;
    }

    public final String component9() {
        return this.type;
    }

    public final UserProfileArg copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        l.d(str17, "");
        return new UserProfileArg(str, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, str11, str12, str13, str14, z, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileArg)) {
            return false;
        }
        UserProfileArg userProfileArg = (UserProfileArg) obj;
        return l.a(this.extraUserId, userProfileArg.extraUserId) && l.a(this.iD, userProfileArg.iD) && l.a(this.extraSecUserId, userProfileArg.extraSecUserId) && l.a(this.compatiblSecUserId, userProfileArg.compatiblSecUserId) && l.a(this.profileFromScene, userProfileArg.profileFromScene) && l.a(this.uniqueId, userProfileArg.uniqueId) && l.a(this.label, userProfileArg.label) && l.a(this.aid, userProfileArg.aid) && l.a(this.type, userProfileArg.type) && l.a(this.enterpriseType, userProfileArg.enterpriseType) && l.a(this.enterMethod, userProfileArg.enterMethod) && l.a(this.liveRequestId, userProfileArg.liveRequestId) && l.a(this.liveRoomId, userProfileArg.liveRoomId) && l.a(this.liveRoomOwnerId, userProfileArg.liveRoomOwnerId) && l.a(this.liveType, userProfileArg.liveType) && this.isFromLiveRecord == userProfileArg.isFromLiveRecord && l.a(this.sceneId, userProfileArg.sceneId) && l.a(this.enterFrom, userProfileArg.enterFrom) && l.a(this.preEnterFrom, userProfileArg.preEnterFrom) && l.a(this.eventType, userProfileArg.eventType) && l.a(this.previousPage, userProfileArg.previousPage) && l.a(this.relationFrom, userProfileArg.relationFrom) && l.a(this.sourceAid, userProfileArg.sourceAid) && l.a(this.trackParams, userProfileArg.trackParams) && l.a(this.position, userProfileArg.position) && l.a(this.searchRequestId, userProfileArg.searchRequestId);
    }

    public final int hashCode() {
        String str = this.extraUserId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.iD;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.extraSecUserId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.compatiblSecUserId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.profileFromScene;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.uniqueId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.label;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.aid;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.type;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.enterpriseType;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        String str10 = this.enterMethod;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.liveRequestId;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.liveRoomId;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.liveRoomOwnerId;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.liveType;
        int hashCode15 = (hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31;
        boolean z = this.isFromLiveRecord;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode15 + i3) * 31;
        String str15 = this.sceneId;
        int hashCode16 = (i6 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.enterFrom;
        int hashCode17 = (hashCode16 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.preEnterFrom;
        int hashCode18 = (hashCode17 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.eventType;
        int hashCode19 = (hashCode18 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.previousPage;
        int hashCode20 = (hashCode19 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.relationFrom;
        int hashCode21 = (hashCode20 + (str20 != null ? str20.hashCode() : 0)) * 31;
        String str21 = this.sourceAid;
        int hashCode22 = (hashCode21 + (str21 != null ? str21.hashCode() : 0)) * 31;
        String str22 = this.trackParams;
        int hashCode23 = (hashCode22 + (str22 != null ? str22.hashCode() : 0)) * 31;
        String str23 = this.position;
        int hashCode24 = (hashCode23 + (str23 != null ? str23.hashCode() : 0)) * 31;
        String str24 = this.searchRequestId;
        if (str24 != null) {
            i2 = str24.hashCode();
        }
        return hashCode24 + i2;
    }

    public final String toString() {
        return "UserProfileArg(extraUserId=" + this.extraUserId + ", iD=" + this.iD + ", extraSecUserId=" + this.extraSecUserId + ", compatiblSecUserId=" + this.compatiblSecUserId + ", profileFromScene=" + this.profileFromScene + ", uniqueId=" + this.uniqueId + ", label=" + this.label + ", aid=" + this.aid + ", type=" + this.type + ", enterpriseType=" + this.enterpriseType + ", enterMethod=" + this.enterMethod + ", liveRequestId=" + this.liveRequestId + ", liveRoomId=" + this.liveRoomId + ", liveRoomOwnerId=" + this.liveRoomOwnerId + ", liveType=" + this.liveType + ", isFromLiveRecord=" + this.isFromLiveRecord + ", sceneId=" + this.sceneId + ", enterFrom=" + this.enterFrom + ", preEnterFrom=" + this.preEnterFrom + ", eventType=" + this.eventType + ", previousPage=" + this.previousPage + ", relationFrom=" + this.relationFrom + ", sourceAid=" + this.sourceAid + ", trackParams=" + this.trackParams + ", position=" + this.position + ", searchRequestId=" + this.searchRequestId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        l.d(parcel, "");
        parcel.writeString(this.extraUserId);
        parcel.writeString(this.iD);
        parcel.writeString(this.extraSecUserId);
        parcel.writeString(this.compatiblSecUserId);
        parcel.writeString(this.profileFromScene);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.label);
        parcel.writeString(this.aid);
        parcel.writeString(this.type);
        Integer num = this.enterpriseType;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.liveRequestId);
        parcel.writeString(this.liveRoomId);
        parcel.writeString(this.liveRoomOwnerId);
        parcel.writeString(this.liveType);
        parcel.writeInt(this.isFromLiveRecord ? 1 : 0);
        parcel.writeString(this.sceneId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.preEnterFrom);
        parcel.writeString(this.eventType);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.relationFrom);
        parcel.writeString(this.sourceAid);
        parcel.writeString(this.trackParams);
        parcel.writeString(this.position);
        parcel.writeString(this.searchRequestId);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getCompatiblSecUserId() {
        return this.compatiblSecUserId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getEnterpriseType() {
        return this.enterpriseType;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getExtraSecUserId() {
        return this.extraSecUserId;
    }

    public final String getExtraUserId() {
        return this.extraUserId;
    }

    public final String getID() {
        return this.iD;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLiveRequestId() {
        return this.liveRequestId;
    }

    public final String getLiveRoomId() {
        return this.liveRoomId;
    }

    public final String getLiveRoomOwnerId() {
        return this.liveRoomOwnerId;
    }

    public final String getLiveType() {
        return this.liveType;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getPreEnterFrom() {
        return this.preEnterFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getProfileFromScene() {
        return this.profileFromScene;
    }

    public final String getRelationFrom() {
        return this.relationFrom;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getSearchRequestId() {
        return this.searchRequestId;
    }

    public final String getSourceAid() {
        return this.sourceAid;
    }

    public final String getTrackParams() {
        return this.trackParams;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final boolean isFromLiveRecord() {
        return this.isFromLiveRecord;
    }

    public UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        l.d(str17, "");
        this.extraUserId = str;
        this.iD = str2;
        this.extraSecUserId = str3;
        this.compatiblSecUserId = str4;
        this.profileFromScene = str5;
        this.uniqueId = str6;
        this.label = str7;
        this.aid = str8;
        this.type = str9;
        this.enterpriseType = num;
        this.enterMethod = str10;
        this.liveRequestId = str11;
        this.liveRoomId = str12;
        this.liveRoomOwnerId = str13;
        this.liveType = str14;
        this.isFromLiveRecord = z;
        this.sceneId = str15;
        this.enterFrom = str16;
        this.preEnterFrom = str17;
        this.eventType = str18;
        this.previousPage = str19;
        this.relationFrom = str20;
        this.sourceAid = str21;
        this.trackParams = str22;
        this.position = str23;
        this.searchRequestId = str24;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserProfileArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? null : str9, (i2 & 512) != 0 ? 0 : num, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : str14, (32768 & i2) != 0 ? false : z, (65536 & i2) != 0 ? null : str15, (131072 & i2) != 0 ? null : str16, (262144 & i2) != 0 ? "" : str17, (524288 & i2) != 0 ? null : str18, (1048576 & i2) != 0 ? null : str19, (2097152 & i2) != 0 ? null : str20, (4194304 & i2) != 0 ? null : str21, (8388608 & i2) != 0 ? null : str22, (16777216 & i2) != 0 ? null : str23, (i2 & 33554432) != 0 ? null : str24);
    }

    public static class a implements Parcelable.Creator<UserProfileArg> {
        static {
            Covode.recordClassIndex(74818);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserProfileArg[] newArray(int i2) {
            return new UserProfileArg[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserProfileArg createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new UserProfileArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final String getSecUid() {
        String str = this.extraSecUserId;
        if (str == null || str.length() == 0) {
            return this.compatiblSecUserId;
        }
        return str;
    }

    public final String getUserId() {
        String str = this.extraUserId;
        if (str == null || str.length() == 0) {
            return this.iD;
        }
        return str;
    }

    public final void setExtraSecUserId(String str) {
        this.extraSecUserId = str;
    }

    public final void setExtraUserId(String str) {
        this.extraUserId = str;
    }

    public final void setSecUid(String str) {
        this.extraSecUserId = str;
    }

    public final void setUserId(String str) {
        this.extraUserId = str;
    }
}
