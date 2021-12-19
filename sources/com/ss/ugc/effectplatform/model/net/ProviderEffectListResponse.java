package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class ProviderEffectListResponse extends h<ProviderEffectModel> {
    private ProviderEffectModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102511);
    }

    public ProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ProviderEffectListResponse copy$default(ProviderEffectListResponse providerEffectListResponse, ProviderEffectModel providerEffectModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            providerEffectModel = providerEffectListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = providerEffectListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = providerEffectListResponse.status_code;
        }
        return providerEffectListResponse.copy(providerEffectModel, str, i2);
    }

    public final ProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ProviderEffectListResponse copy(ProviderEffectModel providerEffectModel, String str, int i2) {
        return new ProviderEffectListResponse(providerEffectModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEffectListResponse)) {
            return false;
        }
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) obj;
        return l.a(this.data, providerEffectListResponse.data) && l.a(this.message, providerEffectListResponse.message) && this.status_code == providerEffectListResponse.status_code;
    }

    public final int hashCode() {
        ProviderEffectModel providerEffectModel = this.data;
        int i2 = 0;
        int hashCode = (providerEffectModel != null ? providerEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "ProviderEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final ProviderEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final ProviderEffectModel getResponseData() {
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

    public final void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i2) {
        this.data = providerEffectModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : providerEffectModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
