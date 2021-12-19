package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class EffectCheckUpdateResponse extends h<Boolean> {
    private String message;
    private int status_code;
    private boolean updated;

    static {
        Covode.recordClassIndex(102492);
    }

    public EffectCheckUpdateResponse() {
        this(false, null, 0, 7, null);
    }

    public static /* synthetic */ EffectCheckUpdateResponse copy$default(EffectCheckUpdateResponse effectCheckUpdateResponse, boolean z, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = effectCheckUpdateResponse.updated;
        }
        if ((i3 & 2) != 0) {
            str = effectCheckUpdateResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = effectCheckUpdateResponse.status_code;
        }
        return effectCheckUpdateResponse.copy(z, str, i2);
    }

    public final boolean component1() {
        return this.updated;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i2) {
        return new EffectCheckUpdateResponse(z, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCheckUpdateResponse)) {
            return false;
        }
        EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) obj;
        return this.updated == effectCheckUpdateResponse.updated && l.a(this.message, effectCheckUpdateResponse.message) && this.status_code == effectCheckUpdateResponse.status_code;
    }

    public final int hashCode() {
        boolean z = this.updated;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.message;
        return ((i5 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final String toString() {
        return "EffectCheckUpdateResponse(updated=" + this.updated + ", message=" + this.message + ", status_code=" + this.status_code + ")";
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

    public final boolean getUpdated() {
        return this.updated;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i2) {
        this.updated = z;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCheckUpdateResponse(boolean z, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
