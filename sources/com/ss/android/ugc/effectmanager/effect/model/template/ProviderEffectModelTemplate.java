package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class ProviderEffectModelTemplate extends ProviderEffectModel {
    private boolean hasMore;
    private final transient ProviderEffectModel kProviderEffect;
    private String searchTips;
    private List<ProviderEffect> stickerList;

    static {
        Covode.recordClassIndex(95457);
    }

    public ProviderEffectModelTemplate() {
        this(null, 1, null);
    }

    public ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public boolean getHasMore() {
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    public String getSearchTips() {
        String search_tips;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (search_tips = kProviderEffect2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.ProviderEffect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate, com.ss.ugc.effectplatform.model.ProviderEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> getStickerList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.ProviderEffectModel r4 = r5.getKProviderEffect()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getSticker_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getSticker_list()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.ProviderEffect
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
            com.ss.ugc.effectplatform.model.ProviderEffect r1 = (com.ss.ugc.effectplatform.model.ProviderEffect) r1
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r0 = new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setSticker_list(r3)
        L_0x0053:
            super.setSticker_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate.getStickerList():java.util.List");
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSearchTips(String str) {
        this.searchTips = str;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    public ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel) {
        super(null, 0, false, null, null, null, 63, null);
        this.kProviderEffect = providerEffectModel;
        this.stickerList = new ArrayList();
    }

    public void setStickerList(List<ProviderEffect> list) {
        l.c(list, "");
        this.stickerList = list;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_list(list);
        }
        super.setSticker_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : providerEffectModel);
    }
}
