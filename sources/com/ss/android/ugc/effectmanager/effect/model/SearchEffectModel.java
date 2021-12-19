package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SearchEffectModel extends SearchEffectModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel;

    static {
        Covode.recordClassIndex(95424);
    }

    public SearchEffectModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final com.ss.ugc.effectplatform.model.net.SearchEffectModel getKSearchEffectModel() {
        return this.kSearchEffectModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final List<Effect> getCollectionList() {
        return super.getCollectionList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final List<Effect> getEffectList() {
        return super.getEffectList();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final int getCursor() {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            return kSearchEffectModel2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final boolean getHas_more() {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            return kSearchEffectModel2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final List<Effect> getBind_effects() {
        List<Effect> bind_effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (bind_effects = kSearchEffectModel2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final List<Effect> getCollection() {
        List<Effect> collection;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (collection = kSearchEffectModel2.getCollection()) == null) {
            return super.getCollection();
        }
        return collection;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final List<Effect> getEffects() {
        List<Effect> effects;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (effects = kSearchEffectModel2.getEffects()) == null) {
            return super.getEffects();
        }
        return effects;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final String getSearch_id() {
        String search_id;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (search_id = kSearchEffectModel2.getSearch_id()) == null) {
            return super.getSearch_id();
        }
        return search_id;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final String getSearch_tips() {
        String search_tips;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (search_tips = kSearchEffectModel2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final Boolean getUse_hot() {
        Boolean use_hot;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 == null || (use_hot = kSearchEffectModel2.getUse_hot()) == null) {
            return super.getUse_hot();
        }
        return use_hot;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final void setBindEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setBindEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setBind_effects(List<? extends Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setCollection(List<? extends Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setCollection(list);
        }
        super.setCollection(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final void setCollectionList(List<? extends Effect> list) {
        l.c(list, "");
        super.setCollectionList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setCursor(int i2) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setCursor(i2);
        }
        super.setCursor(i2);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate
    public final void setEffectList(List<? extends Effect> list) {
        l.c(list, "");
        super.setEffectList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setEffects(List<? extends Effect> list) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setEffects(list);
        }
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setSearch_id(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setSearch_id(str);
        }
        super.setSearch_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setSearch_tips(String str) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.SearchEffectModel
    public final void setUse_hot(Boolean bool) {
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setUse_hot(bool);
        }
        super.setUse_hot(bool);
    }

    public SearchEffectModel(com.ss.ugc.effectplatform.model.net.SearchEffectModel searchEffectModel) {
        super(searchEffectModel);
        this.kSearchEffectModel = searchEffectModel;
        com.ss.ugc.effectplatform.model.net.SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            List<Effect> bind_effects = kSearchEffectModel2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<Effect> collection = kSearchEffectModel2.getCollection();
            if (collection != null) {
                super.setCollection(collection);
            }
            super.setCursor(kSearchEffectModel2.getCursor());
            List<Effect> effects = kSearchEffectModel2.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            super.setHas_more(kSearchEffectModel2.getHas_more());
            String search_id = kSearchEffectModel2.getSearch_id();
            if (search_id != null) {
                super.setSearch_id(search_id);
            }
            String search_tips = kSearchEffectModel2.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            Boolean use_hot = kSearchEffectModel2.getUse_hot();
            if (use_hot != null) {
                super.setUse_hot(Boolean.valueOf(use_hot.booleanValue()));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectModel(com.ss.ugc.effectplatform.model.net.SearchEffectModel searchEffectModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : searchEffectModel);
    }
}
