package com.ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class CreateAnchorInfo implements Parcelable {
    public static final Parcelable.Creator<CreateAnchorInfo> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    private Long addTime;
    private final Boolean canDelete;
    private final String content;
    private final String extra;
    private String iconUrl;
    private final String keyword;
    private final String language;
    private final String subtype;
    @c(a = "third_id")
    private String thirdId;
    @c(a = "time")
    private String time;
    private final int type;
    private final String url;

    static {
        Covode.recordClassIndex(88093);
    }

    public static int com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CreateAnchorInfo copy$default(CreateAnchorInfo createAnchorInfo, int i2, String str, String str2, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = createAnchorInfo.type;
        }
        if ((i3 & 2) != 0) {
            str = createAnchorInfo.keyword;
        }
        if ((i3 & 4) != 0) {
            str2 = createAnchorInfo.url;
        }
        if ((i3 & 8) != 0) {
            str3 = createAnchorInfo.language;
        }
        if ((i3 & 16) != 0) {
            str4 = createAnchorInfo.content;
        }
        if ((i3 & 32) != 0) {
            str5 = createAnchorInfo.iconUrl;
        }
        if ((i3 & 64) != 0) {
            l2 = createAnchorInfo.addTime;
        }
        if ((i3 & 128) != 0) {
            str6 = createAnchorInfo.extra;
        }
        if ((i3 & 256) != 0) {
            str7 = createAnchorInfo.thirdId;
        }
        if ((i3 & 512) != 0) {
            str8 = createAnchorInfo.time;
        }
        if ((i3 & 1024) != 0) {
            str9 = createAnchorInfo.subtype;
        }
        if ((i3 & 2048) != 0) {
            bool = createAnchorInfo.canDelete;
        }
        return createAnchorInfo.copy(i2, str, str2, str3, str4, str5, l2, str6, str7, str8, str9, bool);
    }

    public final int component1() {
        return this.type;
    }

    public final String component10() {
        return this.time;
    }

    public final String component11() {
        return this.subtype;
    }

    public final Boolean component12() {
        return this.canDelete;
    }

    public final String component2() {
        return this.keyword;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.language;
    }

    public final String component5() {
        return this.content;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final Long component7() {
        return this.addTime;
    }

    public final String component8() {
        return this.extra;
    }

    public final String component9() {
        return this.thirdId;
    }

    public final CreateAnchorInfo copy(int i2, String str, String str2, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, Boolean bool) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str7, "");
        l.d(str8, "");
        return new CreateAnchorInfo(i2, str, str2, str3, str4, str5, l2, str6, str7, str8, str9, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAnchorInfo)) {
            return false;
        }
        CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
        return this.type == createAnchorInfo.type && l.a(this.keyword, createAnchorInfo.keyword) && l.a(this.url, createAnchorInfo.url) && l.a(this.language, createAnchorInfo.language) && l.a(this.content, createAnchorInfo.content) && l.a(this.iconUrl, createAnchorInfo.iconUrl) && l.a(this.addTime, createAnchorInfo.addTime) && l.a(this.extra, createAnchorInfo.extra) && l.a(this.thirdId, createAnchorInfo.thirdId) && l.a(this.time, createAnchorInfo.time) && l.a(this.subtype, createAnchorInfo.subtype) && l.a(this.canDelete, createAnchorInfo.canDelete);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        String str = this.keyword;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_data_CreateAnchorInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.content;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l2 = this.addTime;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str6 = this.extra;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.thirdId;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.time;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.subtype;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool = this.canDelete;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "CreateAnchorInfo(type=" + this.type + ", keyword=" + this.keyword + ", url=" + this.url + ", language=" + this.language + ", content=" + this.content + ", iconUrl=" + this.iconUrl + ", addTime=" + this.addTime + ", extra=" + this.extra + ", thirdId=" + this.thirdId + ", time=" + this.time + ", subtype=" + this.subtype + ", canDelete=" + this.canDelete + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
        parcel.writeString(this.iconUrl);
        Long l2 = this.addTime;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.thirdId);
        parcel.writeString(this.time);
        parcel.writeString(this.subtype);
        Boolean bool = this.canDelete;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88094);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getThirdId() {
        return this.thirdId;
    }

    public final String getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public static class b implements Parcelable.Creator<CreateAnchorInfo> {
        static {
            Covode.recordClassIndex(88095);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateAnchorInfo[] newArray(int i2) {
            return new CreateAnchorInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateAnchorInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreateAnchorInfo(readInt, readString, readString2, readString3, readString4, readString5, valueOf, readString6, readString7, readString8, readString9, bool);
        }
    }

    public final void setAddTime(Long l2) {
        this.addTime = l2;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setThirdId(String str) {
        l.d(str, "");
        this.thirdId = str;
    }

    public final void setTime(String str) {
        l.d(str, "");
        this.time = str;
    }

    public CreateAnchorInfo(int i2, String str, String str2, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, Boolean bool) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str7, "");
        l.d(str8, "");
        this.type = i2;
        this.keyword = str;
        this.url = str2;
        this.language = str3;
        this.content = str4;
        this.iconUrl = str5;
        this.addTime = l2;
        this.extra = str6;
        this.thirdId = str7;
        this.time = str8;
        this.subtype = str9;
        this.canDelete = bool;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateAnchorInfo(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Boolean r25, int r26, h.f.b.g r27) {
        /*
            r13 = this;
            r9 = r22
            r8 = r21
            r7 = r20
            r6 = r19
            r10 = r23
            r12 = r25
            r2 = r26
            r0 = r2 & 32
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0015
            r6 = r11
        L_0x0015:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0021
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x0021:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0026
            r8 = r11
        L_0x0026:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002b
            r9 = r11
        L_0x002b:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0030
            r10 = r11
        L_0x0030:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x004a
        L_0x0034:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x003d:
            r0 = r13
            r5 = r18
            r1 = r14
            r2 = r15
            r4 = r17
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x004a:
            r11 = r24
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, h.f.b.g):void");
    }
}
