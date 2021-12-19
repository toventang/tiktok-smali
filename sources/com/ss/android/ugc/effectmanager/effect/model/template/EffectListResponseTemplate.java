package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectListResponseTemplate extends EffectListResponse {
    private List<? extends Effect> bindEffects;
    private final transient EffectListResponse kEffectList;
    private List<String> urlPrefix;

    static {
        Covode.recordClassIndex(95446);
    }

    public EffectListResponseTemplate() {
        this(null, 1, null);
    }

    public EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (url_prefix = kEffectList2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.net.EffectListResponse, com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r4 = r5.getKEffectList()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.net.EffectListResponse, com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r4 = r5.getKEffectList()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.net.EffectListResponse, com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getData() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r4 = r5.getKEffectList()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getData():java.util.List");
    }

    public EffectListResponseTemplate(EffectListResponse effectListResponse) {
        super(null, null, null, 0, null, null, 63, null);
        this.kEffectList = effectListResponse;
        this.bindEffects = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setBindEffects(List<? extends Effect> list) {
        l.c(list, "");
        this.bindEffects = list;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setData(List<? extends Effect> list) {
        l.c(list, "");
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    public void setUrlPrefix(List<String> list) {
        l.c(list, "");
        this.urlPrefix = list;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponseTemplate(EffectListResponse effectListResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectListResponse);
    }
}
