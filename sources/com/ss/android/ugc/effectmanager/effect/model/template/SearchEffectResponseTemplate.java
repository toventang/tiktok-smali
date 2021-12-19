package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchEffectResponseTemplate extends SearchEffectResponse {
    private List<? extends Effect> bindEffects;
    private boolean hasMore;
    private final transient SearchEffectResponse kSearchEffect;

    static {
        Covode.recordClassIndex(95463);
    }

    public SearchEffectResponseTemplate() {
        this(null, 1, null);
    }

    public SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    public boolean getHasMore() {
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.net.SearchEffectResponse, com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.SearchEffectResponse r4 = r5.getKSearchEffect()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getBind_effects()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getBind_effects()
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
            r4.setBind_effects(r3)
        L_0x0053:
            super.setBind_effects(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate.getBindEffects():java.util.List");
    }

    public List<Effect> getCollection() {
        List<com.ss.ugc.effectplatform.model.Effect> collection_list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (collection_list = kSearchEffect2.getCollection_list()) == null) {
            List<com.ss.ugc.effectplatform.model.Effect> collection_list2 = super.getCollection_list();
            ArrayList arrayList = new ArrayList(n.a((Iterable) collection_list2, 10));
            Iterator<T> it = collection_list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) collection_list, 10));
        Iterator<T> it2 = collection_list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    public List<Effect> getEffects() {
        List<com.ss.ugc.effectplatform.model.Effect> effect_list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (effect_list = kSearchEffect2.getEffect_list()) == null) {
            List<com.ss.ugc.effectplatform.model.Effect> effect_list2 = super.getEffect_list();
            ArrayList arrayList = new ArrayList(n.a((Iterable) effect_list2, 10));
            Iterator<T> it = effect_list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) effect_list, 10));
        Iterator<T> it2 = effect_list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public SearchEffectResponseTemplate(SearchEffectResponse searchEffectResponse) {
        super(false, 0, null, null, null, 0, null, 127, null);
        this.kSearchEffect = searchEffectResponse;
        this.bindEffects = new ArrayList();
    }

    public void setBindEffects(List<? extends Effect> list) {
        l.c(list, "");
        this.bindEffects = list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setEffects(List<? extends Effect> list) {
        l.c(list, "");
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponseTemplate(SearchEffectResponse searchEffectResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : searchEffectResponse);
    }
}
