package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectChannelModelTemplate extends EffectChannelModel {
    private final transient EffectChannelModel kChannelModel;
    private List<String> urlPrefix;

    static {
        Covode.recordClassIndex(95444);
    }

    public EffectChannelModelTemplate() {
        this(null, 1, null);
    }

    public EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    public EffectPanelModel getPanel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (effectPanelModel = kChannelModel2.getPanel_model()) == null) {
            effectPanelModel = super.getPanel_model();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (url_prefix = kChannelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategory() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r4 = r5.getKChannelModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCategory_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCategory_list()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
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
            com.ss.ugc.effectplatform.model.EffectCategoryModel r1 = (com.ss.ugc.effectplatform.model.EffectCategoryModel) r1
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCategory_list(r3)
        L_0x0053:
            super.setCategory_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCategory():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r4 = r5.getKChannelModel()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectChannelModel r4 = r5.getKChannelModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getEffect_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getEffect_list()
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
            r4.setEffect_list(r3)
        L_0x0053:
            super.setEffect_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getEffects():java.util.List");
    }

    public EffectChannelModelTemplate(EffectChannelModel effectChannelModel) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.kChannelModel = effectChannelModel;
        this.urlPrefix = new ArrayList();
    }

    public void setCategory(List<EffectCategoryModel> list) {
        l.c(list, "");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    public void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setEffects(List<? extends Effect> list) {
        l.c(list, "");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        l.c(effectPanelModel, "");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    public void setUrlPrefix(List<String> list) {
        l.c(list, "");
        this.urlPrefix = list;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelModelTemplate(EffectChannelModel effectChannelModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectChannelModel);
    }
}
