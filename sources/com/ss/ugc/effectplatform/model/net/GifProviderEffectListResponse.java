package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class GifProviderEffectListResponse extends h<GifProviderEffectModel> {
    private GifProviderEffectModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102502);
    }

    public GifProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ GifProviderEffectListResponse copy$default(GifProviderEffectListResponse gifProviderEffectListResponse, GifProviderEffectModel gifProviderEffectModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gifProviderEffectModel = gifProviderEffectListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = gifProviderEffectListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = gifProviderEffectListResponse.status_code;
        }
        return gifProviderEffectListResponse.copy(gifProviderEffectModel, str, i2);
    }

    public final GifProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final GifProviderEffectListResponse copy(GifProviderEffectModel gifProviderEffectModel, String str, int i2) {
        return new GifProviderEffectListResponse(gifProviderEffectModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifProviderEffectListResponse)) {
            return false;
        }
        GifProviderEffectListResponse gifProviderEffectListResponse = (GifProviderEffectListResponse) obj;
        return l.a(this.data, gifProviderEffectListResponse.data) && l.a(this.message, gifProviderEffectListResponse.message) && this.status_code == gifProviderEffectListResponse.status_code;
    }

    public final int hashCode() {
        GifProviderEffectModel gifProviderEffectModel = this.data;
        int i2 = 0;
        int hashCode = (gifProviderEffectModel != null ? gifProviderEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "GifProviderEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final GifProviderEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final GifProviderEffectModel getResponseData() {
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

    public final void setData(GifProviderEffectModel gifProviderEffectModel) {
        this.data = gifProviderEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i2) {
        this.data = gifProviderEffectModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : gifProviderEffectModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
