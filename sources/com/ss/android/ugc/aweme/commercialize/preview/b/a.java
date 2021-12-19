package com.ss.android.ugc.aweme.commercialize.preview.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "ad_ids")
    private final List<String> adIds;
    @c(a = "creative_ids")
    private final List<String> creativeIds;
    @c(a = "status_code")
    private final int statusCode;

    static {
        Covode.recordClassIndex(46242);
    }

    public static int com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.preview.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = aVar.statusCode;
        }
        if ((i3 & 2) != 0) {
            list = aVar.adIds;
        }
        if ((i3 & 4) != 0) {
            list2 = aVar.creativeIds;
        }
        return aVar.copy(i2, list, list2);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final List<String> component2() {
        return this.adIds;
    }

    public final List<String> component3() {
        return this.creativeIds;
    }

    public final a copy(int i2, List<String> list, List<String> list2) {
        return new a(i2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.statusCode == aVar.statusCode && l.a(this.adIds, aVar.adIds) && l.a(this.creativeIds, aVar.creativeIds);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.statusCode) * 31;
        List<String> list = this.adIds;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.creativeIds;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AdsPreviewResponse(statusCode=" + this.statusCode + ", adIds=" + this.adIds + ", creativeIds=" + this.creativeIds + ")";
    }

    public final List<String> getAdIds() {
        return this.adIds;
    }

    public final List<String> getCreativeIds() {
        return this.creativeIds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public a(int i2, List<String> list, List<String> list2) {
        this.statusCode = i2;
        this.adIds = list;
        this.creativeIds = list2;
    }
}
