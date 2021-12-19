package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class EffectNetListResponse extends h<EffectChannelModel> {
    private EffectChannelModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102496);
    }

    public EffectNetListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ EffectNetListResponse copy$default(EffectNetListResponse effectNetListResponse, EffectChannelModel effectChannelModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            effectChannelModel = effectNetListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = effectNetListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = effectNetListResponse.status_code;
        }
        return effectNetListResponse.copy(effectChannelModel, str, i2);
    }

    public final EffectChannelModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectNetListResponse copy(EffectChannelModel effectChannelModel, String str, int i2) {
        return new EffectNetListResponse(effectChannelModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectNetListResponse)) {
            return false;
        }
        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) obj;
        return l.a(this.data, effectNetListResponse.data) && l.a(this.message, effectNetListResponse.message) && this.status_code == effectNetListResponse.status_code;
    }

    public final int hashCode() {
        EffectChannelModel effectChannelModel = this.data;
        int i2 = 0;
        int hashCode = (effectChannelModel != null ? effectChannelModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "EffectNetListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final EffectChannelModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final EffectChannelModel getResponseData() {
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
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel == null) {
            return false;
        }
        return effectChannelModel.checkValued();
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i2) {
        this.data = effectChannelModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : effectChannelModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
