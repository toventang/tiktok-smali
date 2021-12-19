package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class RecommendSearchWordsResponse extends h<RecommendSearchWordsResponse> {
    private RecommendSearchWordsModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102515);
    }

    public RecommendSearchWordsResponse() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ RecommendSearchWordsResponse copy$default(RecommendSearchWordsResponse recommendSearchWordsResponse, RecommendSearchWordsModel recommendSearchWordsModel, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            recommendSearchWordsModel = recommendSearchWordsResponse.data;
        }
        if ((i3 & 2) != 0) {
            i2 = recommendSearchWordsResponse.status_code;
        }
        if ((i3 & 4) != 0) {
            str = recommendSearchWordsResponse.message;
        }
        return recommendSearchWordsResponse.copy(recommendSearchWordsModel, i2, str);
    }

    public final RecommendSearchWordsModel component1() {
        return this.data;
    }

    public final int component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.message;
    }

    public final RecommendSearchWordsResponse copy(RecommendSearchWordsModel recommendSearchWordsModel, int i2, String str) {
        return new RecommendSearchWordsResponse(recommendSearchWordsModel, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsResponse)) {
            return false;
        }
        RecommendSearchWordsResponse recommendSearchWordsResponse = (RecommendSearchWordsResponse) obj;
        return l.a(this.data, recommendSearchWordsResponse.data) && this.status_code == recommendSearchWordsResponse.status_code && l.a(this.message, recommendSearchWordsResponse.message);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final RecommendSearchWordsResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        RecommendSearchWordsModel recommendSearchWordsModel = this.data;
        int i2 = 0;
        int hashCode = (((recommendSearchWordsModel != null ? recommendSearchWordsModel.hashCode() : 0) * 31) + this.status_code) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RecommendSearchWordsResponse(data=" + this.data + ", status_code=" + this.status_code + ", message=" + this.message + ")";
    }

    public final RecommendSearchWordsModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(RecommendSearchWordsModel recommendSearchWordsModel) {
        this.data = recommendSearchWordsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i2, String str) {
        this.data = recommendSearchWordsModel;
        this.status_code = i2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : recommendSearchWordsModel, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str);
    }
}
