package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public class FetchHotEffectResponseTemplate extends FetchHotEffectResponse {
    private final transient FetchHotEffectResponse kFetchHotModel;

    static {
        Covode.recordClassIndex(95453);
    }

    public FetchHotEffectResponseTemplate() {
        this(null, 1, null);
    }

    public static class DataTemplate extends FetchHotEffectResponse.Data {
        private final transient FetchHotEffectResponse.Data kData;

        static {
            Covode.recordClassIndex(95454);
        }

        public DataTemplate() {
            this(null, 1, null);
        }

        public FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        public DataTemplate(FetchHotEffectResponse.Data data) {
            super(null, null, null, 7, null);
            this.kData = data;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataTemplate(FetchHotEffectResponse.Data data, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : data);
        }
    }

    public static class ExtraTemplate extends FetchHotEffectResponse.Extra {
        private final transient FetchHotEffectResponse.Extra kData;

        static {
            Covode.recordClassIndex(95455);
        }

        public ExtraTemplate() {
            this(null, 1, null);
        }

        public FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        public ExtraTemplate(FetchHotEffectResponse.Extra extra) {
            super(null, 1, null);
            this.kData = extra;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExtraTemplate(FetchHotEffectResponse.Extra extra, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : extra);
        }
    }

    public FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse r4 = r5.getKFetchHotModel()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse r4 = r5.getKFetchHotModel()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getEffects():java.util.List");
    }

    public FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse) {
        super(null, null, 0, 7, null);
        this.kFetchHotModel = fetchHotEffectResponse;
    }

    public void setEffects(List<? extends Effect> list) {
        l.c(list, "");
        FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
