package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.SearchEffectModel;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class SearchEffectModelTemplate extends SearchEffectModel {
    private List<? extends Effect> bindEffects;
    private List<? extends Effect> collectionList;
    private List<? extends Effect> effectList;
    private final transient SearchEffectModel kSearchEffectModel;

    static {
        Covode.recordClassIndex(95462);
    }

    public SearchEffectModelTemplate() {
        this(null, 1, null);
    }

    public SearchEffectModel getKSearchEffectModel() {
        return this.kSearchEffectModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate, com.ss.ugc.effectplatform.model.net.SearchEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r2 = r4.getBind_effects()
            if (r2 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r2 = super.getBind_effects()
        L_0x0010:
            r1 = 0
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x0019:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001e:
            return r2
        L_0x001f:
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
            goto L_0x001e
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
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
            r4.setBind_effects(r3)
        L_0x0053:
            super.setBind_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate, com.ss.ugc.effectplatform.model.net.SearchEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectionList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r2 = r4.getCollection()
            if (r2 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r2 = super.getCollection()
        L_0x0010:
            r1 = 0
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x0019:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001e:
            return r2
        L_0x001f:
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
            goto L_0x001e
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
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
            r4.setCollection(r3)
        L_0x0053:
            super.setCollection(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getCollectionList():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate, com.ss.ugc.effectplatform.model.net.SearchEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffectList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectModel r4 = r5.getKSearchEffectModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r2 = r4.getEffects()
            if (r2 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r2 = super.getEffects()
        L_0x0010:
            r1 = 0
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x0019:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001e:
            return r2
        L_0x001f:
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L_0x0028
            goto L_0x001e
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = h.a.n.a(r2, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
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
            r4.setEffects(r3)
        L_0x0053:
            super.setEffects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectModelTemplate.getEffectList():java.util.List");
    }

    public void setBindEffects(List<? extends Effect> list) {
        l.c(list, "");
        this.bindEffects = list;
        SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCollectionList(List<? extends Effect> list) {
        l.c(list, "");
        this.collectionList = list;
        SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setCollection(list);
        }
        super.setCollection(list);
    }

    public void setEffectList(List<? extends Effect> list) {
        l.c(list, "");
        this.effectList = list;
        SearchEffectModel kSearchEffectModel2 = getKSearchEffectModel();
        if (kSearchEffectModel2 != null) {
            kSearchEffectModel2.setEffects(list);
        }
        super.setEffects(list);
    }

    public SearchEffectModelTemplate(SearchEffectModel searchEffectModel) {
        super(false, 0, null, null, null, null, null, null, 255, null);
        this.kSearchEffectModel = searchEffectModel;
        this.effectList = new ArrayList();
        this.collectionList = new ArrayList();
        this.bindEffects = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectModelTemplate(SearchEffectModel searchEffectModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : searchEffectModel);
    }
}
