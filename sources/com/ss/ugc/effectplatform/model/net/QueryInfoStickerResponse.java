package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class QueryInfoStickerResponse extends h<QueryInfoStickerResponse> {
    private QueryInfoStickerListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102513);
    }

    public QueryInfoStickerResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ QueryInfoStickerResponse copy$default(QueryInfoStickerResponse queryInfoStickerResponse, QueryInfoStickerListModel queryInfoStickerListModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            queryInfoStickerListModel = queryInfoStickerResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = queryInfoStickerResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = queryInfoStickerResponse.status_code;
        }
        return queryInfoStickerResponse.copy(queryInfoStickerListModel, str, i2);
    }

    public final QueryInfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i2) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerResponse)) {
            return false;
        }
        QueryInfoStickerResponse queryInfoStickerResponse = (QueryInfoStickerResponse) obj;
        return l.a(this.data, queryInfoStickerResponse.data) && l.a(this.message, queryInfoStickerResponse.message) && this.status_code == queryInfoStickerResponse.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final QueryInfoStickerResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        QueryInfoStickerListModel queryInfoStickerListModel = this.data;
        int i2 = 0;
        int hashCode = (queryInfoStickerListModel != null ? queryInfoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "QueryInfoStickerResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final QueryInfoStickerListModel getData() {
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

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i2) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : queryInfoStickerListModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
