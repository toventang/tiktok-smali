package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class CategoryPageModel extends CategoryPageModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel;

    static {
        Covode.recordClassIndex(95394);
    }

    public CategoryPageModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final com.ss.ugc.effectplatform.model.CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final CategoryEffectModel getCategoryEffects() {
        return super.getCategoryEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final String getRecId() {
        return super.getRecId();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public final CategoryEffectModel getCategory_effects() {
        CategoryEffectModel category_effects;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (category_effects = kCategoryPageModel2.getCategory_effects()) == null) {
            return super.getCategory_effects();
        }
        return category_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (url_prefix = kCategoryPageModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public final void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public final void setUrl_prefix(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel) {
        super(categoryPageModel);
        this.kCategoryPageModel = categoryPageModel;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            CategoryEffectModel category_effects = kCategoryPageModel2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            CategoryPageModel.Extra extra = kCategoryPageModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            List<String> url_prefix = kCategoryPageModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryPageModel);
    }
}
