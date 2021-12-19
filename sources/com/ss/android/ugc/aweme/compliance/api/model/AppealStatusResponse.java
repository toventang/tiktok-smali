package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class AppealStatusResponse extends BaseResponse {
    @c(a = "appeal_type")
    private final int appealType;
    @c(a = "appeal_url")
    private final String appealUrl;
    @c(a = "ban_time")
    private final long banTime;
    @c(a = "ban_type")
    private final int banType;
    @c(a = "button_list")
    private final List<l> buttonList;
    @c(a = "pop_content")
    private final String popContent;
    @c(a = "pop_title")
    private final String popTitle;
    @c(a = "status")
    private final int status;

    static {
        Covode.recordClassIndex(47327);
    }

    public AppealStatusResponse() {
        this(0, 0, 0, 0, null, null, null, null, 255, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppealStatusResponse copy$default(AppealStatusResponse appealStatusResponse, int i2, int i3, long j2, int i4, String str, String str2, String str3, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = appealStatusResponse.status;
        }
        if ((i5 & 2) != 0) {
            i3 = appealStatusResponse.banType;
        }
        if ((i5 & 4) != 0) {
            j2 = appealStatusResponse.banTime;
        }
        if ((i5 & 8) != 0) {
            i4 = appealStatusResponse.appealType;
        }
        if ((i5 & 16) != 0) {
            str = appealStatusResponse.popTitle;
        }
        if ((i5 & 32) != 0) {
            str2 = appealStatusResponse.popContent;
        }
        if ((i5 & 64) != 0) {
            str3 = appealStatusResponse.appealUrl;
        }
        if ((i5 & 128) != 0) {
            list = appealStatusResponse.buttonList;
        }
        return appealStatusResponse.copy(i2, i3, j2, i4, str, str2, str3, list);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.banType;
    }

    public final long component3() {
        return this.banTime;
    }

    public final int component4() {
        return this.appealType;
    }

    public final String component5() {
        return this.popTitle;
    }

    public final String component6() {
        return this.popContent;
    }

    public final String component7() {
        return this.appealUrl;
    }

    public final List<l> component8() {
        return this.buttonList;
    }

    public final AppealStatusResponse copy(int i2, int i3, long j2, int i4, String str, String str2, String str3, List<l> list) {
        return new AppealStatusResponse(i2, i3, j2, i4, str, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppealStatusResponse)) {
            return false;
        }
        AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
        return this.status == appealStatusResponse.status && this.banType == appealStatusResponse.banType && this.banTime == appealStatusResponse.banTime && this.appealType == appealStatusResponse.appealType && l.a(this.popTitle, appealStatusResponse.popTitle) && l.a(this.popContent, appealStatusResponse.popContent) && l.a(this.appealUrl, appealStatusResponse.appealUrl) && l.a(this.buttonList, appealStatusResponse.buttonList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status) * 31) + com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.banType)) * 31) + com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.banTime)) * 31) + com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.appealType)) * 31;
        String str = this.popTitle;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_compliance_api_model_AppealStatusResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.popContent;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appealUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<l> list = this.buttonList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AppealStatusResponse(status=" + this.status + ", banType=" + this.banType + ", banTime=" + this.banTime + ", appealType=" + this.appealType + ", popTitle=" + this.popTitle + ", popContent=" + this.popContent + ", appealUrl=" + this.appealUrl + ", buttonList=" + this.buttonList + ")";
    }

    public final int getAppealType() {
        return this.appealType;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final List<l> getButtonList() {
        return this.buttonList;
    }

    public final String getPopContent() {
        return this.popContent;
    }

    public final String getPopTitle() {
        return this.popTitle;
    }

    public final int getStatus() {
        return this.status;
    }

    public AppealStatusResponse(int i2, int i3, long j2, int i4, String str, String str2, String str3, List<l> list) {
        this.status = i2;
        this.banType = i3;
        this.banTime = j2;
        this.appealType = i4;
        this.popTitle = str;
        this.popContent = str2;
        this.appealUrl = str3;
        this.buttonList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppealStatusResponse(int i2, int i3, long j2, int i4, String str, String str2, String str3, List list, int i5, g gVar) {
        this((i5 & 1) != 0 ? -1 : i2, (i5 & 2) != 0 ? -1 : i3, (i5 & 4) != 0 ? 0 : j2, (i5 & 8) == 0 ? i4 : -1, (i5 & 16) != 0 ? null : str, (i5 & 32) != 0 ? null : str2, (i5 & 64) != 0 ? null : str3, (i5 & 128) == 0 ? list : null);
    }
}
