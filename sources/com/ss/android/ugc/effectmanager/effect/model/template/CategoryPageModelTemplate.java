package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import h.f.b.g;

public class CategoryPageModelTemplate extends CategoryPageModel {
    private CategoryEffectModel categoryEffects;
    private final transient CategoryPageModel kCategoryPageModel;

    static {
        Covode.recordClassIndex(95439);
    }

    public CategoryPageModelTemplate() {
        this(null, 1, null);
    }

    public CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    public String getRecId() {
        CategoryPageModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryEffectModel getCategoryEffects() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (categoryEffectModel = kCategoryPageModel2.getCategory_effects()) == null) {
            categoryEffectModel = super.getCategory_effects();
        }
        return new CategoryEffectModel(categoryEffectModel);
    }

    public CategoryPageModelTemplate(CategoryPageModel categoryPageModel) {
        super(null, null, null, 7, null);
        this.kCategoryPageModel = categoryPageModel;
    }

    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.categoryEffects = categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModelTemplate(CategoryPageModel categoryPageModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryPageModel);
    }
}
