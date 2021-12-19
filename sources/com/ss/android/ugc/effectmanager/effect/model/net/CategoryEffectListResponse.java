package com.ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

public class CategoryEffectListResponse extends BaseNetResponse {
    private CategoryPageModel data;

    static {
        Covode.recordClassIndex(95426);
    }

    public CategoryPageModel getData() {
        return this.data;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategoryEffects() == null) {
            return false;
        }
        return true;
    }

    public String getRecId() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null) {
            return null;
        }
        return categoryPageModel.getRecId();
    }

    public void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }
}
