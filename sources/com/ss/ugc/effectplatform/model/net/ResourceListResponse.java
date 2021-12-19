package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class ResourceListResponse extends h<ResourceListModel> {
    private ResourceListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102516);
    }

    public ResourceListResponse() {
        this(null, null, 0, 7, null);
    }

    private final ResourceListModel component1() {
        return this.data;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ ResourceListResponse copy$default(ResourceListResponse resourceListResponse, ResourceListModel resourceListModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            resourceListModel = resourceListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = resourceListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = resourceListResponse.status_code;
        }
        return resourceListResponse.copy(resourceListModel, str, i2);
    }

    public final int component3() {
        return this.status_code;
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i2) {
        return new ResourceListResponse(resourceListModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceListResponse)) {
            return false;
        }
        ResourceListResponse resourceListResponse = (ResourceListResponse) obj;
        return l.a(this.data, resourceListResponse.data) && l.a(this.message, resourceListResponse.message) && this.status_code == resourceListResponse.status_code;
    }

    public final int hashCode() {
        ResourceListModel resourceListModel = this.data;
        int i2 = 0;
        int hashCode = (resourceListModel != null ? resourceListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "ResourceListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final ResourceListModel getResponseData() {
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
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResource_list() == null) {
            return false;
        }
        return true;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i2) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListResponse(ResourceListModel resourceListModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : resourceListModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
