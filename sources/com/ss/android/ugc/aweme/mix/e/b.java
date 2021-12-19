package com.ss.android.ugc.aweme.mix.e;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    private int flowStartPositionInGeneralSearch;
    private Integer isFromVideo;
    private String searchId;
    private String searchType;

    static {
        Covode.recordClassIndex(70426);
    }

    public b() {
        this(null, null, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_mix_params_SearchParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, Integer num, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bVar.searchId;
        }
        if ((i3 & 2) != 0) {
            num = bVar.isFromVideo;
        }
        if ((i3 & 4) != 0) {
            str2 = bVar.searchType;
        }
        if ((i3 & 8) != 0) {
            i2 = bVar.flowStartPositionInGeneralSearch;
        }
        return bVar.copy(str, num, str2, i2);
    }

    public final String component1() {
        return this.searchId;
    }

    public final Integer component2() {
        return this.isFromVideo;
    }

    public final String component3() {
        return this.searchType;
    }

    public final int component4() {
        return this.flowStartPositionInGeneralSearch;
    }

    public final b copy(String str, Integer num, String str2, int i2) {
        return new b(str, num, str2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.searchId, bVar.searchId) && l.a(this.isFromVideo, bVar.isFromVideo) && l.a(this.searchType, bVar.searchType) && this.flowStartPositionInGeneralSearch == bVar.flowStartPositionInGeneralSearch;
    }

    public final int hashCode() {
        String str = this.searchId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.isFromVideo;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.searchType;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_mix_params_SearchParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.flowStartPositionInGeneralSearch);
    }

    public final String toString() {
        return "SearchParam(searchId=" + this.searchId + ", isFromVideo=" + this.isFromVideo + ", searchType=" + this.searchType + ", flowStartPositionInGeneralSearch=" + this.flowStartPositionInGeneralSearch + ")";
    }

    public final int getFlowStartPositionInGeneralSearch() {
        return this.flowStartPositionInGeneralSearch;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final Integer isFromVideo() {
        return this.isFromVideo;
    }

    public final void setFlowStartPositionInGeneralSearch(int i2) {
        this.flowStartPositionInGeneralSearch = i2;
    }

    public final void setFromVideo(Integer num) {
        this.isFromVideo = num;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public b(String str, Integer num, String str2, int i2) {
        this.searchId = str;
        this.isFromVideo = num;
        this.searchType = str2;
        this.flowStartPositionInGeneralSearch = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Integer num, String str2, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : num, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i2);
    }
}
