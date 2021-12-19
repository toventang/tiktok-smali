package com.ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    @c(a = "act_type")
    public int actType;
    public String authorId;
    @c(a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @c(a = "end_time")
    public long endTime;
    public String enterFrom;
    public String groupId;
    @c(a = "image")
    public UrlModel image;
    @c(a = "jump_open_url")
    public String jumpOpenUrl;
    @c(a = "jump_web_url")
    public String jumpWebUrl;
    @c(a = "start_time")
    public long startTime;
    @c(a = "time_range")
    public List<a> timeRange;
    @c(a = "title")
    public String title;
    @c(a = "track_url_list")
    public UrlModel trackUrlList;

    static {
        Covode.recordClassIndex(45215);
    }

    public b() {
    }

    public static int com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ b copy$default(b bVar, int i2, UrlModel urlModel, String str, String str2, String str3, long j2, long j3, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i3, Object obj) {
        int i4 = i2;
        String str7 = str;
        UrlModel urlModel4 = urlModel;
        String str8 = str3;
        String str9 = str2;
        long j4 = j2;
        long j5 = j3;
        List list2 = list;
        UrlModel urlModel5 = urlModel3;
        UrlModel urlModel6 = urlModel2;
        String str10 = str5;
        String str11 = str4;
        String str12 = str6;
        if ((i3 & 1) != 0) {
            i4 = bVar.actType;
        }
        if ((i3 & 2) != 0) {
            urlModel4 = bVar.image;
        }
        if ((i3 & 4) != 0) {
            str7 = bVar.jumpWebUrl;
        }
        if ((i3 & 8) != 0) {
            str9 = bVar.jumpOpenUrl;
        }
        if ((i3 & 16) != 0) {
            str8 = bVar.title;
        }
        if ((i3 & 32) != 0) {
            j4 = bVar.startTime;
        }
        if ((i3 & 64) != 0) {
            j5 = bVar.endTime;
        }
        if ((i3 & 128) != 0) {
            list2 = bVar.timeRange;
        }
        if ((i3 & 256) != 0) {
            urlModel6 = bVar.trackUrlList;
        }
        if ((i3 & 512) != 0) {
            urlModel5 = bVar.clickTrackUrlList;
        }
        if ((i3 & 1024) != 0) {
            str11 = bVar.groupId;
        }
        if ((i3 & 2048) != 0) {
            str10 = bVar.authorId;
        }
        if ((i3 & 4096) != 0) {
            str12 = bVar.enterFrom;
        }
        return bVar.copy(i4, urlModel4, str7, str9, str8, j4, j5, list2, urlModel6, urlModel5, str11, str10, str12);
    }

    public final int component1() {
        return this.actType;
    }

    public final UrlModel component10() {
        return this.clickTrackUrlList;
    }

    public final String component11() {
        return this.groupId;
    }

    public final String component12() {
        return this.authorId;
    }

    public final String component13() {
        return this.enterFrom;
    }

    public final UrlModel component2() {
        return this.image;
    }

    public final String component3() {
        return this.jumpWebUrl;
    }

    public final String component4() {
        return this.jumpOpenUrl;
    }

    public final String component5() {
        return this.title;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final List<a> component8() {
        return this.timeRange;
    }

    public final UrlModel component9() {
        return this.trackUrlList;
    }

    public final b copy(int i2, UrlModel urlModel, String str, String str2, String str3, long j2, long j3, List<a> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new b(i2, urlModel, str, str2, str3, j2, j3, list, urlModel2, urlModel3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.actType == bVar.actType && l.a(this.image, bVar.image) && l.a(this.jumpWebUrl, bVar.jumpWebUrl) && l.a(this.jumpOpenUrl, bVar.jumpOpenUrl) && l.a(this.title, bVar.title) && this.startTime == bVar.startTime && this.endTime == bVar.endTime && l.a(this.timeRange, bVar.timeRange) && l.a(this.trackUrlList, bVar.trackUrlList) && l.a(this.clickTrackUrlList, bVar.clickTrackUrlList) && l.a(this.groupId, bVar.groupId) && l.a(this.authorId, bVar.authorId) && l.a(this.enterFrom, bVar.enterFrom);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.actType) * 31;
        UrlModel urlModel = this.image;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.jumpWebUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.jumpOpenUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode4 = (((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_commerce_model_CommerceActivityStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime)) * 31;
        List<a> list = this.timeRange;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        int hashCode6 = (hashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.clickTrackUrlList;
        int hashCode7 = (hashCode6 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str4 = this.groupId;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.authorId;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "CommerceActivityStruct(actType=" + this.actType + ", image=" + this.image + ", jumpWebUrl=" + this.jumpWebUrl + ", jumpOpenUrl=" + this.jumpOpenUrl + ", title=" + this.title + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeRange=" + this.timeRange + ", trackUrlList=" + this.trackUrlList + ", clickTrackUrlList=" + this.clickTrackUrlList + ", groupId=" + this.groupId + ", authorId=" + this.authorId + ", enterFrom=" + this.enterFrom + ")";
    }

    public final int getActType() {
        return this.actType;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getJumpOpenUrl() {
        return this.jumpOpenUrl;
    }

    public final String getJumpWebUrl() {
        return this.jumpWebUrl;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final List<a> getTimeRange() {
        return this.timeRange;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public b(int i2, UrlModel urlModel, String str, String str2, String str3, long j2, long j3, List<a> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.actType = i2;
        this.image = urlModel;
        this.jumpWebUrl = str;
        this.jumpOpenUrl = str2;
        this.title = str3;
        this.startTime = j2;
        this.endTime = j3;
        this.timeRange = list;
        this.trackUrlList = urlModel2;
        this.clickTrackUrlList = urlModel3;
        this.groupId = str4;
        this.authorId = str5;
        this.enterFrom = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(int r17, com.ss.android.ugc.aweme.base.model.UrlModel r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, long r24, java.util.List r26, com.ss.android.ugc.aweme.base.model.UrlModel r27, com.ss.android.ugc.aweme.base.model.UrlModel r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, h.f.b.g r33) {
        /*
            r16 = this;
            r4 = r20
            r3 = r19
            r0 = r32 & 4
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r3 = r5
        L_0x000b:
            r0 = r32 & 8
            if (r0 == 0) goto L_0x0010
            r4 = r5
        L_0x0010:
            r0 = r32 & 16
            if (r0 == 0) goto L_0x002e
        L_0x0014:
            r0 = r16
            r11 = r27
            r10 = r26
            r15 = r31
            r14 = r30
            r2 = r18
            r13 = r29
            r1 = r17
            r12 = r28
            r6 = r22
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            return
        L_0x002e:
            r5 = r21
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.model.b.<init>(int, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, long, long, java.util.List, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
