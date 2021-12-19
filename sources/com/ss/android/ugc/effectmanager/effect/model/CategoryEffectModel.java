package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public class CategoryEffectModel extends CategoryEffectModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect;

    static {
        Covode.recordClassIndex(95393);
    }

    public CategoryEffectModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public com.ss.ugc.effectplatform.model.CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public String getCategoryKey() {
        return super.getCategoryKey();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public int getSortingPosition() {
        return super.getSortingPosition();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getSorting_position() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getSorting_position();
        }
        return super.getSorting_position();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<Effect> getBind_effects() {
        List<Effect> bind_effects;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (bind_effects = kCategoryEffect2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getCategory_key() {
        String category_key;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (category_key = kCategoryEffect2.getCategory_key()) == null) {
            return super.getCategory_key();
        }
        return category_key;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<Effect> getCollection() {
        List<Effect> collection;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (collection = kCategoryEffect2.getCollection()) == null) {
            return super.getCollection();
        }
        return collection;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (version = kCategoryEffect2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setSortingPosition(int i2) {
        super.setSortingPosition(i2);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setBindEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setBindEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCategoryKey(String str) {
        l.c(str, "");
        super.setCategoryKey(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCollectEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setCollectEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCursor(int i2) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCursor(i2);
        }
        super.setCursor(i2);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setSorting_position(int i2) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setSorting_position(i2);
        }
        super.setSorting_position(i2);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setBind_effects(List<? extends Effect> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCategory_key(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_key(str);
        }
        super.setCategory_key(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCollection(list);
        }
        super.setCollection(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setVersion(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setVersion(str);
        }
        super.setVersion(str);
    }

    public CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel) {
        super(categoryEffectModel);
        this.kCategoryEffect = categoryEffectModel;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            List<Effect> bind_effects = kCategoryEffect2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<Effect> category_effects = kCategoryEffect2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            String category_key = kCategoryEffect2.getCategory_key();
            if (category_key != null) {
                super.setCategory_key(category_key);
            }
            List<Effect> collection = kCategoryEffect2.getCollection();
            if (collection != null) {
                super.setCollection(collection);
            }
            super.setCursor(kCategoryEffect2.getCursor());
            super.setHas_more(kCategoryEffect2.getHas_more());
            super.setSorting_position(kCategoryEffect2.getSorting_position());
            String version = kCategoryEffect2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : categoryEffectModel);
    }
}
