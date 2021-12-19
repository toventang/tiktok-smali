package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectChannelResponseTemplate extends EffectChannelResponse {
    private List<? extends Effect> allCategoryEffects;
    private List<EffectCategoryResponse> categoryResponseList;
    private List<? extends Effect> collections;
    private Effect frontEffect;
    private final transient EffectChannelResponse kChannelResponse;
    private EffectPanelModel panelModel;
    private Effect rearEffect;
    private List<String> urlPrefix;

    static {
        Covode.recordClassIndex(95445);
    }

    public EffectChannelResponseTemplate() {
        this(null, 1, null);
    }

    public EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effect = kChannelResponse2.getFront_effect()) == null) {
            effect = super.getFront_effect();
        }
        return new Effect(effect);
    }

    public EffectPanelModel getPanelModel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effectPanelModel = kChannelResponse2.getPanel_model()) == null) {
            effectPanelModel = super.getPanel_model();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effect = kChannelResponse2.getRear_effect()) == null) {
            effect = super.getRear_effect();
        }
        return new Effect(effect);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (url_prefix = kChannelResponse2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getAllCategoryEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r4 = r5.getKChannelResponse()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getAll_category_effects()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getAll_category_effects()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.Effect r1 = (com.ss.ugc.effectplatform.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setAll_category_effects(r3)
        L_0x0053:
            super.setAll_category_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getAllCategoryEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> getCategoryResponseList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r4 = r5.getKChannelResponse()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCategory_responses()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCategory_responses()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r1 = (com.ss.ugc.effectplatform.model.EffectCategoryResponse) r1
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCategory_responses(r3)
        L_0x0053:
            super.setCategory_responses(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCategoryResponseList():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollections() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelResponse r4 = r5.getKChannelResponse()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCollection_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCollection_list()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.Effect r1 = (com.ss.ugc.effectplatform.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCollection_list(r3)
        L_0x0053:
            super.setCollection_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCollections():java.util.List");
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setAllCategoryEffects(List<? extends Effect> list) {
        l.c(list, "");
        this.allCategoryEffects = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setAll_category_effects(list);
        }
        super.setAll_category_effects(list);
    }

    public void setCategoryResponseList(List<EffectCategoryResponse> list) {
        l.c(list, "");
        this.categoryResponseList = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCategory_responses(list);
        }
        super.setCategory_responses(list);
    }

    public void setCollections(List<? extends Effect> list) {
        l.c(list, "");
        this.collections = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setPanelModel(EffectPanelModel effectPanelModel) {
        l.c(effectPanelModel, "");
        this.panelModel = effectPanelModel;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    public void setUrlPrefix(List<String> list) {
        l.c(list, "");
        this.urlPrefix = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse) {
        super(null, null, null, null, null, null, null, null, null, 511, null);
        this.kChannelResponse = effectChannelResponse;
        this.allCategoryEffects = new ArrayList();
        this.categoryResponseList = new ArrayList();
        this.collections = new ArrayList();
        this.panelModel = new EffectPanelModel(null, 1, null);
        this.urlPrefix = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectChannelResponse);
    }
}
