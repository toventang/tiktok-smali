package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AppRawData implements Serializable {
    @c(a = "download_mode")
    private final int downloadMode;
    @c(a = "download_url")
    private final String downloadUrl;
    @c(a = "event_tag")
    private final String eventTag;
    @c(a = "group_id")
    private final String groupId;
    @c(a = "id")
    private final String id;
    @c(a = "is_ad")
    private final int isAd;
    @c(a = "log_extra")
    private final String logExtra;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "pkg_name")
    private final String pkgName;
    @c(a = "quick_app_url")
    private final String quickAppUrl;

    static {
        Covode.recordClassIndex(59304);
    }

    public AppRawData() {
        this(null, null, null, null, null, null, 0, null, null, 0, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AppRawData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AppRawData copy$default(AppRawData appRawData, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appRawData.id;
        }
        if ((i4 & 2) != 0) {
            str2 = appRawData.name;
        }
        if ((i4 & 4) != 0) {
            str3 = appRawData.pkgName;
        }
        if ((i4 & 8) != 0) {
            str4 = appRawData.downloadUrl;
        }
        if ((i4 & 16) != 0) {
            str5 = appRawData.eventTag;
        }
        if ((i4 & 32) != 0) {
            str6 = appRawData.groupId;
        }
        if ((i4 & 64) != 0) {
            i2 = appRawData.isAd;
        }
        if ((i4 & 128) != 0) {
            str7 = appRawData.logExtra;
        }
        if ((i4 & 256) != 0) {
            str8 = appRawData.quickAppUrl;
        }
        if ((i4 & 512) != 0) {
            i3 = appRawData.downloadMode;
        }
        return appRawData.copy(str, str2, str3, str4, str5, str6, i2, str7, str8, i3);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.downloadMode;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.pkgName;
    }

    public final String component4() {
        return this.downloadUrl;
    }

    public final String component5() {
        return this.eventTag;
    }

    public final String component6() {
        return this.groupId;
    }

    public final int component7() {
        return this.isAd;
    }

    public final String component8() {
        return this.logExtra;
    }

    public final String component9() {
        return this.quickAppUrl;
    }

    public final AppRawData copy(String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3) {
        return new AppRawData(str, str2, str3, str4, str5, str6, i2, str7, str8, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRawData)) {
            return false;
        }
        AppRawData appRawData = (AppRawData) obj;
        return l.a(this.id, appRawData.id) && l.a(this.name, appRawData.name) && l.a(this.pkgName, appRawData.pkgName) && l.a(this.downloadUrl, appRawData.downloadUrl) && l.a(this.eventTag, appRawData.eventTag) && l.a(this.groupId, appRawData.groupId) && this.isAd == appRawData.isAd && l.a(this.logExtra, appRawData.logExtra) && l.a(this.quickAppUrl, appRawData.quickAppUrl) && this.downloadMode == appRawData.downloadMode;
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pkgName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.downloadUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.eventTag;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.groupId;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_AppRawData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.isAd)) * 31;
        String str7 = this.logExtra;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.quickAppUrl;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return ((hashCode7 + i2) * 31) + com_ss_android_ugc_aweme_feed_model_AppRawData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.downloadMode);
    }

    public final String toString() {
        return "AppRawData(id=" + this.id + ", name=" + this.name + ", pkgName=" + this.pkgName + ", downloadUrl=" + this.downloadUrl + ", eventTag=" + this.eventTag + ", groupId=" + this.groupId + ", isAd=" + this.isAd + ", logExtra=" + this.logExtra + ", quickAppUrl=" + this.quickAppUrl + ", downloadMode=" + this.downloadMode + ")";
    }

    public final int getDownloadMode() {
        return this.downloadMode;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEventTag() {
        return this.eventTag;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPkgName() {
        return this.pkgName;
    }

    public final String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public final int isAd() {
        return this.isAd;
    }

    public AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3) {
        this.id = str;
        this.name = str2;
        this.pkgName = str3;
        this.downloadUrl = str4;
        this.eventTag = str5;
        this.groupId = str6;
        this.isAd = i2;
        this.logExtra = str7;
        this.quickAppUrl = str8;
        this.downloadMode = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? null : str7, (i4 & 256) == 0 ? str8 : null, (i4 & 512) == 0 ? i3 : 0);
    }
}
