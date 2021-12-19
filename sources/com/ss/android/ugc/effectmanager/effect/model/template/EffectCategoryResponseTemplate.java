package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectCategoryResponseTemplate extends EffectCategoryResponse {
    private List<? extends Effect> collectionEffect;
    private Effect frontEffect;
    private boolean isDefault;
    private final transient EffectCategoryResponse kCategoryResponse;
    private Effect rearEffect;
    private String tagsUpdateTime;
    private List<? extends Effect> totalEffects;

    static {
        Covode.recordClassIndex(95443);
    }

    public EffectCategoryResponseTemplate() {
        this(null, 1, null);
    }

    public EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    public boolean isDefault() {
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            return kCategoryResponse2.is_default();
        }
        return super.is_default();
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (effect = kCategoryResponse2.getFront_effect()) == null) {
            effect = super.getFront_effect();
        }
        return new Effect(effect);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (effect = kCategoryResponse2.getRear_effect()) == null) {
            effect = super.getRear_effect();
        }
        return new Effect(effect);
    }

    public String getTagsUpdateTime() {
        String tags_update_time;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags_update_time = kCategoryResponse2.getTags_update_time()) == null) {
            return super.getTags_update_time();
        }
        return tags_update_time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate, com.ss.ugc.effectplatform.model.EffectCategoryResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectionEffect() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r4 = r5.getKCategoryResponse()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCollection_effect()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCollection_effect()
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
            r4.setCollection_effect(r3)
        L_0x0053:
            super.setCollection_effect(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getCollectionEffect():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate, com.ss.ugc.effectplatform.model.EffectCategoryResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getTotalEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.EffectCategoryResponse r4 = r5.getKCategoryResponse()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getTotal_effects()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getTotal_effects()
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
            r4.setTotal_effects(r3)
        L_0x0053:
            super.setTotal_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getTotalEffects():java.util.List");
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.set_default(z);
        }
        super.set_default(z);
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    public void setCollectionEffect(List<? extends Effect> list) {
        l.c(list, "");
        this.collectionEffect = list;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setCollection_effect(list);
        }
        super.setCollection_effect(list);
    }

    public void setTotalEffects(List<? extends Effect> list) {
        l.c(list, "");
        this.totalEffects = list;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTotal_effects(list);
        }
        super.setTotal_effects(list);
    }

    public EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse) {
        super(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
        this.kCategoryResponse = effectCategoryResponse;
        this.totalEffects = new ArrayList();
        this.collectionEffect = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectCategoryResponse);
    }
}
