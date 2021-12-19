package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class EffectChannelResponse extends EffectChannelResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse;

    static {
        Covode.recordClassIndex(95407);
    }

    public EffectChannelResponse() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final com.ss.ugc.effectplatform.model.EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final List<Effect> getAllCategoryEffects() {
        return super.getAllCategoryEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final List<EffectCategoryResponse> getCategoryResponseList() {
        return super.getCategoryResponseList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final List<Effect> getCollections() {
        return super.getCollections();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final EffectPanelModel getPanelModel() {
        return super.getPanelModel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final List<Effect> getAll_category_effects() {
        List<Effect> all_category_effects;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (all_category_effects = kChannelResponse2.getAll_category_effects()) == null) {
            return super.getAll_category_effects();
        }
        return all_category_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final List<EffectCategoryResponse> getCategory_responses() {
        List<EffectCategoryResponse> category_responses;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (category_responses = kChannelResponse2.getCategory_responses()) == null) {
            return super.getCategory_responses();
        }
        return category_responses;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final List<Effect> getCollection_list() {
        List<Effect> collection_list;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (collection_list = kChannelResponse2.getCollection_list()) == null) {
            return super.getCollection_list();
        }
        return collection_list;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final Effect getFront_effect() {
        Effect front_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (front_effect = kChannelResponse2.getFront_effect()) == null) {
            return super.getFront_effect();
        }
        return front_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (panel = kChannelResponse2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final EffectPanelModel getPanel_model() {
        EffectPanelModel panel_model;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (panel_model = kChannelResponse2.getPanel_model()) == null) {
            return super.getPanel_model();
        }
        return panel_model;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final Effect getRear_effect() {
        Effect rear_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (rear_effect = kChannelResponse2.getRear_effect()) == null) {
            return super.getRear_effect();
        }
        return rear_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (url_prefix = kChannelResponse2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (version = kChannelResponse2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setAllCategoryEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setAllCategoryEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setCategoryResponseList(List<EffectCategoryResponse> list) {
        l.c(list, "");
        super.setCategoryResponseList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setCollections(List<? extends Effect> list) {
        l.c(list, "");
        super.setCollections(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setFront_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setPanel(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel(str);
        }
        super.setPanel(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setPanelModel(EffectPanelModel effectPanelModel) {
        l.c(effectPanelModel, "");
        super.setPanelModel(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setRear_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public final void setUrlPrefix(List<String> list) {
        l.c(list, "");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setVersion(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setVersion(str);
        }
        super.setVersion(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setAll_category_effects(List<? extends Effect> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setAll_category_effects(list);
        }
        super.setAll_category_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCategory_responses(list);
        }
        super.setCategory_responses(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setCollection_list(List<? extends Effect> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        l.c(effectPanelModel, "");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public final void setUrl_prefix(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse) {
        super(effectChannelResponse);
        this.kChannelResponse = effectChannelResponse;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            List<Effect> all_category_effects = kChannelResponse2.getAll_category_effects();
            if (all_category_effects != null) {
                super.setAll_category_effects(all_category_effects);
            }
            List<EffectCategoryResponse> category_responses = kChannelResponse2.getCategory_responses();
            if (category_responses != null) {
                super.setCategory_responses(category_responses);
            }
            List<Effect> collection_list = kChannelResponse2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            Effect front_effect = kChannelResponse2.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String panel = kChannelResponse2.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            EffectPanelModel panel_model = kChannelResponse2.getPanel_model();
            if (panel_model != null) {
                super.setPanel_model(panel_model);
            }
            Effect rear_effect = kChannelResponse2.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> url_prefix = kChannelResponse2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelResponse2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectChannelResponse);
    }
}
