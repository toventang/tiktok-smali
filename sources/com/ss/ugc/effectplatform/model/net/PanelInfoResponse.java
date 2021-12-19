package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class PanelInfoResponse extends h<PanelInfoModel> {
    private PanelInfoModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102508);
    }

    public PanelInfoResponse() {
        this(null, null, 0, 7, null);
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoResponse copy$default(PanelInfoResponse panelInfoResponse, PanelInfoModel panelInfoModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            panelInfoModel = panelInfoResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = panelInfoResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = panelInfoResponse.status_code;
        }
        return panelInfoResponse.copy(panelInfoModel, str, i2);
    }

    public final PanelInfoModel component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i2) {
        return new PanelInfoResponse(panelInfoModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponse)) {
            return false;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) obj;
        return l.a(this.data, panelInfoResponse.data) && l.a(this.message, panelInfoResponse.message) && this.status_code == panelInfoResponse.status_code;
    }

    public final int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int i2 = 0;
        int hashCode = (panelInfoModel != null ? panelInfoModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "PanelInfoResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final PanelInfoModel getResponseData() {
        return this.data;
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

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i2) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : panelInfoModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
