package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;

public final class CategoryEffectListResponse extends h<CategoryPageModel> {
    private CategoryPageModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102489);
    }

    public CategoryEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ CategoryEffectListResponse copy$default(CategoryEffectListResponse categoryEffectListResponse, CategoryPageModel categoryPageModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            categoryPageModel = categoryEffectListResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = categoryEffectListResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = categoryEffectListResponse.status_code;
        }
        return categoryEffectListResponse.copy(categoryPageModel, str, i2);
    }

    public final CategoryPageModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i2) {
        return new CategoryEffectListResponse(categoryPageModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectListResponse)) {
            return false;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) obj;
        return l.a(this.data, categoryEffectListResponse.data) && l.a(this.message, categoryEffectListResponse.message) && this.status_code == categoryEffectListResponse.status_code;
    }

    public final int hashCode() {
        CategoryPageModel categoryPageModel = this.data;
        int i2 = 0;
        int hashCode = (categoryPageModel != null ? categoryPageModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "CategoryEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final CategoryPageModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final CategoryPageModel getResponseData() {
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
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) {
            return false;
        }
        return true;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i2) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : categoryPageModel, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
