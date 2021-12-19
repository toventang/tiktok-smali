package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class EdtCaptionModel extends BaseResponse {
    @c(a = "aweme_info")
    private final Aweme aweme;
    @c(a = "subtitle_id")
    private final String newSubtitleId;
    @c(a = "src_subtitle")
    private final List<CaptionData> srcSubtitle;
    @c(a = "trans_subtitle")
    private final List<CaptionData> transSubtitle;

    static {
        Covode.recordClassIndex(58867);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.caption.edit.EdtCaptionModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EdtCaptionModel copy$default(EdtCaptionModel edtCaptionModel, String str, Aweme aweme2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = edtCaptionModel.newSubtitleId;
        }
        if ((i2 & 2) != 0) {
            aweme2 = edtCaptionModel.aweme;
        }
        if ((i2 & 4) != 0) {
            list = edtCaptionModel.srcSubtitle;
        }
        if ((i2 & 8) != 0) {
            list2 = edtCaptionModel.transSubtitle;
        }
        return edtCaptionModel.copy(str, aweme2, list, list2);
    }

    public final String component1() {
        return this.newSubtitleId;
    }

    public final Aweme component2() {
        return this.aweme;
    }

    public final List<CaptionData> component3() {
        return this.srcSubtitle;
    }

    public final List<CaptionData> component4() {
        return this.transSubtitle;
    }

    public final EdtCaptionModel copy(String str, Aweme aweme2, List<CaptionData> list, List<CaptionData> list2) {
        return new EdtCaptionModel(str, aweme2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EdtCaptionModel)) {
            return false;
        }
        EdtCaptionModel edtCaptionModel = (EdtCaptionModel) obj;
        return l.a(this.newSubtitleId, edtCaptionModel.newSubtitleId) && l.a(this.aweme, edtCaptionModel.aweme) && l.a(this.srcSubtitle, edtCaptionModel.srcSubtitle) && l.a(this.transSubtitle, edtCaptionModel.transSubtitle);
    }

    public final int hashCode() {
        String str = this.newSubtitleId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme2 = this.aweme;
        int hashCode2 = (hashCode + (aweme2 != null ? aweme2.hashCode() : 0)) * 31;
        List<CaptionData> list = this.srcSubtitle;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<CaptionData> list2 = this.transSubtitle;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "EdtCaptionModel(newSubtitleId=" + this.newSubtitleId + ", aweme=" + this.aweme + ", srcSubtitle=" + this.srcSubtitle + ", transSubtitle=" + this.transSubtitle + ")";
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getNewSubtitleId() {
        return this.newSubtitleId;
    }

    public final List<CaptionData> getSrcSubtitle() {
        return this.srcSubtitle;
    }

    public final List<CaptionData> getTransSubtitle() {
        return this.transSubtitle;
    }

    public EdtCaptionModel(String str, Aweme aweme2, List<CaptionData> list, List<CaptionData> list2) {
        this.newSubtitleId = str;
        this.aweme = aweme2;
        this.srcSubtitle = list;
        this.transSubtitle = list2;
    }
}
