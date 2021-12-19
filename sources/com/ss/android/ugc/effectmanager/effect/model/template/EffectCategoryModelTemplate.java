package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import h.f.b.g;

public class EffectCategoryModelTemplate extends EffectCategoryModel {
    private boolean isDefault;
    private final transient EffectCategoryModel kCategoryModel;
    private String tagsUpdateTime;

    static {
        Covode.recordClassIndex(95442);
    }

    public EffectCategoryModelTemplate() {
        this(null, 1, null);
    }

    public EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    public boolean isDefault() {
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            return kCategoryModel2.is_default();
        }
        return super.is_default();
    }

    public String getTagsUpdateTime() {
        String tags_updated_at;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags_updated_at = kCategoryModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(z);
        }
        super.set_default(z);
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    public EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel) {
        super(null, null, null, null, null, null, null, null, false, null, 1023, null);
        this.kCategoryModel = effectCategoryModel;
    }

    public void setIsDefault(boolean z) {
        EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(is_default());
        }
        super.set_default(is_default());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryModelTemplate(EffectCategoryModel effectCategoryModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectCategoryModel);
    }
}
