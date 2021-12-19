package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class InfoStickerListResponse extends h<InfoStickerListResponse> {
    private InfoStickerListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102505);
    }

    public InfoStickerListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ InfoStickerListResponse copy$default(InfoStickerListResponse infoStickerListResponse, InfoStickerListModel infoStickerListModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            infoStickerListModel = infoStickerListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = infoStickerListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = infoStickerListResponse.status_code;
        }
        return infoStickerListResponse.copy(infoStickerListModel, str, i2);
    }

    public final InfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final InfoStickerListResponse copy(InfoStickerListModel infoStickerListModel, String str, int i2) {
        return new InfoStickerListResponse(infoStickerListModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListResponse)) {
            return false;
        }
        InfoStickerListResponse infoStickerListResponse = (InfoStickerListResponse) obj;
        return l.a(this.data, infoStickerListResponse.data) && l.a(this.message, infoStickerListResponse.message) && this.status_code == infoStickerListResponse.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final InfoStickerListResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        InfoStickerListModel infoStickerListModel = this.data;
        int i2 = 0;
        int hashCode = (infoStickerListModel != null ? infoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "InfoStickerListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final InfoStickerListModel getData() {
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

    public final void setData(InfoStickerListModel infoStickerListModel) {
        this.data = infoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i2) {
        this.data = infoStickerListModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : infoStickerListModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
